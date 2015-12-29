/**
 * 
 */
package com.walmart.platform.spring.boot.hateos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.platform.spring.boot.hateos.assemblers.GameResourceAssembler;
import com.walmart.platform.spring.boot.hateos.dto.Game;

/**
 * @author sshar47
 *
 */
@RestController
@RequestMapping(value = "/games")
public class GamesControllerImpl implements GamesController {

	@Autowired
	private GameResourceAssembler gameResourceAssembler;

	@Override
	@RequestMapping(method = RequestMethod.POST, value = "")
	public HttpHeaders createGame() {
		HttpHeaders headers = new HttpHeaders();
		return headers;
	}

	@Override
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Resource<Game> getId(@PathVariable String id) {
		Game game = new Game();
		game.setId(100);
		game.setName("Hitman");
		return gameResourceAssembler.toResource(game);
	}

}
