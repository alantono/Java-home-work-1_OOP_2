package Unit;
public class Arbalester extends Archer {

// Арбалетчик
    protected String name;

    public Arbalester(String name) {
        super(150, 150, 5, 3, 12, 22, 22, 3);
        this.name = name;
    }
    public String getInfo() {
        return String.format("Герой: %s; Имя: %s. Я - арбалетчик",
       this.getClass().getSimpleName(), this.name);
   }
   
}

