package atmsimu;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class NewJFrame extends javax.swing.JFrame {

   Map<String, Account> accounts = new HashMap<>();
Account currentAccount;
    public NewJFrame() {
        initComponents();
            addDefaultAccounts();
    promptForAccount();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        txtToAccount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnTransfer = new javax.swing.JButton();
        btnStatement = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtStatement = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("To Account :");

        txtToAccount.setText("jTextField1");
        txtToAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToAccountActionPerformed(evt);
            }
        });

        jLabel2.setText("Amount :");

        txtAmount.setText("jTextField1");

        btnTransfer.setText("Fund Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        btnStatement.setText("Mini Statement");
        btnStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatementActionPerformed(evt);
            }
        });

        txtStatement.setColumns(20);
        txtStatement.setRows(5);
        jScrollPane3.setViewportView(txtStatement);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtToAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtToAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStatement, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(btnTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtToAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToAccountActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
      performTransfer();
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatementActionPerformed
        showMiniStatement();
    }//GEN-LAST:event_btnStatementActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStatement;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextArea txtStatement;
    private javax.swing.JTextField txtToAccount;
    // End of variables declaration//GEN-END:variables
// Paste here, outside of other methods:
private void performTransfer() {
    String recipientAcc = txtToAccount.getText().trim();
    String amountStr = txtAmount.getText().trim();

    if (!accounts.containsKey(recipientAcc)) {
        JOptionPane.showMessageDialog(this, "Recipient not found!");
        return;
    }

    try {
        double amount = Double.parseDouble(amountStr);
        if (amount <= 0 || amount > currentAccount.getBalance()) {
            JOptionPane.showMessageDialog(this, "Invalid or insufficient amount.");
            return;
        }

        Account recipient = accounts.get(recipientAcc);
        currentAccount.debit(amount);
        recipient.credit(amount);

        currentAccount.addTransaction("Transferred $" + amount + " to " + recipientAcc);
        recipient.addTransaction("Received $" + amount + " from " + currentAccount.getAccountNumber());

        JOptionPane.showMessageDialog(this, "Transfer successful!");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Enter a valid amount.");
    }
}

private void showMiniStatement() {
    txtStatement.setText("Mini Statement:\n");
    for (String txn : currentAccount.getMiniStatement()) {
        txtStatement.append(txn + "\n");
    }
}
private void addDefaultAccounts() {
    accounts.put("12345", new Account("12345", "Alice", 1000.0));
    accounts.put("67890", new Account("67890", "Bob", 500.0));
}

private void promptForAccount() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your account number: ");
    String accNum = scanner.nextLine().trim();

    if (accounts.containsKey(accNum)) {
        currentAccount = accounts.get(accNum);
        System.out.println("Welcome back, " + currentAccount.getAccountHolder());
    } else {
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial deposit: ");
        double balance = Double.parseDouble(scanner.nextLine());

        Account newAccount = new Account(accNum, name, balance);
        accounts.put(accNum, newAccount);
        currentAccount = newAccount;

        System.out.println("Account created successfully!");
    }
}

}



