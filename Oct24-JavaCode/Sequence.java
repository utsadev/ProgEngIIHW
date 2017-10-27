//: innerclasses/Sequence.java
// Holds a sequence of Objects.

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
    private class SeqSelector implements Selector {
      private int i = 0;
      public boolean end() { return i >= items.length; }
      public Object current() { return items[i]; }
      public void next() { i++; }
    }
    public Selector seqSelector() {
      return new SeqSelector();
    }
    private class EvenSelector implements Selector {
      private int i = 0;
      public boolean end() { return i >= items.length; }
      public Object current() { return items[i]; }
      public void next() { i += 2; }
    }
    public Selector evenSelector() {
      return new EvenSelector();
    }
  
    public static void main(String[] args) {
      Sequence seq = new Sequence(10);
      for(int i = 0; i < 10; i++)
        seq.add(Integer.toString(i));
  
      Selector sel = seq.seqSelector();
      while(!sel.end()) {
        System.out.print(sel.current() + " ");
        sel.next();
      }
      System.out.println();
      Selector even = seq.evenSelector();
      while(!even.end()) {
        System.out.print(even.current() + " ");
        even.next();
      }
    }
  } /* Output:
  0 1 2 3 4 5 6 7 8 9
  *///:~