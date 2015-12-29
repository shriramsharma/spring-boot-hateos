/**
 * 
 */
package com.walmart.platform.spring.boot.hateos.controllers;

import org.springframework.http.HttpHeaders;

/**
 * @author sshar47
 *
 */

public interface GamesController {

	public HttpHeaders createGame();

	public String getId(String id);

}
