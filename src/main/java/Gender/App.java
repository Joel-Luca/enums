package Gender;

import Gender.Alien;

public class App {
    public static void main(String[] args) {
        Alien alien = new Alien(Alien.Gender.MALE);

        System.out.println(alien.getGender());
    }
}
