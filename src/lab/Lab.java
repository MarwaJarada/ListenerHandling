package lab;

import fileProcessing.FileProcessing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.EventListener;
import java.util.Scanner;

public class Lab extends JFrame implements ActionListener{
    JLabel JTextTLabel;
    JLabel JPassLabel;
    JLabel JFormattedLabel;

    JTextArea textArea;

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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu=new JMenuBar();
        JMenu fileMenu= new JMenu("File");
        JMenu colorMenu= new JMenu("Color");
        JMenuItem red = new JMenuItem("Red");
        red.addActionListener(this);
        colorMenu.add(red);
        JMenuItem yellow = new JMenuItem("Yellow");
        yellow.addActionListener(this);
        colorMenu.add(yellow);
        JMenuItem black = new JMenuItem("Black");
        black.addActionListener(this);
        colorMenu.add(new JMenuItem("Black"));
        JMenuItem about = new JMenuItem("About");
        about.addActionListener(this);
        fileMenu.add(about);
        JMenuItem close = new JMenuItem("close");
        close.addActionListener(this);
        fileMenu.add(close);
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


        textArea=new JTextArea();
        textArea.setBackground(new Color(204,238,241));
        textArea.setText("Here is the text");

        this.add(textArea);


        //Buttons
        buttonsPAnel=new JPanel(new FlowLayout());
        okBtn=new JButton("Ok");
        okBtn.setActionCommand("okBtn");
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText("");
                textArea.append(JTextTField.getText()+"\n");
                textArea.append(JPassTField.getText()+"\n");
                textArea.append(JFormattedTF.getText()+"\n");
            }
        });
        cancelBtn=new JButton("Cacnel");
        cancelBtn.setActionCommand("cancelBtn");
        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        clearBtn=new JButton("Clear");
        clearBtn.setActionCommand("clearBtn");
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.setText("");
            }
        });
        openFile=new JButton("Open File");
        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                openFileChooser();
            }
        });

        openColor=new JButton("Open color");
        openColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

               Color colorChooser = JColorChooser.showDialog(Lab.this,
                        "Choose Font color :",
                        Color.YELLOW);
                textArea.setForeground(colorChooser);
            }
        });
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

        String action = actionEvent.getActionCommand().toLowerCase();
        switch (action){
            case "Red":
                textArea.setForeground(Color.RED);
                break;
            case "yellow":
                textArea.setForeground(Color.YELLOW);
                break;
            case "balck":
                textArea.setForeground(Color.BLACK);
                break;
            case "close":
                System.exit(0);
                break;
            case "about":
                JOptionPane.showMessageDialog(Lab.this,"Here is About ");
                break;

        }

    }


    public void  openFileChooser(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showDialog(Lab.this, "Select");
        try {
            File selectedFile = fileChooser.getSelectedFile();
            Scanner scanner = new Scanner(selectedFile);
            while (scanner.hasNext()){
                textArea.append(scanner.nextLine());


            }
            textArea.setEditable(true);
        }catch (Exception e) {
            System.out.println("Empty File");
        }
    }
}
