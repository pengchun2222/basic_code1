package com.pengchun.design_mode.factory.adapter;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 */
public class Demo {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power()) ;
        mobile.inputPower(v5Power);
    }
}
