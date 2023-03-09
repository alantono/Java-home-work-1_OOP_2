package Unit;
public class Rogue extends Characters {

    // Разбойник
    protected String name;

    public Rogue(int x, int y, int teams, String name) {
        super(8, 3, 2, 4, 10, 10, 6, x, y, teams);
        this.name = name;
    }

    public String getInfo() {
        return String.format("Команда: %d; Герой: %s; Имя: %s; Скорость: %d. Я - разбойник",
       teams, this.getClass().getSimpleName(), this.name, speed);
   }
        
    }