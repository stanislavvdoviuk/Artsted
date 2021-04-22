package test;


import Pages.TopPart;
import org.testng.annotations.Test;

public class FirstTest extends LocalTestRunner {
    @Test
    public void testLauch() throws InterruptedException {
       launch();
       TopPart topPart=new TopPart(getDriver());

       topPart.signUser("ggbkciww@laste.ml", "12345678");

    }
}
