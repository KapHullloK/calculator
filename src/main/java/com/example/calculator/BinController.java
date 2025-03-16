package com.example.calculator;


import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/store/order")
public class BinController {

    BinService binService;

    public BinController(BinService binService) {
        this.binService = binService;
    }

    @GetMapping(path = "/add")
    public String addInBin(@RequestParam("prodId") Integer prodId) {
        return binService.addInBin(prodId);
    }

    @GetMapping(path = "/get")
    public List<Integer> getBin() {
        return binService.getBin();
    }
}
