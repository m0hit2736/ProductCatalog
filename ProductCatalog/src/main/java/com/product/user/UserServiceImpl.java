package com.product.user;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;

	public Users addUser(Users user) {
		return dao.save(user);
	}

	public Optional<Users> getUser(int userId) {
		return dao.findById(userId);
	}
}
