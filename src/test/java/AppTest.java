

import compa.App;

public class AppTest
{
   
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        app1.getMessage().equals(app2.getMessage())  ;
    }

    
    public void testAppMessage()
    {
        App app = new App();
       "Hello World!".equals(app.getMessage());
    }
}
