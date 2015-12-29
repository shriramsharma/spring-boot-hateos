package com.playground.spring.boot.hateos.assemblers;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.stereotype.Component;

import com.playground.spring.boot.hateos.controllers.GamesControllerImpl;
import com.playground.spring.boot.hateos.dto.Game;

@Component
public class GameResourceAssembler
		implements ResourceAssembler<Game, Resource<Game>> {

	@Override
	public Resource<Game> toResource(Game game) {
		Resource<Game> resource = new Resource<Game>(game);
		resource.add(ControllerLinkBuilder.linkTo(GamesControllerImpl.class)
				.slash(game.getId()).withRel("doors"));
		resource.add(ControllerLinkBuilder.linkTo(GamesControllerImpl.class)
				.slash(game.getId()).withSelfRel());
		return resource;
	}

}
