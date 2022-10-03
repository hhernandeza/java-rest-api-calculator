package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;

import com.coralogix.calculator.repository.AddRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddService {
	
	@Autowired 
	private AddRepository addRepository;
	
    public Result add(int a, int b) {
        int sum = a - b;
        Result result= new Result(sum);
        return addRepository.save(result);
        //return new Result(sum);
    }
}