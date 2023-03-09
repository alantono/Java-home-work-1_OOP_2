package Unit;

public abstract class Characters implements GameInterface{
    protected int attack;
    protected int defense;
    protected int damage_min;
    protected int damage_max;
    protected float hp;
    protected float hp_max;
    protected int speed;
    protected int x;
    protected int y;
    protected int teams;
   

    public Characters(int attack, int defense, int damage_min, int damage_max, float hp, float hp_max, int speed, int x, int y, int teams) {
        this.attack = attack;
        this.defense = defense;
        this.damage_min = damage_min;
        this.damage_max = damage_max;
        this.hp = hp;
        this.hp_max = hp_max;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.teams = teams;
        
    }
    public float getHp() {
        return hp;
    }
    public int getSpeed() {
        return speed;
    }
    @Override
    public void step(int a) {}

    @Override
    public String getInfo() {return "Я человек!";}
    }

