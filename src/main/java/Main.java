import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("My window");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(0, 0, 300, 300);

    frame.setVisible(true);
  }
}

class MyClass{}
class MyAnotherClass{}
