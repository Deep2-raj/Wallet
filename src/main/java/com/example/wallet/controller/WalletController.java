package com.example.wallet.controller;

import com.example.wallet.dto.WalletOperationRequest;
import com.example.wallet.service.WalletService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallet")
    public ResponseEntity<Void> operate(
            @Valid @RequestBody WalletOperationRequest request
    ) {
        walletService.process(request);
        return ResponseEntity.ok().build();
    }
}
