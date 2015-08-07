package com.event.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.Dao.MerchantDao;
import com.event.Model.AuthenticatedList;
import com.event.Model.Merchant;
import com.google.common.collect.Iterables;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantDao repository;

	public void add(Merchant merchant) {
		AuthenticatedList.getcurrentuser();
		repository.save(merchant);
	}

	public void edit(Merchant merchant) {

		Merchant upmerchant = repository.findOne(merchant.getMerchant_id());
		upmerchant.setMerchantName(merchant.getMerchantName());
		upmerchant.setMerchantAddress(merchant.getMerchantAddress());

		upmerchant.setCreated_date(merchant.getCreated_date());
		repository.save(upmerchant);

	}

	public void delete(Integer merchant_id) {
		repository.delete(merchant_id);

	}

	public Merchant getmerchant(Integer merchant_id) {
		return repository.findOne(merchant_id);
	}

	public List<Merchant> getAllmerchant() {
		List<Merchant> list = new ArrayList<Merchant>();
		Iterables.addAll(list, repository.findAll());
		return list;
	}

}
