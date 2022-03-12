
package lab8p2_pamelaramirez_12141141;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class VentanaPrincipal extends javax.swing.JFrame {
    String pista = "";
    int largo = 0;
    Color color;
    ArrayList <Carro> carros = new ArrayList();
    AdminCarros admin = new AdminCarros("./RegistroCarros.cbm");
    DefaultComboBoxModel cboCarrosModel = new DefaultComboBoxModel();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    boolean fin, avanzar;
    AdminBarrita hilo;
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        actualizarCboCarros();
        crearModeloTabla();
        this.setTitle("Gracias por darme más tiempo <3");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnColor = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPista = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnPista = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLargo = new javax.swing.JTextField();
        lblPista = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblLargo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        pbCarrera = new javax.swing.JProgressBar();
        cboCarros = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        spId = new javax.swing.JSpinner();
        cboTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de carro");

        btnColor.setBackground(new java.awt.Color(102, 102, 255));
        btnColor.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnColor.setForeground(new java.awt.Color(255, 255, 255));
        btnColor.setText("Color");
        btnColor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(102, 102, 255));
        btnGuardar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre de la pista");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Largo de la pista");

        btnComenzar.setBackground(new java.awt.Color(153, 102, 255));
        btnComenzar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnComenzar.setForeground(new java.awt.Color(255, 255, 255));
        btnComenzar.setText("Comenzar");
        btnComenzar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnComenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComenzarMouseClicked(evt);
            }
        });
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        btnPausar.setBackground(new java.awt.Color(153, 102, 255));
        btnPausar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPausar.setForeground(new java.awt.Color(255, 255, 255));
        btnPausar.setText("Pausar");
        btnPausar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        btnPista.setBackground(new java.awt.Color(102, 102, 255));
        btnPista.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPista.setForeground(new java.awt.Color(255, 255, 255));
        btnPista.setText("Usar pista");
        btnPista.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPistaActionPerformed(evt);
            }
        });

        btnReiniciar.setBackground(new java.awt.Color(102, 102, 255));
        btnReiniciar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pista:");

        lblPista.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPista.setForeground(new java.awt.Color(255, 255, 255));
        lblPista.setText("___");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Largo:");

        lblLargo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblLargo.setForeground(new java.awt.Color(255, 255, 255));
        lblLargo.setText("___");

        tabla.setBackground(new java.awt.Color(204, 204, 255));
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        pbCarrera.setBackground(new java.awt.Color(102, 102, 255));
        pbCarrera.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        pbCarrera.setForeground(new java.awt.Color(255, 255, 255));
        pbCarrera.setBorder(new javax.swing.border.MatteBorder(null));

        cboCarros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregar.setBackground(new java.awt.Color(102, 102, 255));
        btnAgregar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero identificador");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre corredor");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar -", "McQueen", "Convertible", "Nascar" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnComenzar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblPista, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btnPista, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(cboCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnAgregar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(98, 98, 98)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComenzar)
                    .addComponent(btnPausar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblPista)
                            .addComponent(jLabel3)
                            .addComponent(lblLargo))))
                .addGap(18, 18, 18)
                .addComponent(pbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(btnPista))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel7))
                        .addComponent(btnReiniciar))
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnColor)
                .addGap(12, 12, 12)
                .addComponent(btnGuardar)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPistaActionPerformed
        if (!txtPista.getText().isEmpty() || !txtLargo.getText().isEmpty()) {
            lblPista.setText(txtPista.getText());
            lblLargo.setText(txtLargo.getText());
            txtPista.setText(null);
            txtLargo.setText(null);
            JOptionPane.showMessageDialog(this, "Pista agregada.", "", 1);
        }
        else {
            JOptionPane.showMessageDialog(this, "Debe completar todos los datos de pista.", "Error", 2);
        }
    }//GEN-LAST:event_btnPistaActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        color = JColorChooser.showDialog(this, "Seleccione un color", Color.pink);
        btnColor.setBackground(color);
    }//GEN-LAST:event_btnColorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNom.getText().isEmpty() || color == null) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "Error", 2);
        }
        else {
            boolean agregado = false;
            if (cboTipo.getSelectedIndex() >= 0) {
                String nom = txtNom.getText();
                int id = (Integer)spId.getValue();
                if (admin.idValido(id)) {
                    admin.cargarArchivo();
                    switch (cboTipo.getSelectedIndex()) {
                        case 1: {
                            admin.agregarCarro(new McQueen(nom, id, color));
                            agregado = true;
                            break;
                        }
                        case 2: {
                            admin.agregarCarro(new Convertible(nom, id, color));
                            agregado = true;
                            break;
                        }
                        case 3: {
                            admin.agregarCarro(new Nascar(nom, id, color));
                            agregado = true;
                            break;
                        }
                    }
                    if (agregado) {
                        admin.escribirArchivo();
                        actualizarCboCarros();
                        txtNom.setText(null);
                        spId.setValue(0);
                        cboTipo.setSelectedIndex(0);
                        JOptionPane.showMessageDialog(this, "Carro agregado exitosamente.", "", 1);
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de carro.", "Error", 2);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(this, "Ya existe un carro con ese numero.", "Error", 2);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (cboCarros.getSelectedIndex() >= 0) {
            try {
                boolean valido = true;
                Carro carrito = admin.getCarros().get(admin.getCarros().indexOf(cboCarros.getSelectedItem()));
                Object[] datos = new Object[3];
                datos[0] = carrito.getNumId();
                for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                    if (modeloTabla.getValueAt(i, 0) == datos[0]) {
                        valido = false;
                    }
                }
                if (valido) {
                    datos[1] = carrito.getNombre();
                    datos[2] = carrito.getDistancia();
                    modeloTabla.addRow(datos);
                    carros.add(carrito);
                }
                else {
                    JOptionPane.showMessageDialog(this, "El carro seleccionado ya ha sido agregado.", "Error", 2);
                }
            } catch (Exception e) {
                
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un carro.", "Error", 2);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        if (lblLargo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un largo.", "Error", 2);
        }
        else{
            pbCarrera.setMaximum(Integer.parseInt(txtLargo.getText()));
            hilo = new AdminBarrita(pbCarrera, carros, tabla);
            hilo.setFin(false);
            hilo.setAvanzar(true);
            hilo.run();
            //hilo.start();
        }
        
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        if (btnPausar.getText().equalsIgnoreCase("Pausar")) {
            hilo.setAvanzar(false);
            btnPausar.setText("Reanudar");
        }
        else {
            hilo.setAvanzar(true);
            btnPausar.setText("Pausar");
        }
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        carros = new ArrayList();
        for (Carro carro : admin.getCarros()) {
            carro.setDistancia(0);
        }
        for (Carro carro : carros) {
            carro.setDistancia(0);
        }
        txtNom.setText(null);
        spId.setValue(0);
        cboTipo.setSelectedIndex(0);
        pbCarrera.setValue(0);
        txtPista.setText(null);
        txtLargo.setText(null);
        crearModeloTabla();
        //actualizarTabla();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnComenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComenzarMouseClicked
        
    }//GEN-LAST:event_btnComenzarMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        try {
            if (tabla.getSelectedRow() >= 0) {
                Carro carroSeleccionado = hilo.getCarros().get(tabla.getSelectedRow());
                pbCarrera.setValue(carroSeleccionado.getDistancia());
                pbCarrera.setForeground(carroSeleccionado.getColor());
            }
        }
        catch (Exception e) {

        }
    }//GEN-LAST:event_tablaMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnPista;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JComboBox<String> cboCarros;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLargo;
    private javax.swing.JLabel lblPista;
    private javax.swing.JProgressBar pbCarrera;
    private javax.swing.JSpinner spId;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtLargo;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPista;
    // End of variables declaration//GEN-END:variables

    
    public void actualizarCboCarros() {
        cboCarrosModel = new DefaultComboBoxModel();
        try {
            admin.cargarArchivo();
            if (!admin.getCarros().isEmpty()) {
                for (Carro carro : admin.getCarros()) {
                    cboCarrosModel.addElement(carro);
                }
            }
            cboCarros.setModel(cboCarrosModel);
        } catch (Exception e) {
            System.out.println("no");
        }
        
    }
    
    public void crearModeloTabla() {
        modeloTabla = (DefaultTableModel) tabla.getModel();
        String[] encabezado = new String[3];
        modeloTabla.setColumnCount(3);
        if (admin.getCarros().isEmpty()) {
            modeloTabla.setRowCount(admin.getCarros().size());
        }
        encabezado[0] = "Identificador";
        encabezado[1] = "Corredor";
        encabezado[2] = "Distancia";
        modeloTabla.setColumnIdentifiers(encabezado);
        modeloTabla.setRowCount(0);
        tabla.setModel(modeloTabla);
    }
    
    public void actualizarTabla() {
        for (Carro carrito : carros) {
            Object[] datos = new Object[3];
            for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                datos[0] = carrito.getNumId();
                datos[1] = carrito.getNombre();
                datos[2] = carrito.getDistancia();
                modeloTabla.addRow(datos);
            }
        }
    }

}
