import compa.App;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        app1.getMessage().equals(app2.getMessage())  ;
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
       "Hello World!".equals(app.getMessage());
    }
}
