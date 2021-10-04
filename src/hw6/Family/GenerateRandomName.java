package hw6.Family;

import java.util.Random;

import static hw6.Family.Sex.MASCULINE;

public class GenerateRandomName {
    static int randomIndex;
    static FemaleNames[] fNameRange;
    static MasculineNames[] mNameRange;

    static {
            fNameRange = new FemaleNames[FemaleNames.values().length];
            fNameRange = FemaleNames.values();
            mNameRange = new MasculineNames[MasculineNames.values().length];
            mNameRange = MasculineNames.values();
        }


    private static void getRndIndex(int quantity) {
        Random rnd = new Random();
        randomIndex = rnd.nextInt(quantity);
    }


    public static String get(Sex sex) {

        if (sex == MASCULINE) {
            getRndIndex(MasculineNames.values().length);
            return mNameRange[randomIndex].name();
        } else {
            getRndIndex(FemaleNames.values().length);
            return fNameRange[randomIndex].name();
        }
    }
}
