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
        //Expect
        int expectedY= 1;
        // WHEN
        PlayerCharacter.move(up);
        int actualY =PlayerCharacter.getY();
       Assertions.assertEquals(expectedY,actualY);

        // THEN
    }
    @Test
    void move_expectDown_GivenS() {
    //Given

    char down = 's';
    //Expect
        int expectedY = -1;
        PlayerCharacter.move(down);
        int actualY =PlayerCharacter.getY();
        Assertions.assertEquals(expectedY,actualY);
    }
    @Test
    void move_expectLeft_GivenA() {
    char left = 'a';
    int expectedX = -1;
    PlayerCharacter.move(left);
    int actualX =PlayerCharacter.getX();
    Assertions.assertEquals(expectedX,actualX);

    }
    @Test
    void move_expectRight_GivendD (){
    char right = 'd';
    int expectedX = 1;
    PlayerCharacter.move(right);
    int actualX =PlayerCharacter.getX();
    Assertions.assertEquals(expectedX,actualX);
    }
}
