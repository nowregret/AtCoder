import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.util.regex.Pattern;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String S = br.readLine();
            String T = br.readLine();
            String[] sArray = S.split("");
            String[] tArray = T.split("");

            int i = 0;
            for(String A : sArray) {
                sArray[i] = A.replace("@", "[atcoder]");
                i++;
            }
            
            int j = 0;
            for(String B : tArray) {
                tArray[j] = B.replace("@", "[atcoder]");
                j++;
            }

            String regex = "[atcoder]";
            ArrayList<String> resultBool = new ArrayList<String>();
            for (int y = 0; y < tArray.length; y++) {
                resultBool.add(sArray[y].replaceAll(tArray[y], "*"));
            }

            ArrayList<String> aaaa = new ArrayList<String>();
            String result = "You can win";
            int xy = 0;
            for(String x : resultBool) {
                if(!(x.contains("*"))){
                    result = "You will lose";
                    break;
                }
            }

            System.out.println(result);

        } catch (IOException e) {
            System.out.println("IO Error!");
        }
    }
}
