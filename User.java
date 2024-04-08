package com.qspiders.springrest.pojo;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true,nullable = false)
	private String  userName ;
	@Column(nullable = false,unique = true)
	private String email;
	@Column(nullable = false,unique = true)
	private long mobile;
	@Column(nullable = false)
	private String password;
	@OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	private List<Car> cars;


}
