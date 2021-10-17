package br.com.anderson.model;

import java.math.BigDecimal;

public class TaxService implements Tax{

    private BigDecimal percentTaxService = new BigDecimal("12.00");

    @Override
    public BigDecimal calcTax(BigDecimal baseAmount)    {
        return  baseAmount.multiply(percentTaxService)
                .divide(new BigDecimal("100.00"));
    }
}
