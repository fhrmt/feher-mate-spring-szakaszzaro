package com.flow.fhrmtspringszz.entity;

import javax.persistence.Entity;

@Entity
public class SuperHero {

    private final String id;
    private final String name;
    private final Universe universe;
    private final Team team;
    private final Boolean hero;

    public SuperHero(String id, String name, Universe universe, Team team, Boolean hero) {
        this.id = id;
        this.name = name;
        this.universe = universe;
        this.team = team;
        this.hero = hero;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Universe getUniverse() {
        return universe;
    }

    public Team getTeam() {
        return team;
    }

    public Boolean getHero() {
        return hero;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", universe=" + universe +
                ", team=" + team +
                ", hero=" + hero +
                '}';
    }
}
