import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {

        //Creates Gui
        public static void main(String[] args) {
                new Gui();
        }

        //Setup Gui
        public Gui() {
                super("Example Gui");

                setSize(500,500);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setResizable(false);
                setVisible(true);

                panel = new JPanel();
                add(panel);

                launch();
        }

        //Launch screen of Gui
        public void launch() {
                panel.removeAll();

                panel.setLayout(new FlowLayout());


                //Insert Components
                JButton button = new JButton("Button");
                button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                welcome();
                        }
                });

                JLabel label = new JLabel("Label");

                JTextField text = new JTextField("Text Field");

                panel.add(button);
                panel.add(label);
                panel.add(text);


                panel.updateUI();
        }

        public void welcome() {
                panel.removeAll();

                panel.setLayout(new BorderLayout());

                panel.add(new JLabel("Welcome to my Gui"), BorderLayout.NORTH);

                panel.add(new JButton(new AbstractAction("Press this Button") {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Hello!");
                    }
                }), BorderLayout.CENTER);


                panel.updateUI();
        }

        JPanel panel;
}
