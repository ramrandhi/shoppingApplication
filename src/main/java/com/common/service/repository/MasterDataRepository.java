package com.common.service.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.common.service.vo.Account;
import com.common.service.vo.country;

@Repository
public interface MasterDataRepository {
	public List<country> getAllCountryCodes();

	public List<Account> getAccountDetails();

}
