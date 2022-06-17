package com.Marketing.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Marketing.Entities.Lead;
import com.Marketing.Repository.LeadRepository;


@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository lr;
	
	@Override
	public void saveLead(Lead lead) {
	
		lr.save(lead);
		
		

	}

	@Override
	public List<Lead> getLeads() {
		List<Lead> leads = lr.findAll();
		
		return leads;
	}

	@Override
	public void deleteLead(long id) {

		lr.deleteById(id);
		
	}

	@Override
	public Lead findOneLead(long id) {
	Optional<Lead> findById = lr.findById(id);
	Lead lead = findById.get();
	return lead;
	}

}
