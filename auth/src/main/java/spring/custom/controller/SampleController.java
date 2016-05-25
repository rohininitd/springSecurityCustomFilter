package spring.custom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

	@RequestMapping(value = "/secured", method = RequestMethod.GET)
	public ResponseEntity<Object> secured(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<Object>("Success",
				HttpStatus.OK);
	}
	@RequestMapping(value = "/accessAll", method = RequestMethod.GET)
	public ResponseEntity<Object> access(HttpServletRequest request, HttpServletResponse response) {
		return new ResponseEntity<Object>("Success",
				HttpStatus.OK);
	}
}
