package Principal;


import Principal.Datos;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Principal.FrmFormularioGeneral;
import java.io.File;
import java.sql.SQLException;
public class FrmIngresar_Datos extends javax.swing.JFrame {

    /**
     * Creates new form INTERFACE
     */
    public FrmIngresar_Datos() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TXT_IDENTIDAD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXT_NOMBRE = new javax.swing.JTextField();
        APELLIDO = new javax.swing.JLabel();
        TXT_APELLIDO = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TXT_PESO = new javax.swing.JTextField();
        SEXO = new javax.swing.JLabel();
        JCB_SEXO = new javax.swing.JComboBox<String>();
        jPanel1 = new javax.swing.JPanel();
        JCB_DEPARTAMENTO = new javax.swing.JComboBox<String>();
        SEXO1 = new javax.swing.JLabel();
        SEXO2 = new javax.swing.JLabel();
        JCB_MUNICIPIO = new javax.swing.JComboBox<String>();
        jPanel4 = new javax.swing.JPanel();
        JB_GUARDAR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JB_VER = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("IDENTIDAD:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("NOMBRE:");

        APELLIDO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        APELLIDO.setForeground(new java.awt.Color(0, 51, 255));
        APELLIDO.setText("APELLIDO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(TXT_APELLIDO)
                    .addComponent(TXT_IDENTIDAD))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXT_IDENTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APELLIDO)
                    .addComponent(TXT_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("PESO:");

        SEXO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SEXO.setForeground(new java.awt.Color(0, 51, 255));
        SEXO.setText("GENERO:");

        JCB_SEXO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ELEGIR", "FEMENINO", "MASCULINO" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SEXO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_PESO, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCB_SEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXT_PESO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEXO)
                    .addComponent(JCB_SEXO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JCB_DEPARTAMENTO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ELEGIR", "ATLANTIDA", "COLON", "COMAYAGUA", "COPAN", "CORTES", "CHOLUTECA", "FRANCISCO MORAZAN", "GRACIAS A DIOS", "INTIBUCA", "ISLAS DE LA BAHIA", "LA PAZ", "LEMPIRA", "OLANCHO", "SANTA BARBARA", "VALLE", "YORO", "OCOTEPEQUE", "EL PARAISO" }));
        JCB_DEPARTAMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_DEPARTAMENTOActionPerformed(evt);
            }
        });

        SEXO1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SEXO1.setForeground(new java.awt.Color(0, 51, 255));
        SEXO1.setText("DEPARTAMENTO:");

        SEXO2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SEXO2.setForeground(new java.awt.Color(0, 51, 255));
        SEXO2.setText("MUNICIPIO:");

        JCB_MUNICIPIO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ELEGIR", "LA CEIBA", "TELA", "JUTIAPA", "LA MASICA", "SAN FRANCISCO", "ARIZONA", "ESPARTA", "EL PORVENIR", "TRUJILLO", "BALFATE", "IRIONA", "LIMÓN", "SABÁ", "SANTA FE", "SANTA ROSA DE AGUÁN", "SONAGUERA", "TOCOA", "BONITO ORIENTAL", "COMAYAGUA", "AJUTERIQUE", "EL ROSARIO", "ESQUÍAS", "HUMUYA", "LA LIBERTAD", "LAMANÍ", "LA TRINIDAD", "LEJAMANI", "MEAMBAR", "MINAS DE ORO", "OJOS DE AGUA", "SAN JERÓNIMO (HONDURAS)", "SAN JOSÉ DE COMAYAGUA", "SAN JOSÉ DEL POTRERO", "SAN LUIS", "SAN SEBASTIÁN", "SIGUATEPEQUE", "VILLA DE SAN ANTONIO", "LAS LAJAS", "TAULABÉ", "SANTA ROSA DE COPÁN", "CABAÑAS", "CONCEPCIÓN", "COPÁN RUINAS", "CORQUÍN", "CUCUYAGUA", "DOLORES", "DULCE NOMBRE", "EL PARAÍSO", "FLORIDA", "LA JIGUA", "LA UNIÓN", "NUEVA ARCADIA", "SAN AGUSTÍN", "SAN ANTONIO", "SAN JERÓNIMO", "SAN JOSÉ", "SAN JUAN DE OPOA", "SAN NICOLÁS", "SAN PEDRO", "SANTA RITA", "TRINIDAD DE COPÁN", "VERACRUZ", "SAN PEDRO SULA", "CHOLOMA", "OMOA", "PIMIENTA", "POTRERILLOS", "PUERTO CORTÉS", "SAN ANTONIO DE CORTÉS", "SAN FRANCISCO DE YOJOA", "SAN MANUEL", "SANTA CRUZ DE YOJOA", "VILLANUEVA", "LA LIMA", "CHOLUTECA", "APACILAGUA", "CONCEPCIÓN DE MARÍA", "DUYURE", "EL CORPUS", "EL TRIUNFO", "MARCOVIA", "MOROLICA", "NAMASIGUE", "OROCUINA", "PESPIRE", "SAN ANTONIO DE FLORES", "SAN ISIDRO", "SAN JOSÉ", "SAN MARCOS DE COLÓN", "SANTA ANA DE YUSGUARE", "YUSCARÁN", "ALAUCA", "DANLÍ", "EL PARAÍSO", "GÜINOPE", "JACALEAPA", "LIURE", "MOROCELÍ", "OROPOLÍ", "POTRERILLOS", "SAN ANTONIO DE FLORES", "SAN LUCAS", "SAN MATÍAS", "SOLEDAD", "TEUPASENTI", "TEXIGUAT", "VADO ANCHO", "YAUYUPE", "TROJES", "DISTRITO CENTRAL", "ALUBARÉN", "CEDROS", "CURARÉN", "EL PORVENIR", "GUAIMACA", "LA LIBERTAD", "LA VENTA", "LEPATERIQUE", "MARAITA", "MARALE", "NUEVA ARMENIA", "OJOJONA", "ORICA", "REITOCA", "SABANAGRANDE", "SAN ANTONIO DE ORIENTE", "SAN BUENAVENTURA", "SAN IGNACIO", "SAN JUAN DE FLORES", "SAN MIGUELITO", "SANTA ANA", "SANTA LUCÍA", "TALANGA", "TATUMBLA", "VALLE DE ÁNGELES", "VILLA DE SAN FRANCISCO", "VALLECILLO", "LA PAZ", "AGUANQUETERIQUE", "CABAÑAS", "CANE", "CHINACLA", "GUAJIQUIRO", "LAUTERIQUE", "MARCALA", "MERCEDES DE ORIENTE", "OPATORO", "SAN ANTONIO DEL NORTE", "SAN JOSÉ", "SAN JUAN", "SAN PEDRO DE TUTULE", "SANTA ANA", "SANTA ELENA", "SANTA MARÍA", "SANTIAGO DE PURINGLA", "JUTICALPA", "CAMPAMENTO", "CATACAMAS", "CONCORDIA", "NACAOME", "ALIANZA", "AMAPALA", "ARAMECINA", "CARIDAD", "GOASCORÁN", "LANGUE", "SAN FRANCISCO DE CORAY", "SAN LORENZO", "YORO", "ARENAL", "EL NEGRITO", "EL PROGRESO", "JOCÓN", "MORAZÁN", "OLANCHITO", "SANTA RITA", "SULACO", "VICTORIA", "YORITO" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SEXO1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCB_DEPARTAMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SEXO2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCB_MUNICIPIO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEXO1)
                    .addComponent(JCB_DEPARTAMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SEXO2)
                    .addComponent(JCB_MUNICIPIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JB_GUARDAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JB_GUARDAR.setForeground(new java.awt.Color(0, 51, 255));
        JB_GUARDAR.setText("Guardar");
        JB_GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_GUARDARActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JB_VER.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JB_VER.setForeground(new java.awt.Color(0, 51, 255));
        JB_VER.setText("Ver");
        JB_VER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_VERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(JB_VER, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_GUARDAR)
                    .addComponent(jButton1)
                    .addComponent(JB_VER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("FORMULARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(11, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_GUARDARActionPerformed
        PreparedStatement Sentencia;
        FileInputStream fi;
          String sql = "INSERT INTO" + " HUMANOS (ID, NOMBRE, APELLIDOS, PESO, SEXO, DEPARTAMENTO, MUNICIPIO)"
        +" VALUES(?,?,?,?,?,?,?)"; 
        try{
         Sentencia= Datos.Conexion.prepareStatement(sql);
         Sentencia.setString(1,TXT_IDENTIDAD.getText());
         Sentencia.setString(2,TXT_NOMBRE.getText());
         Sentencia.setString(3,TXT_APELLIDO.getText());
         Sentencia.setString(4,TXT_PESO.getText());
         Sentencia.setString(5,JCB_SEXO.getSelectedItem().toString());
         Sentencia.setString(6,JCB_DEPARTAMENTO.getSelectedItem().toString());
         Sentencia.setString(7,JCB_MUNICIPIO.getSelectedItem().toString());
         Sentencia.executeUpdate();
         System.out.println(sql);       
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"error"+ e);
  
        }
          
    }//GEN-LAST:event_JB_GUARDARActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         Datos.AbrirConexionDB();
    }//GEN-LAST:event_formWindowOpened

    private void JB_VERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_VERActionPerformed
       FrmFormularioGeneral From= new FrmFormularioGeneral();
        From.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_JB_VERActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  PreparedStatement Sentencia;
        FileInputStream fi;
        
        String sql = "UPDATE HUMANOS "+" NOMBRE = ?,  APELLIDOS = ?,PESO = ?, SEXO = ?, DEPARTAMENTO = ?, MUNICIPIO = ?"
          +"WHERE ID = ? " ;
        try{
         Sentencia= Datos.Conexion.prepareStatement(sql);
         Sentencia.setString(0,TXT_IDENTIDAD.getText());
         Sentencia.setString(1,TXT_NOMBRE.getText());
         Sentencia.setString(2,TXT_APELLIDO.getText());
         Sentencia.setString(3,TXT_PESO.getText());
         Sentencia.setString(4,JCB_SEXO.getSelectedItem().toString());
         Sentencia.setString(5,JCB_DEPARTAMENTO.getSelectedItem().toString() ); 
         Sentencia.setString(6,JCB_MUNICIPIO.getSelectedItem().toString() ); 
         Sentencia.executeUpdate();
         System.out.println(sql); 
         JOptionPane.showMessageDialog(null, " La Informacion a sido MODIFICADA");
        }catch(Exception ex){
            System.out.println("error"+ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JCB_DEPARTAMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_DEPARTAMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCB_DEPARTAMENTOActionPerformed

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
            java.util.logging.Logger.getLogger(FrmIngresar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIngresar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIngresar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngresar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIngresar_Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APELLIDO;
    private javax.swing.JButton JB_GUARDAR;
    private javax.swing.JButton JB_VER;
    public static javax.swing.JComboBox<String> JCB_DEPARTAMENTO;
    public static javax.swing.JComboBox<String> JCB_MUNICIPIO;
    public static javax.swing.JComboBox<String> JCB_SEXO;
    private javax.swing.JLabel SEXO;
    private javax.swing.JLabel SEXO1;
    private javax.swing.JLabel SEXO2;
    public static javax.swing.JTextField TXT_APELLIDO;
    public static javax.swing.JTextField TXT_IDENTIDAD;
    public static javax.swing.JTextField TXT_NOMBRE;
    public static javax.swing.JTextField TXT_PESO;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}