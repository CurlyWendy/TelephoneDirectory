package com.example.TelephoneDirectory.model;

import com.fasterxml.jackson.datatype.jsr310.deser.key.ZoneIdKeyDeserializer;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.ZonedDateTime;

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private ZonedDateTime createdAt;
    private ZonedDateTime updateAt;
    private String fullName;
    private String firstName;
    private String lastName;
    private Long positionID;
    private Long companyID;
    private String email;
    private String phoneNumber;

    public Employee() {

    }

    public Employee(String fullName, String firstName, String lastName, Long positionID, Long companyID,
                    String email, String phoneNumber, ZonedDateTime createdAt) {
        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.positionID = positionID;
        this.companyID = companyID;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getFullName() {
        return fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getPositionID() {
        return positionID;
    }

    public Long getCompanyID() {
        return companyID;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdateAt(ZonedDateTime updateAt) {
        this.updateAt = updateAt;
    }
}