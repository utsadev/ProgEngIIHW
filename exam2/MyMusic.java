
class Instrument {
    
    
      static void sPlay() {System.out.println("Instrument sPlay");}
    
    
      void dPlay() {System.out.println("Instrument dPlay");}
    
    
    }
    
    
    class Wind extends Instrument {
    
    
      static void sPlay() {System.out.println("Wind sPlay");}
    
    
      void dPlay() {System.out.println("Wind dPlay");}
    
    
    }
    
    
    class Piano extends Instrument {
    
    
      static void sPlay() {System.out.println("Piano sPlay");}
    
    
      void dPlay() {System.out.println("Piano dPlay");}
    
    
    }
    
    
    public class MyMusic {
    
    
      public static void main(String[] args) {
    
        
        Instrument ia[] = {new Wind(), new Piano()};
    
    
        for (Instrument i : ia) {
          i.sPlay();
          i.dPlay();
    
        }
    
    
        // Your solution to (2) will be inserted here
        int j = 0;
        Instrument k;

        while(j < ia.length){


          //Wind.sPlay();//ia[j].sPlay();
          //ia[j] = (ia[j]);
          //k = ia[j];
          //k.sPlay();
          if(ia[j] instanceof Wind ){
            Wind.sPlay();
          }
          else{ ia[j].sPlay();}
            //this only works if we get rid of the for loop above
          //ia[j].sPlay();

          j++;
        }
    
    
      }
    
    
    }