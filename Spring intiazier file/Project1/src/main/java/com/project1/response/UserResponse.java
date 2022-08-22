package com.project1.response;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserResponse {

	@NotNull(message = "You Can't Leave Field Blank")
	@NotBlank(message = "You Can't Leave Field Blank")
	private String firstName;

	@NotNull(message = "You Can't Leave Field Blank")
	@NotBlank(message = "You Can't Leave Field Blank")
	private String lastName;

	@NotNull(message = "You Can't Leave Field Blank")
	@NotBlank(message = "You Can't Leave Field Blank")
	@Email(message = "Please Enter a valid email")
	private String email;

	@NotNull(message = "You Can't Leave Field Blank")
	@NotBlank(message = "You Can't Leave Field Blank")
	@Size(min = 4, message = "minimum 4 length required")
	private String password;

	@NotNull(message = "You Can't Leave Field Blank")
	@NotBlank(message = "You Can't Leave Field Blank")
	private String confirmPassword;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public UserResponse(String firstName, String lastName, String email, String password, String confirmPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "UserResponse [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", confirmPassword=" + confirmPassword + "]";
	}

}
