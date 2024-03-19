package com.product.user;

import java.util.Optional;

public interface UserService {
	Users addUser(Users user);

	Optional<Users> getUser(int userId);
}
