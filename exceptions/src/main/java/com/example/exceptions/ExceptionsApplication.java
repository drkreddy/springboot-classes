package com.example.exceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ExceptionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionsApplication.class, args);
	}

}
@ControllerAdvice
@RestController("/")
class Controller{

	@GetMapping("sample")
	public String somegetter(@RequestParam(defaultValue = "2") Integer id) throws Exception{
		if(id==1){
			return "ONE";
		}
		if(id==5){
			throw new IllegalArgumentException("I dont like 5");
		}
		if(id==6){
			throw new RuntimeException("I cannot handle");
		}
		if(id==4){
			throw new MyOwnException("I cannot handle 4");
		}

		if(id==10){
			throw new IOException(("I am IO Exception"));
		}
		return "TWO";
	}

//	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> exceptionhandler(IllegalArgumentException e){
		return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> runtim(RuntimeException e){
		return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);

	}
}

//@ControllerAdvice
//class ExceptionHandler{
//
//@org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
//	public ResponseEntity<String> rr(RuntimeException e){
//		return new ResponseEntity(e.getMessage()+"---Controller Advice", HttpStatus.BAD_REQUEST);
//
//	}
//
//}


@org.springframework.stereotype.Controller
class CustomErrorController implements ErrorController {

	@RequestMapping("/error")
	@ResponseBody
	public String handleError(HttpServletRequest request) {
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
		return String.format("<html><body><h2>Sample Error Page</h2><div>Status code: <b>%s</b></div>"
						+ "<div>Exception Message: <b>%s</b></div><body></html>",
				statusCode, exception==null? "N/A": exception.getMessage());
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}