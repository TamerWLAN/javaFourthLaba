package com.art;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

/**
 * класс сотрудника, хранит информацию о сотруднике
 * @author Artem Kozlitin
 * @version 1.2
 * @since 1.0
 */
public class Employee {
    /**Идетификатор сотрудника*/
    @NotNull
    private final int id;
    /**Имя сотрудника*/
    private final String name;
    /**Пол сотрудника*/
    private final Gender gender;
    /**Дата рождения сотрудника*/
    private final LocalDate birthDate;
    /**Подразделение сотрудника*/
    @NotNull
    private final Division division;
    /**Зарплата сотрудника*/
    private final int salary;
    /**Конструктор класса, принимающий все свойства и устанавливающий их*/
    public Employee(final int id, final String name, final Gender gender, final LocalDate birthDate, final @NotNull Division division, final int Salary) {

        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = Salary;
    }
    /**Метод, возращающий строку со всеми свойствами пользователя*/
    public String getInfo() {
        return String.format(" Id:%d \n Name: %s \n Gender: %s \n BithDate: %s \n Division id: %d \n Division name: %s \n Salary: %d \n ----------------",
                id, name, gender.toString(), birthDate.toString(), division.getId(), division.getName(), salary);
    }
}
