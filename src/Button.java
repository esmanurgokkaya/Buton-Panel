import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Button extends JButton {
    // bu değişken bulunduğu sınıfın tipinde referans tutar.
    // Son tıklanan butonu kontrol etmek için kullanıcaz
    private static Button sonTiklanan = null;
    // bu değişken boolean tipinde dedğer tutar.
    // bu değişken ile de butonun aktif olup olmadığını kontrol edeceğiz.
    private boolean aktifMi;
     private Color aktifRenk = Color.red;
    // aktif icon tanımlanır
    private ImageIcon aktifIcon = new ImageIcon(getClass().getResource("thunder.png"));
    // pasif renk tanımlanır
    private Color pasifRenk = Color.blue;
    // pasif icon tanımlanır
    private ImageIcon pasifIcon = new ImageIcon(getClass().getResource("cloud.png"));
    // hayali graphQL için adresinin tutulacağı bir değişken tanımlanır
    private String graphQL;
    // yapıcı metot oluşturup gerekli metotlar çağrılır.
    public Button(String graphQL){
        // alınan değerler değişkenin eşitlemesi yapılır
        this.graphQL = graphQL;
        // ilk konumda buton pasif halde olur
        aktifMi = false;
        //  butonun görünümü için akktif pasif durumuna göre şekillendirmesi yapılır
        butonGorunum();
        // butonun basılma durumu için kendi metoduna belirlediğimiz bir metot parametre olarak gönderilir
        addActionListener(dinleyiciOlusturma());


    }

    // butonun boyutu belirlenir, içerisinde renk ve icon için gerekli metot çağrılır.
    private  void butonGorunum(){
        setPreferredSize(new Dimension(100,80));
        butonTiklama();
    }

    // butonun aktif ya da pasif olmasına göre renkleri ve iconu belirlenir
    private void butonTiklama(){
        if (aktifMi){
            // buton aktif durumda ise rengi ve iconu
            setBackground(aktifRenk);
            setIcon(aktifIcon);
        }
        else {
            // buton pasif durumda ise rengi ve iconu
            setBackground(pasifRenk);
            setIcon(pasifIcon);

        }
    }


    // burada addActionListener a gönderilmek için ActionListener türünde bir metot oluşturulur.

    private ActionListener dinleyiciOlusturma(){
        return new ActionListener() {
            // metot override edilerek yapacağı işlem değiştirilir.
            @Override
            public void actionPerformed(ActionEvent e) {
                // sınıfın tipinde olan ve son tıklanan butonun referansını tutan değişken ile kontrol yapılır.
                // ilk olarak bir referans var mı diye sonra da son tıklanan ile aynı mı diye bakılır.
                // eğer içinde bir referans varsa ve son tıklanan ile kontrol edilen buton aynı değilse son tıklanan pasif yapılır
                if (sonTiklanan != null && sonTiklanan != Button.this){
                    sonTiklanan.pasifYap();
                }
                // if içinden çıkıldığında önce aktif edilir sonra son tıklanana eşitlenir
                // en son da hayali şemaya değer yazdırılır.
                aktifMi = true;
                butonTiklama();
                sonTiklanan = Button.this;
                graphQLSema();
            }
        };
    }

    // aktifliği kontrol eden değişken false a eşitlenir ve metoda gönderilerel pasif hale getirilir.
    private void pasifYap(){
        aktifMi = false;
        butonTiklama();

    }

    private void graphQLSema(){
        System.out.println( "Butona Tıklandı - Aktif - " +graphQL);

    }

}
