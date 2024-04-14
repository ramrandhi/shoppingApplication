package com.common.service.commonservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.service.entity.UserInfo;
import com.common.service.repository.UserInfoRepository;


@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoRepository userInfoRepository;

	@Override
	public List<UserInfo> getAllUsers() {
		return userInfoRepository.findAll();
	}

	@Override
	public UserInfo getUserById(Integer id) {
		return userInfoRepository.findById(id).get();
	}

	@Override
	public UserInfo saveUserInfo(UserInfo userInfo) {
		return userInfoRepository.save(userInfo);
	}

	@Override
	public UserInfo updateUserInfo(UserInfo userInfo) throws Exception {
		Optional<UserInfo> userInfoBean = userInfoRepository.findById(userInfo.getId());
		if(userInfoBean.isEmpty() && !userInfoBean.isPresent()) {
			throw new Exception("User is not present on database");
		}
		return userInfoRepository.save(userInfo);
	}

	@Override
	public void updateUserInfo(Integer id) {
		userInfoRepository.deleteById(id);

	}

}
