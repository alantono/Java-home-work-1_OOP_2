package Unit;
public class Farmer extends Characters {

    // крестьянин
    protected String name;
    protected int delivery;


    public Farmer(int x, int y, int teams, String name, int delivery) {
        super(1, 1, 1, 1, 1, 1, 3, x, y, teams);
        this.name = name;
        this.delivery = delivery;
    }
    public Integer getFeed() {
        return delivery;
    }
    public String getInfo() {
        return String.format("Команда: %d; Герой: %s; Имя: %s; Скорость: %d. Я - крестьянин",
       teams, this.getClass().getSimpleName(), this.name, speed);
   }
}
