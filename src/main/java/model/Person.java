package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author naveen.chauhan on 20/04/22
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Person {

    @JsonProperty
    private String firstName;

    @JsonProperty
    private String lastName;

    @Override
    public String toString() {
        return "Hello Mr/Mrs " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
