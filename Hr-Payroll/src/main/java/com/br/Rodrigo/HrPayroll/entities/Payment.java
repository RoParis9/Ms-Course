package com.br.Rodrigo.HrPayroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Payment
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable{
    
    private String name;
    private Double dailyIncome;
    private Integer days;

    public double getTotal(){
        return days * dailyIncome;
    }
	
}
