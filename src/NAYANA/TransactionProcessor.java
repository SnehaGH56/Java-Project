package NAYANA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TransactionProcessor {
    private ExecutorService executor;
    
    public TransactionProcessor() {
        this.executor = Executors.newFixedThreadPool(5);
    }
    
    public Future<String> processTransactionAsync(Runnable transaction) {
        return executor.submit(() -> {
            transaction.run();
            return "Transaction processed successfully";
        });
    }
    
    public void shutdown() {
        executor.shutdown();
    }
}
