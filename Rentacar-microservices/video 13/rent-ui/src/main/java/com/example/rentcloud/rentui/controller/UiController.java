package com.example.rentcloud.rentui.controller;

import com.example.rentcloud.rentui.config.AccessToken;
import org.example.rentcloud.commons.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

@Controller
@EnableOAuth2Sso
public class UiController extends WebSecurityConfigurerAdapter {

    @Autowired
    RestTemplate restTemplate;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/")
                .permitAll()
                .anyRequest()
                .authenticated();
    }

    @RequestMapping(value = "/")
    public String loadUi(){
        return "My Home";
    }

    @RequestMapping(value = "/secure")
    public String loadSecuredUi(){
        return "Secure";
    }

    @RequestMapping(value = "/customers")
    public String loadCustomers(Model model){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", AccessToken.getAccessToken());
        HttpEntity<Customer> customerHttpEntity = new HttpEntity<>(httpHeaders);
        try {
            ResponseEntity<Customer[]> responseEntity = restTemplate.exchange("http://localhost:8181/service/customers", HttpMethod.GET, customerHttpEntity, Customer[].class);
            model.addAttribute("customer", responseEntity.getBody());
        }catch (HttpStatusCodeException e){
            ResponseEntity responseEntity = ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders()).body(e.getResponseBodyAsString());
            model.addAttribute("error",responseEntity);
        }
        return "Secure";
    }

}
