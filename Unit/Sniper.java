package Unit;
public class Sniper extends Archer {

    // Снайпер
    protected String name;
    
    public Sniper(String name) {
        super(150, 150, 4, 3, 12, 30, 30, 5);
        this.name = name;
    }
    @Override
    public String getInfo() {
        return String.format("Герой: %s; Имя: %s. Я - снайпер",
    this.getClass().getSimpleName(), this.name);
}

}

