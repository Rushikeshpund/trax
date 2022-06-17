package com.Marketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Marketing.Entities.Lead;
import com.Marketing.dto.LeadData;
import com.Marketing.services.LeadService;
import com.Marketing.utility.EmailService;

@Controller
public class LeadController {
	@Autowired
	private LeadService ls;
	
	@Autowired
	private EmailService em;
	
	
	@RequestMapping("/viewLead")
	public String  viewLeadPge() {
		return "new_lead";
	}
	
	
	@RequestMapping("/savelead")
	public String saveOneLead(@ModelAttribute Lead lead,ModelMap model) {
		ls.saveLead(lead);
		em.sendSimpleMessage("rushikeshpund98@gmail.com", "test ", " one new lead is saved");
		model.addAttribute("msg", "SAVED...");
		return "new_lead";
	}

	
	@RequestMapping("/listall")
	public String listAll(ModelMap model) {
		List<Lead> leads = ls.getLeads();
		
		model.addAttribute("leads", leads);
	    return "search";
	}
	
	
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id")  long id, ModelMap model) {
		
		ls.deleteLead(id);
	List<Lead> leads = ls.getLeads();
		
		model.addAttribute("leads", leads);
	    return "search";	
	    }
	
	
	
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id")  long id, ModelMap model) {
	Lead lead = ls.findOneLead(id);
	model.addAttribute("lead", lead);
		    return "update_lead";	
	    }
	
	

	@RequestMapping("/updatelead")
	public String updateLead(LeadData lead,ModelMap model) {
		
		Lead l = new Lead();
		
		l.setId(lead.getId());
		l.setFirstName(lead.getFirstName());
		l.setLastName(lead.getLastName());
		l.setMobile(lead.getMobile());
		
		ls.saveLead(l);	
		model.addAttribute("msg", "updated...");
List<Lead> leads = ls.getLeads();
		model.addAttribute("leads", leads);
	    return "search";	}
	
	
	
}
