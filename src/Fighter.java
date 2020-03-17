import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Fighter {



    private String userName;
    private int hp;
    private String special;
    private int durability;
    private String Chin;
    private String rage;



    public Fighter(String userName, int initialHp, String special) {
        this.userName = userName;
        hp = initialHp;
        this.special = special;
    }
    public Fighter(){

    }

    public int attack() {
        int ability = Ability.getAbility();
        int damage = Ability.values()[ability].getDamage();



        return damage;
    }

    public void dealDamage(int damage) {
        hp -= damage;

    }

    public boolean isDead() {
        return hp <= 0;
    }

    public String getUserName() {
        return userName;
    }

    public String getSpecial() {
        return special;
    }

    public int getHp() {
        return hp;
    }

    public String toString () {
        return userName;
    }

}

