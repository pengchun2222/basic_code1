package com.pengchun.design_mode.factory.decorate;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 * 蓝宝石装饰类
 */
public class BlueGemDecorator implements IEquipDecorator{
    private IEquip iEquip;

    public BlueGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int calculateAttack() {
        return iEquip.calculateAttack() + 100;
    }

    @Override
    public String description() {
        return "攻击力上升50";
    }
}
