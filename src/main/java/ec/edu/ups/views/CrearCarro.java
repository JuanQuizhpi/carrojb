/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.views;

import ec.edu.ups.pweb.business.GestionCarrosRemoto;
import ec.edu.ups.pweb.model.Carro;
import java.util.Hashtable;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanf
 */
public class CrearCarro extends javax.swing.JFrame {

    /**
     * Creates new form CrearCarro
     */
    public CrearCarro() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        txtPlacaCarro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMarcaCarro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModeloCarro = new javax.swing.JTextField();
        btnCrearCarro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarros = new javax.swing.JTable();
        txtPlacaBusqueda = new javax.swing.JTextField();
        btnBuscarCarros = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPlacaModificaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMarcaActualizar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtModeloActualizar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Carro"));

        jLabel1.setText("Placa");

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        btnCrearCarro.setText("Crear");
        btnCrearCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlacaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarcaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnCrearCarro)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlacaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarcaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModeloCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearCarro)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Carros"));

        tblCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarros);

        btnBuscarCarros.setText("Buscar");
        btnBuscarCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCarrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPlacaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnBuscarCarros))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlacaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCarros))
                .addGap(228, 228, 228))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Gestión Carros");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar - Borrar"));

        jLabel5.setText("Placa");

        txtPlacaModificaciones.setEditable(false);

        jLabel6.setText("Marca");

        jLabel7.setText("Modelo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(txtPlacaModificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(txtMarcaActualizar)
                    .addComponent(jLabel7)
                    .addComponent(txtModeloActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlacaModificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMarcaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModeloActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnActualizar)
                .addGap(42, 42, 42)
                .addComponent(btnBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));

        jLabel8.setText("Juan Francisco Quizhpi Fajardo");

        jLabel9.setText("juanfranciscoqf2022@gmail.com");

        jLabel10.setText("0983931855");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCarroActionPerformed
        // TODO add your handling code here:
        if (txtPlacaCarro.getText().equalsIgnoreCase("") || txtMarcaCarro.getText().equalsIgnoreCase("") || txtModeloCarro.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Faltan Datos");
        } else {
            try {
                final Hashtable<String, String> jndiProperties = new Hashtable<>();
                jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
                jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
                jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb64"); // Reemplaza 'username' con tu nombre de usuario
                jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb64"); // Reemplaza 'password' con tu contraseña
                jndiProperties.put("jboss.naming.client.ejb.context", "true");

                final Context context = new InitialContext(jndiProperties);
                GestionCarrosRemoto gestionCarros = (GestionCarrosRemoto) context.lookup("ejb:/demojq/GestionCarros!ec.edu.ups.pweb.business.GestionCarrosRemoto");

                // Uso del EJB
                Carro carro = new Carro();
                carro.setPlaca(txtPlacaCarro.getText());
                carro.setModelo(txtModeloCarro.getText());
                carro.setMarca(txtMarcaCarro.getText());
                gestionCarros.guardarCarros(carro);
                System.out.println("Carro guardado!");
                JOptionPane.showMessageDialog(null, "Creación Exitosa");
                limpiarCrear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCrearCarroActionPerformed

    private void btnBuscarCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCarrosActionPerformed
        // TODO add your handling code here:

        if (txtPlacaBusqueda.getText().equalsIgnoreCase("")) {
            //Busqueda de todos los carros
            DefaultTableModel modelo = modeloCarroAll();
            tblCarros.setModel(modelo);
            tblCarros.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()) {
                        // Obtener la fila seleccionada
                        int filaSeleccionada = tblCarros.getSelectedRow();
                        mostrarDetallesFila(filaSeleccionada);
                    }
                }
            });
        } else {
            //Busqueda personalizada por placa
            DefaultTableModel modelo = modeloCarroPlaca(txtPlacaBusqueda.getText());
            tblCarros.setModel(modelo);
            tblCarros.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()) {
                        // Obtener la fila seleccionada
                        int filaSeleccionada = tblCarros.getSelectedRow();
                        mostrarDetallesFila(filaSeleccionada);
                    }
                }
            });
        }
    }//GEN-LAST:event_btnBuscarCarrosActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if (txtPlacaModificaciones.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Nada que actualizar");
        } else {
            if (txtMarcaActualizar.getText().equalsIgnoreCase("") || txtModeloActualizar.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No pueden quedar campos vacios");
            } else {
                try {
                    final Hashtable<String, String> jndiProperties = new Hashtable<>();
                    jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
                    jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
                    jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb64"); // Reemplaza 'username' con tu nombre de usuario
                    jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb64"); // Reemplaza 'password' con tu contraseña
                    jndiProperties.put("jboss.naming.client.ejb.context", "true");

                    final Context context = new InitialContext(jndiProperties);
                    GestionCarrosRemoto gestionCarros = (GestionCarrosRemoto) context.lookup("ejb:/demojq/GestionCarros!ec.edu.ups.pweb.business.GestionCarrosRemoto");
                    Carro nuCarro = new Carro();
                    nuCarro.setPlaca(txtPlacaModificaciones.getText());
                    nuCarro.setMarca(txtMarcaActualizar.getText());
                    nuCarro.setModelo(txtModeloActualizar.getText());
                    gestionCarros.actualizarCarro(nuCarro);
                    JOptionPane.showMessageDialog(null, "Carro actualizado");
                    limpiarModificaciones();
                    actualizarTabla();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        if (txtPlacaModificaciones.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Nada que borrar");
        } else {
            int i = JOptionPane.showConfirmDialog(null, "Realmente deseas Eliminar los datos del Carro", "Eliminar Carro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (i == 0) {
                try {
                    final Hashtable<String, String> jndiProperties = new Hashtable<>();
                    jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
                    jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
                    jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb64"); // Reemplaza 'username' con tu nombre de usuario
                    jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb64"); // Reemplaza 'password' con tu contraseña
                    jndiProperties.put("jboss.naming.client.ejb.context", "true");

                    final Context context = new InitialContext(jndiProperties);
                    GestionCarrosRemoto gestionCarros = (GestionCarrosRemoto) context.lookup("ejb:/demojq/GestionCarros!ec.edu.ups.pweb.business.GestionCarrosRemoto");
                    gestionCarros.borrarCarro(txtPlacaModificaciones.getText());
                    JOptionPane.showMessageDialog(null, "Carro Borrado");
                    actualizarTabla();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                limpiarModificaciones();
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    public void limpiarModificaciones() {
        txtPlacaModificaciones.setText("");
        txtMarcaActualizar.setText("");
        txtModeloActualizar.setText("");
    }

    public DefaultTableModel modeloCarroAll() {
        String[] Columnas = {"Placa", "Marca", "Modelo"};
        Object[] datos = new Object[3];

        DefaultTableModel modelo = new DefaultTableModel(null, Columnas);
        //Conexion a servidor
        try {
            final Hashtable<String, String> jndiProperties = new Hashtable<>();
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb64"); // Reemplaza 'username' con tu nombre de usuario
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb64"); // Reemplaza 'password' con tu contraseña
            jndiProperties.put("jboss.naming.client.ejb.context", "true");

            final Context context = new InitialContext(jndiProperties);
            GestionCarrosRemoto gestionCarros = (GestionCarrosRemoto) context.lookup("ejb:/demojq/GestionCarros!ec.edu.ups.pweb.business.GestionCarrosRemoto");
            //Cargamos a la tabla
            List<Carro> carros = gestionCarros.getCarros();
            for (Carro aux : carros) {
                datos[0] = aux.getPlaca();
                datos[1] = aux.getMarca();
                datos[2] = aux.getModelo();
                modelo.addRow(datos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //Devolvemos modelo
        return modelo;
    }

    public DefaultTableModel modeloCarroPlaca(String placa) {
        String[] Columnas = {"Placa", "Marca", "Modelo"};
        Object[] datos = new Object[3];

        DefaultTableModel modelo = new DefaultTableModel(null, Columnas);
        //Conexion a servidor
        try {
            final Hashtable<String, String> jndiProperties = new Hashtable<>();
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb64"); // Reemplaza 'username' con tu nombre de usuario
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb64"); // Reemplaza 'password' con tu contraseña
            jndiProperties.put("jboss.naming.client.ejb.context", "true");

            final Context context = new InitialContext(jndiProperties);
            GestionCarrosRemoto gestionCarros = (GestionCarrosRemoto) context.lookup("ejb:/demojq/GestionCarros!ec.edu.ups.pweb.business.GestionCarrosRemoto");
            //Cargamos a la tabla
            List<Carro> carros = gestionCarros.getCarros();

            // Suponiendo que tienes una placa específica que deseas buscar
            //String placaABuscar = "ABC123";
            // Flag para indicar si se encontró el carro con la placa especificada
            boolean encontrado = false;

            // Itera sobre la lista de carros y busca el carro con la placa especificada
            for (Carro carro : carros) {
                if (carro.getPlaca().equals(placa)) {
                    encontrado = true;
                    // Realiza alguna acción cuando encuentres el carro con la placa especificada
                    System.out.println("Se encontró el carro con la placa: " + placa);
                    // Aquí puedes agregar el código adicional que desees ejecutar cuando encuentres el carro
                    Carro carroCre = gestionCarros.getCarroPorPlaca(placa);
                    datos[0] = carroCre.getPlaca();
                    datos[1] = carroCre.getMarca();
                    datos[2] = carroCre.getModelo();
                    modelo.addRow(datos);
                    break; // Termina el bucle una vez que se encuentre el carro
                }
            }

            // Si el carro no se encontró en la lista
            if (!encontrado) {
                System.out.println("No se encontró ningún carro con la placa: " + placa);
                // Puedes agregar acciones adicionales que desees realizar si no se encuentra el carro
                JOptionPane.showMessageDialog(null, "No existe ese carro");
            }

            //
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Devolvemos modelo
        return modelo;
    }

    //Metodo para obtener fila especifica de la tabla 
    private void mostrarDetallesFila(int fila) {
        // Verificar si se ha seleccionado una fila válida
        if (fila >= 0 && fila < tblCarros.getRowCount()) {
            // Obtener los datos de la fila seleccionada
            Object[] datosFila = new Object[tblCarros.getColumnCount()];
            for (int i = 0; i < tblCarros.getColumnCount(); i++) {
                datosFila[i] = tblCarros.getValueAt(fila, i);
                //System.out.println(datosFila[i]);
            }
            Object primerValor = tblCarros.getValueAt(fila, 0);
            //System.out.println("Primer valor de la fila: " + primerValor);

            // Realizar un cast a String (asegurarte de manejar posibles null)
            String primerValorString = (primerValor != null) ? primerValor.toString() : "";
            //System.out.println("Primer valor de la fila en String: " + primerValorString);

            //Metodo para acentar datos
            setearDatosCarro(primerValorString);

        }

    }

    //Metodo para acentar datos de un carro para actualizar o borrar
    public void setearDatosCarro(String placa) {

        try {
            final Hashtable<String, String> jndiProperties = new Hashtable<>();
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb64"); // Reemplaza 'username' con tu nombre de usuario
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb64"); // Reemplaza 'password' con tu contraseña
            jndiProperties.put("jboss.naming.client.ejb.context", "true");

            final Context context = new InitialContext(jndiProperties);
            GestionCarrosRemoto gestionCarros = (GestionCarrosRemoto) context.lookup("ejb:/demojq/GestionCarros!ec.edu.ups.pweb.business.GestionCarrosRemoto");

            Carro carMod = gestionCarros.getCarroPorPlaca(placa);

            txtPlacaModificaciones.setText(carMod.getPlaca());
            txtMarcaActualizar.setText(carMod.getMarca());
            txtModeloActualizar.setText(carMod.getModelo());

            System.out.println("Carro listo");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarTabla() {
        DefaultTableModel modelo = modeloCarroAll();
        tblCarros.setModel(modelo);
    }

    public void limpiarCrear() {
        txtPlacaCarro.setText("");
        txtMarcaCarro.setText("");
        txtModeloCarro.setText("");
    }

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
            java.util.logging.Logger.getLogger(CrearCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscarCarros;
    private javax.swing.JButton btnCrearCarro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCarros;
    private javax.swing.JTextField txtMarcaActualizar;
    private javax.swing.JTextField txtMarcaCarro;
    private javax.swing.JTextField txtModeloActualizar;
    private javax.swing.JTextField txtModeloCarro;
    private javax.swing.JTextField txtPlacaBusqueda;
    private javax.swing.JTextField txtPlacaCarro;
    private javax.swing.JTextField txtPlacaModificaciones;
    // End of variables declaration//GEN-END:variables
}
