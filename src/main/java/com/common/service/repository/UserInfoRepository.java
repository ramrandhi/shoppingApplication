package com.common.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.common.service.entity.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

	@Query(value = "SELECT * FROM common.user_info WHERE mobile_number = :userName", nativeQuery = true)
	public UserInfo findUserName(String userName);

	@Query(value = "SELECT * FROM common.user_info WHERE mobile_number = :userName AND password = :password", nativeQuery = true)
	public UserInfo checkUserNamePassword(String userName, String password);

}
