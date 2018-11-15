package com.samples.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Developer {
	
	private String name;
	private BigDecimal salary;
	private int age;
	

	public Developer(String name, BigDecimal salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

}
