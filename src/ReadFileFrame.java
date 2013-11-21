
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AS
 */
public class ReadFileFrame extends javax.swing.JPanel {

    /**
     * Creates new form ReadFileFrame
     */
    public ReadFileFrame() {
        initComponents();
        ReadShow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public GetSetPath file = new GetSetPath();
    public GetSetWord word = new GetSetWord();
    
    private void ReadShow() {
        StyledDocument doc = jTextPane1.getStyledDocument();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file.getFilePath()));
            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                doc.insertString(doc.getLength(), line + "\n", null);
            }
            br.close();
        } 
        catch (IOException | BadLocationException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
        word.setWord(jTextPane1.getText());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
