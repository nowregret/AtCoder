import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

  public static void main(String[] args) throws Exception {

    try {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // インプットから名前リストの生成元を格納する
      List<String> generateForName  = new ArrayList<>();

      for(int i = 0; i < 5; i++) {
    	  generateForName.add(String.valueOf((char)br.read()));
      }

      // 生成元から名前を生成して格納する
      List<String> nameList = new ArrayList<>();

      for(int j = 0; j < 5; j++) {
    	  for(int y = 0; y < 5; y++) {
    		  nameList.add(
    				  generateForName.get(j) + generateForName.get(y)
    		  );
    	  }
      }

      // 改行の読み込み
      br.read();

      // 結果の出力
      System.out.println(nameList.get(Integer.parseInt(br.readLine()) - 1));

    } catch(IOException | NumberFormatException e) {
      e.printStackTrace();
      System.exit(0);
    } catch(Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}
