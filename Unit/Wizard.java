package Unit;
public class Wizard extends Magisians{

    // Колдун

    protected String name;

    public Wizard(String name) {
        super(150, 150, 5, 3, 12, 10, 10, 6);
        this.name = name;
    }
    public String getInfo() {
        return String.format("Герой: %s; Имя: %s. Я - колдун",
       this.getClass().getSimpleName(), this.name);
   }

}