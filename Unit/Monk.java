package Unit;
public class Monk extends Magisians {
    // монах
    protected String name;
    
    public Monk(String name) {
        super(150, 150, 5, 3, 12, 10, 10, 5);
        this.name = name;
    }
    public String getInfo() {
        return String.format("Герой: %s; Имя: %s. Я - монах",
       this.getClass().getSimpleName(), this.name);
   }
}
// public class Priest extends BaseHero {

//     private int elixir;
//     private int maxElixir;

//     public Priest() {
//         super(String.format("Hero_Priest #%d", ++Magician.number),
//                 Magician.r.nextInt(100, 200));
//         this.maxElixir = Magician.r.nextInt(50, 150);
//         this.elixir = maxElixir;
//     }
    
//     public String getInfo() {
//         return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
//     }
// }


// package Lesson_07.Ex007;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;

// public class Program {
//     public static void main(String[] args) {
      
//         // #region ex1 Demo

//         // BaseHero hero3 = new Magician();
//         // System.out.println(hero3.getInfo());

//         // BaseHero hero4 = new Priest();
//         // System.out.println(hero4.getInfo());

//         // #endregion

//         // #region ex2 Attack
//         // System.out.println("------");
//         // System.out.println(hero3.getInfo());
//         // System.out.println(hero4.getInfo());

//         // hero3.Attack(hero4);
        
//         // hero4.Attack(hero3);
//         // System.out.println(hero3.getInfo());
//         // System.out.println(hero4.getInfo());

//         // #endregion

//         // #region Teams

//         int teamCount = 10;
//         Random rand = new Random();
//         int magicianCount = 0;
//         int priestCount = 0;
 

//         List<BaseHero> teams = new ArrayList<>();
//         for (int i = 0; i < teamCount; i++) {
//             if (rand.nextInt(2) == 0) {
//                 teams.add(new Priest());
//                 priestCount++;
//             }
//             else{
//                 teams.add(new Magician());
//                 magicianCount++;
//             }

//             System.out.println(teams.get(i).getInfo());
//         }
//         System.out.println();
//         System.out.printf("magicalCount: %d priestCount: %d \n\n", magicianCount, priestCount);
        
//         // attack

//         // #endregion

//         // todo добавить ещё один класс и 
//         // реализовать возможность лечения героев
//     }
// }