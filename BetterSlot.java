import java.util.*;

class BetterSlot{
	
	/* 
	public static void main(String[] args)
	{
		int[] values = pullTheLever();
		 
		
		System.out.println("Slot Numbers: " + Arrays.toString(values) + " pays $" + payOff(values));
	}
	*/
	
	

	 public int[] pullTheLever()
	 {
		 //Making the digits randomized
		 Random randNum = new Random();
		 int[] values = new int[5];
		 
		 //FOR loop to fill in values array with random digits
		 for (int i = 0; i < values.length; i++)
		 {
			 
			 values[i] = randNum.nextInt(51);
			 
		 }
		 
		 
		//returning random values array
		return values;
		 
	 }
	 
	 
	 public int payOff(int[] values)
	 {
		 int TotalPayOut = 0;
		 
		 //Unique PayOuts
		 int FiveofaKind = 1000000;
		 int FourofaKind = 10000;
		 int FullHouse = 5000;
		 int ThreeofaKind = 100;
		 int Pair = 10;
		 
		 //sorting numbers in the array
		 Arrays.sort(values);
		 
		 //Storing numbers as individual variables
		 int Num1 = values[0];
		 int Num2 = values[1];
		 int Num3 = values[2];
		 int Num4 = values[3];
		 int Num5 = values[4];
		 
		 //Check for valid slot numbers
		 for(int i = 0; i < values.length; i++)
		 {
			if (values[i] <= 0 && values[i] >= 50)
			{
				pullTheLever();
			}
		 }
		 
		 
		 //FIVE of a kind check
		 if(Num1 == Num2 && Num1 == Num3 && Num1 == Num4 && Num1 == Num5)
		 {
			 TotalPayOut = FiveofaKind;
		 }
		 //FOUR of a kind check (First)
		 else if(Num1 == Num2 && Num1 == Num3 && Num1 == Num4 && Num1 != Num5)
		 {
			 TotalPayOut = FourofaKind;
		 }
		//FOUR of a kind check (Last)
		 else if(Num5 == Num2 && Num5 == Num3 && Num5 == Num4 && Num1 != Num5)
		 {
			 TotalPayOut = FourofaKind;
		 }
		 //FULL HOUSE check (First)
		 else if(Num1 == Num2 && Num2 == Num3 && (Num4 == Num5))
		 {
			 TotalPayOut = FullHouse;
		 }
		//FULL HOUSE check (Last)
		 else if((Num1 == Num2) && Num3 == Num4 && Num4 == Num5)
		 {
			 TotalPayOut = FullHouse;
		 }
		//Three of a kind check (f irst)
		 else if(Num1 == Num2 && Num2 == Num3 && (Num4 != Num5))
		 {
			 TotalPayOut = ThreeofaKind;
		 }
		//Three of a kind check (last)
		 else if((Num1 != Num2) && Num3 == Num4 && Num4 == Num5)
		 {
			 TotalPayOut = ThreeofaKind;
		 }
		 //Three of a kind check (middle)
		 else if((Num1 != Num5) && Num2 == Num3 && Num3 == Num4)
		 {
			 TotalPayOut = ThreeofaKind;
		 }
		 //Two pair check
		 else if ((Num1 == Num2) && Num3 == Num4 && Num1 != Num5 && Num3 != Num5)
		 {
		 TotalPayOut = Pair;
		 }
		//Two pair check
		 else if ((Num1 == Num2) && Num1 != Num3 && Num3 != Num4 && Num4 ==Num5)
		 {
		 TotalPayOut = Pair;
		 }
		//Two pair check
		 else if ((Num2 == Num3) && Num1 != Num2 && Num4 == Num5 && Num3 != Num4)
		 {
		 TotalPayOut = Pair;
		 }
		 //Pair check (First)
		 else if((Num1 == Num2) && Num2 != Num3 && Num3 != Num4 && Num4 != Num5)
		 {
			 TotalPayOut = Pair;
		 }
		 //Pair check (Middle - 1)
		 else if((Num2 == Num3) && Num3 != Num4 && Num4 != Num5 && Num1 != Num2)
		 {
			 TotalPayOut = Pair;
		 }
		//Pair check (Middle - 2)
		 else if((Num3 == Num4) && Num4 != Num5 && Num1 != Num2 && Num2 != Num3)
		 {
			 TotalPayOut = Pair;
		 }
		//Pair check (Last)
		 else if((Num4 == Num5) && Num1 != Num2 && Num2 != Num3 && Num3 != Num4)
		 {
			 TotalPayOut = Pair;
		 }
		 
		 
		 
		//CHECK for power of 2
		 for (int i = 0; i < values.length; i++)
		 {
			 //powers of two before 50
			 int one = 1;
			 int two = 2;
			 int four = 4;
			 int eight = 8;
			 int sixTeen = 16;
			 int thirtyTwo = 32;
		
			 if(values[i] == one || values[i] == two || values[i] == four || values[i] == eight || values[i] == sixTeen || values[i] == thirtyTwo)
			 {
				 TotalPayOut += 3;
				 break;
			 }
			 
			 //if ( (values[i] != 0) && ((values[i] & (values[i] - 1)) == 0) )
			 //{
				 //TotalPayOut += 3;
				 //break;
			 //}
		 }
		 
		 
		 
		//CHECK for values = 42 
		 for (int i = 0; i < values.length; i++)
		 {
			
			 if(values[i] == 42)
			 {
				 TotalPayOut += 2;
				 break;
			 }
		 }
		
		 
		 
		 //CHECK for perfect squares
		 for (int i = 0; i < values.length; i++)
		 {
			 //perfect squares until 50
			 int one = 1;
			 int four = 4;
			 int nine = 9;
			 int sixTeen = 16;
			 int twentyFive = 25;
			 int thirtySix = 36;
			 int fortyNine = 49;
			 
			 
			 if(values[i] == one || values[i] == four || values[i] == nine || values[i] == sixTeen
					 || values[i] == twentyFive || values[i] == thirtySix || values[i] == fortyNine)
			 {
				 TotalPayOut += 7;
				 break;
			 }
			 
		 } 
		 
		 //Array Test Check 
		 //System.out.println(Arrays.toString(values));
		 
		 
		 return TotalPayOut;
	 }
	 
	 
	 
 }