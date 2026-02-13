package com.example.wallet.repository;

import com.example.wallet.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.UUID;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, UUID> {




    @Modifying
    @Query("""
        UPDATE Wallet w
        SET w.balance = w.balance + :amount
        WHERE w.valletId = :valletId
    """)
    int deposit(@Param("valletId") UUID valletId,
                @Param("amount") BigDecimal amount);

    @Modifying
    @Query("""
        UPDATE Wallet w
        SET w.balance = w.balance - :amount
        WHERE w.valletId = :valletId AND w.balance >= :amount
    """)
    int withdraw(@Param("valletId") UUID valletId,
                 @Param("amount") BigDecimal amount);
}
