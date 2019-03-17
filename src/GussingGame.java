import javax.swing.*;

public class GussingGame extends JFrame{

    JLabel rangeNumLabel;
    JLabel guessLabel;
    JLabel resultNum;
    JTextField numTxtField;
    JButton newGameBtn;

    public GussingGame(){
        setTitle("Gussing Game");
        setLocationRelativeTo(null);
        setSize(300,150);

        rangeNumLabel=new JLabel();
        guessLabel=new JLabel();
        resultNum=new JLabel();

        numTxtField=new JTextField();
        newGameBtn=new JButton();
        




        setVisible(true);

    }


    public static void main(String[] args) {

    }
}
