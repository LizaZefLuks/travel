package com.stp.controller;

import com.stp.model.Country;
import com.stp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/")
    public String index(){
        return "index.html";
    }
}
