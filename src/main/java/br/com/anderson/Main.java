package br.com.anderson;

import br.com.anderson.model.Order;
import br.com.anderson.model.TaxService;
import br.com.anderson.model.TaxStay;

import java.math.BigDecimal;

public class Main {


    public static void main(String[] args){

        Order order = new Order();

        order.setAmountOrder(new BigDecimal("105.00"));
        order.addTax(new TaxService());
        order.addTax(new TaxStay());

        System.out.println( " Total Amount Order: " +  order.getAmountOrderPlusTax().toString());

    }
}
