import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person2 i = new Person2();
		i.setAge(47);
		i.setName("Chuck");
		i.setnumberOfChildern(0);
		i.setOccupation("Making Jokes About Himself");
		i.setHeight(8.1);
		i.setdateOfBirth("March 3, 2098");
		
		assertEquals("Chuck",i.getName());
		assertEquals("Making Jokes About Himself", i.getOccupation());
		assertEquals("March 3, 2098", i.getdateOfBirth());
		assertEquals(0,i.getnumberOfChildern());
		assertEquals(47,i.getAge());
		assertEquals(8.1,i.getHeight(),0.001);
		
		
	}

}
