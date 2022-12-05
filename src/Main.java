import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String word=scan.nextLine();

        String reverse = "";
        for (int i = word.length()-1; i >=0 ; i--) {

            reverse+=word.charAt(i);

        }

        if (word.equals(reverse))
            System.out.println(word+" Palindromik kelimedir.");
        else
            System.out.println(word+" Palindromik kelime değildir.");
    }
}
