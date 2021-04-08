package com.pengchun.design_mode.factory.adapter;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 */
public class Mobile {
    /**
     * 充电
     * @param power
     */
    public void inputPower(V5Power power)
    {
        int provideV5Power = power.provideV5Power();
        System.out.println("手机（客户端）：我需要5V电压充电，现在是-->" + provideV5Power + "V");
    }

}
