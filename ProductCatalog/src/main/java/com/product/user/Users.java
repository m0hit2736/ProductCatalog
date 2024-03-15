package com.product.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Users {

	@Id
	@SequenceGenerator(name = "users_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
	private int userId;
	private String userName;
	private String userEmail;
	private String userPswd;

}
