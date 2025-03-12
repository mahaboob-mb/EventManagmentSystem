package cts.ems.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import cts.ems.dto.ApiException;
import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@ExceptionHandler(exception = TicketNotFoundException.class)
	public ResponseEntity<?> handlerTicketNotFoundException(TicketNotFoundException ex, HttpServletRequest request){
		ApiException api = new ApiException(LocalDateTime.now(),request.getRequestURI(),ex.getMessage());
		return new ResponseEntity<>(api,HttpStatus.NOT_FOUND);
	}

}
