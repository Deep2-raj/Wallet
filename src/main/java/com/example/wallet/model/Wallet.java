package com.example.wallet.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="wallets")
public class Wallet {

    @Id
    private UUID valletId;

    private BigDecimal balance;

    public void setid(UUID valletId){
        this.valletId = valletId;
    }
    public UUID getvalletId(){
        return valletId;
    }

    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }

    public BigDecimal getBalance(){
        return balance;
    }

}
