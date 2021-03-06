package ec.edu.epn.git.calculadora;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora c;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        System.out.println("setUp()");
        c = new Calculadora();
    }

    @Test
    public void given_two_integers_when_suma_then_ok(){
        System.out.println("Test 1");
        assertEquals(6, c.suma(3,3));
    }

    @Test
    public void given_two_integers_when_resta_then_ok(){
        System.out.println("Test 2");
        assertEquals(7, c.resta(10,3));
    }


    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception(){
        System.out.println("Test 3");
        assertEquals(1,c.division(1,0),0);
    }

    @Test(timeout = 150)
    public void given_a_time_when_timeout_then_exception(){
        System.out.println("Test 4");
        c.timeout(100);
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setRespuesta(0);
    }

    @AfterClass
    public static void terDownClass(){
        System.out.println("tearDownClass()");
    }



}