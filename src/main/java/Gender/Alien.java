package Gender;

import java.sql.SQLOutput;

public class Alien {

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    private Gender gender = Gender.OTHER;

    public Alien(Gender gender) {
        this.gender = gender;
    }

    public void printGender() {
        switch (gender) {
            case FEMALE:
                System.out.println("My gender is female");
                break;
            case MALE:
                System.out.println("My gender is male");
                break;
            case OTHER:
                System.out.println("My gender is other");
            default:
                break;
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }
}
