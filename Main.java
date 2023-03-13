import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rdn=new Random();
        int randomNumber=rdn.nextInt(100);
        int predictedNumber;
        Scanner scan=new Scanner(System.in);
        int right=0;
        int[] wrongPredictedNumber=new int[5];

            while (right < 5) {
                System.out.print("Lütfen Tahmininizi Giriniz: ");
                predictedNumber = scan.nextInt();
                if (predictedNumber<0 || predictedNumber>100)
                {
                    System.out.println("Lütfen 0-100 Arasında Bir Değer Giriniz.");
                    continue;
                }
                wrongPredictedNumber[right]=predictedNumber;
                right++;
                if (predictedNumber == randomNumber) {
                    System.out.println("Tebrikler Doğru Tahmin Ettiniz.");
                    break;
                }else{
                    System.out.println("Hatalı Bir Sayı Girdiniz.");
                    if (predictedNumber>randomNumber){
                        System.out.println(predictedNumber+" sayısı, gizli sayıdan büyüktür.");
                    } else {
                        System.out.println(predictedNumber+" sayısı, gizli sayıdan küçüktür.");
                    }
                    if ((5-right)!=0){
                        System.out.println("Kalan Hak: "+ (5-right));
                    }
                    else{
                        System.out.println();
                        System.out.println("Oyun Bitti. Gizli Sayı: "+randomNumber);
                        System.out.print("Tahminleriniz: "+ Arrays.toString(wrongPredictedNumber));
                    }
                }
                System.out.println();
        }
    }
}
