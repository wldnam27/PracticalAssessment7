package test.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private String id;
    private String username; //ada id sama name
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String userStatus;


}
