package com.event.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.event.Model.Merchant;
import com.event.Service.MerchantService;


@Controller
public class MerchantController {
	@Autowired
	private MerchantService merchantService;


	@RequestMapping("/")
	public String setUpForm(Map<String, Object> map) {
		Merchant merchant = new Merchant();
		map.put("merchant", merchant);
		

		return "merchant";
	}


	 @RequestMapping(value= "/merchant.do", method = RequestMethod.POST)
	    public String addMerchant(@ModelAttribute("merchant") Merchant merchants,BindingResult result,
				 Model model)
				{	         
		 
	            merchantService.add(merchants);
	            
	            
	       

	        model.addAttribute("merchantList", merchantService.getAllmerchant());
	        return "merchantlist";
	         
				}
	 
	 @RequestMapping(value= "/update/{merchant_id}", method = RequestMethod.POST)
	 public String editMerchant(@ModelAttribute("merchant")Merchant merchants,Model model,@PathVariable("merchant_id") String id){
	merchants.setMerchant_id(Integer.parseInt(id));
		 merchantService.edit(merchants);
		 
		 model.addAttribute("merchantList", merchantService.getAllmerchant());
	        return "merchantlist";
	 }
	 
	 @RequestMapping("/remove/{merchant_id}")
	 
	 
	    public String removeMerchant(@PathVariable("merchant_id") int merchant_id,Model model){
	         
	        merchantService.delete(merchant_id);
	        model.addAttribute("merchantList", merchantService.getAllmerchant());
	        return "merchantlist";
	    }
	 
	 @RequestMapping("/just")
	  public String redirect(Model model){
		 model.addAttribute("merchantList", merchantService.getAllmerchant());
	        return "merchantlist";
	 }
	        
	   @RequestMapping("/update/{merchant_id}")
	   public String editMerchant(@PathVariable("merchant_id") int merchant_id, Model model){
		   model.addAttribute("merchant",this.merchantService.getmerchant(merchant_id));
		   model.addAttribute("merchantList", this.merchantService.getAllmerchant());
		   
		   return "editMerchant";
		   
		   
	   }
		   
	   
	    }

		
	

