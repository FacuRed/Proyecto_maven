package example.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CarritoTest.class,
        ClienteTest.class,
        FacturaTest.class,
        MainTest.class
})
public class SuiteTest {
}