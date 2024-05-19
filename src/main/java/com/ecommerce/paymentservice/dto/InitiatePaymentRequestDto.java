package com.ecommerce.paymentservice.dto;

import lombok.Data;

@Data
public class InitiatePaymentRequestDto {
    private String email;
    private String phoneNumber;
    private Double amount;
    private Long orderId;
}
