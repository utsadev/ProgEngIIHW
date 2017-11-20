interface Selector {
    
      boolean end();
    
      Object current();
    
      void next();
    
    }
    
    public class Sequence {
    
      private Object[] items;
    
      private int next = 0;
    
      public Sequence(int size) { items = new Object[size]; }
    
      public void add(Object x) {
    
        if(next < items.length)
    
          items[next++] = x;
    
      }
    
      private class OddSelector implements Selector {
    
        // Your code will be used here
        int i = 0;
        public String current(){
            if(s)

        }
    
      }
    
      public Selector oddSelector() {
    
        return new OddSelector();
    
      }
    
     
    
      public static void main(String[] args) {
    
        Sequence seq = new Sequence(10);
    
        for(int i = 0; i < 10; i++)
    
          seq.add(Integer.toString(i));
    
        Selector odd = seq.oddSelector();
    
        while(!odd.end()) {
    
          System.out.print(odd.current() + " ");
    
          odd.next();
    
        }
    
        System.out.println();
    
      }
    
    }