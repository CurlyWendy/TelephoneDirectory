package com.example.TelephoneDirectory.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private ZonedDateTime createdAt;
    private ZonedDateTime updateAt;
    private String name;
    private BigDecimal paycheck;

    public Position() {

    }

    public Position(String name, BigDecimal paycheck, ZonedDateTime createdAt) {
        this.name = name;
        this.paycheck = paycheck;
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

    public String getName() {
        return name;
    }

    public BigDecimal getPaycheck() {
        return paycheck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaycheck(BigDecimal paycheck) {
        this.paycheck = paycheck;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdateAt(ZonedDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
