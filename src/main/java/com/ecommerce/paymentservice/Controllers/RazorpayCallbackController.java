package com.ecommerce.paymentservice.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/razorpaycallback")
public class RazorpayCallbackController {
    @GetMapping("")
    public void receiveCallback(){
        System.out.println("callback method called");

    }
}
