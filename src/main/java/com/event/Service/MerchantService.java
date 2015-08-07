package com.event.Service;

import java.util.List;

import com.event.Model.Merchant;

public interface MerchantService {

	public void add(Merchant merchant);

	public void edit(Merchant merchant);

	public void delete(Integer merchant_id);

	public Merchant getmerchant(Integer merchant_id);

	public List<Merchant> getAllmerchant();

}
