/**
 * 
 */
package com.mkyong.java8.example3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jordi.Artal
 *
 */
public class Stream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> lines = Arrays.asList("spring", "node", "mkyong");

		System.out.println("This method filters a List using Stream methods");
		
		List<String> result = lines.stream() // convert list to stream
				.filter(line -> !"mkyong".equals(line)) // we dont like mkyong
				.collect(Collectors.toList()); // collect the output and convert streams to a List

		result.forEach(System.out::println); // output : spring, node

	}

}
