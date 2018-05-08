/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgrasp.assignment.australia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ECRConsultant
 */
public class GUIApp1 extends JFrame {
    private JButton btnBlue= new JButton("blue");
    private JButton btnYellow = new JButton("yellow");
    private JTextArea txaMessage= new JTextArea();
    private JFrame frame = new JFrame("Frame with two buttons");
    private static int blueButtonClickCount=0;
    private static int yellowButtonClickCount=0;
    public GUIApp1(){
        panels();
    }
    public void panels(){
        JPanel panel = new JPanel(new GridLayout(1,1));
        panel.setBorder(new EmptyBorder(5,20,50,20));
        panel.setBackground(Color.magenta);
        btnBlue.setBackground(Color.blue);
        btnYellow.setBackground(Color.yellow);
        JPanel uppanel = new JPanel();
        uppanel.setBackground(Color.magenta);
        uppanel.setBorder(new EmptyBorder(5,5,5,5));
        uppanel.add(btnBlue);
        uppanel.add(btnYellow);
        panel.add(txaMessage);
         JScrollPane scrollBarForTextArea=new JScrollPane(txaMessage,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          panel.add(scrollBarForTextArea); 
          frame.add(panel);
          frame.getContentPane().add(uppanel,BorderLayout.NORTH);
          frame.setSize(400,300);
          frame.setVisible(true);
          frame.setLocationRelativeTo(null);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          txaMessage.setText("You have clicked the blue button "+String.valueOf(blueButtonClickCount)+" times\n"
                  +"You have clicked the blue button "+String.valueOf(yellowButtonClickCount)+" times");
          btnBlue.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btnBlue){
                    blueButtonClickCount++;
                    txaMessage.setText("You have clicked the blue button "+String.valueOf(blueButtonClickCount)+" times\n"
                  +"You have clicked the blue button "+String.valueOf(yellowButtonClickCount)+" times");
                }
                
                
            }
          });
          btnYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 if(e.getSource()==btnYellow){
                    yellowButtonClickCount++;
                    txaMessage.setText("You have clicked the blue button "+String.valueOf(blueButtonClickCount)+" times\n"
                  +"You have clicked the blue button "+String.valueOf(yellowButtonClickCount)+" times");
                }
               
            }
       });
//       
    }
    public static void main(String[]args){
        new GUIApp1();
    }
}
