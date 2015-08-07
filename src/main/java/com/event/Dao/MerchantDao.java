package com.event.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.event.Model.Merchant;
@Repository
public interface MerchantDao extends CrudRepository<Merchant, Integer> 
 {
	
	
	

}
