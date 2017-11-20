interface StringProcessor {
    
      String process(String input);
    
    }
    
    class Upcase implements StringProcessor {
    
      public String process(String input) {
    
        return input.toUpperCase();
    
      }
    
    }
    
    class Downcase {
    
      public String process(String input) {
    
        return input.toLowerCase();
    
      }
    
    }
    
    class DowncaseAdapter implements StringProcessor {
    
      // Your code will be used here
      //Downcase d;
      public String process(String s){ return s;}

      public String DowncaseAdapter(Downcase d){
        
            return d.process("hello world!");
        }
    
    }
    
    public class Apply {
    
      public static void process(StringProcessor p, String s) {
    
        System.out.println(p.process(s));
    
      }
    
      public static String s = "Hello World!";
    
      public static void main(String[] args) {
    
        Apply.process(new Upcase(), s);
    
        Apply.process(new DowncaseAdapter(new Downcase()), s);
    
      }
    
    }