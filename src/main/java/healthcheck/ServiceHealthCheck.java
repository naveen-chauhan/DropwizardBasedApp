package healthcheck;

import com.codahale.metrics.health.HealthCheck;

/**
 * @author naveen.chauhan on 20/04/22
 */
public class ServiceHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }

}
