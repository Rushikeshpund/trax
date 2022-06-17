package com.Marketing.services;

import java.util.List;

import com.Marketing.Entities.Lead;

public interface LeadService {

	
	public void saveLead(Lead lead); 
		
	public List<Lead> getLeads();

	public void deleteLead(long id);

	public Lead findOneLead(long id);
	
}
