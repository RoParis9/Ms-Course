package com.br.Rodrigo.HrPayroll.entities;

import java.io.Serializable;

import lombok.Data;

/**
 * Payment
 */
@Data
public class Payment implements Serializable{
    
    private String name;
    private Double dailyIncome;
    private Integer days;

    public double getTotal(){
        return days * dailyIncome;
    }
	
}
