package com.Marketing;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Marketing.Entities.Lead;
import com.Marketing.Repository.LeadRepository;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private LeadRepository lr;
	
	
	@GetMapping("/listallLeads")
	public List <Lead> getAllLeads(){
		List<Lead> leads = lr.findAll();
		return leads;	
	}
	
	
	@PostMapping("saveApi")
	public void saveLead(@RequestBody Lead lead){
   lr.save(lead);	
}
	
	
	@DeleteMapping("delete/{id}")
	public void deleteLead(@PathVariable long id) {
		lr.deleteById(id);
	}
	
	@PutMapping("updateApi")
	public void updateLead(@RequestBody Lead lead){
   lr.save(lead);	
}
	
	@GetMapping("getApi/{id}")
	public Lead getOneLead(@PathVariable long id) {
	try {
		Optional<Lead> findById = lr.findById(id);
        Lead lead = findById.get();
 return lead;
	} catch (Exception e) {
		e.printStackTrace();	
	
	}
	return null;

	}
	
	
}