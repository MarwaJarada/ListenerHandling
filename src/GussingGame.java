import javax.swing.*;
import java.awt.*;

public class GussingGame extends JFrame{

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

        rangeNumLabel=new JLabel("I have a number between 1 and 1000");
        guessLabel=new JLabel("Can you guess my number?");
        resultNum=new JLabel("Too high try a lower number");
        numTxtField=new JTextField();
        numTxtField.setPreferredSize(new Dimension(50,20));
        newGameBtn=new JButton("New Gmae");
        add(rangeNumLabel);
        add(guessLabel);
        add(resultNum);
        add(numTxtField);
        add(newGameBtn);



        setVisible(true);

    }


    public static void main(String[] args) {
        GussingGame gussingGame=new GussingGame();

    }
}
