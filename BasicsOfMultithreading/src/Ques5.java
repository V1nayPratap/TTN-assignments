//Use isShutDown() and isTerminated() with ExecutorService.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques5 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running");
            }
        });
        executorService.shutdownNow();
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
    }
}