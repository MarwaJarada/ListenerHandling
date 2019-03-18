package guessingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import static java.lang.Integer.valueOf;

public class GussingGame extends JFrame implements ActionListener{

    JLabel rangeNumLabel;
    JLabel guessLabel;
    JLabel resultNum;
    JTextField numTxtField;
    JButton newGameBtn;

    public GussingGame(){
        setLayout(new FlowLayout());
        setTitle("Gussing Game");
        setLocationRelativeTo(null);
        setSize(300,150);
        setResizable(false);
        int randomNumber = generateRandonNum();
        rangeNumLabel=new JLabel("I have a number between 1 and 1000");
        guessLabel=new JLabel("Can you guess my number?");
        resultNum=new JLabel("Here is your input  number");
        numTxtField=new JTextField();
        numTxtField.setPreferredSize(new Dimension(50,20));
        numTxtField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

           }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
        newGameBtn=new JButton("New Gmae");
        add(rangeNumLabel);
        add(guessLabel);
        add(resultNum);
        add(numTxtField);
        add(newGameBtn);
        setVisible(true);

    }


    public int generateRandonNum(){
        Random random=new Random();
        return random.nextInt(1001);
    }


    public static void main(String[] args) {
        GussingGame gussingGame=new GussingGame();

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        }


    }

