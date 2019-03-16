
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
    JPanel buttonGroupPanel; // To group radio buttons together


    public TempretureConventer(){
        celsiusLabel=new JLabel();
        celsuisTextfield= new JTextField();
        buttonGroup=new ButtonGroup();
        fahrenheitRadioBtn=new JRadioButton();
        kelvinRadioBtn=new JRadioButton();
        resultTempraturer=new JLabel();
        buttonGroupPanel=new JPanel();
        //Basic properities

        setLayout(new FlowLayout());
        setTitle("Temperature conventer");
        setResizable(true);
        setLocationRelativeTo(null); // To show the output in the middle of screen
        setSize(350,250);

        celsiusLabel.setText("Enter Celsius temperature:");
        add(celsiusLabel);
        celsuisTextfield.setPreferredSize(new Dimension(200,20));
        add(celsuisTextfield);

        fahrenheitRadioBtn.setText("Fahrenhit");
        kelvinRadioBtn.setText("Kelvin");
        buttonGroup.add(fahrenheitRadioBtn);
        buttonGroup.add(kelvinRadioBtn);
        buttonGroupPanel.add(fahrenheitRadioBtn);
        buttonGroupPanel.add(kelvinRadioBtn);
        add(buttonGroupPanel);


        
        setVisible(true);

    }


    public static void main(String[] args) {
        TempretureConventer tempretureConventer=new TempretureConventer();
    }
}
