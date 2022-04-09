import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalKingdomTest {
    @Test void returnListOfAnimalObjects() {
        Animal crocodile = new Crocodile("Crocodile", "test", "test", "test", "test", 25, 25);
        new AnimalKingdom();
        assertEquals(crocodile.getName(), AnimalKingdom.getAllAnimals().get(0).getName());
    }

    @Test void gettingTheRightAnimalInformation() {
        Lion lion = new Lion("Lion", "test", "test", "test", "test", 25, 25);
        new AnimalKingdom();
        assertEquals("A lion can walk and even run incredibly fast!", lion.walks());
    }

}
