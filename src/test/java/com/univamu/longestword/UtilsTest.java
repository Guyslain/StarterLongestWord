package com.univamu.longestword;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

  @Test
  public void isVowel() {
    assertTrue(Utils.isVowel('a'));
    assertTrue(Utils.isVowel('e'));
    assertTrue(Utils.isVowel('i'));
    assertTrue(Utils.isVowel('o'));
    assertTrue(Utils.isVowel('u'));
    assertTrue(Utils.isVowel('y'));
    assertFalse(Utils.isVowel('b'));
    assertFalse(Utils.isVowel('g'));
    assertFalse(Utils.isVowel('h'));
    assertFalse(Utils.isVowel('n'));
    assertFalse(Utils.isVowel('s'));
    assertFalse(Utils.isVowel('z'));
  }
}