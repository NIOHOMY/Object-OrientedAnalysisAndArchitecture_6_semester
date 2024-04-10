package lab2_Adapter.tests.unit;
import lab2_Adapter.core.entities.games.RockScissorsPaper;
import lab2_Adapter.core.entities.random.RandomNumberGenerator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class RockScissorsPaperTests {
    @Mock
    private RandomNumberGenerator random;
    RockScissorsPaper game = new RockScissorsPaper();
    @Before
    public void setUp() throws NoSuchFieldException, IllegalAccessException {
        MockitoAnnotations.openMocks(this);
        Field field = RockScissorsPaper.class.getDeclaredField("randomNumberGenerator");
        field.setAccessible(true);
        field.set(game, random);
    }

    @Test
    public void testDrawRock() {

        when(random.generateRandomNumber(0, 2)).thenReturn(0);

        String result = game.play("камень");

        assertEquals("Ничья!", result);
    }
    @Test
    public void testDrawScissors() {

        when(random.generateRandomNumber(0, 2)).thenReturn(1);


        String result = game.play("ножницы");

        assertEquals("Ничья!", result);
    }
    @Test
    public void testDrawPaper() {

        when(random.generateRandomNumber(0, 2)).thenReturn(2);


        String result = game.play("бумага");

        assertEquals("Ничья!", result);
    }

    @Test
    public void testUserWinsWithPaper() {

        when(random.generateRandomNumber(0, 2)).thenReturn(0);


        String result = game.play("бумага");

        assertEquals("Вы выиграли!", result);
    }
    @Test
    public void testUserWinsWithRock() {

        when(random.generateRandomNumber(0, 2)).thenReturn(1);


        String result = game.play("камень");

        assertEquals("Вы выиграли!", result);
    }
    @Test
    public void testUserWinsWithScissors() {

        when(random.generateRandomNumber(0, 2)).thenReturn(2);


        String result = game.play("ножницы");

        assertEquals("Вы выиграли!", result);
    }

    @Test
    public void testComputerWinsWithUserScissors() {
        when(random.generateRandomNumber(0, 2)).thenReturn(0);


        String result = game.play("ножницы");

        assertEquals("Вы проиграли!", result);
    }
    @Test
    public void testComputerWinsWithUserRock() {
        when(random.generateRandomNumber(0, 2)).thenReturn(2);


        String result = game.play("камень");

        assertEquals("Вы проиграли!", result);
    }
    @Test
    public void testComputerWinsWithUserPaper() {
        when(random.generateRandomNumber(0, 2)).thenReturn(1);


        String result = game.play("бумага");

        assertEquals("Вы проиграли!", result);
    }
    @Test
    public void testInvalidInput() {
        when(random.generateRandomNumber(0, 2)).thenReturn(1);

        String result = game.play("1");

        assertEquals("Такого выбора в игре нет!", result);
    }
}

