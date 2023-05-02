import javax.swing.*;

public class Buttonpanel extends JPanel {
    JPanel Row1 = new JPanel();
    JPanel Row2 = new JPanel();
    JPanel Row3 = new JPanel();

    public void setUp() {
        JButton A1 = new JButton();
        JButton A2 = new JButton();
        JButton A3 = new JButton();
        JButton B1 = new JButton();
        JButton B2 = new JButton();
        JButton B3 = new JButton();
        JButton C1 = new JButton();
        JButton C2 = new JButton();
        JButton C3 = new JButton();
        // Put buttons to Rows
        Row1.add(A1);
        Row1.add(A2);
        Row1.add(A3);
        Row1.add(B1);
        Row1.add(B2);
        Row1.add(B3);
        Row1.add(C1);
        Row1.add(C2);
        Row1.add(C3);
    }
    public void addButton(){

    }
}
