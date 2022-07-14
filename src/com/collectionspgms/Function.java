package com.collectionspgms;
import java.util.*;

public class Function { 
  String LongestWord(String sen) {
 
    String[] words = sen.split(" ");

    int maior = -1;
    String maiorResultado = "";
   
    boolean ehPalavra = true;
    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words[i].length(); j++) {
        if (!Character.isLetterOrDigit(words[i].charAt(j))) {
            ehPalavra = false;
        }
      }
      if (ehPalavra && words[i].length() > maior) {
        maior = words[i].length();
        maiorResultado = words[i];
      }
      ehPalavra = true;
    }
   
    return maiorResultado;
   
  }
 
  public static void main (String[] args) { 
    // keep this function call here    
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LongestWord(s.nextLine()));
  }  
 
}          
