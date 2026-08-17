import java.util.Locale;

public class IdiomaSistema{
    public static void main(String[] args) {
        Locale localAtual = Locale.getDefault();
        System.out.println("O idioma do sistema:" + localAtual.getDisplayLanguage());
    }
}