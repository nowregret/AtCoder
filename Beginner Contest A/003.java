import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
 
public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            double[] resultArray = new double[N];
            double n = (double) N;
            
            for(int i = 0; i < N; i++) {
                resultArray[i] = ((i + 1) * 10000) * (1 / n);
            }
            
            double result = 0;
            for(double resultTmp : resultArray) {
                result = result + resultTmp;
            }
            System.out.println((int)result);
            
        } catch (IOException e) {
            System.out.println("IO Error!");
        }
    }
}
