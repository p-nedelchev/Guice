package com.clouway.multibind;

import com.google.inject.Inject;

import java.util.List;
import java.util.Set;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Warehouse {
    private final Set<Suplier> supliers;

    @Inject
    public Warehouse(Set<Suplier> supliers) {
        this.supliers = supliers;
    }

    public String receiveOrder(List<Product> products) {
        StringBuilder receipt = new StringBuilder();
        for (Suplier suplier : supliers) {
            receipt.append(suplier.suply(products));
        }
        return receipt.toString();
    }
}
