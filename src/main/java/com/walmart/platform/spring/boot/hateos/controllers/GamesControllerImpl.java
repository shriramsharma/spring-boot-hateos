/**
 * 
 */
package com.walmart.platform.spring.boot.hateos.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sshar47
 *
 */
@RestController
@RequestMapping(value = "/games")
public class GamesControllerImpl implements GamesController {

	@Override
	@RequestMapping(method = RequestMethod.POST, value = "")
	public HttpHeaders createGame() {
		HttpHeaders headers = new HttpHeaders();
		return headers;
	}

	@Override
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public String getId(@PathVariable String id) {
		return id;
	}

}
