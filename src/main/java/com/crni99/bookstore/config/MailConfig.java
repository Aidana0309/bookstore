package com.crni99.bookstore.config; // Укажите пакет вашего проекта

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com"); // Укажите здесь ваш SMTP-сервер
        mailSender.setPort(587); // Укажите здесь порт SMTP-сервера
        mailSender.setUsername("your_email@gmail.com"); // Укажите здесь вашу электронную почту
        mailSender.setPassword("your_password"); // Укажите здесь ваш пароль

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true"); // Установите в false в продакшн окружении

        return mailSender;
    }
}
