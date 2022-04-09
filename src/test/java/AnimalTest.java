import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalTest {
    @Test void checkIfNameIsImplemented() {
        Animal lion = new Lion("Lion", "test", "test", "test", "test", 25, 25);
        assertEquals("Lion", lion.getName());
    }

    @Test void checkIfFeatureIsImplemented() {
        Animal lion = new Lion("Lion", "test", "test", "test", "test", 25, 25);
        assertEquals("test", lion.getFeature());
    }

    @Test void checkIfDobIsImplemented() {
        Animal lion = new Lion("Lion", "test", "testDob", "test", "test", 25, 25);
        assertEquals("testDob", lion.getDob());
    }

    @Test void checkIfSpeciesIsImplemented() {
        Animal lion = new Lion("Lion", "test", "testDob", "testSpecies", "test", 25, 25);
        assertEquals("testSpecies", lion.getSpecies());
    }

    @Test void checkIfFoodIsImplemented() {
        Animal lion = new Lion("Lion", "test", "testDob", "testSpecies", "testFood", 25, 25);
        assertEquals("testFood", lion.getFood());
    }

    @Test void checkIfWeightIsImplemented() {
        Animal lion = new Lion("Lion", "test", "testDob", "testSpecies", "testFood", 25, 40);
        assertEquals(25, lion.getWeight());
    }

    @Test void checkIfHeightIsImplemented() {
        Animal lion = new Lion("Lion", "test", "testDob", "testSpecies", "testFood", 25, 40);
        assertEquals(40, lion.getHeight());
    }

    @Test void testsBooleanLaysEggsIsTrue() {
        Animal lion = new Lion("Lion", "test", "testDob", "testSpecies", "testFood", 25, 40);
        lion.doesLayEggs();
        assertTrue(lion.doesAnimalLayEggs());
    }

    @Test void testsBooleanGivesBirthIsTrue() {
        Animal lion = new Lion("Lion", "test", "testDob", "testSpecies", "testFood", 25, 40);
        lion.doesGiveBirth();
        assertTrue(lion.doesAnimalGiveBirth());
    }

    @Test void testsBooleanDoesSlideIsTrue() {
        Animal lion = new Lion("Lion", "test", "testDob", "testSpecies", "testFood", 25, 40);
        lion.doesSlide();
        assertTrue(lion.doesAnimalSlide());
    }

    @Test void testsBooleanDoesWalkIsTrue() {
        Animal lion = new Lion("Lion", "test", "testDob", "testSpecies", "testFood", 25, 40);
        lion.doesWalk();
        assertTrue(lion.doesAnimalWalk());
    }

    @Test void testsBooleanDoesSwimIsTrue() {
        Animal lion = new Lion("Lion", "test", "testDob", "testSpecies", "testFood", 25, 40);
        lion.doesSwim();
        assertTrue(lion.doesAnimalSwim());
    }

}
