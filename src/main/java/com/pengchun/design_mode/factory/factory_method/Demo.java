package com.pengchun.design_mode.factory.factory_method;

import com.pengchun.design_mode.factory.simple_factory.RouJiaMo;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 */
public class Demo {
    public static void main(String[] args) {
        RoujiaMoStore1 roujiaMoStore1 = new XiAnRoujiaMoStore();
        RouJiaMo suan = roujiaMoStore1.sellRouJiaMo("Suan");
        System.out.println(suan);
    }
}
