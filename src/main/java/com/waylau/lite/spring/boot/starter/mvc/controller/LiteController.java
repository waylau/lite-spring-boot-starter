/**
 * Welcome to https://waylau.com
 */
package com.waylau.lite.spring.boot.starter.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waylau.lite.spring.boot.starter.Lite;


/**
 * Lite Controller.
 * 
 * @since 1.0.0 2019年2月14日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
@RequestMapping("/lite")
public class LiteController {
	
	@GetMapping
	public Lite sayHi() {
		return new Lite("waylau.com", "1.0.0");
	}

}
