# Sayı Tahmin Oyunu

Bu Java programı, kullanıcının rastgele bir sayıyı tahmin etmeye çalıştığı bir sayı tahmin oyunudur. Program, kullanıcının tahminlerini alır, doğru tahmin edilen sayıyı kontrol eder ve gerektiğinde geri bildirimlerde bulunur. Oyuncunun 5 denemeden sonra doğru tahmin yapamaması durumunda, gizli sayıyı ve tüm tahmin edilen sayıları gösterir.

## Kurulum

- Java JDK'nın bilgisayarınıza yüklü olduğundan emin olun.
- Bu repo'yu klonlayın veya zip dosyası olarak indirin.

## Nasıl Çalıştırılır
- Bir Java derleyici veya entegre geliştirme ortamı (IDE) kullanarak projeyi açın.
- SayiTahminOyunu.java dosyasını bulun ve açın.
- Programı derleyin ve çalıştırın.

## Oyun Kuralları

- Program rastgele bir sayı seçer ve kullanıcının bu sayıyı tahmin etmesini bekler.
- Kullanıcı, tahmin edilen sayıyı girmesi istenir.
- Program, kullanıcının tahmininin geçerli bir aralıkta (0 ile 100 arasında) olup olmadığını kontrol eder.
- Eğer tahmin aralığın dışında ise, bir hata mesajı gösterilir ve kullanıcıya tekrar giriş yapması istenir.
- Eğer tahmin doğru ise, tebrik mesajı görüntülenir ve oyun sona erer.
- Eğer tahmin yanlış ise, bir hata mesajı ve gizli sayının daha büyük veya daha küçük olduğuna dair bir ipucu görüntülenir.
- Kullanıcıya toplamda 5 deneme hakkı verilir.
- Eğer kullanıcı deneme hakkını tüketirse, program gizli sayıyı ve tüm tahmin edilen sayıları gösterir.

Bu README.md dosyası, Sayı Tahmin Oyunu'nun genel bir açıklamasını içerir. Programın nasıl kurulacağı, nasıl çalışağı ve oyun kuralları hakkında bilgi verir. Umarım bu bilgiler size yardımcı olur. İyi çalışmalar!

# Number Guessing Game

This Java program is a number guessing game where the user tries to guess a randomly generated number. The program takes the user's guesses, checks if the guessed number is within a valid range, and provides feedback as needed. If the user fails to make a correct guess after 5 attempts, the program reveals the hidden number and displays all the guessed numbers.

## Installation

- Make sure Java JDK is installed on your computer.
- Clone this repository or download it as a zip file.

## How to Run

- Open the project using a Java compiler or an Integrated Development Environment (IDE).
- Locate the SayiTahminOyunu.java file and open it.
- Compile and run the program.

## Game Rules

- The program selects a random number and prompts the user to guess that number.
- The user is asked to enter their guess.
- The program checks if the user's guess is within a valid range (between 0 and 100).
- If the guess is outside the range, an error message is displayed, and the user is prompted to enter again.
- If the guess is correct, a congratulatory message is displayed, and the game ends.
- If the guess is incorrect, an error message is displayed along with a hint that the hidden number is either larger or smaller.
- The user is given a total of 5 attempts.
- If the user exhausts all attempts without making a correct guess, the program reveals the hidden number and displays all the guessed numbers.

This README.md file provides a general overview of the Number Guessing Game. It explains how to install and run the program, as well as the rules of the game. I hope this information is helpful to you. Happy coding!
