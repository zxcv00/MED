import javax.swing.*;

public class ShootingGame extends JFrame {

    public ShootingGame(){
        setTitle("슈팅게임");
        setUndecorated(true);   //GUI 테투리 없게
        setSize(1280,720);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
    }
}
