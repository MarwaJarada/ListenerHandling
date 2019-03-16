
package tempretureConventer;
/**
 * @author Marwa N. Jarada
 */

import javax.swing.*;
import java.awt.*;

public class TempretureConventer extends JFrame {
    // Components :
    JLabel celsiusLabel;
    JTextField celsuisTextfield;
    ButtonGroup buttonGroup;
    JRadioButton fahrenheitRadioBtn;
    JRadioButton kelvinRadioBtn;
    JLabel resultTempraturer;

    public TempretureConventer(){
        celsiusLabel=new JLabel();
        celsuisTextfield= new JTextField();
        buttonGroup=new ButtonGroup();
        fahrenheitRadioBtn=new JRadioButton();
        kelvinRadioBtn=new JRadioButton();
        resultTempraturer=new JLabel();

        //Basic properities

        setLayout(new GridLayout(4,1));//4row,1col
        setTitle("Temperature conventer");
        setResizable(true);
        setLocationRelativeTo(null); // To show the output in the middle of screen
        setSize(500,250);




        setVisible(true);

    }


    public static void main(String[] args) {
        TempretureConventer tempretureConventer=new TempretureConventer();
    }
}
