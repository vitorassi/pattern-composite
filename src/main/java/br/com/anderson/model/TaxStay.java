package br.com.anderson.model;

import java.math.BigDecimal;

public class TaxStay implements Tax{

    private BigDecimal percentTaxStay = new BigDecimal("2.00");

    private BigDecimal amountMaxTaxStay = new BigDecimal("12.00");


    @Override
    public BigDecimal calcTax(BigDecimal baseAmount) {

        BigDecimal totalTax = baseAmount.multiply(percentTaxStay)
                .divide(new BigDecimal("100.00"));

        if(totalTax.compareTo(amountMaxTaxStay) == 1){
            return amountMaxTaxStay;
        }
        return totalTax;
    }
}
