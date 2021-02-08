package com.flow.fhrmtspringszz.service;

import com.flow.fhrmtspringszz.repository.SuperHeroRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperHeroService {

    private static final Logger log = LoggerFactory.getLogger(SuperHeroService.class);

    private final SuperHeroRepository superHeroRepository;

    @Autowired
    public SuperHeroService(SuperHeroRepository superHeroRepository) {
        this.superHeroRepository = superHeroRepository;
    }


}
