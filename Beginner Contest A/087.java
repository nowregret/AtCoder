import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int pocketMoney = Integer.parseInt(br.readLine()) - Integer.parseInt(br.readLine());
            int donutsFee = Integer.parseInt(br.readLine());

            while (pocketMoney >= donutsFee) {
                pocketMoney -= donutsFee;
            }

            System.out.println(pocketMoney);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}