package com.example.wallet.service;

//import com.example.wallet.dto.OperationType;
import com.example.wallet.dto.OperationType;
import com.example.wallet.dto.WalletOperationRequest;
import com.example.wallet.exception.BusinessException;
import com.example.wallet.repository.WalletRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository walletRepository;
    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }


    @Transactional
    public void process(WalletOperationRequest request) {

        int updatedRows;

        if (request.operationType() == OperationType.DEPOSIT) {
            updatedRows = walletRepository.deposit(
                    request.valletId(),
                    request.amount()
            );
        } else {
            updatedRows = walletRepository.withdraw(
                    request.valletId(),
                    request.amount()
            );
        }

        if (updatedRows == 0) {
            throw new BusinessException(
                    "Wallet not found or insufficient funds"
            );
        }
    }
}
