 # Buton Kontrol Paneli Uygulması

 Bu projede 4x4 adet butondan oluşan bir ekran tasarlandı. Bu butonlara basıldığında aktif renk ve ikon olarak belirlenen değerleri alır. Basılmadığı durumda ise pasif renk ve ikon değerlerini alır.

 Bir butona basıldığında aktif renk aktif ikon gösterir. Farklı bir butona basıldığında basılan buton aktif renk ve aktif ikon olur diğerleri pasif duruma geçer.

 Yazılan kodlarda "Button" adında bir class bulunur. Bu class JButton sınıfını extends eder ve kullanacağımız metotları override ederek kullanabiliriz. Bu class içinde kullanacağımız gerekli paketler sayfa başında import edilir. Class içinde kullanılacak değişkenler private olarak tanımlanır.

 “`Button“` yapıcı metot oluşturulur. Bunun içinde butonun ilk  durumu tanımlanır, görünümü için atamalar yapılır ve akksiyon dinleyicisi ile basılma durumuna bakılır. 

 “`butonGorunum“` private tanımlanmış class içinde kullanılan bir metottur. Butonun boyutu tanımlanır ve aktif pasif durumuna göre işlemler için metot çağrılır.

 “`butonTiklama“` aktifMi değişkeninin true veya false durumuna göre alacağı renk ve ikonlar belirlenir.

 “`dinleyiciOlusturma“` burada ActionListener tipinden veri dönmesi için bir metot tanımlanır. actionPerformed adlı metot override edilerek içinde bir kontrol yapısı tanımlanır. Bu butona basılmışsa ve farklı butona basılacaksa öncekini pasif yapar.

 “`pasifYap“` bir önceki metot içinden çağrılarak butonu pasif konuma getirir. 

 “`graphQLSema“` bu metot ise basılan butonun aftif olup olmadığını bildiren hayali GraphQL şemasıdır. 

 Kodların içinde bu class da yazılanların çalışması için bir "main" class bulunur. Burada öncelikle pencere tanımlanır. setLayout ile pencere içindeki görünüş grid olarak tanımlanır. 4x4 dizilişinde 5 piksel boşluklardan oluşan bir yapı bulunur. for kullanılarak döngünün her bir adımında  Button clasından yeni bir buton oluşturulup frame e eklenir. En son da pencerre görünüşü ile ilgili kodlar yazılır. 

 # GrapQL

 Veri çekmek, üzerinde işlem yapmak, sorgulamak için kullanılan REST(programlama dilinden bağımsız olarak web servis oluşturmak için kullanılan yapıdır) tabanlı web servis sorgulama dilidir. 

Sunucu ve istemciden oluşur. Sunucuda istemciye gönderilecek verilerin olduğu bilgiler bulunur. Bunlar GraphQL şemaları, işlemler gibi şeylerdir. Şemanın hazırlanması programlama dillerine göre farklılık gösterir. Hazırlama bittikten sonra veriler kaynaktan alınıp istemciye iletilir. 

GraphQL üstünde işlem yaparken mutation denilen yapı kullanılır. Bunda ekleme, silme, güncelleme gibi işlemler yapılır. 

GraphQL sunucusu temelde sunucuya gönderilen sorguları işler. İstekler sunucuya gönderilirken query parametresi kullanılır. Burada stuff adına alan açılır ve bilgiler alınır. 

 
 

 
 

 
