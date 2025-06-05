package xyz;

import java.util.TreeMap;

public class TreeMapTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeMap<String, String> country=new TreeMap<>();
      country.put("india", "newdelhi");
      country.put("usa", "washington");
      country.put("germany", "berlin");
      country.put("japan", "tokyo");
      country.put("india", "delhi");
      System.out.println(country);
      System.out.println(country.firstEntry());
      System.out.println(country.lastEntry());
      System.out.println(country.higherEntry("germany"));
      System.out.println(country.lowerEntry("india"));
	}

}