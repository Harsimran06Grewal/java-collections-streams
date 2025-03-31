package BasicTesting;

public class PerformanceTest {
    public static void main(String[] args) {

    }

    public static void longRunningTask() throws InterruptedException{
        // Pause execution for 3 seconds to simulate a time-consuming process
        Thread.sleep(3000);
    }
}
