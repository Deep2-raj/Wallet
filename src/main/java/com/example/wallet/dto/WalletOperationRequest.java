package com.example.wallet.dto;

import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

public record WalletOperationRequest(
        @NotNull
        UUID valletId,
        @NotNull
        OperationType operationType,

        BigDecimal amount
) {}
