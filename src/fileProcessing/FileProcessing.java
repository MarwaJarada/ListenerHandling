package fileProcessing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        fileMenu.add("Open");
        fileMenu.add("Close");
        fileMenu.add(exit);

        editMenu.add("Font");
        editMenu.add("Color");
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
                    break;
                case "exit":
                    break;
                case "close":
                    break;
                case "font":
                    break;
                case "color":
                    break;
            }
        }
    };
}
