package com.pengchun.design_mode.factory.decorate;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 * 装备接口
 */
public interface IEquip {
    /**
     * 计算攻击力
     * @return
     */
    public int calculateAttack();

    /**
     * 装备描述
     * @return
     */
    public String description();
}
