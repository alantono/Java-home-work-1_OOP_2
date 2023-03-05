package Unit;

public abstract class Archer extends Characters{
// Лучник (с подклассами Арбалетчик, Снайпер)
    int shots;
    int max_shots;
    float distance;

        public Archer(float hp, float hp_max, int attack, int defense, int damage, int shots, int max_shots,
            float distance) {
        super(hp, hp_max, attack, defense, damage);
        this.shots = shots;
        this.max_shots = max_shots;
        this.distance = distance;
    }
    
    public float getDistance() {return distance;}
    public int getMax_shots() {return max_shots;}
    public int getShots() {return shots;}
    
}
