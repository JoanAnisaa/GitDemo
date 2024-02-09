package TestNG1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void demo(){
        System.out.println("Hello");
    }
    @Test
public void demo2(){
        System.out.println("Bye");
}
@BeforeTest
public void demo3(){
        System.out.println("It's Bed Time");

    }
}
