package com.allgays.bestiary.Model;

public class Monster {
    private String monster_name, monster_danger, monster_type, monster_armor,monster_hp,monster_speed;

    private Monster() {}

    public Monster(String monster_name, String monster_danger, String monster_type, String monster_armor, String monster_hp, String monster_speed) {
        this.monster_name = monster_name;
        this.monster_danger = monster_danger;
        this.monster_type = monster_type;
        this.monster_armor = monster_armor;
        this.monster_hp = monster_hp;
        this.monster_speed = monster_speed;
    }

    public String getMonster_name() {
        return monster_name;
    }

    public void setMonster_name(String monster_name) {
        this.monster_name = monster_name;
    }

    public String getMonster_danger() {
        return monster_danger;
    }

    public void setMonster_danger(String monster_danger) {
        this.monster_danger = monster_danger;
    }

    public String getMonster_type() {
        return monster_type;
    }

    public void setMonster_type(String monster_type) {
        this.monster_type = monster_type;
    }

    public String getMonster_armor() {
        return monster_armor;
    }

    public void setMonster_armor(String monster_armor) {
        this.monster_armor = monster_armor;
    }

    public String getMonster_hp() {
        return monster_hp;
    }

    public void setMonster_hp(String monster_hp) {
        this.monster_hp = monster_hp;
    }

    public String getMonster_speed() {
        return monster_speed;
    }

    public void setMonster_speed(String monster_speed) {
        this.monster_speed = monster_speed;
    }
}
