package lab2_Adapter.tests.unit;

import lab2_Adapter.core.entities.games.BirdRockWater;
import lab2_Adapter.core.entities.random.RandomNumberGenerator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class BirdRockWaterTests {
    @Mock
    private RandomNumberGenerator random;
    BirdRockWater game = new BirdRockWater();
    /**
     * Sets up the necessary mocks and fields before each test.
     */
    @Before
    public void setUp() throws NoSuchFieldException, IllegalAccessException {
        MockitoAnnotations.openMocks(this);
        Field field = BirdRockWater.class.getDeclaredField("randomNumberGenerator");
        field.setAccessible(true);

        field.set(game, random);
    }

    /**
     * Tests the scenario...
     */
    @Test
    public void testDrawRock() {

        when(random.generateRandomNumber(0, 2)).thenReturn(0);

        String result = game.playBirdRockWater("камень");

        assertEquals("Ничья!", result);
    }
    @Test
    public void testDrawBird() {

        when(random.generateRandomNumber(0, 2)).thenReturn(1);


        String result = game.playBirdRockWater("птица");

        assertEquals("Ничья!", result);
    }
    @Test
    public void testDrawWater() {

        when(random.generateRandomNumber(0, 2)).thenReturn(2);


        String result = game.playBirdRockWater("вода");

        assertEquals("Ничья!", result);
    }

    @Test
    public void testUserWinsWithWater() {

        when(random.generateRandomNumber(0, 2)).thenReturn(0);


        String result = game.playBirdRockWater("вода");

        assertEquals("Вы выиграли!", result);
    }
    @Test
    public void testUserWinsWithRock() {

        when(random.generateRandomNumber(0, 2)).thenReturn(1);


        String result = game.playBirdRockWater("камень");

        assertEquals("Вы выиграли!", result);
    }
    @Test
    public void testUserWinsWithBird() {

        when(random.generateRandomNumber(0, 2)).thenReturn(2);


        String result = game.playBirdRockWater("птица");

        assertEquals("Вы выиграли!", result);
    }

    @Test
    public void testComputerWinsWithUserBird() {
        when(random.generateRandomNumber(0, 2)).thenReturn(0);


        String result = game.playBirdRockWater("птица");

        assertEquals("Вы проиграли!", result);
    }
    @Test
    public void testComputerWinsWithUserRock() {
        when(random.generateRandomNumber(0, 2)).thenReturn(2);


        String result = game.playBirdRockWater("камень");

        assertEquals("Вы проиграли!", result);
    }
    @Test
    public void testComputerWinsWithUserWater() {
        when(random.generateRandomNumber(0, 2)).thenReturn(1);

        String result = game.playBirdRockWater("вода");

        assertEquals("Вы проиграли!", result);
    }

    @Test
    public void testInvalidInput() {
        when(random.generateRandomNumber(0, 2)).thenReturn(1);

        String result = game.playBirdRockWater("1");

        assertEquals("Такого выбора в игре нет!", result);
    }
}
