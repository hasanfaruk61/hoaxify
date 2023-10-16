package com.hoaxify.demo.user.dto;

import com.hoaxify.demo.user.User;
import com.hoaxify.demo.user.validation.UniqueEmail;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public record UserCreate(
        @NotBlank(message = "{hoaxify.constraint.username.notblank}")
        @Size(min = 4, max = 255)
        String username,

        @NotBlank
        @Email
        @UniqueEmail
        String email,

        @Size(min = 8, max = 255)
        @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", message = "{hoaxify.constraint.password.pattern}")
        String password
) {
    public User toUser() {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }


}