import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
class Main {
  public static void main (String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    double mKm = 1000;
    int m = Integer.parseInt(scanner.next());
    double km = m/mKm;
    int VV = 0;
    
    if (70 < km) {
	    VV = 89;
    } else if (35 <= km && 70 >= km) {
        VV = (int)((km - 30)/5 + 80);
    } else if (6 <= km && 30 >= km) {
        VV = (int)(km + 50);
    } else if (0.1 <= km && 5 >= km) {
        VV = (int)(km * 10);
    } else if (0.1 > km) {
        VV = 0;
    }
    
    System.out.println(String.format("%02d", VV));
  }
}
