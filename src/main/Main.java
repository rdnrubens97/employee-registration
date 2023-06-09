/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;



/**
 *
 * @author Rubens
 */
public class Main extends javax.swing.JFrame {

    ArrayList<Employee> employeeList;
    String interfaceMode;
    
    public void LoadEmployeeTable() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Nome Completo", "Data de Nascimento", "Salário"}, 0);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
                
        for (int i = 0; i < employeeList.size(); i += 1) {
            Object row[] = new Object[]{employeeList.get(i).getId(),
                employeeList.get(i).getName(),
                employeeList.get(i).getBirthDate(),
                currencyFormat.format(employeeList.get(i).getSalary()),
        };
            model.addRow(row);
        }
        table_employees.setModel(model);
    }

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);       
        employeeList = new ArrayList();
        interfaceMode = "Home";
        AlterInterfaceFunc();
    }

    public void AlterInterfaceFunc() {
        switch (interfaceMode) {
            case "Home":
                button_register.setEnabled(false);
                button_register.setText("CADASTRAR");
                button_cancel.setEnabled(false);
                button_printout.setEnabled(true);
                button_new.setEnabled(true);
                button_edit.setEnabled(false);
                button_delete.setEnabled(false);
                field_employee_id.setEnabled(false);
                field_employee_name.setEnabled(false);
                field_employee_birthdate.setEnabled(false);
                field_employee_salary.setEnabled(false);           

                break;

            case "New":
                button_register.setEnabled(true);
                button_cancel.setEnabled(true);
                button_printout.setEnabled(false);
                button_new.setEnabled(false);
                button_edit.setEnabled(false);
                button_delete.setEnabled(false);
                field_employee_id.setEnabled(false);
                field_employee_name.setEnabled(true);
                field_employee_birthdate.setEnabled(true);
                field_employee_salary.setEnabled(true);
                break;

            case "Edit":
                button_register.setEnabled(true);
                button_register.setText("ALTERAR");
                button_cancel.setEnabled(true);
                button_printout.setEnabled(false);
                button_new.setEnabled(true);
                button_edit.setEnabled(false);
                button_delete.setEnabled(false);
                field_employee_id.setEnabled(false);
                field_employee_name.setEnabled(true);
                field_employee_birthdate.setEnabled(true);
                field_employee_salary.setEnabled(true);
                break;

            case "Delete":
                button_register.setEnabled(false);
                button_cancel.setEnabled(false);
                button_printout.setEnabled(true);
                button_new.setEnabled(true);
                button_edit.setEnabled(false);
                button_delete.setEnabled(false);
                break;

            case "Selection":
                button_register.setEnabled(false);
                button_cancel.setEnabled(false);
                button_printout.setEnabled(true);
                button_new.setEnabled(true);
                button_edit.setEnabled(true);
                button_delete.setEnabled(true);
                break;
            default:
                System.out.println("Modo inválido");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_employees = new javax.swing.JTable();
        table_data = new javax.swing.JPanel();
        label_employee_id = new javax.swing.JLabel();
        field_employee_id = new javax.swing.JTextField();
        label_employee_name = new javax.swing.JLabel();
        field_employee_name = new javax.swing.JTextField();
        label_employee_birthdate = new javax.swing.JLabel();
        label_employee_salary = new javax.swing.JLabel();
        field_employee_salary = new javax.swing.JFormattedTextField();
        button_register = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();
        button_printout = new javax.swing.JButton();
        field_employee_birthdate = new javax.swing.JFormattedTextField();
        button_edit = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        button_new = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_employees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Completo", "Data de Nascimento", "Salário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_employeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_employees);

        label_employee_id.setText("ID");

        label_employee_name.setText("NOME COMPLETO");

        field_employee_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_employee_nameActionPerformed(evt);
            }
        });

        label_employee_birthdate.setText("DATA DE NASCIMENTO");

        label_employee_salary.setText("SALÁRIO");

        field_employee_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_employee_salaryActionPerformed(evt);
            }
        });

        button_register.setText("CADASTRAR");
        button_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registerActionPerformed(evt);
            }
        });

        button_cancel.setText("CANCELAR");
        button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelActionPerformed(evt);
            }
        });

        button_printout.setText("IMPRIMIR");
        button_printout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_printoutActionPerformed(evt);
            }
        });

        try {
            field_employee_birthdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout table_dataLayout = new javax.swing.GroupLayout(table_data);
        table_data.setLayout(table_dataLayout);
        table_dataLayout.setHorizontalGroup(
            table_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table_dataLayout.createSequentialGroup()
                .addGroup(table_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(table_dataLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(table_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(table_dataLayout.createSequentialGroup()
                                .addComponent(button_register)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_printout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_employee_id)
                            .addComponent(label_employee_name)
                            .addComponent(label_employee_birthdate)
                            .addComponent(label_employee_salary)
                            .addComponent(field_employee_id, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(field_employee_name)))
                    .addGroup(table_dataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(table_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(field_employee_birthdate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_employee_salary))))
                .addGap(150, 150, 150))
        );
        table_dataLayout.setVerticalGroup(
            table_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_dataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_employee_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_employee_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_employee_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_employee_birthdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_employee_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(label_employee_salary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_employee_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(table_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_register)
                    .addComponent(button_cancel)
                    .addComponent(button_printout))
                .addContainerGap())
        );

        button_edit.setText("EDITAR");
        button_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editActionPerformed(evt);
            }
        });

        button_delete.setText("DELETAR");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        button_new.setText("NOVO");
        button_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_newActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addComponent(table_data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_new, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(button_new, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    public Boolean verifyRegisterFields(){
        if (!nameFieldIsValid()){
            JOptionPane.showMessageDialog(null, "O campo 'nome' é obrigatório.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!birthDateFieldIsValid()){
            JOptionPane.showMessageDialog(null, "O campo 'data de nascimento' é inválido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!salaryFieldIsValid()){
            JOptionPane.showMessageDialog(null, "O campo 'salário' é inválido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;        
    }

    
    private Boolean nameFieldIsValid(){        
        return !field_employee_name.getText().isBlank();      
        
    }
    
    private Boolean birthDateFieldIsValid(){        
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birthDate = LocalDate.parse(field_employee_birthdate.getText(), dateTimeFormatter);
            LocalDate today = LocalDate.now(); 
            return today.isAfter(birthDate);
        }
        catch (Exception e){
            return false;
        }
    }
    
    private Boolean salaryFieldIsValid(){        
        try{
            Double salary = Double.parseDouble(field_employee_salary.getText());
            return salary >= 0;  
        }
        catch (Exception e){            
            return false;
        }
    }    
   
        
    private void button_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registerActionPerformed
        // TODO add your handling code here:  

        if (interfaceMode.equals("New") && verifyRegisterFields()) {       
            Employee employee = new Employee(field_employee_name.getText().toUpperCase().trim(),
                                            field_employee_birthdate.getText(),
                                            (Double.parseDouble(field_employee_salary.getText())));
                     
            employeeList.add(employee);            
            refreshInterface();  
        } 
        else if (interfaceMode.equals("Edit") && verifyRegisterFields()) {
            int index = table_employees.getSelectedRow();         
            employeeList.get(index).setId(Integer.parseInt(field_employee_id.getText()));
            employeeList.get(index).setName(field_employee_name.getText().toUpperCase().trim());
            employeeList.get(index).setBirthDate(field_employee_birthdate.getText());
            employeeList.get(index).setSalary(Double.parseDouble(field_employee_salary.getText()));
            refreshInterface();
            JOptionPane.showMessageDialog(null, "Dados editados com sucesso");
            
        }
                
        LoadEmployeeTable();

    }//GEN-LAST:event_button_registerActionPerformed

    private void refreshInterface(){        
        interfaceMode = "Home";
        AlterInterfaceFunc();
        field_employee_id.setText("");
        field_employee_name.setText("");
        field_employee_birthdate.setText("");
        field_employee_salary.setText("");
    }
    
    

    private void table_employeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_employeesMouseClicked
        // TODO add your handling code here:        
        int index = table_employees.getSelectedRow();
        if (index >= 0 && index < employeeList.size()) {
            Employee employee = employeeList.get(index);
            field_employee_id.setText(String.valueOf(employee.getId()));
            field_employee_name.setText(employee.getName());
            field_employee_birthdate.setText(employee.getBirthDate());
            field_employee_salary.setText(String.valueOf(employee.getSalary()));
            interfaceMode = "Selection";
            AlterInterfaceFunc();
        }


    }//GEN-LAST:event_table_employeesMouseClicked

    private void field_employee_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_employee_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_employee_nameActionPerformed

    private void button_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_newActionPerformed
        // TODO add your handling code here:
        field_employee_id.setText("");
        field_employee_name.setText("");
        field_employee_birthdate.setText("");
        field_employee_salary.setText("");

        interfaceMode = "New";
        AlterInterfaceFunc();

    }//GEN-LAST:event_button_newActionPerformed

    private void button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelActionPerformed
        // TODO add your handling code here:
        field_employee_id.setText("");
        field_employee_name.setText("");
        field_employee_birthdate.setText("");
        field_employee_salary.setText("");
        interfaceMode = "Home";
        AlterInterfaceFunc();

    }//GEN-LAST:event_button_cancelActionPerformed

    private void button_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editActionPerformed
        // TODO add your handling code here:
        interfaceMode = "Edit";        
        AlterInterfaceFunc();

    }//GEN-LAST:event_button_editActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        // TODO add your handling code here:
        int index = table_employees.getSelectedRow();
        if (index >= 0 && index < employeeList.size()) {
            employeeList.remove(index);
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso");
        }
        LoadEmployeeTable();
        field_employee_id.setText("");
        field_employee_name.setText("");
        field_employee_birthdate.setText("");
        field_employee_salary.setText("");
        interfaceMode = "Home";
        AlterInterfaceFunc();
    }//GEN-LAST:event_button_deleteActionPerformed

    private void field_employee_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_employee_salaryActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_field_employee_salaryActionPerformed

    private void button_printoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_printoutActionPerformed
        // TODO add your handling code here:
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %30s %15s %30s %15s %30s","ID", "NOME", "NASCIMENTO", "SALÁRIO", "IDADE", "SALÁRIO + 10%" );
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        for(Employee employee: employeeList){
            printEmployee(employee);
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        Double totalSalary = employeeList.stream().map(employee -> employee.getSalary()).reduce(0.0, Double::sum);
        System.out.println("TOTAL SALÁRIO: " + totalSalary);
        System.out.println("TOTAL SALÁRIO COM ACRÉSCIMO: " + formatDouble(1.1 * totalSalary));
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");      
           
    }//GEN-LAST:event_button_printoutActionPerformed

    private void printEmployee(Employee employee){
            Double salary = employee.getSalary();
            System.out.format("%10s %30s %15s %30s %15s %30s",
                    employee.getId(), employee.getName(), employee.getBirthDate(), salary, employee.getAge(), formatDouble(1.1*salary));
            System.out.println();           
            
    }
    
    private String formatDouble(Double salary){
        DecimalFormat df = new DecimalFormat("####.00");
        return df.format(salary);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_edit;
    private javax.swing.JButton button_new;
    private javax.swing.JButton button_printout;
    private javax.swing.JButton button_register;
    private javax.swing.JFormattedTextField field_employee_birthdate;
    private javax.swing.JTextField field_employee_id;
    private javax.swing.JTextField field_employee_name;
    private javax.swing.JFormattedTextField field_employee_salary;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_employee_birthdate;
    private javax.swing.JLabel label_employee_id;
    private javax.swing.JLabel label_employee_name;
    private javax.swing.JLabel label_employee_salary;
    private javax.swing.JPanel table_data;
    private javax.swing.JTable table_employees;
    // End of variables declaration//GEN-END:variables
}
