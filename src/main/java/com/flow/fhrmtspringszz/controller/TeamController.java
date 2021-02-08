package com.flow.fhrmtspringszz.controller;

import com.flow.fhrmtspringszz.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teams")
public class TeamController {

    private static final Logger log = LoggerFactory.getLogger(TeamController.class);


    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    public addTeam(){

    }

    public updateTeam(){

    }

    public getTeams(){

    }

    public getTeamById(){

    }


}
