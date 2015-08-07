package com.event.Service;



import java.util.List;

import com.event.Model.Services;


public interface ServiceService {

	public void add(Services Service);

	public void edit(Services Service);


	public void delete(Integer id);

	public Services getService(Integer id);

	public List<Services> getAllService();

}


