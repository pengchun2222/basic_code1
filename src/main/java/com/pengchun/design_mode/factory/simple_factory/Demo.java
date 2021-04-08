package com.pengchun.design_mode.factory.simple_factory;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 */
public class Demo {
    public static void main(String[] args) {
        RouJiaMoFactory rouJiaMoFactory = new RouJiaMoFactory();
        RouJiaMo suan = rouJiaMoFactory.createRouJiaMo("Suan");

    }
}
