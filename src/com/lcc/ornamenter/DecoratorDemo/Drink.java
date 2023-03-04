package com.lcc.ornamenter.DecoratorDemo;

/**
 * @author Licc
 * @date 2023/1/10 9:05 AM
 */
public abstract class Drink {
    public String des;
    private Double price =0.00;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract  double cost();
}