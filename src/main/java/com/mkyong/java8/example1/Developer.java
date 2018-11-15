package com.mkyong.java8.example1;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Developer {

	public String name;
	public BigDecimal salary;
	public int age;
	
	
}
