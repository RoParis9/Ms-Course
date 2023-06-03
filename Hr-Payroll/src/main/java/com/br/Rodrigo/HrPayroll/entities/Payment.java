package com.br.Rodrigo.HrPayroll.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Payment implements Serializable{
    
    private String name;
    private Double dailyIncome;
    private Integer days;

    public Payment (String name, Double dailyIncome, Integer days){
        super();
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;

    }
    public double getTotal(){
        return days * dailyIncome;
    }
	
}
