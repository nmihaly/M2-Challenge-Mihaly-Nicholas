package com.company.MonthAndMathService.models;

import java.util.Objects;

public class Month {

    private int number;
    private String name;

    public Month(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return number == month.number && Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
