package hw6.Family;

final public class Woman extends Human {
    Woman(){
        super();
    }

    Woman(String name, String surname, int year){
        super(name, surname, year);
    }
    Woman(String name, String surname, int year,
        int iq, String[][] schedule, Family family){
        super(name, surname, year, iq, schedule, family);
    }

    public void makeup (){
        System.out.println("Запущена утрення процедура краски");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.println("Хорошая собака, " + pet.getNickname() + ", принеси маме тапочки!");
    }
}