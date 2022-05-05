package Config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import lombok.*;

/**
 * @author naveen.chauhan on 19/04/22
 */

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FirexConfiguration extends Configuration {

    @JsonProperty
    private String firstName;

    @JsonProperty
    private String lastName;

}
