package com.java.rateservece.service;

import com.java.rateservece.entity.Rate;
import com.java.rateservece.rep.RateRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateServer {
    @Autowired
    private RateRep rateRep;

    public Rate getRateByType(String type) {
        Rate rate = RateRep.findByType(type).orElseThrow(() -> new RuntimeException("Rate Not Found: " + type));
        return rate;
    }
}
