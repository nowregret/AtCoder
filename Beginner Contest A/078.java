import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] input = br.readLine().split(" ");
            int firstCharToInt = input[0].charAt(0);
            int secondCharToInt = input[1].charAt(0);

            String result;
            if (firstCharToInt > secondCharToInt) {
                result = ">";
            } else if (firstCharToInt == secondCharToInt) {
                result = "=";
            } else {
                result = "<";
            }

            System.out.println(result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}