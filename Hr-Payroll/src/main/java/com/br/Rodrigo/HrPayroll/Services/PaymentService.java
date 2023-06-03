package com.br.Rodrigo.HrPayroll.Services;

import com.br.Rodrigo.HrPayroll.entities.Payment;

import org.springframework.stereotype.Service;

/**
 * PaymentService
 */
@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){

        return new Payment("Alex", 200.0,days);
    }
    
	
}
