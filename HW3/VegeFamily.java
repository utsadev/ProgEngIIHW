class Vegetable //parent class of all the different class vegtables
{   
    //constructor for Vegtable class
    public Vegetable(){
        System.out.println("I am a Vege!");
    }
    //dipose method for Vegtable class
    public void dispose(){
        System.out.println("Vege is consumed!");
    }
}

class Tomato extends Vegetable
{
    /*constructor of Tomator sublass that calls the constructor 
    of it's super class first and then finishes the constructor 
    of it's own class*/
    public Tomato(){
        super();
        System.out.println("I am a Tomato!");
        
    }
    
    /*prints out a statement in the dispose method in the sub class
    before calling the dispose method in the parent class */
    public void dispose(){
        System.out.println("A tomato is consumed!");
        super.dispose();
    }
}

class Lettuce extends Vegetable
{
    /*constructor of Lettuce sublass that calls the constructor 
    of it's super class first and then finishes the constructor 
    of it's own class*/
    public Lettuce(){
        super();
        System.out.println("I am a Lettuce!");
    }
    
    /*prints out a statement in the dispose method in the sub class
    before calling the dispose method in the parent class */
    public void dispose(){
        System.out.println("A lettuce is consumed!");
        super.dispose();
    }
}

class Cabbage extends Vegetable
{   
    /*constructor of Cabbage sublass that calls the constructor 
    of it's super class first and then finishes the constructor 
    of it's own class*/
    public Cabbage(){
        super();
        System.out.println("I am a Cabbage!");
    }
    
    /*prints out a statement in the dispose method in the sub class
    before calling the dispose method in the parent class */
    public void dispose(){
        System.out.println("A cabbage is consumed!");
        super.dispose();
    }
}

class VegeFamily
{
    /*an array of type vegitable that will store a object of each subclass
    the Vegtable class has */
    Vegetable[] array = new Vegetable[] {new Tomato(), new Lettuce(), new Cabbage() };

    //goes through the array and called the dispose method of each subclass that it calls
    //and super class that is associated to that sub class
    public void dispose(){
        for(int j = 0; j<array.length;j++){
            array[j].dispose();
        }
    }

    
    public static void main(String [] args)
    {
        VegeFamily myVeg = new VegeFamily(); //creates an object myVeg of type VegeFamily
        //calls the dispose method in the VegeFamily that will call the dipose for all subclasses and superclass
        myVeg.dispose(); 
    }
}