public class Main {
    public static void main(String[] args) {
        StarbucksBuilder sb = new StarbucksBuilder.Builder("tall").yumuşakIçenler("yumaşak içim").build();

        //Builder Design pattern
        //ihtiyaç duydukça  kullanılırsa en optimum kullanımı olur.
        // şayet opsiyonel olan alanlar bir sınıfta 6 ve daha fazla ise(çokça var ise)bu durumda Builder Design pattern kullanılması mantıklı olur.
        // şayet gerekli alanlar çokça varsa o zman Builder Design pattern kullanılmasına gerek yoktur



    }
}