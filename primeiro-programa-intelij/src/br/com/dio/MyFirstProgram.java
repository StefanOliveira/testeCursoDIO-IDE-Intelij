package br.com.dio;

import br.com.dio.base.Order;

public class MyFirstProgram {
    public static void main(String[] args) {
        Order order = new Order( "order1234");

        System.out.println(order);
    }
}
