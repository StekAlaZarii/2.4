import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String wejscie, wyjscie;
    int dlugosc = 0;
    int ile = 0;
    
    Scanner skaner = new Scanner(System.in);
    wejscie = skaner.nextLine();
    skaner.close();
    dlugosc = wejscie.length();

      for (int i = 0; i < dlugosc; i++) {
          if (wejscie.charAt(i) == 'q') {
              i = dlugosc;
          } else {
              ile++;
          }
      }
    wyjscie = wejscie.substring(0, ile);
    System.out.println(wyjscie);
  }
}