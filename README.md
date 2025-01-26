


<img src ="readmephoto.jpeg"/>


# OperiqSystem

**OperiqSystem**, işletmelerin operasyonel süreçlerini verimli bir şekilde yönetmek için geliştirilmiş bir yazılım sistemidir. Kullanıcıların tedarik zinciri yönetimi, iş gücü takibi, finansal yönetim ve diğer iş süreçlerini daha etkin hale getirmeleri için kapsamlı araçlar sunar..

## Ana Özellikler
- **Müsteri Yönetimi**: Müşteri ilişkilerini düzenlemek, stok takibi yapmak, tedarikçi yönetimini sağlamak ve sipariş takibini kolaylaştırmak, işletmelerin verimliliğini artırır. Bu modül, ürünlerin müşterilere zamanında ve doğru bir şekilde ulaştırılmasını sağlar.
- **İş Emri Takibi**: Çalışanların etkinliğini izlemek, vardiya düzenlemelerini yapmak ve performans değerlendirmeleri sunmak için kullanılan araçlardır. Bu, operasyonel süreçlerin düzgün işlemesi için kritik öneme sahiptir.
- **Sipariş Yönetim**: Gelir-gider takibi, bütçeleme ve finansal raporlama araçlarıyla, siparişlerin düzgün yönetilmesi sağlanır. Siparişlerin doğru şekilde takip edilmesi, işin finansal sağlığını korur.
- **Stok Raporlama**: Stok seviyelerinin düzenli olarak izlenmesi ve analiz edilmesi, doğru kararlar almak için gereklidir. Görsel raporlar, işletmenin ihtiyacı olan verilere hızlı erişim sağlar.
- **Ürün Ağacı sistemi**: Ürünlerin bileşenlerine dayalı olarak, ürünlerin üretim süreci ve bileşenleri takip edilir. Bu, tedarik zinciri yönetiminde verimlilik sağlar.
- **Kullanıcı Kaydı**: Kullanıcıların sisteme kaydedilmesi ve yönetilmesi, erişim kontrolünü sağlar. Bu, güvenliği artırır ve her kullanıcının doğru izinlere sahip olmasını temin eder
- **İleri Düzey Raporlama**: Detaylı veri analizleri yaparak, iş süreçlerini optimize etmek için kapsamlı raporlar oluşturulur. Bu raporlar, yöneticilere daha iyi stratejik kararlar alma imkânı sunar.

## Kullanıcı Arayüzü
Sistem, kullanıcı dostu bir arayüze sahip olup, tüm operasyonel süreçlerin kolayca yönetilmesini sağlar. Verimli bir şekilde raporlama yapılabilir, analizler görülebilir ve süreçler izlenebilir.

## Teknolojiler
- **Backend**: Java, Spring Boot
- **Veritabanı**: PostgreSQL
- **Frontend**: React.js (İsteğe bağlı, proje ihtiyacına göre frontend geliştirmeleri yapılabilir)

## Bağımlılıklar

Bu projede aşağıdaki bağımlılıklar kullanılmıştır:

- **Spring Boot Starter Data JPA**: Veritabanı etkileşimleri için.
- **Spring Boot Starter Validation**: Veritabanı doğrulama işlemleri için.
- **Spring Boot Starter Web**: Web uygulaması geliştirmek için gerekli temel yapı.
- **Spring Boot DevTools**: Geliştirme sırasında otomatik yeniden başlatma ve hata ayıklama araçları.
- **ModelMapper**: Nesneler arası dönüşüm işlemleri için.
- **SpringDoc OpenAPI**: API dokümantasyonu için.
- **Jackson Datatype JSR310**: Java 8 Tarih/Zaman türlerinin JSON'a dönüştürülmesi.
- **Spring Security**: Uygulama güvenliği için.
- **Spring Security Crypto**: Şifreleme işlemleri için.
- **PostgreSQL Driver**: PostgreSQL veritabanı bağlantısı.
- **Spring Boot Starter Test**: Birim testler için.
- **Lombok**: Sınıflarda getter, setter gibi metodları otomatik olarak üretir.

Bu bağımlılıklar, projenin düzgün çalışabilmesi için gereklidir.

## Genel Yapı
Sistem, modüler bir yapıya sahiptir ve farklı iş süreçleri için özelleştirilebilir bileşenlere sahiptir. Her bileşen, bağımsız olarak yönetilebilecek şekilde tasarlanmıştır.

## Kullanım Alanları
- Küçük ve orta ölçekli işletmeler için operasyonel süreçlerin otomatikleştirilmesi.
- Büyük şirketlerde departmanlar arası iş birliğini artırarak verimliliğin sağlanması.
- Finansal analizlerin düzenli bir şekilde yapılabilmesi ve karar alma süreçlerinde veri odaklı yaklaşım.

## Gelecek Planları
- **Mobil Uygulama**: OperiqSystem’in mobil versiyonunun geliştirilmesi.
- **Yapay Zeka Entegrasyonu**: İş süreçlerini daha da optimize etmek için yapay zeka tabanlı öneri sistemlerinin eklenmesi.
- **Bulut Tabanlı Entegrasyon**: Verilerin daha güvenli ve esnek bir şekilde depolanması için bulut tabanlı çözümler.

## Lisans
MIT Lisansı altında lisanslanmıştır.
