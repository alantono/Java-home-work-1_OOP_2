package Unit;
public class Arbalester extends Archer {

// Арбалетчик
    protected String name;

    public Arbalester(int x, int y, int teams, int shots, String name) {
        super(6, 3, 2, 3, 10, 10, 4, x, y, 16, teams);
        this.name = name;
    }

    public String getInfo() {
        return String.format("Команда: %d; Герой: %s; Имя: %s; Скорость: %d. Я - арбалетчик",
       teams, this.getClass().getSimpleName(), this.name, speed);
   }
   
}

