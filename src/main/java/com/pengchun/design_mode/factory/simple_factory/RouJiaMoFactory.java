package com.pengchun.design_mode.factory.simple_factory;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 */
public class RouJiaMoFactory {
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan")) {
            rouJiaMo = new SuanRouJiaMoImpl();

        } else if (type.equals("Tian")) {
            rouJiaMo = new TianRouJiaMoImpl();
        } else if (type.equals("La")) {
            rouJiaMo = new LaRouJiaMoImpl();
        }
        return rouJiaMo;
    }
}
