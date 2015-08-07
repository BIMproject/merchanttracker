package com.event.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Iterables;
import com.event.Dao.ServiceDao;
import com.event.Model.Services;
@Service
public class ServiceServiceImp implements ServiceService {

	@Autowired
	private ServiceDao repository;

	
	public void add(Services Service) {
		repository.save(Service);

	}

	public void edit(Services Service) {
	repository.findAll();
		
		repository.save(Service);
		}

	public void delete(Integer ID) {
		repository.delete(ID);

	}
	 
	public void alter(Integer ID){
		repository.findOne(ID);
	}
	public Services getService(Integer ID) {
		return repository.findOne(ID);
	}

	public  List<Services> getAllService() {
		 List<Services> list = new ArrayList<Services>();
			Iterables.addAll(list,repository.findAll());
			return list;
	}



}



