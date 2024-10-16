
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private ListaEnlazada lista;
    private DefaultTableModel modelo;

    private PilaTareasU pilaTareasU; // Declarar la pila de tareas

    public VentanaPrincipal() {
        lista = new ListaEnlazada();
        txtTarea = new JTextField(20);
        initComponents();
        
        String[] columnas = {"Tarea"};
   
         modelo = new DefaultTableModel(columnas, 0); 

        tabla.setModel(modelo);  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtTarea = new javax.swing.JTextField();
        btnMostrarPila = new javax.swing.JButton();
        txtImportancia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tarea", "Importancia"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnMostrarPila.setText("Convertir a una Pila");
        btnMostrarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPilaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre de la tarea");

        jLabel2.setText("Importancia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarPila)
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTarea)
                                .addComponent(txtImportancia, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar)
                    .addComponent(btnMostrar))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(txtTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrar)
                            .addComponent(btnMostrarPila)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(txtImportancia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     agregarTarea();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       eliminarTarea();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarTareas();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarTarea();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPilaActionPerformed

       mostrarPila();
    }//GEN-LAST:event_btnMostrarPilaActionPerformed

    private void agregarTarea() {
        String descripcion = txtTarea.getText();
        String importanciaStr = txtImportancia.getText();
        if (!descripcion.isEmpty() && !importanciaStr.isEmpty()) {
            int importancia = Integer.parseInt(importanciaStr); // Convertir a entero
            lista.agregarTarea(descripcion, importancia); // Agregar tarea con importancia
            modelo.addRow(new Object[]{descripcion, importancia}); // Agregar a la tabla
            txtTarea.setText(""); // Limpiar campo de tarea
            txtImportancia.setText(""); // Limpiar campo de importancia
            JOptionPane.showMessageDialog(null, "Tarea agregada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar una tarea y su importancia.");
        }
    }
    private void eliminarTarea() {
        String descripcion = txtTarea.getText();
        if (lista.eliminarTarea(descripcion)) {
            JOptionPane.showMessageDialog(null, "Tarea eliminada.");
            mostrarTareas(); // Actualizar la tabla
        } else {
            JOptionPane.showMessageDialog(null, "Tarea no encontrada.");
        }
        txtTarea.setText("");
    }
    private void mostrarTareas() {
        modelo.setRowCount(0); // Limpiar la tabla
        lista.mostrarTareas(modelo); // Llenar la tabla con tareas
    }

    private void buscarTarea() {
        String descripcion = txtTarea.getText();
        if (lista.buscarTarea(descripcion)) {
            JOptionPane.showMessageDialog(null, "Tarea encontrada.");
        } else {
            JOptionPane.showMessageDialog(null, "Tarea no encontrada.");
        }
        txtTarea.setText("");
    }
    private void mostrarPila() {
        pilaTareasU = new PilaTareasU(100); // Reinicializa la pila
        Nodo actual = lista.cabeza;
        
        while (actual != null) {
            pilaTareasU.apilar(actual.tarea, actual.importancia); // Agregar tareas a la pila
            actual = actual.siguiente;
        }

        // Ordenar la pila por importancia
        pilaTareasU.ordenarPilaPorImportancia();

        modelo.setRowCount(0); // Limpiar la tabla

        // Mostrar la pila en la tabla
        for (Tarea tarea : pilaTareasU.mostrarPila()) {
            if (tarea != null) {
                modelo.addRow(new Object[]{tarea.tarea, tarea.importancia}); // Agregar a la tabla
            }
        }

        JOptionPane.showMessageDialog(null, "La lista de tareas se ha convertido en una pila.");
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarPila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtImportancia;
    private javax.swing.JTextField txtTarea;
    // End of variables declaration//GEN-END:variables
}
