package gr;

import io.quarkus.arc.profile.IfBuildProfile;
import io.quarkus.scheduler.Scheduled;

@IfBuildProfile(anyOf = {"dev", "prod", "RateLimitSchedulerProfile"})
public class RateLimitScheduler {

    @Scheduled(every = "1s")
    public void schedule() {
        System.out.println("hello " + System.currentTimeMillis());
    }
}
