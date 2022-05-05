import Config.FirexConfiguration;
import com.hubspot.dropwizard.guice.GuiceBundle;
import healthcheck.ServiceHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import modules.FirexModule;
import resources.ApiResource;

/**
 * @author naveen.chauhan on 19/04/22
 */
public class FirexService extends Application<FirexConfiguration> {

    @Override
    public void initialize(Bootstrap<FirexConfiguration> bootstrap) {
        bootstrap.addBundle(
                GuiceBundle
                        .<FirexConfiguration>newBuilder()
                        .addModule(new FirexModule())
                        .setConfigClass(FirexConfiguration.class)
                        .enableAutoConfig(getClass().getPackage().getName())
                        .build()
        );
    }

    public static void main(String[] args) throws Exception {
        new FirexService().run(args);
    }

    @Override
    public void run(FirexConfiguration firexConfiguration, Environment environment) throws Exception {
//        final ApiResource apiResource = new ApiResource(firexConfiguration.getFirstName(), firexConfiguration.getLastName());
//
//        environment.jersey().register(apiResource);
//        environment.healthChecks().register("Firex Service HealthCheck", new ServiceHealthCheck());
    }
}
