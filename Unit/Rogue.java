package Unit;
public class Rogue extends Characters {

    // Разбойник
    protected String name;

    public Rogue(String name) {
        super(150, 150, 4, 2, 10);
        this.name = name;
    }
    public String getInfo() {
        return String.format("Герой: %s; Имя: %s. Я - разбойник",
       this.getClass().getSimpleName(), this.name);
   }
        
    }