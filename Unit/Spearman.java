package Unit;
public class Spearman extends Characters {

// копейщик
    protected String name;

    public Spearman(int x, int y, int teams, String name) {
        super(4, 5, 1, 3, 10, 10, 4, x, y, teams);
        this.name = name;
    }

    public String getInfo() {
        return String.format("Команда: %d; Герой: %s; Имя: %s; Скорость: %d. Я - копейщик",
       teams, this.getClass().getSimpleName(), this.name, speed);
   }
    
}