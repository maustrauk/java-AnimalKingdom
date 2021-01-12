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
        animalsList.sort((firstItem, secondItem) -> (firstItem.getName().charAt(0) > secondItem.getName().charAt(0)) ? 1 : -1);
        animalsList.forEach(item -> System.out.println(item.contain()));

        System.out.println("");
        System.out.println("List all the animals order by how they move:");
        animalsList.sort((firstItem, secondItem) -> (firstItem.move().charAt(0) > secondItem.move().charAt(0)) ? 1 : -1);
        animalsList.forEach(item -> System.out.println(item.contain()));

        System.out.println("");
        System.out.println("List only those animals the breath with lungs:");
        List<Animals> breathWithLungs = new ArrayList<>();
        animalsList.forEach(item -> {
            if (item.breath() == "lungs") {
                breathWithLungs.add(item);
            }
        });
        breathWithLungs.forEach(item -> System.out.println(item.contain()));

        System.out.println("");
        System.out.println("List only those animals that breath with lungs and were named in 1758:");
        List<Animals> breathWithLungs1758 = new ArrayList<>();
        animalsList.forEach(item -> {
            if (item.breath() == "lungs" && item.getYear() == 1758) {
                breathWithLungs1758.add(item);
            }
        });
        breathWithLungs1758.forEach(item -> System.out.println(item.contain()));

        System.out.println("");
        System.out.println("List only those animals that lay eggs and breath with lungs:");
        List<Animals> breathWithLungsLayEggs = new ArrayList<>();
        animalsList.forEach(item -> {
            if (item.breath() == "lungs" && item.reproduce() == "eggs") {
                breathWithLungsLayEggs.add(item);
            }
        });
        breathWithLungsLayEggs.forEach(item -> System.out.println(item.contain()));

        System.out.println("");
        System.out.println("List alphabetically only those animals that were named in 1758:");
        List<Animals> listNamed1758 = new ArrayList<>();
        animalsList.forEach(item -> {
            if (item.getYear() == 1758) {
                listNamed1758.add(item);
            }
        });
        listNamed1758.sort((firstItem, secondItem) -> (firstItem.getName().charAt(0) > secondItem.getName().charAt(0)) ? 1 : -1);
        listNamed1758.forEach(item -> System.out.println(item.contain()));
    }
}