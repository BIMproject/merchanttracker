package com.event.Dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.event.Model.Services;
@Repository
public interface ServiceDao extends CrudRepository<Services, Integer> 
 {
	
	

}

