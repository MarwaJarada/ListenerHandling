
package tempretureConventer;
/**
 * @author Marwa N. Jarada
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempretureConventer extends JFrame  {
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
        fahrenheitRadioBtn.setActionCommand("f");
        kelvinRadioBtn=new JRadioButton();
        kelvinRadioBtn.setActionCommand("k");
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
        add(resultTempraturer);

        fahrenheitRadioBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double num=Integer.parseInt(celsuisTextfield.getText());
                resultTempraturer.setText("New temperature in is"+String.valueOf((num*9/5+32)));

            }
        });
        kelvinRadioBtn.setText("Kelvin");
        kelvinRadioBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double num=Integer.parseInt(celsuisTextfield.getText());
                resultTempraturer.setText("New temperature in is"+String.valueOf((num+273.15)));
            }
        });
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
