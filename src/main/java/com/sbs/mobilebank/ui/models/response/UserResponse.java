package com.sbs.mobilebank.ui.models.response;

import javax.persistence.*;
import javax.validation.constraints.Size;

public class UserResponse {

    private String userCode;

    @Basic(optional = false)
    @Size(min = 1, max = 10)
    private String filiale;

    @Size(max = 10)
    private String agence;
    @Size(max = 50)

    private String nom;
    @Size(max = 80)

    private String prenoms;
    @Size(max = 20)

    private String userName;
    @Size(max = 80)

    @Size(max = 100)
    private String email;
    @Size(max = 100)

    private String contact;
    @Size(max = 20)

    private String datecnx;
    @Size(max = 1)

    private String etatconnexion;
    @Size(max = 10)

    private String datedrnacces;
    @Size(max = 10)

    private String datedrnconnect;
    @Size(max = 5)

    private String heuredrnacces;
    @Size(max = 5)

    private String heureconnect;
    @Size(max = 35)

    private String menugroup;
    @Size(max = 10)
    //@Column(name = "page")
    private String page;
    @Size(max = 1)

    private String essai;
    @Size(max = 5)

    private String activer;
    @Size(max = 10)

    private String userenreg;
    @Size(max = 10)

    private String usermaj;
    @Size(max = 20)

    private String dateenreg;
    @Size(max = 20)

    private String datemaj;

    @Column(nullable = false)
    private boolean locked;

    @Column(nullable = false)
    private boolean enabled;

    @Column(nullable = false)
    private boolean expired;

    @Column(nullable = false)
    private boolean credentialsExpired;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDatecnx() {
        return datecnx;
    }

    public void setDatecnx(String datecnx) {
        this.datecnx = datecnx;
    }

    public String getEtatconnexion() {
        return etatconnexion;
    }

    public void setEtatconnexion(String etatconnexion) {
        this.etatconnexion = etatconnexion;
    }

    public String getDatedrnacces() {
        return datedrnacces;
    }

    public void setDatedrnacces(String datedrnacces) {
        this.datedrnacces = datedrnacces;
    }

    public String getDatedrnconnect() {
        return datedrnconnect;
    }

    public void setDatedrnconnect(String datedrnconnect) {
        this.datedrnconnect = datedrnconnect;
    }

    public String getHeuredrnacces() {
        return heuredrnacces;
    }

    public void setHeuredrnacces(String heuredrnacces) {
        this.heuredrnacces = heuredrnacces;
    }

    public String getHeureconnect() {
        return heureconnect;
    }

    public void setHeureconnect(String heureconnect) {
        this.heureconnect = heureconnect;
    }

    public String getMenugroup() {
        return menugroup;
    }

    public void setMenugroup(String menugroup) {
        this.menugroup = menugroup;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getEssai() {
        return essai;
    }

    public void setEssai(String essai) {
        this.essai = essai;
    }

    public String getActiver() {
        return activer;
    }

    public void setActiver(String activer) {
        this.activer = activer;
    }

    public String getUserenreg() {
        return userenreg;
    }

    public void setUserenreg(String userenreg) {
        this.userenreg = userenreg;
    }

    public String getUsermaj() {
        return usermaj;
    }

    public void setUsermaj(String usermaj) {
        this.usermaj = usermaj;
    }

    public String getDateenreg() {
        return dateenreg;
    }

    public void setDateenreg(String dateenreg) {
        this.dateenreg = dateenreg;
    }

    public String getDatemaj() {
        return datemaj;
    }

    public void setDatemaj(String datemaj) {
        this.datemaj = datemaj;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public boolean isCredentialsExpired() {
        return credentialsExpired;
    }

    public void setCredentialsExpired(boolean credentialsExpired) {
        this.credentialsExpired = credentialsExpired;
    }
}
