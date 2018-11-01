package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }
    String drzava;
    String broj;

    public MedunarodniBroj(String drz, String br){
        drzava = drz;
        broj = br;
    }
}
