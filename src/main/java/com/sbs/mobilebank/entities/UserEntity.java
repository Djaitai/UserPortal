package com.sbs.mobilebank.entities;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

/**
 * 
 * @author djaitai
 *
 */

@Entity
@Table(name = "users")
public class UserEntity {

	//be7f77c4-5e20-4094-a7d1-9f0bb74fc6a8
	//b43b42af-a9fa-417a-b70c-145328b44cb6

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	private String userCode;
    private String firstName;
    private String lastName;
    private String mobile;
    private String userEmail;
	private String encryptedPassword;
	private String filiale;
	private String agence;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getFiliale() {
		return filiale;
	}

	public void setFiliale(String filiale) {
		this.filiale = filiale;
	}

	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	@Override
	public String toString() {
		return "UserEntity{" +
				"userId=" + userId +
				", userCode='" + userCode + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", mobile='" + mobile + '\'' +
				", userEmail='" + userEmail + '\'' +
				", encryptedPassword='" + encryptedPassword + '\'' +
				", filiale='" + filiale + '\'' +
				", agence='" + agence + '\'' +
				'}';
	}
}
