import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class DemoTest {

    private static Object JUnitCore;

    public static void main(String[] args) {



            org.junit.runner.Result result = org.junit.runner.JUnitCore.runClasses(ControllerTest.class);

            for (Failure failure : ((Result) result).getFailures()) {
                System.out.println(failure.toString());
            }

            System.out.println(result.wasSuccessful());
        }
    }

