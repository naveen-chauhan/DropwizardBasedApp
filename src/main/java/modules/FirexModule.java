package modules;

import Config.FirexConfiguration;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;

import javax.inject.Named;

/**
 * @author naveen.chauhan on 23/04/22
 */

public class FirexModule implements Module {

    @Override
    public void configure(Binder binder) {
    }

    @Provides
    @Named("firstName")
    public String provideFirstName(FirexConfiguration firexConfiguration) {
        return firexConfiguration.getFirstName();
    }

    @Provides
    @Named("lastName")
    public String provideLastName(FirexConfiguration firexConfiguration) {
        return firexConfiguration.getLastName();
    }
}
