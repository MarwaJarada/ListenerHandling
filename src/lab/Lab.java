package lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Lab extends JFrame implements ActionListener{
    JLabel JTextTLabel;
    JLabel JPassLabel;
    JLabel JFormattedLabel;

    JTextField JTextTField;
    JTextField JPassTField;
    JTextField JFormattedTF;

    JMenuBar mainMenu;

    JPanel gridLayout1;
    JPanel buttonsPAnel;

    JButton okBtn;
    JButton cancelBtn;
    JButton clearBtn;
    JButton openFile;
    JButton openColor;



    public void setFormPanel(){
        this.setLayout(new BorderLayout());
        setSize(500, 500);
        setTitle("Calculator");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        mainMenu=new JMenuBar();
        JMenu fileMenu= new JMenu("File");
        JMenu colorMenu= new JMenu("Color");

        colorMenu.add("Red");
        colorMenu.add("Yelloe");
        colorMenu.add("Black");

        mainMenu.add(fileMenu);
        mainMenu.add(colorMenu);
        this.setJMenuBar(mainMenu);


        // grid layout
        gridLayout1=new JPanel(new GridLayout(3,2));
        gridLayout1.setBorder(BorderFactory.createTitledBorder("Text fields"));
        JTextTLabel=new JLabel("Text field");
        JTextTField=new JTextField();
        JPassLabel=new JLabel("JPasswordField");
        JPassTField=new JTextField();
        JFormattedLabel=new JLabel("JFormattedTextField");
        JFormattedTF=new JTextField();
        gridLayout1.add(JTextTLabel);
        gridLayout1.add(JTextTField);
        gridLayout1.add(JPassLabel);
        gridLayout1.add(JPassTField);
        gridLayout1.add(JFormattedLabel);
        gridLayout1.add(JFormattedTF);

        this.add(BorderLayout.NORTH,gridLayout1);
        //GrifLAyout


        JTextArea textArea=new JTextArea();
        textArea.setBackground(new Color(204,238,241));
        textArea.setText("Here is the text");

        this.add(textArea);


        //Buttons
        buttonsPAnel=new JPanel(new FlowLayout());
        okBtn=new JButton("Ok");
        okBtn.setActionCommand("okBtn");
        cancelBtn=new JButton("Cacnel");
        cancelBtn.setActionCommand("cancelBtn");
        clearBtn=new JButton("Clear");
        clearBtn.setActionCommand("clearBtn");
        openFile=new JButton("Open File");

        openColor=new JButton("Open color");
        buttonsPAnel.add(okBtn);
        buttonsPAnel.add(cancelBtn);
        buttonsPAnel.add(clearBtn);
        buttonsPAnel.add(openFile);
        buttonsPAnel.add(openColor);
        this.add(BorderLayout.SOUTH,buttonsPAnel);




        this.setVisible(true);
    }


    public static void main(String[] args) {
        Lab lab=new Lab();
        lab.setFormPanel();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        actionEvent.getActionCommand();

    }
}
