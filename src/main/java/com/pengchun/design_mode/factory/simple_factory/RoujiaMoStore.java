package com.pengchun.design_mode.factory.simple_factory;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 * 简单工厂模式（肉夹馍案例）
 */
public class RoujiaMoStore {
    private RouJiaMoFactory factroy;

    public RoujiaMoStore(RouJiaMoFactory factroy)
    {
        this.factroy = factroy;
    }

    /**
     * 根据传入类型卖不同的肉夹馍
     *
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type)
    {
        RouJiaMo rouJiaMo = factroy.createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }

}
