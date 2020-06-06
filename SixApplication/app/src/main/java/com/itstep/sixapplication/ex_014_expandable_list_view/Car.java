package com.itstep.sixapplication.ex_014_expandable_list_view;

public class Car {

    private String mark;
    private String model;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Car car = (Car) obj;
            return mark.equals(car.mark);
        }
        return false;
    }

}
