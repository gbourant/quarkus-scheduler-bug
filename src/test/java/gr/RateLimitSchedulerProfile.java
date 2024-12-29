package gr;

import io.quarkus.test.junit.QuarkusTestProfile;

public class RateLimitSchedulerProfile implements QuarkusTestProfile {
    @Override
    public String getConfigProfile() {
        return "test,RateLimitSchedulerProfile";
    }
}
