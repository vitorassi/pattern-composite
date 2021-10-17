package br.com.anderson.model;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calcTax(BigDecimal baseAmount);
}
