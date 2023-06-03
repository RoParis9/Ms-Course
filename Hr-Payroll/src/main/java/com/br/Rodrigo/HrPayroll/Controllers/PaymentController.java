package com.br.Rodrigo.HrPayroll.Controllers;

import com.br.Rodrigo.HrPayroll.Services.PaymentService;
import com.br.Rodrigo.HrPayroll.entities.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PaymentController
 */
@RestController
@RequestMapping(value = "/payments")
public class PaymentController {
    
    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable long workerId, @PathVariable Integer days){

        Payment payment = paymentService.getPayment(workerId, days);

        return ResponseEntity.ok().body(payment);

    }
}
