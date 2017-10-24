class Vegetable
{   
    public Vegetable(){
        System.out.println("I am a Vege!");
    }
    
    public void dispose(){
        System.out.println("Vege is consumed!");
    }
}

class Tomato extends Vegetable
{
    public Tomato(){
        super();
        System.out.println("I am a Tomato!");
        
    }
    
    public void dispose(){
        System.out.println("A tomato is consumed!");
        super.dispose();
    }
}

class Lettuce extends Vegetable
{
    public Lettuce(){
        super();
        System.out.println("I am a Lettuce!");
    }
    
    public void dispose(){
        System.out.println("A lettuce is consumed!");
        super.dispose();
    }
}

class Cabbage extends Vegetable
{   
    //super();
    public Cabbage(){
        super();
        System.out.println("I am a Cabbage!");
    }
    
    public void dispose(){
        System.out.println("A cabbage is consumed!");
        super.dispose();
    }
}

class VegeFamily
{

    Vegetable[] array = new Vegetable[] {new Tomato(), new Lettuce(), new Cabbage() };

    public void dispose(){
        for(int j = 0; j<array.length;j++){
            array[j].dispose();
        }
    }

    
    public static void main(String [] args)
    {
        VegeFamily myVeg = new VegeFamily();
        myVeg.dispose();
    }
}