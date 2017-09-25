
public class Bicycle 
{
	//======== Instance Variables======
	int cadence = 0; 
	int speed = 0; 
	int gear = 1;
	//double rate=1.05;
	//String greeting="hello world";
	//==============================
	
	//=====Class Variables===
	static int numGears=6;
	//=======================
	
	//=======Constants========
	 static final int NUM_GEARS = 6;
	 //=======================
	 
	
	void changeCadence(int x_c) //method
	{ 
	    cadence = x_c;
	    System.out.println("cadence value is "+cadence);
	}
	
	void addGears(int x_n) 
	{
		    numGears = numGears + x_n;
		    System.out.println("numGears Value is: "+numGears);
		    
	}
	
	void printNumGears() 
	{
	    System.out.println("The bicycle has" + NUM_GEARS + "gears!");
	}
	
	void applyBreak() 
	{
		    int delta = 1; //local variables
		    if (speed >= delta) 
		    {
		      speed = speed - delta;
		    }
		    //System.out.println("a is " + a);
	}
	
	void applyBreak2(int x_d) //x_d is a local variables
	{
		    if (speed >= x_d)
		    {
		      speed  = speed - x_d;
		    }
	}
	void Cadence_Gears(int cadance, int gears)
	{
		System.out.println(cadance);
		System.out.println(gears);
	}
	public static void main(String[] args) 
	{
		Bicycle b1 = new Bicycle();
		//Bicycle b2 = new Bicycle();
		//Instance Variables====
		//b1.changeCadence(1); 
		//b2.changeCadence(2);
		//=======Class Variables===
		//b1.addGears(1); 
		//b2.addGears(2);
		//b1.addGears(0);
		//=======Constant fill it by yourself=====
		b1.Cadence_Gears(1, 2);
		//======
		//long a=1234_4568_7890L;
		//double b=123.4;
		//b1.applyBreak();
		//System.out.println(a);
		//System.out.println(b);
	}
	
	

}
