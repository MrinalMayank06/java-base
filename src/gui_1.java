import java.awt.*;
import javax.swing.*;

public class gui_1 extends JFrame {
    public void initialize() {
        JPanel mPanel1 = new JPanel();
        mPanel1.setLayout(new BorderLayout());
        mPanel1.setBackground(new Color(100, 55, 244));
        setTitle("Welcome Baby");
        setSize(500, 600);
        setMaximumSize(new Dimension(200, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components for the form
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField();
        JButton submitButton = new JButton("Submit");

        // Create a subpanel for form components
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(1, 1));
        formPanel.add(nameLabel);
        formPanel.add(nameTextField);
        formPanel.add(submitButton);

        // Add the form panel to the main panel
        mPanel1.add(formPanel, BorderLayout.CENTER);

        // Add the main panel to the frame
        add(mPanel1);

        setVisible(true);
    }

    public static void main(String[] args) {
        gui_1 mergeFrame = new gui_1();
        mergeFrame.initialize();
        System.out.println("Hello World");
    }
}


