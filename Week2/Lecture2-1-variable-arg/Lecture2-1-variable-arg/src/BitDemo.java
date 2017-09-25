class BitDemo {
  public static void main(String[] args) {
    int bitmask = 0x000f;
    int val = 0x2222;
    System.out.println(~bitmask); //0xfffffff0 = -16
    System.out.println(val & bitmask); //0x0002 = 2
    System.out.println(val | bitmask); //0x222f = 8751
    System.out.println(val ^ bitmask); //0x222d = 8749
  }
}
