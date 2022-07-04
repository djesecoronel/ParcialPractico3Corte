
package co.edu.unicesar.interfaz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import co.edu.unicesar.modelo.AudioLibro;
import co.edu.unicesar.modelo.Libro;
import co.edu.unicesar.modelo.ListaPublicacion;
import co.edu.unicesar.modelo.Publicacion;

public class Agregar extends javax.swing.JPanel {
    
    public static ListaPublicacion modelo;
    public static Publicacion publicacion;
    FileWriter salvar;
    

    public void registrarPublicacion() {
        Publicacion nuevaPublicacion = this.leerNuevaPublicacion();
        this.modelo.insertarPublicacion(nuevaPublicacion);
    }
    
    public Publicacion leerNuevaPublicacion() {
        
        boolean salir=true;
        
        while(salir == true)
        {
            try
            {
                String isbn = textidbn.getText();
                String titulo = texttitulo.getText();
                String autor = textautor.getText();
                int anio = Integer.parseInt(textañop.getText());
                double costo = Double.parseDouble(textcosto.getText());
                int tipo = tipolibro.getSelectedIndex();

                if (tipo == 1) {
                    int nPag = Integer.parseInt(textnpajinas1.getText());
                    int edicion = Integer.parseInt(textnedicion1.getText());

                    publicacion = new Libro(nPag, edicion, isbn, titulo, autor, anio, costo);
                }
                if (tipo == 2) {

                    int nPag = 0;
                    int edicion = 0;
                    String formato = textformat.getText();
                    double duracion = Double.parseDouble(textduracion.getText());
                    double peso = Double.parseDouble(textpeso.getText());
                    publicacion = new AudioLibro(isbn,titulo,autor,anio,costo,duracion,peso,formato);
                    
                    if (tipo == 0) 
                    {
                        JOptionPane.showMessageDialog(null, "ingrese el tipo");
                    }
                }
                
                salir = false;
            }catch(java.lang.NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "llene todos los campos");
                salir = true;
                textidbn.setText("");
                texttitulo.setText("");
                textautor.setText("");
                textañop.setText("");
                textcosto.setText("");
                tipolibro.setSelectedIndex(0);
                textnpajinas1.setText("");
                textnedicion1.setText("");
                textformat.setText("");
                textduracion.setText("");
                textpeso.setText("");
            }
        }
        
