
package multipleSelection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleSelection extends JFrame{
        JButton copyBtn;
        JTextArea txtArea;
        JList<String> list;



        public static void main(String[] args){
                MultipleSelection list=new MultipleSelection();
                list.setMultipleSelectionListJFrame();

        }


        public void setMultipleSelectionListJFrame(){

                this.setTitle("Multiple Selection Lists");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setResizable(true);
                this.setSize(400,200);
                this.setLayout(new FlowLayout());
                String[] myList={"Black","Blue","Cyan","Dark Grary","Gray"};
                list=new JList<>(myList);
                list.setPreferredSize(new Dimension(60,100));
                list.setVisibleRowCount(5);
                JScrollPane scrollPane=new JScrollPane(list);

                copyBtn=new JButton("Copy >>");
                copyBtn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                                if (list.isSelectionEmpty()){
                                        JOptionPane.showMessageDialog(MultipleSelection.this,"No items Selected !");
                                }
                                else {
                                        for (int x=0 ; x<list.getSelectedValuesList().size() ;x++){
                                                txtArea.append(list.getSelectedValuesList().get(x)+"\n");}
                                }
                        }
                });
                txtArea=new JTextArea();
                txtArea.setPreferredSize(new Dimension(100,100));
                this.add(list);
                this.add(scrollPane);
                this.add(copyBtn);
                this.add(txtArea);
                this.setVisible(true);


        }

}