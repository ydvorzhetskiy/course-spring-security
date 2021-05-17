package edu.spingsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class UserDto {

    private long id;

    private String login;

    private String password;

    private List<String> roles;
}
