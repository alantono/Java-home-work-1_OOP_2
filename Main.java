// Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. 
// Для каждого сформировать список свойств и возможных действий. 
// Например свойство скорость, действие нанести удар. 
// Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. 
// Создать этот класс. Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. 
// В основной программе создать по одному экземпляру каждого типа персонажей.

// Доработать дерево классов так, чтобы экземпляры классов создавались конструктором с именем в параметре а остальные параметры инициализировали 
// сами в зависимости от персонажа. Добавить файл интерфейса в котором описать два метода, void step(); и String getInfo(); Добавить реализацию 
// интерфейса в ваш коренной абстрактный класс. Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер" и так далее в 
// зависимости от типа персонажа. В основном классе создать список и добавить в него 10 случаных персонажей. 
// Пройти по списку и вывести строку возвращаемую getInfo.

import java.util.ArrayList;
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

        ArrayList<Characters> teams = new ArrayList<>();
        teams.add(new Rogue(getName()));
        teams.add(new Sniper(getName()));
        teams.add(new Farmer(getName(), 0));
        teams.add(new Monk(getName()));
        teams.add(new Spearman(getName()));
        teams.add(new Wizard(getName()));
        teams.add(new Arbalester(getName()));

        for (Characters item : teams) {
            System.out.println(item.getInfo());
        }
    }

    private static String getName(){
        String name= String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;    }
    }

        // Sniper sniper = new Sniper(getName());
        // Arbalester arbalester = new Arbalester(getName());
        // Farmer farmer = new Farmer(getName(), 0);
        // Monk monk = new Monk(getName());
        // Rogue rogue = new Rogue(getName());
        // Spearman spearman = new Spearman(getName());
        // Wizard wizard = new Wizard(getName());