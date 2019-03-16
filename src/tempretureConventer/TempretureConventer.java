package tempretureConventer;

import javax.swing.*;
import java.awt.*;

public class TempretureConventer extends JFrame {
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
    }
}
