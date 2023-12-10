import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
            // yeni bir pencere oluşturulur
            JFrame frame = new JFrame("Buton Kontrol Paneli uygulaması");
            // kapatılma davranışını belirlenir
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // grid yapısını tanımlayıp kaçlık olacağı belirlenir
            //  4 satır 4 sütundan oluşur 5 er piksellik boşluk bırakılır aralarında
            frame.setLayout(new GridLayout(4,4,5,5));

            // for döngüsü kullanılarak butonlar oluşturulur.
            for (int i = 0 ; i < 4 ; i++){
                for (int j = 0 ; j < 4 ; j++){
                    // içinde özelleştirme yaptığımız class new edilir ve frame eklenir
                    Button buton = new Button();
                    frame.add(buton);
                }
            }

            //framein görünür olması ve boyutunun pencere boyuna göre değişmesi için tanımlanır.
            frame.pack();
            frame.setVisible(true);
    }
}
