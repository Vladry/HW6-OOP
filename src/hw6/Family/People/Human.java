package hw6.Family.People;

import hw6.Family.Animals.Pet;
import hw6.Family.DayOfWeek;

import java.util.Arrays;
import java.util.Random;

import static hw6.Family.People.Sex.FEMININE;
import static hw6.Family.People.Sex.MASCULINE;

public abstract class Human implements HumanCreator {

    private String name;
    private String surname;
    private int year;
    private int iq; //from 0 to 100;
    private String[][] schedule;
    private Family family;

    static {
        System.out.println("загружается новый класс Human");
    }

    {
        schedule = new String[7][2];
        schedule[0][0] = DayOfWeek.SUNDAY.name().toLowerCase();
        schedule[1][0] = DayOfWeek.MONDAY.name().toLowerCase();
        schedule[3][0] = DayOfWeek.TUESDAY.name().toLowerCase();
        schedule[2][0] = DayOfWeek.WEDNESDAY.name().toLowerCase();
        schedule[4][0] = DayOfWeek.THURSDAY.name().toLowerCase();
        schedule[5][0] = DayOfWeek.FRIDAY.name().toLowerCase();
        schedule[6][0] = DayOfWeek.SATURDAY.name().toLowerCase();
//        System.out.println("создается новый объект Human");
    }

    Human() {
    }

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human(String name, String surname, int year,
          int iq, String[][] schedule, Family family) {
        this(name, surname, year);
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }


    public Human bornChild(Human spouse) {
        String[][] babySchedule = this.schedule;
        int babyIq = (this.iq + spouse.iq) / 2;
        String babyName = "";
        Sex sex;       // MASCULINE, FEMININE
        Random random = new Random();
        int rnd = random.nextInt(2);
        sex = (rnd == 0) ? MASCULINE : FEMININE;
        babyName = GenerateRandomName.get(sex);
        return (sex == MASCULINE) ?
                new Man("мальчик: " + babyName, this.surname, 2021, babyIq, babySchedule, this.family)
                : new Woman("девочка: " + babyName, this.surname, 2021, babyIq, babySchedule, this.family);
    }
//    return (sex == MASCULINE) ?
//                new Man(babyName, this.surname, 2021, babyIq, babySchedule, this.family)
//                : new Woman(babyName, this.surname, 2021, babyIq, babySchedule, this.family);
//    }

    public void greetPet(Pet pet) {
        System.out.println("Привет, " + pet.getNickname());
    }

    public void describePet(Pet pet) {
        String trickVerdict;
        if (pet.getTrickLevel() > 50) {
            trickVerdict = "очень хитрый";
        } else {
            trickVerdict = "почти не хитрый";
        }

        System.out.println("У меня есть " +
                pet.getSpecies() +
                ", ему " +
                pet.getAge() +
                " лет, он +" +
                trickVerdict
        );

    }

    public String getName() {
        return this.name;
    }

    ;

    public void setName(String name) {
        this.name = name;
    }

    ;

    public String getSurname() {
        return this.surname;
    }

    ;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    ;

    public int getYear() {
        return this.year;
    }

    ;

    public void setYear(int year) {
        this.year = year;
    }

    ;

    public int getIq() {
        return this.iq;
    }

    ;

    public void setIq(int iq) {
        this.iq = iq;
    }

    ;

    public String[][] getSchedule() {
        return this.schedule;
    }

    ;

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    ;

    public Family getFamily() {
        return this.family;
    }

    ;

    public void setFamily(Family family) {
        this.family = family;
    }


    @Override
    public String toString() {
        return "Human{ name=" + this.getName() + ", surname= " + this.getSurname() +
                ", year=" + this.getYear() + ", iq=" + this.getIq() +
//                ", family=" + this.getFamily().toString() +
                ", schedule=" + Arrays.deepToString(this.getSchedule()) +
                "} \n ";
    }

    @Override
    protected void finalize() {
        System.out.println("Deleting an instance of Human");
    }
}