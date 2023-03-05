package Unit;

public abstract class Magisians extends Characters{
    // Маги (с подклассами Монах и Колдун)
    protected float mana;
    protected float mana_max;
    protected int treat;

    public Magisians(float hp, float hp_max, int attack, int defense, int damage, float mana, float mana_max,
            int treat) {
        super(hp, hp_max, attack, defense, damage);
        this.mana = mana;
        this.mana_max = mana_max;
        this.treat = treat;
    }
    public float getMana() {return mana;}
    // public int getMana_max() {return mana_max;}
    public int getTreat() {return treat;}
    
    
}
