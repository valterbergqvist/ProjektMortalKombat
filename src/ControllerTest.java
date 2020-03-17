import javafx.css.Match;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest  {
Fighter fighter = new Fighter();
Controller controller = new Controller();




    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addFighters() {
        controller.addFighters();
        assertNotNull(controller.fighter);

    }


    @Test
    void matchcreator() {
       controller.addFighters();
       assertNotNull(controller.fighter);
    }

    @Test
    void semifinals() {
       controller.matchcreator();
       assertNotNull(controller.fighter);
    }

    @Test
    void finals() {
        controller.semifinals();
        assertNotNull(controller.fighter);

    }

    @Test
    void combat1() {
        controller.matchcreator();
        assertNotNull(controller.fighter);

    }

    @Test
    public void test () {
       assertNotSame(fighter.getUserName(), fighter.getSpecial());
    }

  @Test
  public void testt() {
   //   assertArrayEquals(semifinals(), matchcreator());
  }

      }





