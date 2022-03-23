/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.EvidencePojistnychUdalosti;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.http.HttpMethod;


/**
 *
 * @author savel
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
    
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("systemUser").password(passwordEncoder().encode("systemUser")).roles("USER")
                .and()
                .withUser("systemAdmin").password(passwordEncoder().encode("systemAdmin")).roles("ADMIN", "USER");        
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{        
        http
                .cors().disable()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/home/remove/{id}", "/home/pojisteni/remove/{id}", "/home/adresa/remove/{id}", "/home/edit/{id}", "/home/pojisteni/edit/{id}", "/home/adresa/edit/{id}").hasRole("ADMIN")
                .antMatchers("/*").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .defaultSuccessUrl("/home", true);    
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
}
