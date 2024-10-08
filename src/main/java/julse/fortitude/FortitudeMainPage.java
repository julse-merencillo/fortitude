/* Package */
package julse.fortitude;

/* Imports */
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julse
 */
public class FortitudeMainPage extends javax.swing.JFrame
{

    /**
     * Creates new form FortitudeMainPage.
     */
    private FortitudeMainPage()
    {
        initComponents();
        setLocationRelativeTo(null);
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        passwordTable = new javax.swing.JTable();
        descriptionField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        copyClipboardButton = new javax.swing.JButton();
        passwordLabel1 = new javax.swing.JLabel();
        loadFileButton = new javax.swing.JButton();
        saveFileButton = new javax.swing.JButton();
        resetAllPassButton = new javax.swing.JButton();
        updateDescButton = new javax.swing.JButton();
        deleteEntryButton = new javax.swing.JButton();
        addEntryRandCharButton = new javax.swing.JButton();
        addEntryWordListChar = new javax.swing.JButton();
        resetPassRandCharButton = new javax.swing.JButton();
        resetPassWordListButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fortitude");
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        passwordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Description", "Password"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        passwordTable.getTableHeader().setReorderingAllowed(false);
        passwordTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                passwordTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(passwordTable);
        if (passwordTable.getColumnModel().getColumnCount() > 0)
        {
            passwordTable.getColumnModel().getColumn(0).setResizable(false);
            passwordTable.getColumnModel().getColumn(1).setResizable(false);
        }

        descriptionLabel.setText("Description");

        copyClipboardButton.setText("Copy to Clipboard");
        copyClipboardButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                copyClipboardButtonActionPerformed(evt);
            }
        });

        passwordLabel1.setText("Password");

        loadFileButton.setText("Load Password Entries from File");
        loadFileButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loadFileButtonActionPerformed(evt);
            }
        });

        saveFileButton.setText("Save Password Entries to File");
        saveFileButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveFileButtonActionPerformed(evt);
            }
        });

        resetAllPassButton.setText("Reset Passwords in All Entries");
        resetAllPassButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetAllPassButtonActionPerformed(evt);
            }
        });

        updateDescButton.setText("Update Description");
        updateDescButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                updateDescButtonActionPerformed(evt);
            }
        });

        deleteEntryButton.setText("Delete Entry");
        deleteEntryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deleteEntryButtonActionPerformed(evt);
            }
        });

        addEntryRandCharButton.setText("Add Entry (Random Characters)");
        addEntryRandCharButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addEntryRandCharButtonActionPerformed(evt);
            }
        });

        addEntryWordListChar.setText("Add Entry (Random Words)");
        addEntryWordListChar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addEntryWordListCharActionPerformed(evt);
            }
        });

        resetPassRandCharButton.setText("Reset Password (Random Characters)");
        resetPassRandCharButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetPassRandCharButtonActionPerformed(evt);
            }
        });

        resetPassWordListButton.setText("Reset Password (Random Words)");
        resetPassWordListButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetPassWordListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addEntryRandCharButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addEntryWordListChar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(resetPassRandCharButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resetPassWordListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(deleteEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(descriptionField)
                        .addComponent(resetAllPassButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadFileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveFileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(passwordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(copyClipboardButton))
                        .addComponent(updateDescButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(descriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(copyClipboardButton)
                            .addComponent(passwordLabel1))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addEntryRandCharButton)
                            .addComponent(addEntryWordListChar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetPassWordListButton)
                            .addComponent(resetPassRandCharButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateDescButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteEntryButton)
                        .addGap(61, 61, 61)
                        .addComponent(resetAllPassButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveFileButton)))
                .addGap(30, 30, 30))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyClipboardButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_copyClipboardButtonActionPerformed
    {//GEN-HEADEREND:event_copyClipboardButtonActionPerformed
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection selected = new StringSelection(listCopy.retrieveAt(row_target).getPassword());
        
        clip.setContents(selected, selected);
    }//GEN-LAST:event_copyClipboardButtonActionPerformed

    private void resetAllPassButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resetAllPassButtonActionPerformed
    {//GEN-HEADEREND:event_resetAllPassButtonActionPerformed
        listCopy.resetAllPass();
        
        refreshTable();
        clearFields();
    }//GEN-LAST:event_resetAllPassButtonActionPerformed

    private void updateDescButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateDescButtonActionPerformed
    {//GEN-HEADEREND:event_updateDescButtonActionPerformed
        if (row_target >= listCopy.getSize())
        {
            return;
        }
        
        String newDesc = descriptionField.getText();
        listCopy.retrieveAt(row_target).setDescription(newDesc);
        
        refreshTable();
        clearFields();
    }//GEN-LAST:event_updateDescButtonActionPerformed

    private void deleteEntryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteEntryButtonActionPerformed
    {//GEN-HEADEREND:event_deleteEntryButtonActionPerformed
        if (row_target >= listCopy.getSize())
        {
            return;
        }
        
        JFrame confirmForm = new JFrame();
        confirmForm.setLocationRelativeTo(null);
        confirmForm.setVisible(true);
        confirmForm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        int response = JOptionPane.showConfirmDialog(confirmForm, "Do you want to delete this entry?");
        
        if (response == JOptionPane.YES_OPTION)
        {
            confirmForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            listCopy.deleteAt(row_target);
            refreshTable();
            clearFields();
        }
    }//GEN-LAST:event_deleteEntryButtonActionPerformed

    private void passwordTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_passwordTableMouseClicked
    {//GEN-HEADEREND:event_passwordTableMouseClicked
        JTable target = (JTable) evt.getSource();
        row_target = target.getSelectedRow();
        refreshTable();
        
        descriptionField.setText(listCopy.retrieveAt(row_target).getDescription());
        passwordField.setText(listCopy.retrieveAt(row_target).getPassword());
    }//GEN-LAST:event_passwordTableMouseClicked

    private void addEntryRandCharButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addEntryRandCharButtonActionPerformed
    {//GEN-HEADEREND:event_addEntryRandCharButtonActionPerformed
        JFrame lengthForm = new JFrame();
        lengthForm.setLocationRelativeTo(null);
        lengthForm.setVisible(true);
        lengthForm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        lengthForm.setTitle("Set Password Length");
        int length;
        try
        {
            length = Integer.parseInt(JOptionPane.showInputDialog(lengthForm, "Set the length of the password."));
            lengthForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        catch (NumberFormatException ex)
        {
            length = PasswordGenerator.DEFAULT_LENGTH;
        }
        
        JFrame charSetForm = new JFrame();
        charSetForm.setLocationRelativeTo(null);
        charSetForm.setVisible(true);
        charSetForm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        charSetForm.setTitle("Set Character List");
        String charSet;
        
        charSet = JOptionPane.showInputDialog(charSetForm, """
                                                           Input the characters to be included in the password.
                                                           Leave blank to set to default.""");
        
        RandomChars tempGen = new RandomChars(length, charSet);
        
        String newDesc = (descriptionField.getText().equals("")) ? 
                "New password using random characters" : descriptionField.getText();
        Password<RandomChars> temp = new Password<>(newDesc, tempGen);
        listCopy.add(temp);
        
        refreshTable();
        clearFields();
    }//GEN-LAST:event_addEntryRandCharButtonActionPerformed

    private void addEntryWordListCharActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addEntryWordListCharActionPerformed
    {//GEN-HEADEREND:event_addEntryWordListCharActionPerformed
        try
        {
            JFrame lengthForm = new JFrame();
            lengthForm.setLocationRelativeTo(null);
            lengthForm.setVisible(true);
            lengthForm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            lengthForm.setTitle("Set Number of Words");
            int length;
        
            length = Integer.parseInt(JOptionPane.showInputDialog(lengthForm, "Set the number of words in the password."));
            lengthForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            if (length < 1)
            {
                length = PasswordGenerator.DEFAULT_LENGTH;
            }
        
     
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
            chooser.setFileFilter(filter);
            int retval = chooser.showOpenDialog(null);
            String path;
            if (retval == JFileChooser.APPROVE_OPTION)
            {
                path = chooser.getSelectedFile().getAbsolutePath();
            }
            else
            {
                path = "";
            }
           
                
            WordList tempGen = new WordList(length, path);
            String newDesc = (descriptionField.getText().equals("")) ? 
                "New password using random words" : descriptionField.getText();
            Password<WordList> temp = new Password<>(newDesc, tempGen);
            listCopy.add(temp);
        } 
        catch (IOException | NumberFormatException ex)
        {
            
        }
        
        refreshTable();
        clearFields();
    }//GEN-LAST:event_addEntryWordListCharActionPerformed

    private void resetPassRandCharButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resetPassRandCharButtonActionPerformed
    {//GEN-HEADEREND:event_resetPassRandCharButtonActionPerformed
        if (row_target >= listCopy.getSize())
        {
            return;
        }
        
        JFrame lengthForm = new JFrame();
        lengthForm.setLocationRelativeTo(null);
        lengthForm.setVisible(true);
        lengthForm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        lengthForm.setTitle("Set Password Length");
        int length;
        try
        {
            length = Integer.parseInt(JOptionPane.showInputDialog(lengthForm, "Set the length of the password."));
            lengthForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        catch (NumberFormatException ex)
        {
            length = PasswordGenerator.DEFAULT_LENGTH;
        }
        
        JFrame charSetForm = new JFrame();
        charSetForm.setLocationRelativeTo(null);
        charSetForm.setVisible(true);
        charSetForm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        charSetForm.setTitle("Set Character List");
        String charSet;
        
        charSet = JOptionPane.showInputDialog(charSetForm, "Input the characters to be included in the password.\n"
                + "Leave blank to set to default.");
        
        RandomChars tempGen = new RandomChars(length, charSet);

        listCopy.retrieveAt(row_target).setGenerator(tempGen);
        listCopy.resetPassAt(row_target);
        
        refreshTable();
        clearFields();
    }//GEN-LAST:event_resetPassRandCharButtonActionPerformed

    private void resetPassWordListButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resetPassWordListButtonActionPerformed
    {//GEN-HEADEREND:event_resetPassWordListButtonActionPerformed
        if (row_target >= listCopy.getSize())
        {
            return;
        }
        
        try
        {
            JFrame lengthForm = new JFrame();
            lengthForm.setLocationRelativeTo(null);
            lengthForm.setVisible(true);
            lengthForm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            lengthForm.setTitle("Set Number of Words");
            int length;
        
            length = Integer.parseInt(JOptionPane.showInputDialog(lengthForm, "Set the number of words in the password."));
            lengthForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            if (length < 1)
            {
                length = PasswordGenerator.DEFAULT_LENGTH;
            }
        
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
            chooser.setFileFilter(filter);
            int retval = chooser.showOpenDialog(null);
            String path;
            if (retval == JFileChooser.APPROVE_OPTION)
            {
                path = chooser.getSelectedFile().getAbsolutePath();
            }
            else
            {
                path = "";
            }
                
            WordList tempGen = new WordList(length, path);
            listCopy.retrieveAt(row_target).setGenerator(tempGen);
            listCopy.resetPassAt(row_target);
        }
        catch (IOException ex)
        {
            
        }
        
        refreshTable();
        clearFields();
    }//GEN-LAST:event_resetPassWordListButtonActionPerformed

    private void loadFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_loadFileButtonActionPerformed
    {//GEN-HEADEREND:event_loadFileButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Comma-separated value files", "csv");
        chooser.setFileFilter(filter);
        int retval = chooser.showOpenDialog(null);
        File loadedFile;
        if (retval == JFileChooser.APPROVE_OPTION)
        {
            loadedFile = chooser.getSelectedFile();
        }
        else
        {
            return;
        }
        
        try
        {
            BufferedReader csvRead = new BufferedReader(new FileReader(loadedFile));
            String row;
            while ( (row = csvRead.readLine()) != null)
                {
                        String[] data = row.split(",");

                        // processes the read data and adds it onto the list
                        Password temp = new Password<>(data[0], data[1], null);
                        
                        listCopy.add(temp);
                }

                csvRead.close();

            csvRead.close();
        } 
        catch (FileNotFoundException ex)
        {
            return;
        } 
        catch (IOException ex)
        {
            return;
        }

        refreshTable();
        clearFields();
    }//GEN-LAST:event_loadFileButtonActionPerformed

    private void saveFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveFileButtonActionPerformed
    {//GEN-HEADEREND:event_saveFileButtonActionPerformed
        try
        {
            JFileChooser chooser = new JFileChooser();
            int retval = chooser.showSaveDialog(null);
            File savedFile;
            if (retval == JFileChooser.APPROVE_OPTION)
            {
                savedFile = chooser.getSelectedFile();
                
                if (!savedFile.isFile())
                {
                    savedFile.createNewFile();
                }
            }
            else
            {
                return;
            }   
            FileWriter csvWrite = new FileWriter(savedFile);
            
            for (int i = 0; i < listCopy.getSize(); i++)
            {
                Password temp = listCopy.retrieveAt(i);
                
                // description
                csvWrite.append(temp.getDescription());
                csvWrite.append(",");
                // password
                csvWrite.append(temp.getPassword());
                csvWrite.append("\n");
            }
            
            csvWrite.flush();
            csvWrite.close();
        } 
        catch (IOException ex)
        {
            
        } 
        
        refreshTable();
        clearFields();
    }//GEN-LAST:event_saveFileButtonActionPerformed

    private static int instances = 0;
    public static FortitudeMainPage createSingleInstance()
    {
        if (instances == 0)
        {
            instances++;
            return new FortitudeMainPage();
        }
        
        System.out.println("An instance of this page is currently active.");
        return null;
    }
    
    private void refreshTable()
    {
        int size = listCopy.getSize();
        Password[] temp = new Password[size];
        
        for (int i = 0; i < size; i++)
        {
            temp[i] = listCopy.retrieveAt(i);
        }
        
        String[][] data = new String[size][2];
        String[] columns = {"Description", "Password"};
        
        for (int i = 0; i < size; i++)
        {
            data[i][0] = listCopy.retrieveAt(i).getDescription();
            data[i][1] = "Select entry to view...";
        }
        
        DefaultTableModel model = new DefaultTableModel(data, columns);
        passwordTable.setModel(model);
    }
    
    private void clearFields()
    {
        descriptionField.setText("");
        passwordField.setText("");
    }
    
    private int row_target;
    PasswordList listCopy = Fortitude.passwordLists;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEntryRandCharButton;
    private javax.swing.JButton addEntryWordListChar;
    private javax.swing.JButton copyClipboardButton;
    private javax.swing.JButton deleteEntryButton;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton loadFileButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JTable passwordTable;
    private javax.swing.JButton resetAllPassButton;
    private javax.swing.JButton resetPassRandCharButton;
    private javax.swing.JButton resetPassWordListButton;
    private javax.swing.JButton saveFileButton;
    private javax.swing.JButton updateDescButton;
    // End of variables declaration//GEN-END:variables
}
