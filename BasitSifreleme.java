import java.util.Scanner;

public class BasitSifreleme {

    public static void main(String[] args) {
        // Kullanıcıdan alınan her harfi bir karakter ileri kaydır
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Metin gir: ");
        String metin = scanner.nextLine();
        
        String sifreliMetin = "";
                
        for(int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            
            if (karakter != ' ') {  
                sifreliMetin += (char)(karakter + 1); 
            } else {
                sifreliMetin += karakter; 
            }
        }
        
        System.out.println("Şifrelenmiş Metin: " + sifreliMetin);
        scanner.close();
    }
}
