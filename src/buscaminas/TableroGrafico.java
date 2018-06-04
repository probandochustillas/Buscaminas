/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author xabi_
 */

class Botonazos extends JButton{
    Botonazos(){
        setBackground(new Color(164,61,208));
    }
    
}
class TableroGrafico extends JFrame{
    private Botonazos botonMorado;
   /* private ActionListener proba = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           Botonazos proba = 
        }
    };*/
    TableroGrafico(){
        super("buscaminas");
        JFrame miFrame= new JFrame();
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miFrame.setSize(500,300);
        setLayout(new GridLayout(InterfazJugador.dimensionesTablero,InterfazJugador.dimensionesTablero));
        miFrame.setVisible(true);
        for(int i=0;i<InterfazJugador.dimensionesTablero;i++){
            for(int j=0;j<InterfazJugador.dimensionesTablero;j++){
                botonMorado = new Botonazos();
                
            }
        }
    }
}