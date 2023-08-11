package com.wellsfargo.training.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.training.pms.service.DealerService;
import com.wellsfargo.training.pms.model.Address;
import com.wellsfargo.training.pms.model.Dealer;
import com.wellsfargo.training.pms.model.DealerAddress;

// Controller for login and registration of a dealer.

@RestController
@RequestMapping(value="/api")
public class DealerController {
	
	@Autowired
	private DealerService dservice; 
	
	@PostMapping("/dealers")
	public DealerAddress createDealer(@Validated @RequestBody DealerAddress dealer){
		
		Dealer d = new Dealer();
		d.setEmail(dealer.getEmail());
		d.setfName(dealer.getFname());
		d.setlName(dealer.getLname());
		d.setPassword(dealer.getPassword());
		d.setDob(dealer.getDob());
		d.setPhoneNo(dealer.getPhoneNo());
		
		Address a = new Address();
		a.setStreet(dealer.getStreet());
		a.setCity(dealer.getCity());
		a.setPincode(dealer.getPincode());
		d.setAddress(a);
		a.setDealer(d);
		
		final Dealer newDealer=dservice.registerDealer(d);
		return dealer;
	}
	
}
