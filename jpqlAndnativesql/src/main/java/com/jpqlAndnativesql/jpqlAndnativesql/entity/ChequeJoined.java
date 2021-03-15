package com.jpqlAndnativesql.jpqlAndnativesql.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "chequeJoined")
@PrimaryKeyJoinColumn(name = "id")
public class ChequeJoined extends PaymentJoined {

    @Column(name = "chequenumber")
    private String chequeNumber;

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}