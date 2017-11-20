//: innerclasses/LocalInnerClass.java
// Holds a sequence of Objects.

interface Counter {
    int next();
  }	
  public class LocalInnerClass 
  {
    private int count = 0;

    Counter localCounter(final String name) 
    {
      class LocalCounter implements Counter 
      {
        public int next() {
          System.out.print(name); 
          return count++;
        }
      }
      return new LocalCounter();
    }
    Counter anonyCounter(final String name) {
      return new Counter() {
        public int next() {
          System.out.print(name); 
          return count++;
        }
      };
    }
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter 
            c1 = lic.localCounter("Local "),
            c2 = lic.anonyCounter("Anonymous ");
    
        for(int i = 0; i < 3; i++)
            System.out.println(c1.next());
        for(int i = 0; i < 3; i++)
            System.out.println(c2.next());
    }
  } /* Output:
  LocalCounter()
  Counter()
  Local inner 0
  Local inner 1
  Local inner 2
  Local inner 3
  Local inner 4
  Anonymous inner 5
  Anonymous inner 6
  Anonymous inner 7
  Anonymous inner 8
  Anonymous inner 9
  *///:~