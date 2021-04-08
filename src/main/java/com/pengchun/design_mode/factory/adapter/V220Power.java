package com.pengchun.design_mode.factory.adapter;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 */
public class V220Power {
    /**
     * 提供220V电压
     * @return
     */
    public int provideV220Power()
    {
        System.out.println("我提供220V交流电压。");
        return 220 ;
    }

}
