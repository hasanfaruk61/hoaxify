package com.hoaxify.demo.user.validation;

import com.hoaxify.demo.user.User;
import com.hoaxify.demo.user.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        User inDB = userRepository.findByEmail(value);
        /*if (inDB != null) {
            return false;
        }else {
            return true;
        }*/
        return inDB == null;
    }
}
