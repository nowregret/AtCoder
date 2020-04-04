import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int currentRating = Integer.parseInt(br.readLine());
            int goalRating = Integer.parseInt(br.readLine());
            int targetRating = (goalRating - currentRating) + goalRating;

            System.out.println(targetRating);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}