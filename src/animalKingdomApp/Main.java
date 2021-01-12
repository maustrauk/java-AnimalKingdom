package animalKingdomApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mammals> mammalsList = new ArrayList<>();
        mammalsList.add(new Mammals("Panda", 1869));
        mammalsList.add(new Mammals("Zebra", 1778));
        mammalsList.add(new Mammals("Koala", 1816));
        mammalsList.add(new Mammals("Sloth", 1804));
        mammalsList.add(new Mammals("Armadillo", 1758));
        mammalsList.add(new Mammals("Raccoon", 1758));
        mammalsList.add(new Mammals("Bigfoot", 2021));

        List<Birds> birdsList = new ArrayList<>();
        birdsList.add(new Birds("Pigeon", 1837));
        birdsList.add(new Birds("Peacock", 1821));
        birdsList.add(new Birds("Toucan", 1758));
        birdsList.add(new Birds("Parrot", 1824));
        birdsList.add(new Birds("Swan", 1758));

        List<Fish> fishList = new ArrayList<>();
        fishList.add(new Fish("Salmon", 1758));
        fishList.add(new Fish("Catfish", 1817));
        fishList.add(new Fish("Perch", 1758));

        List<Animals> animalsList = new ArrayList<>();

        mammalsList.forEach(item -> animalsList.add(item));
        birdsList.forEach(item -> animalsList.add(item));
        fishList.forEach(item -> animalsList.add(item));

        System.out.println("Before any action:");
        animalsList.forEach(item -> System.out.println(item.contain()));

        System.out.println("");
        System.out.println("List all the animals in descending order by year named:");
        animalsList.sort((firstItem, secondItem) -> (firstItem.getYear() > secondItem.getYear()) ? -1 : 1);
        animalsList.forEach(item -> System.out.println(item.contain()));

        System.out.println("");
        System.out.println("List all the animals alphabetically:");
        animalsList.sort((firstItem, secondItem) -> (firstItem.getFirstCharOfName() > secondItem.getFirstCharOfName()) ? 1 : -1);
        animalsList.forEach(item -> System.out.println(item.contain()));
    }
}