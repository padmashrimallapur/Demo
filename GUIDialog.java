package salesGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDialog implements ActionListener{

    private JFrame frame;
    private JButton button;

    public static void main(String[] args) {
        GUIDialog ap4 = new GUIDialog();
        ap4.start();
    }

    public void start()
    {
        frame = new JFrame("Dialog box example");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        button = new JButton("click me");
        button.addActionListener(this);
        contentPane.add(button);

        frame.pack();
        frame.setVisible(true);


    }

    public void actionPerformed(ActionEvent e)
    {
        String textToShow;
        textToShow = JOptionPane.showInputDialog(frame, "Enter Text you want to display","Input Dialog", JOptionPane.QUESTION_MESSAGE );

        System.out.println(textToShow);
        if(textToShow != null)
        {
            button.setForeground(Color.red);
            button.setText(textToShow);
        }

    }
}
