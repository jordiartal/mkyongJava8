package com.samples.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.samples.model.Developer;
import com.samples.model.Item;

@RunWith(SpringJUnit4ClassRunner.class)
public class Java8TutorialsApplicationTests {

	@Test
	public void lambda_loop() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		items.forEach((key, value) -> {
			System.out.println("key: " + key + "   value: " + value);
			Assert.assertNotEquals((int) 0, (int) value); 
		});
	}
	
	@Test
	public void lambda_loop_object() {
		List<Developer> listado = this.getDevelopers();
		
		listado.forEach(item -> {
			System.out.println(item.toString());
			Assert.assertNotNull(item);
		});
	}
	
	/**
	 * Devuelve la edad de los developer que tienen 70000 de salario
	 */
	@Test
	public void lambda_stream() {
		List<Developer> listado = this.getDevelopers();
		List<Integer> dev = listado.stream()
			.filter(s->  new BigDecimal(70000).equals(s.getSalary()))
			.map(Developer::getAge)
			.collect(Collectors.toList());
		
		Assert.assertEquals(dev.isEmpty(), false);
		
		dev.forEach(item -> {
			System.out.println(item.toString());
		});
		
		Assert.assertEquals(2, dev.size());
	}
	
	public void grouping() {
		//3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

        Map<String, Long> counting = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.counting()));

        System.out.println(counting);

        Map<String, Integer> sum = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));

        System.out.println(sum);
	}
	
	private List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		result.add(new Developer("carles", new BigDecimal("70000"), 37));
		
		return result;
	}

	public void bastardo(Function<String, Object> action) {
		action.apply("hola");
	}
	
}
