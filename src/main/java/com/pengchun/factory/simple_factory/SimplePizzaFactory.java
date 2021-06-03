package com.pengchun.factory.simple_factory;

/**
 * @author 彭淳
 * @date 2021/6/2 15:42
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        }else if(type.equals("clam")) {
            pizza = new ClamPizza();
        }else if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }else if(type.equals("veggiePizza")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
