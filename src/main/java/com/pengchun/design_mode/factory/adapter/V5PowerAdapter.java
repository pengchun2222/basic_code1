package com.pengchun.design_mode.factory.adapter;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 */
public class V5PowerAdapter implements V5Power{
    V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {
        int i = v220Power.provideV220Power();
        //power经过各种操作-->5
        System.out.println("适配器：我悄悄的适配了电压。");
        return 5 ;
    }
}
