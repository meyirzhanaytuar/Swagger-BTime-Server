package kz.bcc.tutorial.balatime.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserUpdateDto {
    private String login;
    private String password;
}
