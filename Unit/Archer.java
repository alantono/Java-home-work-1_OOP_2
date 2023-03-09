package Unit;

public abstract class Archer extends Characters{
// Лучник (с подклассами Арбалетчик, Снайпер)
    int shots;

    public Archer(int attack, int defense, int damage_min, int damage_max, float hp, float hp_max, int speed, int x,
            int y, int shots, int teams) {
        super(attack, defense, damage_min, damage_max, hp, hp_max, speed, x, y, teams);
        this.shots = shots;
    }

    public int getShots() {return shots;}
    
}
