package com.example.application.spring.service;

import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.application.spring.dto.UserDto;
import com.example.application.spring.entity.AppUser;
import com.example.application.spring.repository.login.LoginRepository;

@Service
@Transactional
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public boolean registerNewUser(UserDto userDto) {
		
		DozerBeanMapper mapper = new DozerBeanMapper();
		AppUser app = mapper.map(userDto, AppUser.class);
		loginRepository.save(app);
		return true;
	}
	
	public boolean validateUser(String userName, String password) {
		
		Optional<AppUser> appUserOpt = loginRepository.findByName(userName);

		if (appUserOpt.isPresent()) {
			AppUser appUser = appUserOpt.get();
			if (appUser.getPassword().equals(password)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
