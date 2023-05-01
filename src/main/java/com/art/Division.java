package com.art;

import org.jetbrains.annotations.NotNull;

/**
 * класс подразделения, хранит айди и и имя подразделения
 * @author Artem Kozlitin
 * @version 1.0
 * @since 1.0
 */
public class Division {
    /**Переменная хранящая первый свободный идентификатор*/
    private static int startId = 0;
    /**Идентификатор данного подразделения*/
    @NotNull
    private final int id;
    /**Название данного подразделения*/
    private final String name;

    /**
     * Конструктор класса, присваивающий имя подразделению
     * выдаётся первый свободный идентификатор
     * увеличивает значение свободного идентификатора на 1
     * @param nameOfDivision
     */
    public Division(final String nameOfDivision) {
        this.name = nameOfDivision;
        this.id = startId;
        ++startId;
    }

    /**
     * Метод возвращающий идентификатор
     * @return идентификатор даннаого подразделения
     */
    final public int getId() {
        return this.id;
    }

    /**
     * Метод возвращающий имя подразделения
     * @return имя данного подразделения
     */
    final public String getName() {
        return this.name;
    }
}
