package guessingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * @author Marwa N. Jarada
 */

public class GussingGame extends JFrame implements ActionListener{

    JLabel rangeNumLabel;
    JLabel guessLabel;
    JLabel resultNum;
    JTextField numTxtField;
    JButton newGameBtn;

    public GussingGame(){
        final int[] num = {generateRandonNum()};
        setLayout(new FlowLayout());
        setTitle("Gussing Game");
        setLocationRelativeTo(null);
        setSize(300,150);
        setResizable(false);
        rangeNumLabel=new JLabel("I have a number between 1 and 1000");
        guessLabel=new JLabel("Can you guess my number?");
        resultNum=new JLabel("Here is your input  number");
        numTxtField=new JTextField();
        numTxtField.setPreferredSize(new Dimension(50,20));
        this.getContentPane().setBackground(new Color(250,250,50));

        numTxtField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }
            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                System.out.println(num[0]);
                if(Integer.valueOf(numTxtField.getText())> num[0]){
                    GussingGame.this.getContentPane().setBackground(Color.RED);
                    resultNum.setText("Your input number is Too high");
                }else if (Integer.valueOf(numTxtField.getText())< num[0]){
                    GussingGame.this.getContentPane().setBackground(Color.BLUE);
                    resultNum.setText("Your input number is Too low");
                }else {
                    GussingGame.this.getContentPane().setBackground(Color.YELLOW);
                    numTxtField.setEditable(false);
                    resultNum.setText("Your input Number is RIGHT");
                }
            }
        });
        newGameBtn=new JButton("New Game");
        newGameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numTxtField.setEditable(true);
                resultNum.setText("Here is your input  number :");
                num[0] =generateRandonNum();
                numTxtField.setText(null);
            }
        });
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

