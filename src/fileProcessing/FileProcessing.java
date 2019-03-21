package fileProcessing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Marwa N. Jarada
 */
public class FileProcessing extends JFrame{
    JMenuBar mainMenu;
    JMenu fileMenu;
    JMenu editMenu;
    JMenuItem exit;
    JMenuItem open;
    JMenuItem close;
    JMenuItem font;
    JMenuItem color;
    JScrollPane scrollPan;
    JTextArea fileTxt;
    JFileChooser fileChooser;
    Color colorChooser;
    String fontSizeSelected;

    public FileProcessing(){

        setLocationRelativeTo(null);
        setSize(400,250);
        setResizable(true);
        setTitle("File Processing");



        mainMenu =new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu=new JMenu("Edit");
        exit=new JMenuItem("Exit");
        exit.addActionListener(actionListener);
        open=new JMenuItem("Open");
        open.addActionListener(actionListener);
        close=new JMenuItem("Close");
        close.addActionListener(actionListener);
        font=new JMenuItem("Font");
        font.addActionListener(actionListener);
        color=new JMenuItem("Color");
        color.addActionListener(actionListener);


        fileMenu.add(open);
        fileMenu.add(close);
        fileMenu.add(exit);

        editMenu.add(font);
        editMenu.add(color);
        mainMenu.add(fileMenu);
        mainMenu.add(editMenu);
        this.setJMenuBar(mainMenu);
        fileTxt=new JTextArea();
        scrollPan= new JScrollPane(fileTxt);
        scrollPan.setPreferredSize(new Dimension(400,250));
        this.add(scrollPan);


        setVisible(true);

    }


    public static void main(String[] args) {
        FileProcessing fileProcessing=new FileProcessing();

    }

    ActionListener actionListener=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            String action = actionEvent.getActionCommand().toLowerCase();
            switch (action){
                case "open":
                    openFileChooser();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "close":
                    fileTxt.setText(null);
                    fileTxt.setEditable(false);
                    break;
                case "font":
                    showFontDailog();
                    break;
                case "color":


                    break;
            }
        }
    };


    public void showFontDailog(){
        int fontSize= (int)JOptionPane.showInputDialog(null,"Select font size","Fonr size",JOptionPane.OK_CANCEL_OPTION,
                null,
                new Integer[]{12,14,16,18},
                15);
        fileTxt.setFont(new Font("Tahoma",0,fontSize));

}

    public void  openFileChooser(){
        fileChooser = new JFileChooser();
        fileChooser.showDialog(FileProcessing.this,"Select");
        String selectedFile = fileChooser.getSelectedFile().getName();
        String content = selectedFile;
        fileTxt.setText(content);

        try {
            if (fileTxt.getText()!=null){
            Scanner scanner = new Scanner(selectedFile);
            fileTxt.setText(scanner.toString());
            fileTxt.setEditable(true);}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