        return publicacion;
    }

    public void textPublicaciones() {

        try {
            salvar = new FileWriter("datos.txt");
            List<Publicacion> lista = this.modelo.leerPublicaciones();
            for (Publicacion p : lista) {
                salvar.write(p.getDataStringFormat());
            }

            salvar.close();
        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, "error");
        }

    } 
    
    /**
     * Creates new form NewJPanel
     */
    public Agregar() {
        
        initComponents();
        panelaudiolibro.setVisible(false);
        this.modelo = new ListaPublicacion();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        tipolibro = new javax.swing.JComboBox<>();
        textidbn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        texttitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textautor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textañop = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textcosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panellibro = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        textnpajinas1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textnedicion1 = new javax.swing.JTextField();
        panelaudiolibro = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        textformat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textduracion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textpeso = new javax.swing.JTextField();
        GUARDAR = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setBackground(new java.awt.Color(255, 0, 0));
        atras.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        atras.setForeground(new java.awt.Color(102, 0, 51));
        atras.setText("ATRAS");
        atras.setBorder(null);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 124, 47));

        tipolibro.setBackground(new java.awt.Color(204, 255, 204));
        tipolibro.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        tipolibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar tipo", "LIBRO", "AUDIOLIBRO" }));
        tipolibro.setToolTipText("");
        tipolibro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tipolibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipolibroActionPerformed(evt);
            }
        });
        jPanel1.add(tipolibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 150, 30));

        textidbn.setBackground(new java.awt.Color(204, 255, 204));
        textidbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textidbnActionPerformed(evt);
            }
        });
        jPanel1.add(textidbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 106, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ISBN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 132, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AGREGAR PUBLICACION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 310, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TITULO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 59, -1));

        texttitulo.setBackground(new java.awt.Color(204, 255, 204));
        texttitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttituloActionPerformed(evt);
            }
        });
        jPanel1.add(texttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 106, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AUTOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        textautor.setBackground(new java.awt.Color(204, 255, 204));
        textautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textautorActionPerformed(evt);
            }
        });
        jPanel1.add(textautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 106, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AÑO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        textañop.setBackground(new java.awt.Color(204, 255, 204));
        textañop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textañopActionPerformed(evt);
            }
        });
        textañop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textañopKeyTyped(evt);
            }
        });
        jPanel1.add(textañop, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 106, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRECIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        textcosto.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(textcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 106, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TIPO DE LIBRO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 30));

        panellibro.setBackground(new java.awt.Color(255, 153, 153));
        panellibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N° DE PAGINAS");
        panellibro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 34, -1, -1));

        textnpajinas1.setBackground(new java.awt.Color(204, 255, 204));
        textnpajinas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textnpajinas1KeyTyped(evt);
            }
        });
        panellibro.add(textnpajinas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 68, 103, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("N° DE EDICION");
        panellibro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 141, -1, -1));

        textnedicion1.setBackground(new java.awt.Color(204, 255, 204));
        textnedicion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textnedicion1KeyTyped(evt);
            }
        });
        panellibro.add(textnedicion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 175, 103, -1));

        jPanel1.add(panellibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 190, 280));

        panelaudiolibro.setBackground(new java.awt.Color(255, 153, 153));
        panelaudiolibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FORMATO AUDIOLIBRO");
        panelaudiolibro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        textformat.setBackground(new java.awt.Color(204, 255, 204));
        panelaudiolibro.add(textformat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 103, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DURACION");
        panelaudiolibro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        textduracion.setBackground(new java.awt.Color(204, 255, 204));
        panelaudiolibro.add(textduracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 103, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PESO");
        panelaudiolibro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        textpeso.setBackground(new java.awt.Color(204, 255, 204));
        textpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpesoActionPerformed(evt);
            }
        });
        panelaudiolibro.add(textpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, -1));

        jPanel1.add(panelaudiolibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 170, 280));

        GUARDAR.setBackground(new java.awt.Color(51, 51, 255));
        GUARDAR.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        GUARDAR.setForeground(new java.awt.Color(204, 204, 255));
        GUARDAR.setText("GUARDAR PUBLICACION");
        GUARDAR.setBorder(null);
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });
        jPanel1.add(GUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 160, 47));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        MenuPrincipal.fondo.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

    private void tipolibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipolibroActionPerformed

        if(tipolibro.getSelectedItem().equals("AUDIOLIBRO"))
        {
            panellibro.setVisible(false);
            panelaudiolibro.setVisible(true);
        }
        if(tipolibro.getSelectedItem().equals("LIBRO"))
        {
            panellibro.setVisible(true);
            panelaudiolibro.setVisible(false);
        }
    }//GEN-LAST:event_tipolibroActionPerformed

    private void textidbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textidbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textidbnActionPerformed

    private void texttituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttituloActionPerformed

    private void textañopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textañopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textañopActionPerformed

    private void textautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textautorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textautorActionPerformed

    private void textpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpesoActionPerformed

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        leerNuevaPublicacion();
        registrarPublicacion();
        textPublicaciones();
    }//GEN-LAST:event_GUARDARActionPerformed

    private void textañopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textañopKeyTyped
        char validar = evt.getKeyChar();
        
        if (Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this, "solo numeros en año pub.");
        }
    }//GEN-LAST:event_textañopKeyTyped

    private void textnpajinas1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textnpajinas1KeyTyped
        char validar = evt.getKeyChar();
        
        if (Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this, "solo numeros en n° pajinas");
        }
    }//GEN-LAST:event_textnpajinas1KeyTyped

    private void textnedicion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textnedicion1KeyTyped
        char validar = evt.getKeyChar();
        
        if (Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(this, "solo numeros en num edic.");
    }//GEN-LAST:event_textnedicion1KeyTyped
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GUARDAR;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelaudiolibro;
    public static javax.swing.JPanel panellibro;
    private javax.swing.JTextField textautor;
    private javax.swing.JTextField textañop;
    private javax.swing.JTextField textcosto;
    private javax.swing.JTextField textduracion;
    private javax.swing.JTextField textformat;
    private javax.swing.JTextField textidbn;
    private javax.swing.JTextField textnedicion1;
    private javax.swing.JTextField textnpajinas1;
    private javax.swing.JTextField textpeso;
    private javax.swing.JTextField texttitulo;
    private javax.swing.JComboBox<String> tipolibro;
    // End of variables declaration//GEN-END:variables
}