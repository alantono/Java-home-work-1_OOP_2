package Unit;
public class Wizard extends Characters{

    // Колдун

    protected String name;
    protected float mana = 1;
    protected float mana_max = 1;

    public Wizard(int x, int y, int teams, String name, float mana, float mana_max) {
        super(17, 12, 5, 0, 30, 30, 9, x, y, teams);
        this.name = name;
        this.mana = mana;
        this.mana_max = mana_max;
    }

    public String getInfo() {
        return String.format("Команда: %d; Герой: %s; Имя: %s; Скорость: %d. Я - колдун",
       teams, this.getClass().getSimpleName(), this.name, speed);
   }

}