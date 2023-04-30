package com.art;

public class Division {
    private static int startId = 0;
    private int id;
    private String name;

    public Division(final String nameOfDivision) {
        this.name = nameOfDivision;
        this.id = startId;
        ++startId;
    }

    final public int getId() {
        return this.id;
    }

    final public String getName() {
        return this.name;
    }
}
