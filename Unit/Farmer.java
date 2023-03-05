package Unit;
public class Farmer extends Characters {

    // крестьянин
    protected String name;
    protected int feed;
  
    public Farmer(String name, int feed) {
        super(150, 150, 2, 2, 2);
        this.name = name;
        this.feed = feed;
    }

    public Integer getFeed() {
        return feed;
    }
    public String getInfo() {
        return String.format("Герой: %s; Имя: %s. Я - крестьянин",
       this.getClass().getSimpleName(), this.name);
   }
}
