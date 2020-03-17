public enum Ability {
    JAB(2),
    OVERHAND(5),
    SPINNINGBACKFIST(10),
    SIDEKICK(15),
    HEADKICK(25);

    private int damage;

    private Ability(int dmg){
        this.damage = dmg;
    }

    public int getDamage() {
        return damage ;
    }
    public static int getAbility () {
        int index = (int) (Math.random()*Ability.values().length);
        System.out.println(Ability.values()[index].name());
        return index;


    }
}
