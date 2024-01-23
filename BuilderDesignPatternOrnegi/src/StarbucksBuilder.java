public class StarbucksBuilder {

    //Gerekli
    private String kahveBoyutu;

    //Seçime göre değişir
    private String laktoksuzSütMiktarı;
    private String yumuşatici;

    public static class Builder{
        //Gerekli
        private final String kahveBoyutu;

        //Seçime göre değişir
        private String laktoksuzSütMiktarı;
        private String yumuşatici;

        public Builder(String kahveBoyutu) {
            this.kahveBoyutu = kahveBoyutu;
        }

        public Builder laktoksuzTayfa(String laktoksuzSüt){
            laktoksuzSütMiktarı = laktoksuzSüt;
            return this;
        }
        public Builder yumuşakIçenler(String yumuşakDeğer){
            yumuşatici = yumuşakDeğer;
            return this;
        }

        public StarbucksBuilder build(){
            return new StarbucksBuilder(this);
        }
    }

    public StarbucksBuilder(Builder builder) {
        kahveBoyutu = this.kahveBoyutu;
        laktoksuzSütMiktarı = builder.laktoksuzSütMiktarı;
        yumuşatici = builder.yumuşatici;
    }
}
