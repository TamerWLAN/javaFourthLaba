package com.art;

import org.jetbrains.annotations.NotNull;

public class Division {
    private static int startId = 0;
    @NotNull
    private final int id;
    private final String name;

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
