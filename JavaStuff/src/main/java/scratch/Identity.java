package scratch;

public class Identity {
  public static void main(String[] args) {
    int x = 2;
    int y = 2;
    System.out.println(x == y);
    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println(sb1 == sb2);
  }
}
