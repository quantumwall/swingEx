import java.awt.*;
import javax.swing.*;

public class SimpleFrame {
    public static void main(String[] args) { 
        EventQueue.invokeLater(() ->
            {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Image icon = toolkit.getImage("/home/rico/itProjects/java/swing/Mascot_konqi.png");
                Dimension screenSize = toolkit.getScreenSize();
                int screenWidth = screenSize.width;
                int screenHeight = screenSize.height;

                var frame = new JFrame("Title");
                frame.setBounds(screenWidth/4,screenHeight/4,screenWidth / 2, screenHeight / 2);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setIconImage(icon);
                frame.setVisible(true);
            });
    }
}

/*class SimpleFrameExt extends JFrame {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    public SimpleFrameExt() {
        setSize(WIDTH, HEIGHT);
    }
}*/
    
