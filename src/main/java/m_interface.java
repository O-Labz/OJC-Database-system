
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10011971
 */
public class m_interface extends javax.swing.JFrame {

    /**
     * Creates new form m_interface
     */
    public m_interface() {
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

        txtSQL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        cmdExecute = new javax.swing.JButton();
        cmdCommit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OJC Database Interface");

        txtSQL.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        txtSQL.setText("Enter SQL Query");

        txtResult.setEditable(false);
        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Lucida Console", 0, 13)); // NOI18N
        txtResult.setForeground(new java.awt.Color(0, 0, 102));
        txtResult.setRows(5);
        txtResult.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtResult.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        jScrollPane1.setViewportView(txtResult);

        cmdExecute.setText("Execute");
        cmdExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExecuteActionPerformed(evt);
            }
        });

        cmdCommit.setText("Commit");
        cmdCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCommitActionPerformed(evt);
            }
        });

        jLabel1.setText("SQL");

        jLabel2.setText("RESULT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                            .addComponent(txtSQL)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(cmdExecute)
                        .addGap(130, 130, 130)
                        .addComponent(cmdCommit)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCommit)
                    .addComponent(cmdExecute))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExecuteActionPerformed
        //Trim and remove extra spaces
        String checkSQL = txtSQL.getText().replaceAll("( )+", " ").trim();
        if (checkSQL.isEmpty()) {
            txtResult.setText("Please enter a SQL query");
        } else {
            if(validateSyntax(checkSQL)){
                txtResult.setText(checkSQL + "\n" + "Valid SQL query.");
            } else{
                txtResult.setText(checkSQL + "\n" + "Syntax error! Please check SQL query.");
            }
        } 
    // TODO add your handling code here:
    }//GEN-LAST:event_cmdExecuteActionPerformed

    private void cmdCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCommitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCommitActionPerformed

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
            java.util.logging.Logger.getLogger(m_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(m_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(m_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(m_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new m_interface().setVisible(true);
                String currentDatabase = "";
                String currentDatabases = "";
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCommit;
    private javax.swing.JButton cmdExecute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtSQL;
    // End of variables declaration//GEN-END:variables
    
    
    
    private boolean validateSyntax(String inputSQL){
        String regexpattern;
        inputSQL = inputSQL.toUpperCase();
        final String create1;
        create1 = "^CREATE +(DATABASE +[A-Za-z]+[0-9A-Za-z]*|TABLE +[A-Za-z]+[0-9A-Za-z]*+[ ]*+[(]+[ ]*+[A-Za-z]+[0-9A-Za-z]*+[ ]+(int|String)+([,]+[ ]*+[A-Za-z]+[0-9A-Za-z]*+[ ]+(int|String))*+[ ]*+[)]|INDEX +[A-Za-z]+[0-9A-Za-z]*+[ ]+ON+[ ]+[(]+[ ]*+[A-Za-z]+[0-9A-Za-z]*+[ ]*+([,]+[ ]*+[A-Za-z]+[0-9A-Za-z]*)*+[ ]*+[)])+[ ]*+[;]$";
        final String use1;
        use1 = "^USE +[A-Za-z]+[0-9A-Za-z]*+[ ]*+[;]$";
        final String select1;
        select1 = "^SELECT +([A-Za-z]+[0-9A-Za-z]*|[*])+[ ]+FROM+[ ]+[A-Za-z]+[0-9A-Za-z]*+( WHERE+[ ]+[A-Za-z]+[0-9A-Za-z]*+[ ]*+(<|>|=|!=|<=|>=)+[ ]*+[0-9A-Za-z]*)*+[ ]*+[;]$";
        final String insert1;
        insert1 = "^INSERT INTO +[A-Za-z]+[0-9A-Za-z]*+ VALUES+[ ]*+[(]+[ ]*+(\\d+|[']+\\S+['])+([ ]*+[,]+[ ]*+(\\d+|[']+\\S+[']))*+[)]+[ ]*+[;]$";
        final String delete1;
        delete1 ="^DELETE FROM +[A-Za-z]+[0-9A-Za-z]*+ WHERE +[A-Za-z]+[0-9A-Za-z]*+[ ]*+(<|>|=|!=|<=|>=)+[ ]*+(\\d+|[']+\\S+['])+[ ]*+[;]$";
        final String update1;
        update1 = "^UPDATE +[A-Za-z]+[0-9A-Za-z]*+ SET +[A-Za-z]+[0-9A-Za-z]*+[ ]*+[=]+[ ]*(\\d+|[']+\\S+['])+ WHERE +[A-Za-z]+[0-9A-Za-z]*+(<|>|=|!=|<=|>=)+[ ]*+(\\d+|[']+\\S+['])+[ ]*+[;]$";
        
        if(inputSQL.startsWith("SELECT")){
            regexpattern = select1;
        }else {
            if(inputSQL.startsWith("UPDATE")){
                regexpattern = update1;
            }else{
                if(inputSQL.startsWith("INSERT")){
                    regexpattern = insert1;
                }else{
                    if(inputSQL.startsWith("DELETE")){
                        regexpattern = delete1;
                    }else {
                        if(inputSQL.startsWith("CREATE")){
                            regexpattern = create1;
                        }else {
                            if(inputSQL.startsWith("USE")){
                                regexpattern = use1;
                            } else{
                                return false;
                            }
                        }
                    }
                }
            }
        }
        
        return Pattern.matches(regexpattern, inputSQL.toUpperCase());
        
    }
}
