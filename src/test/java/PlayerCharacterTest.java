import org.example.PlayerCharacter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PlayerCharacterTest {

@Test
void getX_expect0_whenStart() {
    // GIVEN
    int startX = 0;
    // WHEN
    int startActual = PlayerCharacter.getX();
    // THEN
    Assertions.assertEquals(startX, startActual);
}

@Test
    void getY_expect0_whenStart() {
        // GIVEN
        int startY = 0;
        // WHEN
        int startActual = PlayerCharacter.getY();
        // THEN
        Assertions.assertEquals(startY, startActual);
    }

    @Test
    void move_expectUp_GivenW() {
        // GIVEN
        char up = 'w';
        // WHEN

        // THEN
    }
}
