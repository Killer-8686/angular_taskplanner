package ru.masta.springboot.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity(debug = true) // true - вывод в консоль какие бины создаются, @ - для Spring контейнера, что бы находил файлы конфигурации в классе
public class SpringConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().disable(); // отключение, т.к. автоматически создается не на Spring Security
        http.httpBasic().disable(); // отключение стандартной формы авторизации

        http.requiresChannel().anyRequest().requiresSecure(); // обязательно использовать HTTPS
    }
}
