# Builder Pattern in Java

Bu README dosyası, Java'da Builder Pattern tasarım deseninin kullanımına ilişkin temel bilgileri içermektedir.

## Neden Builder Pattern Kullanılır?

Builder Pattern, nesne oluşturma sürecini daha esnek, okunabilir ve sürdürülebilir hale getirmek için kullanılır. Aşağıda, Builder Pattern'ın kullanılmasını gerektiren bazı durumlar açıklanmıştır:

1. **Çok Parametreli Oluşturma:** Bir sınıfın birçok isteğe bağlı parametreye sahip olduğu durumlarda, Builder Pattern kullanmak karmaşıklığı azaltabilir.

    ```java
    Person person = new PersonBuilder()
        .setFirstName("John")
        .setLastName("Doe")
        .setAge(30)
        .setAddress("123 Main St")
        .build();
    ```

2. **Zincirleme Yapısı (Fluent Interface):** Builder Pattern, zincirleme yapısını destekler ve sıralı metot çağrılarıyla daha okunabilir bir kod sağlar.

    ```java
    Person person = new PersonBuilder()
        .setFirstName("John")
        .setLastName("Doe")
        .setAge(30)
        .setAddress("123 Main St")
        .build();
    ```

3. **Nesne İmmutability (Değiştirilemezlik):** Eğer oluşturulan nesnenin değiştirilemez (immutable) olmasını istiyorsanız, Builder Pattern kullanabilirsiniz.

    ```java
    public class Person {
        // ...

        private Person(PersonBuilder builder) {
            // ...
        }

        public static class PersonBuilder {
            // ...
        }
    }
    ```

Bu gibi durumlarda, Builder Pattern kullanmak daha temiz ve esnek bir çözüm sunabilir ve sınıfların gelecekteki değişikliklere daha iyi uyum sağlamasına yardımcı olabilir.

## Nasıl Kullanılır?

1. İlgili sınıfın içinde bir Builder sınıfı tanımlayın.
2. Builder sınıfında isteğe bağlı parametreleri içeren setter metotlarını tanımlayın.
3. Ana sınıfta, builder sınıfını kullanarak nesneyi oluşturan bir `build` metodu ekleyin.

```java
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;

    private Person(PersonBuilder builder) {
        // ...
    }

    public static class PersonBuilder {
        // ...
    }
}
