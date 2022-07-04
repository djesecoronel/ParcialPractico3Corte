/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicesar.interfazAgregar;

import javax.swing.JFrame;

/**
 *
 * @author DAVID
 */
public class VentanaPrincipal extends JFrame{
    private Registrar agregar;
    
    public VentanaPrincipal(){
        this.setTitle("Hola mundo");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.initComponents();
        this.setSize(720, 480);
        this.setResizable(false);
    }
    
    private void initComponents(){
        this.agregar = new Registrar();
        this.add(this.agregar);
    }
}
