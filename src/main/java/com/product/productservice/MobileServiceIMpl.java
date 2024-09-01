package com.product.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Mobile;
import com.product.repository.MobileRepository;

@Service
public class MobileServiceIMpl implements MobileService {
	
	@Autowired
	private MobileRepository mobileRepository;

	@Override
	public List<Mobile> getAllMobiles() {
		// TODO Auto-generated method stub
		return mobileRepository.findAll();
	}

}
