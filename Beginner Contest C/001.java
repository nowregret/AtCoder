import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.io.BufferedReader;
import java.util.regex.Pattern;
 
class Main {
  public static void main (String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
		String tmp = br.readLine();
		String[] tmp2 = tmp.split("\\s+");
 
		int Deg = Integer.parseInt(tmp2[0]) * 10;
		double Dis = Integer.parseInt(tmp2[1]);
 
		double disPerSec = (Dis/60);
		BigDecimal bd = new BigDecimal(String.valueOf(disPerSec));
		BigDecimal bd1 = bd.setScale(1, RoundingMode.HALF_UP);
		disPerSec = bd1.doubleValue();
 
		String Dir = "N";
		int W = 0;
 
		if (32625 <= Deg && 34875 > Deg) {
			Dir = "NNW";
		} else if (30375 <= Deg && 32625 > Deg) {
			Dir = "NW";
		} else if (28125 <= Deg && 30375 > Deg) {
			Dir = "WNW";
		} else if (25875 <= Deg && 28125 > Deg) {
			Dir = "W";
		} else if (23625 <= Deg && 25875 > Deg) {
			Dir = "WSW";
		} else if (21375 <= Deg && 23625 > Deg) {
			Dir = "SW";
		} else if (19125 <= Deg && 21375 > Deg) {
			Dir = "SSW";
		} else if (16875 <= Deg && 19125 > Deg) {
			Dir = "S";
		} else if (14625 <= Deg && 16875 > Deg) {
			Dir = "SSE";
		} else if (12375 <= Deg && 14625 > Deg) {
			Dir = "SE";
		} else if (10125 <= Deg && 12375 > Deg) {
			Dir = "ESE";
		} else if (7875 <= Deg && 10125 > Deg) {
			Dir = "E";
		} else if (5625 <= Deg && 7875 > Deg) {
			Dir = "ENE";
		} else if (3375 <= Deg && 5625 > Deg) {
			Dir = "NE";
		} else if (1125 <= Deg && 3375 > Deg) {
			Dir = "NNE";
		} else {
			Dir = "N";
		}
 
		if (32.7 <= disPerSec) {
			W = 12;
		} else if (28.5 <= disPerSec && 32.6 >= disPerSec) {
			W = 11;
		} else if (24.5 <= disPerSec && 28.4 >= disPerSec) {
			W = 10;
		} else if (20.8 <= disPerSec && 24.4 >= disPerSec) {
			W = 9;
		} else if (17.2 <= disPerSec && 20.7 >= disPerSec) {
			W = 8;
		} else if (13.9 <= disPerSec && 17.1 >= disPerSec) {
			W = 7;
		} else if (10.8 <= disPerSec && 13.8 >= disPerSec) {
			W = 6;
		} else if (8.0 <= disPerSec && 10.7 >= disPerSec) {
			W = 5;
		} else if (5.5 <= disPerSec && 7.9 >= disPerSec) {
			W = 4;
		} else if (3.4 <= disPerSec && 5.4 >= disPerSec) {
			W = 3;
		} else if (1.6 <= disPerSec && 3.3 >= disPerSec) {
			W = 2;
		} else if (0.3 <= disPerSec && 1.5 >= disPerSec) {
			W = 1;
		} else if (0.0 <= disPerSec && 0.2 >= disPerSec) {
			W = 0;
          	Dir = "C";
		}
 
		System.out.println(Dir + " " + W);
	} catch (IOException e) {
		System.out.println("IOError");
	}
  }
}
