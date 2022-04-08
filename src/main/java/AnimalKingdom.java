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

    public static void allAnimalInformation() {
        for(int i = 0; i < allAnimals.size(); i++) {
            System.out.println("______"+ allAnimals.get(i).getName() + "_______");
            getAnimalBasicInformation(allAnimals.get(i));
            allAnimals.get(i).makesSound();
            allAnimals.get(i).getsFed();
            allAnimals.get(i).sleeps();
            if (allAnimals.get(i) instanceof Crocodile crocodile) {
                crocodile.swim();
                crocodile.walks();
                crocodile.laysEggs();
                System.out.println("_______________________________________________");
            } else if (allAnimals.get(i) instanceof Dolphin dolphin) {
                dolphin.swim();
                dolphin.givesBirth();
                System.out.println("_______________________________________________");
            } else if (allAnimals.get(i) instanceof Elephant elephant) {
                elephant.walks();
                elephant.givesBirth();
                System.out.println("_______________________________________________");
            } else if (allAnimals.get(i) instanceof Flamingo flamingo) {
                flamingo.walks();
                flamingo.laysEggs();
                System.out.println("_______________________________________________");
            } else if (allAnimals.get(i) instanceof Lion lion) {
                lion.walks();
                lion.givesBirth();
                System.out.println("_______________________________________________");
            } else if (allAnimals.get(i) instanceof Penguin penguin) {
                penguin.walks();
                penguin.swim();
                penguin.slides();
                penguin.laysEggs();
                System.out.println("_______________________________________________");
            } else if (allAnimals.get(i) instanceof Shark shark) {
                shark.swim();
                shark.laysEggs();
                System.out.println("_______________________________________________");
            } else if (allAnimals.get(i) instanceof Snake snake) {
                snake.slides();
                snake.laysEggs();
                System.out.println("_______________________________________________");
            }
        }
    }


    public static void animalInformation(Animal animal) {
        System.out.println("______"+ animal.getName() + "_______");
        getAnimalBasicInformation(animal);
        animal.makesSound();
        animal.getsFed();
        animal.sleeps();
        if (animal instanceof Crocodile crocodile) {
            crocodile.swim();
            crocodile.walks();
            crocodile.laysEggs();
        } else if (animal instanceof Dolphin dolphin) {
            dolphin.swim();
            dolphin.givesBirth();
        } else if (animal instanceof Elephant elephant) {
            elephant.walks();
            elephant.givesBirth();
        } else if (animal instanceof Flamingo flamingo) {
            flamingo.walks();
            flamingo.laysEggs();
        } else if (animal instanceof Lion lion) {
            lion.walks();
            lion.givesBirth();
        } else if (animal instanceof Penguin penguin) {
            penguin.walks();
            penguin.swim();
            penguin.slides();
            penguin.laysEggs();
        } else if (animal instanceof Shark shark) {
            shark.swim();
            shark.laysEggs();
        } else if (animal instanceof Snake snake) {
            snake.slides();
            snake.laysEggs();
        }

    }

    private static void animalInformation(Animal animal, String task) {
        switch(task) {
            case "sound":
                animal.makesSound();
                break;
            case "food":
                animal.getsFed();
                break;
            case "sleep":
                animal.sleeps();
                break;
            default:
                if (animal instanceof Crocodile animalForTask) {
                    switch (task) {
                        case "swim" -> animalForTask.swim();
                        case "walk" -> animalForTask.walks();
                        case "reproduction" -> animalForTask.laysEggs();
                    }
                } else if (animal instanceof Dolphin animalForTask) {
                    switch (task) {
                        case "swim" -> animalForTask.swim();
                        case "reproduction" -> animalForTask.givesBirth();
                    }
                } else if (animal instanceof Elephant animalForTask) {
                    switch (task) {
                        case "walk" -> animalForTask.walks();
                        case "reproduction" -> animalForTask.givesBirth();
                    }
                } else if (animal instanceof Flamingo animalForTask) {
                    switch (task) {
                        case "walk" -> animalForTask.walks();
                        case "reproduction" -> animalForTask.laysEggs();
                    }
                } else if (animal instanceof Lion animalForTask) {
                    switch (task) {
                        case "walk" -> animalForTask.walks();
                        case "reproduction" -> animalForTask.givesBirth();
                    }
                } else if (animal instanceof Penguin animalForTask) {
                    switch (task) {
                        case "swim" -> animalForTask.swim();
                        case "walk" -> animalForTask.walks();
                        case "slide" -> animalForTask.slides();
                        case "reproduction" -> animalForTask.laysEggs();
                    }
                } else if (animal instanceof Shark animalForTask) {
                    switch (task) {
                        case "swim" -> animalForTask.swim();
                        case "reproduction" -> animalForTask.laysEggs();
                    }
                } else if (animal instanceof Snake animalForTask) {
                    switch (task) {
                        case "slide" -> animalForTask.slides();
                        case "reproduction" -> animalForTask.laysEggs();
                    }
                }
        }
    }

    public static void animalsThatCanSwim() {
        System.out.println("_____Animals that can swim!________");
        for(int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).getSwims()) {
                System.out.println("-" + allAnimals.get(i).getName());
                animalInformation(allAnimals.get(i), "swim");
                System.out.println("______________________");
            }
        }
    }

    public static void animalsThatCanWalk() {
        System.out.println("_____Animals that can walk!________");
        for(int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).getWalks()) {
                System.out.println("-" + allAnimals.get(i).getName());
                animalInformation(allAnimals.get(i), "walk");
                System.out.println("______________________");
            }
        }
    }

    public static void animalsThatCanSlide() {
        System.out.println("_____Animals that can Slide!________");
        for(int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).getSlides()) {
                System.out.println("-" + allAnimals.get(i).getName());
                animalInformation(allAnimals.get(i), "slide");
                System.out.println("______________________");
            }
        }
    }

    public static void animalsThatGiveBirth() {
        System.out.println("_____Animals that give birth!________");
        for(int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).getGivesBirth()) {
                System.out.println("-" + allAnimals.get(i).getName());
                animalInformation(allAnimals.get(i), "reproduction");
                System.out.println("______________________");
            }
        }
    }

    public static void animalsThatLayEggs() {
        System.out.println("_____Animals that lay eggs!________");
        for(int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).getLaysEggs()) {
                System.out.println("-" + allAnimals.get(i).getName());
                animalInformation(allAnimals.get(i), "reproduction");
            }
        }
    }

    public static void herbivores() {
        System.out.println("Herbivores");
        for(int i = 0; i < allAnimals.size(); i++) {
            if(allAnimals.get(i).getFeature().equals("herbivore")) {
                System.out.println("-" + allAnimals.get(i).getName());
            }
        }
    }

    public static void omnivores() {
        System.out.println("omnivores");
        for(int i = 0; i < allAnimals.size(); i++) {
            if(allAnimals.get(i).getFeature().equals("omnivore")) {
                System.out.println("-" + allAnimals.get(i).getName());
            }
        }
    }

    public static void carnivore() {
        System.out.println("carnivores");
        for(int i = 0; i < allAnimals.size(); i++) {
            if(allAnimals.get(i).getFeature().equals("carnivore")) {
                System.out.println("-" + allAnimals.get(i).getName());
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

