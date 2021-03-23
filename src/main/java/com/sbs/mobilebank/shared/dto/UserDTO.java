package com.sbs.mobilebank.shared.dto;

import javax.persistence.*;
import javax.validation.constraints.Size;

public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userIUd;
    private String userCode;
    private String firstName;
    private String lastName;
    private String mobile;
    private String userEmail;
    private String encryptedPassword;
    private String filiale;
    private String agence;

    public long getUserIUd() {
        return userIUd;
    }

    public void setUserIUd(long userIUd) {
        this.userIUd = userIUd;
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
}
