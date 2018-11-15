/**
 * 
 */
package com.mkyong.java8.example3;

import lombok.Data;

/**
 * @author Jordi.Artal
 *
 */
@Data
public class Person {
	
	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
