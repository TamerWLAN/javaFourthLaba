package com.art;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private Division division;
    private int Salary;

    public Employee(final int id, final String name, final Gender gender,
                    final LocalDate birthDate, final Division division, final int Salary) {

        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = division;
        this.Salary = Salary;
    }

    public  String getInfo() {
        return "";
    }
}
