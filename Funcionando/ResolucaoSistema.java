import java.awt.*;

public class ResolucaoSistema {
    public static void main(String[] args) {
        Toolkit t= Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        System.out.println("A resolucao e: "+d.height+"x"+d.width);
    }
}
