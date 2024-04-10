package com.ram.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ram.service.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{

}
