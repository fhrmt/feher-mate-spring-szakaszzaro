package com.flow.fhrmtspringszz.entity;

import javax.persistence.Entity;

@Entity
public class Team {

    private final String id;
    private final String name;
    private final Universe universe;
    private final Kind kind;

    public Team(String id, String name, Universe universe, Kind kind) {
        this.id = id;
        this.name = name;
        this.universe = universe;
        this.kind = kind;
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

    public Kind getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", universe=" + universe +
                ", kind=" + kind +
                '}';
    }
}
