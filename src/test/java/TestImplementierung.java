
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//NEW static import for assert methods
import static org.junit.Assert.*;

public class TestImplementierung {
	
	private Implementierung myTestDemo; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		myTestDemo = new Implementierung();
	}

	@After
	public void tearDown() throws Exception {
		myTestDemo = null;
	}
	
	@Test
	public void testIsEmpty(){
		assertFalse(myTestDemo.isEmpty("123"));
		assertTrue(myTestDemo.isEmpty(""));
	}
	
	@Test
	public void testCapitalize(){
		assertEquals(myTestDemo.capitalize("hallo"), "Hallo");
		assertEquals(myTestDemo.capitalize("HALLO"), "Hallo");
		assertEquals(myTestDemo.capitalize("123ABC"), "123abc");
	}
	
	@Test
	public void testJoin(){
		assertEquals(myTestDemo.join("Hallo", "Welt", "!"), "Hallo Welt ! ");
	}
	
	@Test
	public void testReverse(){
		assertEquals(myTestDemo.reverse("Hallo Welt"), "tleW ollaH");
	}
	
	@Test(expected=NullPointerException.class)
    public void testNullPointerException() {
       myTestDemo.reverse(null);
    }

}

