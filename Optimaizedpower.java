package Recursion;

public class Optimaizedpower {
  public static int optimaizedPower(int x, int n) {
    if(n==0) {
      return 1;
    }
    //n is EVEN
    int halfPower = optimaizedPower(x, n/2);
    int halfPowerSq = halfPower * halfPower;

    //n is ODD
    if(n % 2 != 0) {
      halfPowerSq = x *halfPowerSq;
    }
    return halfPowerSq;

  }
  public static void main(String args[]) {
    int x = 2;
    int n = 5;
    System.out.println(optimaizedPower(x, n));
  }
}
