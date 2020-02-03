package com.acn.powerrangers.dayiversary.models;

import java.time.LocalDate;

public class User {
	private String firstName;
	private String lastName;
	private Long id;
	private LocalDate birthDate;
	
	public User() {
		super();
	}

	public User(String firstName, String lastName, Long id, LocalDate birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Long getId() {
		return id;
	}
	
}
