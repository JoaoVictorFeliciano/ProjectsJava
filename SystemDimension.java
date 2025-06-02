
import java.awt.Dimension;
import java.awt.Toolkit;

public class SystemDimension {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolucao = toolkit.getScreenSize();
        int larg = resolucao.width;
        int alt = resolucao.height;
        System.out.println("Screen Resoltuion: "+larg+"x"+alt);
    }
}
