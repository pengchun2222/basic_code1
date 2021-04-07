package com.pengchun.design_mode.factory.decorate;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 * 武器
 */
public class WeaponQuip implements IEquip{
    @Override
    public int calculateAttack() {
        return 1000;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }
}
