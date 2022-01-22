package selenium;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class arrays {

	@Test

	public void testarraysort() {
		int[] expected= {1,2, 3, 4};
		int[] actual= {4,3,2,1};
	

		Arrays.sort(actual);
		assertArrayEquals(expected,actual);
	}
	
	@Test
	
	public void arraynull() {
		int [] arr1= null;
		int [] arr2=null;
		
		assertArrayEquals(arr1,arr2);
		
	}

	@Test
	
public void assertnull() {
		Object cars= null;
		Object fruits="grapes";
		assertNull("car should be null", cars);
		assertNotNull("fruits should not be null",fruits);
		
	}
	
	@Test
	
	public void assertsamenotsame() {
		Object dog= new Object();
		Object cat=new Object();
		
		assertSame(dog,dog);
		assertNotSame(dog,cat);
		
	}
	
}
