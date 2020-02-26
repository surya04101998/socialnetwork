package com.service;
import org.springframework.stereotype.Service;

import com.model.Details;
@Service
public interface DetailsDao {
	
	public void AddDetails(Details details);
	
	public boolean authentication(Details details);
	

}
