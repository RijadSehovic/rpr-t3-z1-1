package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }



   public enum Grad { SARAJEVO, TUZLA, ZENICA, BRCKO}
    Grad grad;
        String broj;

    public FiksniBroj(Grad gr, String br){
        grad=gr;
        broj=br;

    }
}
