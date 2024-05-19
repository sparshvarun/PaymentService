package com.ecommerce.paymentservice.service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service("razorpay")
public class RazorpayPaymentService implements PaymentService{

    private RazorpayClient razorpayClient;

    public RazorpayPaymentService(RazorpayClient razorpayClient) {
        this.razorpayClient = razorpayClient;
    }
    @Override
    public void doPayment(String email, String phoneNumber, Double amount, Long orderId) throws RazorpayException {


        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount", amount);
        orderRequest.put("currency","INR");
        orderRequest.put("receipt", "receipt#1");
        JSONObject notes = new JSONObject();
        notes.put("notes_key_1",email);
        notes.put("notes_key_1",phoneNumber);
        orderRequest.put("notes",notes);

        Order order = razorpayClient.orders.create(orderRequest);
    }
}
