package com.coralogix.calculator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Result {

	@Id
	@GeneratedValue
	private Long id;
	
	private int result;

    public Result(int result) {
        this.result = result;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
