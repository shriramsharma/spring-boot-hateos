/**
 * 
 */
package com.walmart.platform.spring.boot.hateos.controllers;

import org.springframework.hateoas.Resource;
import org.springframework.http.HttpHeaders;

import com.walmart.platform.spring.boot.hateos.dto.Game;

/**
 * @author sshar47
 *
 */

public interface GamesController {

	public HttpHeaders createGame();

	public Resource<Game> getId(String id);

}
