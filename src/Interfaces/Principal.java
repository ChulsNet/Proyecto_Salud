/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Util.Metodos;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;

/**
 *
 * @author Miguel
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    Metodos met = new Metodos();
    
    public Principal() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/Icono.png")).getImage());
        ponerFondo();
        iconosMenus();
    }

    private void ponerFondo() {
        lblFondo.setIcon(new Metodos().ponerIcono("/Imagenes/Fondo.jpg", lblFondo.getWidth(),lblFondo.getHeight()));
        this.repaint();
    }
    
    private void iconosMenus(){
        itemSalir.setIcon(met.ponerIcono("/Imagenes/exit.png", 24, 24));
        itemExportar.setIcon(met.ponerIcono("/Imagenes/export.png", 20, 24));
        itemImportar.setIcon(met.ponerIcono("/Imagenes/import.png", 20, 24));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFondo = new javax.swing.JLabel();
        mnMenuPrincipal = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();
        mnHerramientas = new javax.swing.JMenu();
        itemImportar = new javax.swing.JMenuItem();
        itemExportar = new javax.swing.JMenuItem();
        mnMantenimiento = new javax.swing.JMenu();
        mnRequerimientos = new javax.swing.JMenu();
        mnProyectos = new javax.swing.JMenu();
        mnReportes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:Espley Group S.A.C.:. - SISTEMA DE GESTIÓN DE PROYECTOS");
        setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        lblFondo.setPreferredSize(getContentPane().getMaximumSize());
        getContentPane().add(lblFondo);

        mnMenuPrincipal.setBackground(new java.awt.Color(102, 102, 102));

        mnArchivo.setText("Archivo");
        mnArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnArchivo.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        itemSalir.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        mnArchivo.add(itemSalir);

        mnMenuPrincipal.add(mnArchivo);

        mnHerramientas.setText("Herramientas");
        mnHerramientas.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        itemImportar.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        itemImportar.setText("Importar");
        itemImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemImportarActionPerformed(evt);
            }
        });
        mnHerramientas.add(itemImportar);

        itemExportar.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        itemExportar.setText("Exportar");
        mnHerramientas.add(itemExportar);

        mnMenuPrincipal.add(mnHerramientas);

        mnMantenimiento.setText("Mantenimiento");
        mnMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnMantenimiento.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        mnMenuPrincipal.add(mnMantenimiento);

        mnRequerimientos.setText("Requerimientos");
        mnRequerimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnRequerimientos.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        mnMenuPrincipal.add(mnRequerimientos);

        mnProyectos.setText("Proyectos");
        mnProyectos.setToolTipText("");
        mnProyectos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnProyectos.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        mnMenuPrincipal.add(mnProyectos);

        mnReportes.setText("Reportes");
        mnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnReportes.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        mnMenuPrincipal.add(mnReportes);

        setJMenuBar(mnMenuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemImportarActionPerformed
         try {
            Process process = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft SQL Server\\120\\DTS\\Binn\\DTSWizard.exe");
            InputStream inputstream = process.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_itemImportarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem itemExportar;
    public javax.swing.JMenuItem itemImportar;
    public javax.swing.JMenuItem itemSalir;
    public javax.swing.JLabel lblFondo;
    public javax.swing.JMenu mnArchivo;
    public javax.swing.JMenu mnHerramientas;
    public javax.swing.JMenu mnMantenimiento;
    public javax.swing.JMenuBar mnMenuPrincipal;
    public javax.swing.JMenu mnProyectos;
    public javax.swing.JMenu mnReportes;
    public javax.swing.JMenu mnRequerimientos;
    // End of variables declaration//GEN-END:variables
}
