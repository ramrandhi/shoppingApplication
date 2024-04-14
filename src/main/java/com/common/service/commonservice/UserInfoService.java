package com.common.service.commonservice;

import java.util.List;

import com.common.service.entity.UserInfo;


public interface UserInfoService {

	public List<UserInfo> getAllUsers();

	public UserInfo getUserById(Integer id);

	public UserInfo saveUserInfo(UserInfo userInfo);

	public UserInfo updateUserInfo(UserInfo userInfo) throws Exception;

	public void updateUserInfo(Integer id)  throws Exception;

}
