package com.common.service.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.common.service.vo.country;

import jakarta.persistence.EntityManager;

@Repository
public class MasterDataRepositoryImpl implements MasterDataRepository {

	@Autowired
	private EntityManager em;
	@SuppressWarnings("unchecked")
	public List<country> getAllCountryCodes() {
		List<country> results = em.createNamedQuery("masterData.getCountryCodes").getResultList();
				return results;
	}

}
