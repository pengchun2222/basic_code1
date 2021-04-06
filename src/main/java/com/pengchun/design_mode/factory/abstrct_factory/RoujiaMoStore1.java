package com.pengchun.design_mode.factory.abstrct_factory;

import com.pengchun.design_mode.factory.simple_factory.RouJiaMo;
import com.pengchun.design_mode.factory.simple_factory.RouJiaMoFactory;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 * 抽象工厂
 */
public abstract class RoujiaMoStore1 {
    public abstract RouJiaMo createRouJiaMo(String type);

    /**
     * 根据传入类型卖不同的肉夹馍
     *
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type)
    {
        RouJiaMo rouJiaMo = createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }


}
