package com.coralogix.calculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coralogix.calculator.model.Result;

public interface AddRepository extends JpaRepository<Result,Long> { 
		
}
