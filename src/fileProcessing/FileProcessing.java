package fileProcessing;

import javax.swing.*;

public class FileProcessing extends JFrame{
    JMenuBar mainMenu;
    JMenu fileMenu;
    JMenu editMenu;

    public FileProcessing(){

        setLocationRelativeTo(null);
        setSize(400,250);
        setResizable(true);
        setTitle("File Processing");



        mainMenu =new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu=new JMenu("Edit");
        fileMenu.add("Open");
        fileMenu.add("Close");
        fileMenu.add("Exit");

        editMenu.add("Font");
        editMenu.add("Color");

        mainMenu.add(fileMenu);
        mainMenu.add(editMenu);
        this.setJMenuBar(mainMenu);

        

        setVisible(true);

    }


    public static void main(String[] args) {
        FileProcessing fileProcessing=new FileProcessing();
    }
}
