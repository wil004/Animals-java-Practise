import java.util.ArrayList;
import java.util.List;

public class AnimalKingdom {
    private static List<Animal> allAnimals;

    public AnimalKingdom() {
        Animal crocodile = new Crocodile("Crocodile", "carnivore", "01-01-2000", "reptile", "meat", 25, 25);
        Animal lion = new Lion("Lion", "carnivore", "01-01-2000", "mammal", "meat", 25, 25);
        Animal shark = new Shark("Shark", "carnivore", "01-01-2000", "fish", "fish", 25, 25);
        Animal snake = new Snake("Snake", "carnivore", "01-01-2000", "reptile", "meat", 25, 25);
        Animal dolphin = new Dolphin("Dolphin", "omnivore", "01-01-2000", "fish", "fish or plants", 25, 25);
        Animal elephant = new Elephant("Elephant", "herbivore", "01-01-2000", "mammal", "plants", 2500, 400);
        Animal flamingo = new Flamingo("Flamingo", "omnivore", "01-01-2000", "bird", "fish or plants", 25, 25);
        Animal penguin = new Penguin("Penguin", "carnivore", "01-01-2000", "bird", "fish", 10, 10);

        allAnimals = new ArrayList<>();
        allAnimals.add(crocodile);
        allAnimals.add(lion);
        allAnimals.add(shark);
        allAnimals.add(snake);
        allAnimals.add(dolphin);
        allAnimals.add(elephant);
        allAnimals.add(flamingo);
        allAnimals.add(penguin);
    }


    public static List<Animal> getAllAnimals() {
        return allAnimals;
    }

    private static void getAnimalBasicInformation(Animal animal) {
        System.out.println(animal.getSpecies());
        System.out.println(animal.getDob());
        System.out.println(animal.getWeight() + " kg");
        System.out.println(animal.getHeight() + " cm");
        System.out.println(animal.getFeature());
    }

    public static void getAnimalNames() {
        for(int i = 0; i < allAnimals.size(); i++) {
            System.out.println("-" + allAnimals.get(i).getName());
        }
    }

    protected static String animalInformation(Animal animal, String task) {
        if (animal instanceof Crocodile animalForTask) {
            switch (task) {
                case "swim" -> {
                    return animalForTask.swim();
                }
                case "walk" -> {
                    return animalForTask.walks();
                }
                case "reproduction" -> {
                    return animalForTask.laysEggs();
                }
            }
        } else if (animal instanceof Dolphin animalForTask) {
            switch (task) {
                case "swim" -> {
                    return animalForTask.swim();
                }
                case "reproduction" -> {
                    return animalForTask.givesBirth();
                }
            }
        } else if (animal instanceof Elephant animalForTask) {
            switch (task) {
                case "walk" -> {
                    return animalForTask.walks();
                }
                case "reproduction" -> {
                    return animalForTask.givesBirth();
                }
            }
        } else if (animal instanceof Flamingo animalForTask) {
            switch (task) {
                case "walk" -> {
                    return animalForTask.walks();
                }
                case "reproduction" -> {
                    return animalForTask.laysEggs();
                }
            }
        } else if (animal instanceof Lion animalForTask) {
            switch (task) {
                case "walk" -> {
                    return animalForTask.walks();
                }
                case "reproduction" -> {
                    return animalForTask.givesBirth();
                }
            }
        } else if (animal instanceof Penguin animalForTask) {
            switch (task) {
                case "swim" -> {
                    return animalForTask.swim();
                }
                case "walk" -> {
                    return animalForTask.walks();
                }
                case "slide" -> {
                    return animalForTask.slides();
                }
                case "reproduction" -> {
                    return animalForTask.laysEggs();
                }

            }
        } else if (animal instanceof Shark animalForTask) {
            switch (task) {
                case "swim" -> {
                    return animalForTask.swim();
                }
                case "reproduction" -> {
                    return animalForTask.laysEggs();
                }
            }
        } else if (animal instanceof Snake animalForTask) {
            switch (task) {
                case "slide" -> {
                    return animalForTask.slides();
                }
                case "reproduction" -> {
                    return animalForTask.laysEggs();
                }
            }
        }
        return "";
    }

