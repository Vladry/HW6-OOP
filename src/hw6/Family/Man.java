package hw6.Family;

final public class Man extends Human {

    Man(){
        super();
    }

    Man(String name, String surname, int year){
        super(name, surname, year);
    }
    Man(String name, String surname, int year,
        int iq, String[][] schedule, Family family){
        super(name, surname, year, iq, schedule, family);
    }

    public void repairCar(){
        System.out.println("Третий год чиним машину");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.println(pet.getNickname() + " , почему тапочки несёшь, ты не домашний рабчик, ты - крутецкий пёс");
    }
}
