package edu.cnm.deepdive;

import java.util.Arrays;

public class StaircaseStrings {

  public static String[] stairString(int height) {
    String[] stairs = new String[height];
    for (int i = 0; i < height; i++) {
      StringBuilder builder = new StringBuilder();
      builder.append(" ".repeat(height + 1 - i))
          .append("*".repeat(i + 1));
      stairs[i] = builder.toString();
    }
    return stairs;
  }

  public static void main(String[] args) {
    String[] stairs = stairString(10);
    for (int i = 0; i < stairs.length; i++) {
      System.out.println(stairs[i]);
    }
  }
}
