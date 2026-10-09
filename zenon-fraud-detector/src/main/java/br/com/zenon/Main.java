package br.com.zenon;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    static void main() {

        List<Transaction> transactions = getTransactions();
        for (int i = 0; i < transactions.size(); i++) {
            IO.println("Transação:" + (i+1));
            IO.println("step:" + transactions.get(i).step());
            IO.println("type:" + transactions.get(i).type().name());
            IO.println("amount:" + transactions.get(i).amount());
            IO.println("nameOrig:" + transactions.get(i).nameOrig());
            IO.println("oldbalanceOrig:" + transactions.get(i).oldbalanceOrig());
            IO.println("newbalanceOrig:" + transactions.get(i).newbalanceOrig());
            IO.println("nameDest:" + transactions.get(i).nameDest());
            IO.println("oldbalanceDest:" + transactions.get(i).oldbalanceOrig());
            IO.println("newbalanceDest:" + transactions.get(i).newbalanceDest());
            IO.println("isFraud:" + (transactions.get(i).isFraud() ? 1 : 0));
            IO.println("isFlaggedFraud:" + (transactions.get(i).isFlaggedFraud() ? 1 : 0)+ "\n");
        }
    }

    private static List<Transaction> getTransactions() {
        Transaction transaction1 = new Transaction(1, TransactionType.PAYMENT, new BigDecimal("9839.64"),
                "C1231006815", new BigDecimal("170136.0"),new BigDecimal("160296.36"),
                "M1979787155",0.0,0.0, false, false);

        Transaction transaction2 = new Transaction(743, TransactionType.CASH_OUT, new BigDecimal("850002.52"),
                "C1280323807", new BigDecimal("850002.52"),new BigDecimal("0.0"),
                "C873221189",6510099.11,7360101.63, true, false);

        return List.of(transaction1, transaction2);
    }
}
