package br.com.anderson.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order implements Tax{

    private List<Tax> taxes;

    private BigDecimal amountOrder;

    public Order() {
        this.taxes = new ArrayList<>();
        this.amountOrder = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal calcTax(BigDecimal baseAmount) {
        BigDecimal valorTotal =
                taxes.stream()
                        .map(tax -> tax.calcTax(baseAmount))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);
        return valorTotal;
    }


    public BigDecimal getAmountOrderPlusTax() {
        return amountOrder.add(calcTax(amountOrder));
    }

    public void setAmountOrder(BigDecimal amountOrder) {
        this.amountOrder = amountOrder;
    }

    public void addTax(Tax tax){
        taxes.add(tax);
    }
}
