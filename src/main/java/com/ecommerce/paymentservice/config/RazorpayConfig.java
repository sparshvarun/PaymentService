package com.ecommerce.paymentservice.config;

import com.razorpay.RazorpayClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayConfig {
    @Value(value = "${razorpay.key.id}")
    private String razorpayKeyId;

    @Value(value = "${razorpay.key.secret}")
    private String razorpayKeySecret;

    @Bean
    public RazorpayClient createRazorpayClient()throws Exception{
        return new RazorpayClient(razorpayKeyId, razorpayKeySecret);
    }
}
