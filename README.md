# Java ile-6.Hafta Ödevi

Bu depo, nesne yönelimli programlama (OOP), soyut sınıflar (abstract classes), arayüzler (interfaces), karşılaştırma (`Comparable`), klonlama (`Cloneable`) ve büyük sayılar (`BigInteger`) konularını kapsayan Java ödev çözümlerini içermektedir.

---

## 🛠️ Proje İçeriği ve Sınıflar

### 1. Geometrik Nesneler ve Hiyerarşi
- **`GeometricObject.java`**: Tüm geometrik şekiller için temel oluşturan soyut (abstract) sınıf.
- **`Circle.java`**: `GeometricObject` sınıfını genişleten ve `Comparable` arayüzünü uygulayan Çember sınıfı (Yarıçapa göre karşılaştırma ve `equals` ezilmesi).
- **`Rectangle.java`**: `GeometricObject` sınıfını genişleten ve `Comparable` arayüzünü uygulayan Dikdörtgen sınıfı (Alana göre karşılaştırma).
- **`Square.java`**: Kare hesaplamaları ve özelliklerini barındıran sınıf.
- **`Octagon.java`**: `GeometricObject` sınıfından türeyen, `Comparable` ve `Cloneable` arayüzlerini uygulayan Düzgün Sekizgen sınıfı.
- **`Triangle.java`**: Üçgen hesaplamaları için yazılmış geometrik sınıf.

### 2. Nesne Kopyalama ve Derin Kopyalama (Deep Copy)
- **`Course.java`**: `Cloneable` arayüzünü uygulayarak öğrenci listesini (`students`) derin kopyalama (deep copy) ile klonlayan kurs yönetim sınıfı.

### 3. İleri Düzey Matematik ve Sayı Sistemleri
- **`Rational.java`**: Hassas hesaplamalar için `BigInteger` kullanan, `Number` sınıfından türeyen ve `Comparable` arayüzünü uygulayan Rasyonel Sayı sınıfı.

### 4. Kişi ve Çalışan Hiyerarşisi
- **`Person.java`**: Kişi temel sınıfı.
- **`Student.java`**: Öğrenci bilgilerini tutan sınıf.
- **`Employee.java`**: Çalışan temel sınıfı.
- **`Faculty.java`**: Fakülte/Akademik
