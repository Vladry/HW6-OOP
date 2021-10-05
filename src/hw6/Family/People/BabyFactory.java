package hw6.Family.People;

import java.util.Arrays;
import java.util.Random;

import static hw6.Family.People.Sex.FEMININE;
import static hw6.Family.People.Sex.MASCULINE;


public class BabyFactory {
    static String babyName = "";
    static Sex sex;       // MASCULINE, FEMININE
    static int rnd;

    public static Human deliverABaby(Family family) {
        int babyIq = (family.getFather().getIq() + family.getMother().getIq()) / 2;

        Random random = new Random();
        rnd = random.nextInt(2);
        sex = (rnd == 0) ? MASCULINE : FEMININE;
        babyName = GenerateRandomName.get(sex);


        switch (sex) {
            case MASCULINE:
                return new Man("мальчик: " + babyName, family.getFather().getSurname(), 2021, babyIq, family.getFather().getSchedule(), family);
            case FEMININE:
                return new Woman("девочка: " + babyName, family.getFather().getSurname(), 2021, babyIq, family.getFather().getSchedule(), family);
            default:
                return null;


        }
    }
}
