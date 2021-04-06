package com.pengchun.design_mode.factory.abstrct_factory;

import com.pengchun.design_mode.factory.simple_factory.RouJiaMo;
import com.pengchun.design_mode.factory.simple_factory.RouJiaMoFactory;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 * 具体工厂
 */
public class XiAnRoujiaMoStore extends RoujiaMoStore1{
    @Override
    public RouJiaMo createRouJiaMo(String type)
    {
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan"))
        {
            rouJiaMo = new XianSuanRouJiaMo();

        } else if (type.equals("Tian"))
        {
            rouJiaMo = new XianTianRouJiaMo();
        } else if (type.equals("La"))
        {
            rouJiaMo = new XianLaRouJiaMo();
        }
        return rouJiaMo;

    }


}
