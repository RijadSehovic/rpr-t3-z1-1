package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }
    int mobilnaMreza;
    String broj;
    public MobilniBroj(int mobilnamreza, String br){
        mobilnaMreza= mobilnamreza;
        broj= br;
    }
}
