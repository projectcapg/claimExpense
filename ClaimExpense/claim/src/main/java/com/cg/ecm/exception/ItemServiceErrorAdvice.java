package com.cg.ecm.exception;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



@ControllerAdvice
public class ItemServiceErrorAdvice {
	@ResponseBody
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value=Exception.class)
	protected ErrorInfo handleConflict(Exception e,HttpServletRequest request)
	{
		
		String bodyOfResponse=e.getMessage();
		String uri=request.getRequestURL().toString();
		System.out.println("Error Message: "+bodyOfResponse+" Req URL: "+uri);
		return new ErrorInfo(uri,bodyOfResponse);
	}


	@ExceptionHandler({ItemNotFoundException.class,SQLException.class})
	protected ResponseEntity<String> handleConflict2(ItemNotFoundException unf)
	{
		return error(HttpStatus.INTERNAL_SERVER_ERROR,unf);
		
	}


	protected ResponseEntity<String> error(HttpStatus status,ItemNotFoundException ee)
	{
		
		return ResponseEntity.status(status).body(ee.getMessage());
	}
}