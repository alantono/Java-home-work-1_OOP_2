package Unit;
public class Monk extends Characters{
    // монах
    protected String name;
    protected float mana = 1;
    protected float mana_max = 1;
    

    public Monk(int x, int y, int teams, String name, float mana, float mana_max) {
        super(12, 7, 4, 0, 30, 30, 5, x, y, teams);
        this.name = name;
        this.mana = mana;
        this.mana_max = mana_max;
    }


    public String getInfo() {
        return String.format("Команда: %d; Герой: %s; Имя: %s; Скорость: %d. Я - монах",
       teams, this.getClass().getSimpleName(), this.name, speed);
   }
}
