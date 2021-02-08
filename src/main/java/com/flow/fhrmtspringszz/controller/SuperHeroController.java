package com.flow.fhrmtspringszz.controller;

import com.flow.fhrmtspringszz.service.SuperHeroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("super-hero")
public class SuperHeroController {


    private static final Logger log = LoggerFactory.getLogger(SuperHeroController.class);

    private final SuperHeroService superHeroService;


    public SuperHeroController(SuperHeroService superHeroService) {
        this.superHeroService = superHeroService;
    }


    public addSuperHero(){

    }

    public updateSuperHero(){

    }

    public getSuperHeros(){

    }

    public getSuperHeroById(){

    }
}
