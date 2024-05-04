package Recursion;

public class SumofNnatural {
  public static int sumofN(int n) {
    if(n==1) {
      return 1;
    }
    int snm1 = sumofN(n-1);
    int fn = n + snm1;
    return fn;
  }
  public static void main(String args[]) {
    int n = 4;
    System.out.println(sumofN(n));
  }
}
