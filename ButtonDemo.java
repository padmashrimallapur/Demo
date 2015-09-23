package salesGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo implements ActionListener {

    int redScoreAmount = 0;
    int blueScoreAmount = 0;

    JPanel titlePanle, buttonPanel, scorePanel;
    JLabel redLable, blueLable, redScore, blueScore;
    JButton redButton, blueButton, resetButton;


    public JPanel createContent() {
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        titlePanle = new JPanel();
        titlePanle.setSize(250, 30);
        titlePanle.setLayout(null);
        titlePanle.setLocation(10, 0);
        totalGUI.add(titlePanle);

        redLable = new JLabel("red team");
        redLable.setLocation(0, 0);
        redLable.setForeground(Color.red);
        redLable.setSize(100, 30);
        redLable.setHorizontalAlignment(0);
        titlePanle.add(redLable);


        blueLable = new JLabel("Blue team");
        blueLable.setLocation(120, 0);
        blueLable.setForeground(Color.blue);
        blueLable.setSize(100, 30);
        blueLable.setHorizontalAlignment(0);
        titlePanle.add(blueLable);

        scorePanel = new JPanel();
        scorePanel.setLayout(null);
        scorePanel.setLocation(10, 40);
        scorePanel.setSize(250, 30);
        totalGUI.add(scorePanel);


        redScore = new JLabel("" + redScoreAmount);
        redScore.setLocation(0, 0);
        redScore.setHorizontalAlignment(0);
        redScore.setSize(100, 30);
        scorePanel.add(redScore);

        blueScore = new JLabel("" + blueScoreAmount);
        blueScore.setLocation(120, 0);
        blueScore.setHorizontalAlignment(0);
        blueScore.setSize(100, 30);
        scorePanel.add(blueScore);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(10, 80);
        buttonPanel.setSize(250, 70);
        totalGUI.add(buttonPanel);

        redButton = new JButton("Red button");
        redButton.setSize(100, 30);
        redButton.addActionListener(this);
        redButton.setLocation(0, 0);
        buttonPanel.add(redButton);


        blueButton = new JButton("Blue Button");
        blueButton.setSize(100, 30);
        blueButton.setLocation(120, 0);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);

        resetButton = new JButton("Reset Button");
        resetButton.setSize(220, 30);
        resetButton.setLocation(0, 40);
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        totalGUI.setOpaque(true);
        return totalGUI;


    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == redButton) {
            redScoreAmount = redScoreAmount + 1;
            redScore.setText("" + redScoreAmount);
        } else if (event.getSource() == blueButton) {
            blueScoreAmount = blueScoreAmount + 1;
            blueScore.setText("" + blueScoreAmount);
        } else {
            redScoreAmount = 0;
            blueScoreAmount = 0;
            redScore.setText("" + redScoreAmount);
            blueScore.setText("" + blueScoreAmount);
        }
    }

    private static void creatAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame(" button demo");

        ButtonDemo demo = new ButtonDemo();
        frame.setContentPane(demo.createContent());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 190);
        frame.setVisible(true);
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                creatAndShowGUI();
            }
        });
    }
}
