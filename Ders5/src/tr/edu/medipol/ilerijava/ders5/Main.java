package tr.edu.medipol.ilerijava.ders5;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
    for (Integer i : numbers) {
      sayiyiYazdir(i);
    }
  }

  private static void sayiyiYazdir(Integer n) {
    System.out.println(n);
  }

}