package com.example.TelephoneDirectory.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.context.annotation.ScopeMetadata;

import java.time.ZonedDateTime;

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private ZonedDateTime createdAt;
    private ZonedDateTime updateAt;
    private String companyName;
    private String adress;

    public Company() {

    }

    public Company(String companyName, String adress, ZonedDateTime createdAt) {
        this.companyName = companyName;
        this.adress = adress;
        this.createdAt = createdAt;
    }

    public Long getID(){
        return ID;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public ZonedDateTime getUpdateAt() {
        return updateAt;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAdress() {
        return adress;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdateAt(ZonedDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
