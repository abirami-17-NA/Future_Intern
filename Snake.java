import javax.swing.JFrame;

public class Snake extends JFrame {

    public Snake() {
        initUI();
    }

    private void initUI() {
        add(new SnakeGame());
        setResizable(false);
        pack();

        setTitle("Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}

