package com.univamu.longestword;

public class Utils {

  public static boolean isVowel(int codePoint) {
    switch (codePoint) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'y':
        return true;
      default:
        return false;
    }
  }

}
