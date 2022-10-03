package com.coralogix.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coralogix.calculator.model.Result;
import com.coralogix.calculator.services.AddService;

@SpringBootTest
class CalculatorApplicationTests {

	@Autowired
    private AddService addservice;
	
	@Test
	void contextLoads() {
        // when
        Result result = addservice.add(2, 10);

        // then
        //assertEquals(result.getResult(), 5);
        assertEquals(result.getResult(), -8);

	}

}
