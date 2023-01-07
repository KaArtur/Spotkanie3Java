public class Kol2popr {

  /*  Napisz program przechowujący w pamięci 30 liczb całkowitych. Ustaw pierwszą liczbę na wartość większą od zera. Każda kolejna liczba powinna być trzy razy większa od poprzedniej. Wyświetl przechowywane liczby na ekranie.

            Przykład:
            1
            3
            9
            27
            ...*/
  public static void main(String[] args) {
      int[] table = new int[31];


      for (int i = 1; i < table.length; i++) {

         table[i] = i*3;
          System.out.println(table[i]);
      }

  }


}
