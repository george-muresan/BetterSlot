import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSlipperySlot {

	
	
	@Test
	void  FiveofaKind() 
	{
		int values[] = {5,5,5,5,5};
		SlipperySlot fives = new SlipperySlot();
		int results = fives.payOff(values);
		
		assertEquals(1000000, results);
		
		//fail("Error: 5 of a kind");
	}
	@Test
	void  FourofaKind() 
	{
		int values[] = {5,5,5,5,6};
		SlipperySlot fours = new SlipperySlot();
		int results = fours.payOff(values);
		
		assertEquals(10000, results);
		
		//fail("Error: 4 of a kind");
	}
	@Test
	void  FullHouse() 
	{
		int values[] = {5,5,5,3,3};
		SlipperySlot fullhouse = new SlipperySlot();
		int results = fullhouse.payOff(values);
		assertEquals(5000, results);
		
		//fail("Error: Full House");
	}
	@Test
	void  ThreeofaKind() 
	{
		int values[] = {7,7,7,3,5};
		SlipperySlot threes = new SlipperySlot();
		int results = threes.payOff(values);
		assertEquals(100, results);
		
		//fail("Error: 3 of a kind");
	}
	@Test
	void  Pair() 
	{
		int values[] = {11,11,3,5,7};
		SlipperySlot pair = new SlipperySlot();
		int results = pair.payOff(values);
		assertEquals(10, results);
		
		//fail("Error: Pair");
	}
	@Test
	void  TwoPair() 
	{
		int values[] = {7,7,3,3,5};
		SlipperySlot twoPairs = new SlipperySlot();
		int results = twoPairs.payOff(values);
		assertEquals(10, results);
		
		//fail("Error: 2 pairs");
	}
	@Test
	void  FortyTwo() 
	{
		int values[] = {42,11,3,5,7};
		SlipperySlot fourtyTwo = new SlipperySlot();
		int results = fourtyTwo.payOff(values);
		assertEquals(2, results);
		
		//fail("Error: 42");
	}
	@Test
	void  FortytwoPair() 
	{
		int values[] = {42,42,11,3,5};
		SlipperySlot fourtyTwoPair = new SlipperySlot();
		int results = fourtyTwoPair.payOff(values);
		assertEquals(12, results);
		
		//fail("Error: 42 pair");
	}
	@Test
	void  PerfectSquare() 
	{
		int values[] = {11,3,5,7,25};
		SlipperySlot perfect = new SlipperySlot();
		int results = perfect.payOff(values);
		assertEquals(7, results);
		
		//fail("Error: Perfect Square");
	}
	@Test
	void  PerfectSquareDos() 
	{
		int values[] = {25,49,11,3,5};
		SlipperySlot perfects = new SlipperySlot();
		int results = perfects.payOff(values);
		assertEquals(7, results);
		
		//fail("Error: 2 Perfect Squares");
	}
	@Test
	void  PerfectSquarePair() 
	{
		int values[] = {25, 25,11,3,5};
		SlipperySlot perfects = new SlipperySlot();
		int results = perfects.payOff(values);
		assertEquals(17, results);
		
		//fail("Error: Perfect Square Pair");
	}
	@Test
	void  PowerofDos() 
	{
		int values[] = {11,3,5,7,8};
		SlipperySlot powers = new SlipperySlot();
		int results = powers.payOff(values);
		assertEquals(3, results);
		
		//fail("Error: Perfect Square");
	}
	@Test
	void  powersdos() 
	{
		int values[] = {11,3,8,32,5};
		SlipperySlot powers = new SlipperySlot();
		int results = powers.payOff(values);
		assertEquals(3, results);
		
		//fail("Error: 2 powers of 2");
	}
	@Test
	void  powerpair() 
	{
		int values[] = {11,8,8,3,5};
		SlipperySlot powerpair = new SlipperySlot();
		int results = powerpair.payOff(values);
		assertEquals(13, results);
		
		//fail("Error: power of 2 pair");
	}
	

}


