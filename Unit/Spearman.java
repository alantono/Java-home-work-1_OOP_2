package Unit;
public class Spearman extends Characters {

// копейщик
    protected String name;

    public Spearman(String name) {
        super(150, 150, 5, 4, 15);
        this.name = name;
    }
    public String getInfo() {
        return String.format("Герой: %s; Имя: %s. Я - копейщик",
       this.getClass().getSimpleName(), this.name);
   }
    
}