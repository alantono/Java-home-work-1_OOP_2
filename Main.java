// В материалы добавил xml с полями и параметрами по умолчанию. Убедиться что у вас все поля описанны. Создать в основной программе два списка. 
// Положить в них по 10 случайных персонажей. В первом только крестьянин, разбойник, снайпер или колдун. 
// Во втором крестьянин, копейщик, арбалетчик, монах. 
// Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import Unit.Arbalester;
import Unit.Characters;
import Unit.Farmer;
import Unit.Monk;
import Unit.Names;
import Unit.Rogue;
import Unit.Sniper;
import Unit.Spearman;
import Unit.Wizard;

public class Main {

    public static void main(String[] args) {

        // получаю список из 7 героев - teams

        ArrayList<Characters> teams = new ArrayList<>();
        teams.add(new Rogue(0, 0, 0, getName()));
        teams.add(new Sniper(0, 0, 0, 0, getName()));
        teams.add(new Farmer(0, 0, 0, getName(), 0));
        teams.add(new Monk(0, 0, 0, getName(), 0, 0));
        teams.add(new Spearman(0, 0, 0, getName()));
        teams.add(new Wizard(0, 0, 0, getName(), 0, 0));
        teams.add(new Arbalester(0, 0, 0, 0, getName()));

        System.out.println("++++ Teams ++++");
        for (Characters item : teams) {
            System.out.println(item.getInfo());
        }
        System.out.println("=========================================");

        // формирую первую команду teams-1 из 10ти героев (крестьян, разбойников, снайперов и колдунов)

        Random rnd = new Random();
        ArrayList<Characters> teams_1 = new ArrayList<>();
        int count = 10;
        while (count > 0) {
            switch ((teams.get(rnd.nextInt(6))).getClass().getSimpleName()) {
                case  ("Rogue"):
                    teams_1.add(new Rogue(0, 0, 1, getName()));
                    count --;
                case ("Sniper"):
                    teams_1.add(new Sniper(0, 0, 1, 32, getName()));
                    count --;
                case  ("Wizard"):
                    teams_1.add(new Wizard(0, 0, 1, getName(), 1, 1));
                    count --;
                case ("Farmer"):
                    teams_1.add(new Farmer(0, 0, 1, getName(), 1));
                    count --; } }

        System.out.println("++++ Teams - 1 ++++");
        for (Characters item : teams_1) {
            System.out.println(item.getInfo());
        }    
        System.out.println("=========================================");

        // формирую вторую команду teams-2 из 10ти героев (крестьян, копейщиков, арбалетчиков, монахов)

        ArrayList<Characters> teams_2 = new ArrayList<>();
        int count1 = 10;
        while (count1 > 0) {
            switch ((teams.get(rnd.nextInt(6))).getClass().getSimpleName()) {
                case  ("Monk"):
                    teams_2.add(new Monk(0, 0, 2, getName(), 1, 1));
                    count1 --;
                case ("Farmer"):
                    teams_2.add(new Farmer(0, 0, 2, getName(), 1));
                    count1 --;
                case  ("Spearman"):
                    teams_2.add(new Spearman(0, 0, 2, getName()));
                    count1 --;
                case ("Arbalester"):
                    teams_2.add(new Arbalester(0, 0, 2, 0, getName()));
                    count1 --;
                            } }
        System.out.println("++++ Teams - 2 ++++");
        for (Characters item : teams_2) {
            System.out.println(item.getInfo()); }
        System.out.println("=========================================");    

        // объединяю обе команды в один список

        ArrayList<Characters> list = new ArrayList<>();
        list.addAll(teams_1);
        list.addAll(teams_2);
        System.out.println("++++ Total team ++++");
        for (Characters item : list) {
            System.out.println(item.getInfo()); }

       // сортирую общий список по скорости героев 

        list.sort(new Comparator<Characters>(){
        @Override
        public int compare(Characters o1, Characters o2) {
                if (o2.getSpeed() == o1.getSpeed()) {
                return (int) (o1.getHp() - o2.getHp());
            }
                return o2.getSpeed() - o1.getSpeed();
    }
}
);
        System.out.println("=========================================");   
        System.out.println("++++ Total team Sorted by health ++++");
        for (Characters item : list) {
            System.out.println(item.getInfo()); }
 }
    
    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name; }

}
