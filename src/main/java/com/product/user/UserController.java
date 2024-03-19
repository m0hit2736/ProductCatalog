package com.product.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@MutationMapping
	public Users addUser(@Argument Users customer) {
		if (customer.getUserPswd().length() > 8 && customer.getUserEmail().contains("@gmail.com")) {
			return service.addUser(customer);
		}
		return null;
	}

	@QueryMapping
	public Optional<Users> getUser(@Argument int userId) {
		return service.getUser(userId);
	}
}
