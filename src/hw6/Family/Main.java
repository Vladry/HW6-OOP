package hw6.Family;

import hw6.Family.People.Family;
import hw6.Family.People.Human;
import hw6.Family.People.Man;
import hw6.Family.People.Woman;

public class Main {
    public static void main(String[] args) {

        Human dad = new Man("Sergey", "Ivankov", 1980);
        Human mother = new Woman("Zoya", "Ivankova", 1985);
        Family family = new Family(dad, mother);
        dad.setFamily(family);
        mother.setFamily(family);
        int totalChildren = 100;
        Human[] children = new Human[totalChildren];
        int girlsCounter = 0;
        for (int i = 0; i < totalChildren; i++) {
            children[i] = dad.bornChild(mother);
//            children[i].setFamily(family);
//            System.out.println(children[i].toString());
            if (children[i].getName().contains("девочка")) {
                girlsCounter++;
            }
        }
        System.out.println("всего создано детей: " + totalChildren);
        System.out.println("из них девочек: " + girlsCounter);

//        System.out.println(dad.toString());
//        System.out.println(mother.toString());
//        System.out.println(family.toString());


    }
}



