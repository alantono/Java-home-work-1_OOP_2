package Unit;

public abstract class Characters implements GameInterface{

    protected float hp;
    protected float hp_max = 100;
    protected int attack;
    protected int defense;
    protected int damage;

    public Characters(float hp, float hp_max, int attack, int defense, int damage) {
        this.hp = hp;
        this.hp_max = hp_max;
        this.attack = attack;
        this.defense = defense;
        this.defense = damage;
    }
    @Override
    public void step(int a) {}

    @Override
    public String getInfo() {return "Я человек!";}
    }

