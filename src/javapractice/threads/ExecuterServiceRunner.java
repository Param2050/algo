package javapractice.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceRunner {

    public static void main(String args []) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(() -> {
            for(int i=0; i<10; i++) {
                System.out.println("Task 1" );
            }
        });

        executorService.execute(() -> {
            for(int i=0; i<10; i++) {
                System.out.println("Task 2" );
            }
        });

        executorService.shutdown();
    }
}
