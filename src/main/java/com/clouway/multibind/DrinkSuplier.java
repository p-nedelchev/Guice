package com.clouway.multibind;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.List;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class DrinkSuplier implements Suplier {
    private final Company company;

    @Inject
    public DrinkSuplier(@Named("Drink") Company company) {
        this.company = company;
    }

    @Override
    public String suply(List<Product> products) {
        StringBuilder builder = new StringBuilder();
        builder.append(company.name);
        builder.append(" has delivered: \n");
        for (Product product : products) {
            if (product.getType().equals("Drink")) {
                builder.append(product.getName()).append(":").append(product.getQuantity()).append("\n");
            }
        }
        return builder.toString();
    }

}
