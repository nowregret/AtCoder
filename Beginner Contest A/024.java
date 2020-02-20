import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String[] args) throws Exception {

    try {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // 子供の入場人数
      int childCount = 0;

      // 大人の入場人数
      int adultCount = 0;

      // 総入場人数
      int sumCount = 0;

      // 一定人数以上の場合、1人当たりの割引額
      int discountFee = 0;

      // この人数以上の入場であれば1当たりの料金を割り引く
      int discountCondition = 0;

      // 子供の入場料金
      int childFee = 0;

      // 大人の入場料金
      int adultFee = 0;

      String[] inputLine1 = br.readLine().split(" ");
      String[] inputLine2 = br.readLine().split(" ");


      childCount = Integer.parseInt(inputLine2[0]);
      adultCount = Integer.parseInt(inputLine2[1]);
      sumCount = childCount + adultCount;
      discountFee = Integer.parseInt(inputLine1[2]);
      discountCondition = Integer.parseInt(inputLine1[3]);

      childFee = Integer.parseInt(inputLine1[0]);
      adultFee = Integer.parseInt(inputLine1[1]);

      // 結果
      int result = (childCount * childFee) + (adultCount * adultFee);

      if (sumCount >= discountCondition) {
    	  result -= (sumCount * discountFee);
      }

      System.out.println(result);

    } catch(IOException | NumberFormatException e) {
      e.printStackTrace();
      System.exit(0);
    } catch(Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}
