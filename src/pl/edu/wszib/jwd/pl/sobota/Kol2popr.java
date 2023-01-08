package pl.edu.wszib.jwd.pl.sobota;

public class Kol2popr {

  /*  Napisz program przechowujący w pamięci 30 liczb całkowitych. Ustaw pierwszą liczbę na wartość większą od zera. Każda kolejna liczba powinna być trzy razy większa od poprzedniej. Wyświetl przechowywane liczby na ekranie.

            Przykład:
            1
            3
            9
            27
            ...*/
  public static void main(String[] args) {
    /*  int[] table = new int[31];


      for (int i = 1; i < table.length; i++) {

         table[i] = i*3;
          System.out.println(table.length);
      }*/


      // Tworzymy tablicę o rozmiarze 30
      long[] numbers = new long[30];

      // Ustawiamy pierwszą liczbę na wartość większą od zera


      // Pętla for, która iteruje po wszystkich elementach tablicy
      for (int i = 1; i < numbers.length; i++) {
          numbers[0] = 1;
          // Każda kolejna liczba jest trzy razy większa od poprzedniej
          numbers[i] = numbers[i - 1] * 3;
      }
      for (long number : numbers) {
          System.out.println(number);
      }

  }


}
