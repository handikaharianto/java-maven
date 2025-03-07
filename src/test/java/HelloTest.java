import Unknown.Hello;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloTest {
    @Test
    public void testHello() {
        System.out.println("Hello World");
        Hello hello = new Hello();
        assertEquals("Hello World!", hello.sayHello());
    }
}
