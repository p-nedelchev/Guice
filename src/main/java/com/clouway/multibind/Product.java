package com.clouway.multibind;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Product {
    private final String type;
    private final String name;
    private final Integer quantity;

    public Product(String type, String name, Integer quantity) {
        this.type = type;
        this.name = name;
        this.quantity = quantity;
    }


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