    public static void allAnimalInformation() {
        for(int i = 0; i < allAnimals.size(); i++) {
            System.out.println("______"+ allAnimals.get(i).getName() + "_______");
            getAnimalBasicInformation(allAnimals.get(i));
            allAnimals.get(i).makesSound();
            allAnimals.get(i).getsFed();
            allAnimals.get(i).sleeps();
            if(allAnimals.get(i).doesAnimalSwim()) {
                System.out.println(animalInformation(allAnimals.get(i), "swim"));
            } if(allAnimals.get(i).doesAnimalWalk()) {
                System.out.println(animalInformation(allAnimals.get(i), "walk"));
            } if(allAnimals.get(i).doesAnimalSlide()) {
                System.out.println(animalInformation(allAnimals.get(i), "slide"));
            }
                System.out.println(animalInformation(allAnimals.get(i), "reproduction"));
        }
    }


    public static void animalInformation(Animal animal) {
        System.out.println("______"+ animal.getName() + "_______");
        getAnimalBasicInformation(animal);
        animal.makesSound();
        animal.getsFed();
        animal.sleeps();
        if(animal.doesAnimalSwim()) {
            System.out.println(animalInformation(animal, "swim"));
        } if(animal.doesAnimalWalk()) {
            System.out.println(animalInformation(animal, "walk"));
        } if(animal.doesAnimalSlide()) {
            System.out.println(animalInformation(animal, "slide"));
        }
        System.out.println(animalInformation(animal, "reproduction"));
    }


    public static void animalsThatCanSwim() {
        System.out.println("_____Animals that can swim!________");
        for(int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).doesAnimalSwim()) {
                System.out.println("-" + allAnimals.get(i).getName());
                System.out.println(animalInformation(allAnimals.get(i), "swim"));
                System.out.println("______________________");
            }
        }
    }

    public static void animalsThatCanWalk() {
        System.out.println("_____Animals that can walk!________");
        for(int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).doesAnimalWalk()) {
                System.out.println("-" + allAnimals.get(i).getName());
                System.out.println(animalInformation(allAnimals.get(i), "walk"));
                System.out.println("______________________");
            }
        }
    }

    public static void animalsThatCanSlide() {
        System.out.println("_____Animals that can Slide!________");
        for(int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).doesAnimalSlide()) {
                System.out.println("-" + allAnimals.get(i).getName());
                System.out.println(animalInformation(allAnimals.get(i), "slide"));
                System.out.println("______________________");
            }
        }
    }

    public static void animalsThatGiveBirth() {
        System.out.println("_____Animals that give birth!________");
        for(int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).doesAnimalGiveBirth()) {
                System.out.println("-" + allAnimals.get(i).getName());
                System.out.println(animalInformation(allAnimals.get(i), "reproduction"));
                System.out.println("______________________");
            }
        }
    }

    public static void animalsThatLayEggs() {
        System.out.println("_____Animals that lay eggs!________");
        for(int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).doesAnimalLayEggs()) {
                System.out.println("-" + allAnimals.get(i).getName());
                System.out.println(animalInformation(allAnimals.get(i), "reproduction"));
            }
        }
    }

    public static void herbivores() {
        System.out.println("Herbivores");
        for (Animal allAnimal : allAnimals) {
            if (allAnimal.getFeature().equals("herbivore")) {
                System.out.println("-" + allAnimal.getName());
            }
        }
    }

    public static void omnivores() {
        System.out.println("omnivores");
        for (Animal allAnimal : allAnimals) {
            if (allAnimal.getFeature().equals("omnivore")) {
                System.out.println("-" + allAnimal.getName());
            }
        }
    }

    public static void carnivore() {
        System.out.println("carnivores");
        for (Animal allAnimal : allAnimals) {
            if (allAnimal.getFeature().equals("carnivore")) {
                System.out.println("-" + allAnimal.getName());
            }
        }
    }

    public static void mammals() {
        System.out.println("mammals");
        for(int i = 0; i < allAnimals.size(); i++) {
            if(allAnimals.get(i).getSpecies().equals("mammal")) {
                System.out.println("-" + allAnimals.get(i).getName());
            }
        }
    }

    public static void reptiles() {
        System.out.println("reptiles");
        for(int i = 0; i < allAnimals.size(); i++) {
            if(allAnimals.get(i).getSpecies().equals("reptile")) {
                System.out.println("-" + allAnimals.get(i).getName());
            }
        }
    }

    public static void fish() {
        System.out.println("fish");
        for(int i = 0; i < allAnimals.size(); i++) {
            if(allAnimals.get(i).getSpecies().equals("fish")) {
                System.out.println("-" + allAnimals.get(i).getName());
            }
        }
    }

    public static void birds() {
        System.out.println("bird");
        for(int i = 0; i < allAnimals.size(); i++) {
            if(allAnimals.get(i).getSpecies().equals("bird")) {
                System.out.println("-" + allAnimals.get(i).getName());
            }
        }
    }

}

