//package com.example.wallet.model;
//
//import jakarta.persistence.*;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "transactions")
//public class Transaction {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private LocalDateTime date;
//
//    @Column(nullable = false)
//    private String type;
//
//    @Column(nullable = false, precision = 19, scale = 2)
//    private BigDecimal amount;
//
//    @Column(name = "cheque_no")
//    private String chequeNo;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "wallet_id", nullable = false)
//    private Wallet wallet;
//
//    // Default constructor (JPA requirement)
//    protected Transaction() {}
//
//    // Constructor for DEPOSIT / WITHDRAW
//    public Transaction(Wallet wallet,
//                       String type,
//                       BigDecimal amount,
//                       String chequeNo) {
//        this.wallet = wallet;
//        this.type = type;
//        this.amount = amount;
//        this.chequeNo = chequeNo;
//        this.date = LocalDateTime.now();
//    }
//
//    // Getters only (recommended for immutability)
//
//    public Long getId() {
//        return id;
//    }
//
//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public BigDecimal getAmount() {
//        return amount;
//    }
//
//    public String getChequeNo() {
//        return chequeNo;
//    }
//
//    public Wallet getWallet() {
//        return wallet;
//    }
//}
