package com.hoaxify.demo.user.exception;

import com.hoaxify.demo.shared.Messages;
import org.springframework.context.i18n.LocaleContextHolder;

public class ActivationNotificationException extends RuntimeException {
    public ActivationNotificationException() {
        super(Messages.getMessageForLocale("hoaxify.create.user.email.failure", LocaleContextHolder.getLocale()));
    }
}
