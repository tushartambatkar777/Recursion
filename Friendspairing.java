package Recursion;

public class Friendspairing {
  public static int friendsParing(int n) {
    //Base case
    if(n==1 || n==2) {
      return n;
    }

    //choice
    //single
    int fnm1 = friendsParing(n-1);

    //pair
    int fnm2 = friendsParing(n-2);
    int pairWays = (n-1) * fnm2;

    //totWays
    int totWays = fnm1 * pairWays;
    return totWays;

  }
  public static void main(String args[]) {
    System.out.println(friendsParing(3));
  }
}
