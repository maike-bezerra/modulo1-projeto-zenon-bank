package br.com.zenon;

import java.math.BigDecimal;

public record Transaction(int step, TransactionType type, BigDecimal amount,
                          String nameOrig, BigDecimal oldbalanceOrig, BigDecimal newbalanceOrig,
                          String nameDest, double oldbalanceDest, double newbalanceDest,
                          boolean isFraud, boolean isFlaggedFraud) {
}
