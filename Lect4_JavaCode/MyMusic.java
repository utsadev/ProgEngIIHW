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

        for(int j = 0; j<ia.length ;j++){
            Wind.sPlay();
            Piano.sPlay();

        }
    
      }
    
    }
    