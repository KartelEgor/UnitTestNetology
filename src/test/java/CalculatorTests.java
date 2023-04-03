import org.junit.jupiter.api.*;

public class CalculatorTests {
    Calculator calculator;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each");
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each");
        calculator = null;
    }

    @Test
    public void testPlus() {
        System.out.println("Test Plus");
        //arrange
        int expected = 5, a = 2, b = 3;
        //act
        int result = calculator.plus.apply(a, b);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMinus() {
        System.out.println("Test Minus");
        //arrange
        int expected = 4, a = 12, b = 8;
        //act
        int result = calculator.minus.apply(a, b);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        System.out.println("Test Multiply");
        //arrange
        int expected = 15, a = 3, b = 5;
        //act
        int result = calculator.multiply.apply(a, b);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivide() {
        System.out.println("Test Divide");
        //arrange
        int expected = 4, a = 20, b = 5;
        //act
        int result = calculator.divide.apply(a, b);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivideByZero() {
        System.out.println("Test DivideByZero");
        //arrange
        int expected = Integer.MIN_VALUE, a = 20, b = 0;
        //act
        int result = calculator.divide.apply(a, b);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPow() {
        System.out.println("Test Pow");
        //arrange
        int expected = 25, a = 5;
        //act
        int result = calculator.pow.apply(a);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testIsPositive() {
        System.out.println("Test is positive");
        //arrange
        int actual = 5;
        int expected = 1;
        //act

        //assert
        Assertions.assertTrue((actual > 0) == calculator.isPositive.test(expected));
    }


}
