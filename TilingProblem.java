package Recursion;

public class TilingProblem {
  public static int tilingProblem(int n) {
    //Base Case
    if(n==0 || n==1) {
      return 1;
    }

    //Vertical choice
    int fnm1 = tilingProblem(n-1);

    //Horizaltal choice
    int fnm2 = tilingProblem(n-2);

    //Total Ways
    int totways = fnm1 + fnm2;
    return totways; 
  }
  public static void main(String args[]) {
    System.out.println(tilingProblem(4));
  }
}
