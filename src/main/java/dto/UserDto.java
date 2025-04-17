package dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import enums.UserRoleEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO for {@link entity.User}
 */
@Getter
@Setter
public class UserDto implements Serializable {
    Long id;
    String username;
    @JsonIgnore
    String password;
    String fullName;
    String email;
    String phone;
    UserRoleEnum role;
}