package com.ecommerce.paymentservice.service;

import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
     void doPayment(String email, String phoneNumber, Double amount, Long orderId)throws Exception;
        // Payment logic

}
