package com.common.service.commonservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.service.repository.MasterDataRepository;
import com.common.service.vo.country;

@Service
public class MasterDataServiceImpl implements MasterDataService{
	
	@Autowired
	private MasterDataRepository masterDataRepository;

	@Override
	public List<country> getAllCountryCodes() {
		
		return masterDataRepository.getAllCountryCodes();
	}

}
