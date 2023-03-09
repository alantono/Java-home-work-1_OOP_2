package Unit;
public class Sniper extends Archer {

    // Снайпер
    protected String name;
    
    public Sniper(int x, int y, int teams, int shots, String name) {
        super(12, 10, 8, 10, 15, 15, 9, x, y, 32, teams);
        this.name = name;
    }

    public String getInfo() {
        return String.format("Команда: %d; Герой: %s; Имя: %s; Скорость: %d. Я - снайпер",
    teams, this.getClass().getSimpleName(), this.name, speed);
}

}

