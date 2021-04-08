package com.pengchun.design_mode.factory.decorate;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 * 暗器
 */
public class HiddenWeaponsQuip implements IEquip{

    @Override
    public int calculateAttack() {
        return 300;
    }

    @Override
    public String description() {
        return "小李飞刀";
    }
}
