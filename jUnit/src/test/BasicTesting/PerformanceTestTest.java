package BasicTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

class PerformanceTestTest {

    // This test ensures that the long-running task completes within the specified time limit
    // The @Timeout annotation enforces a maximum execution time of 2 seconds.
    // @throws InterruptedException if the thread is interrupted during execution.
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void longRunningTask() throws InterruptedException{
        PerformanceTest.longRunningTask();
    }
}