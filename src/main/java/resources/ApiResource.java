package resources;

import com.codahale.metrics.annotation.Timed;
import model.Person;

//import javax.inject.Inject;
//import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

/**
 * @author naveen.chauhan on 19/04/22
 */

@Path("/name")
@Produces(MediaType.APPLICATION_JSON)
public class ApiResource {

    //    @Inject
    private final String defaultFirstName;

    //    @Inject
    private final String defaultLastName;

    public ApiResource(
//            @Named("firstName")
            String defaultFirstName,
//                       @Named("lastName")
            String defaultLastName) {
        this.defaultFirstName = defaultFirstName;
        this.defaultLastName = defaultLastName;
    }

    @GET
    @Timed
    public String getName(@QueryParam("firstName")
//                          @DefaultValue("Firex")
                                  Optional<String> firstName,
                          @QueryParam("lastName")
//                          @DefaultValue("IIT ISM")
                                  Optional<String> lastName) {
        Person person = new Person(firstName.orElse(defaultFirstName), lastName.orElse(defaultLastName));

        return person.toString();
    }
}
