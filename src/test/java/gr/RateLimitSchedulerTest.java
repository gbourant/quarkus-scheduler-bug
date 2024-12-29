package gr;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(RateLimitSchedulerProfile.class)
class RateLimitSchedulerTest {

    @Inject
    RateLimitScheduler rateLimitScheduler;

    @Test
    void test() {
        System.out.println("RateLimitSchedulerTest:");
        rateLimitScheduler.schedule();
    }

}