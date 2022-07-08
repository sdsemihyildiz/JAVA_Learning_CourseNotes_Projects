
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CalisanEkrani extends javax.swing.JDialog {
    DefaultTableModel model;
    CalisanIslemleri islemler = new CalisanIslemleri();
    
    
    
    
   
    public CalisanEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel)calisan_tablosu.getModel();
        calisanGoruntule();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calisan_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        dep_alani = new javax.swing.JTextField();
        maas_alani = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        calisan_ekle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        calisan_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ad", "Soyad", "Departman", "Maaş"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calisan_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calisan_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calisan_tablosu);

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Ad:");

        jLabel2.setText("Soyad:");

        jLabel3.setText("Departman:");

        jLabel4.setText("Maaş:");

        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));

        calisan_ekle.setText("Yeni Çalışan Ekle");
        calisan_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calisan_ekleActionPerformed(evt);
            }
        });

        guncelle.setText("Çalışan Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setText("Çalışan Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arama_cubugu)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(maas_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(dep_alani)
                                    .addComponent(ad_alani)
                                    .addComponent(soyad_alani)))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calisan_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ad_alani))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(soyad_alani)
                    .addComponent(calisan_ekle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dep_alani)
                    .addComponent(guncelle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maas_alani)
                    .addComponent(sil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr = 
                new TableRowSorter<DefaultTableModel>(model);
        
     calisan_tablosu.setRowSorter(tr);
     
     tr.setRowFilter(RowFilter.regexFilter(ara));
     
     //tabloyu filtrelemiş olduk
        
        
        
        
    }
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        
        String ara = arama_cubugu.getText();
        
        dinamikAra(ara);
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_arama_cubuguKeyReleased

    
    private void calisan_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calisan_ekleActionPerformed
        mesaj_yazisi.setText("");
        String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String departman = dep_alani.getText();
        String maas = maas_alani.getText();
        
        islemler.calisanEkle(ad,soyad,departman,maas);
        
        calisanGoruntule();
        mesaj_yazisi.setText("Yeni Çalışan başarıyla eklendi...");
        
        
        
        
        
    }//GEN-LAST:event_calisan_ekleActionPerformed

    private void calisan_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calisan_tablosuMouseClicked
        
        int selectedrow = calisan_tablosu.getSelectedRow();
        
        ad_alani.setText(model.getValueAt(selectedrow,1).toString());
        soyad_alani.setText(model.getValueAt(selectedrow,2).toString());
        dep_alani.setText(model.getValueAt(selectedrow,3).toString());
        maas_alani.setText(model.getValueAt(selectedrow,4).toString());
        
        
    }//GEN-LAST:event_calisan_tablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
       
        
        
        String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String departman = dep_alani.getText();
        String maas = maas_alani.getText();
        
        int selectedRow = calisan_tablosu.getSelectedRow();
        
        if(selectedRow==-1){
            
            if(model.getRowCount()==0){
                
                mesaj_yazisi.setText("Çalışanlar tablosu şu anda boş...");
                
                
            }else{
                mesaj_yazisi.setText("Lütfen güncellenecek bir çalışan seçin...");
                
            }
            
            
        }
        else{
            
            int id = (int)model.getValueAt(selectedRow, 0);
            
            islemler.calisanGuncelle(id, soyad, soyad, departman, maas);
            
            calisanGoruntule();
            mesaj_yazisi.setText("Çalışan başarıyla güncellendi...");
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        
        mesaj_yazisi.setText("");
        int selectedRow = calisan_tablosu.getSelectedRow();
        
        if(selectedRow==-1){
            
            if(model.getRowCount()==0){
                
                mesaj_yazisi.setText("Çalışanlar tablosu şu anda boş...");
                
                
            }else{
                mesaj_yazisi.setText("Lütfen silinecek bir çalışan seçin...");
                
            }
            
            
        }
        else{
            
            int id = (int)model.getValueAt(selectedRow, 0);
            
            islemler.calisanSil(id);
            calisanGoruntule();
            mesaj_yazisi.setText("Çalışan başarıyla silindi...");
            
            
        }
        
    }//GEN-LAST:event_silActionPerformed

    
   public void calisanGoruntule(){
       
       model.setRowCount(0); //çalışan tablomuz her seferinde boş olacak
       
       ArrayList<Calisan>calisanlar=new ArrayList<Calisan>();
       
       
       calisanlar= islemler.calisanlariGetir();
       
       if (calisanlar!= null) {
           
           for(Calisan calisan : calisanlar){
               Object [] eklenecek = {calisan.getId(),calisan.getAd(),
                   calisan.getSoyad(),calisan.getDepartman(),calisan.getMaas()};
               
               model.addRow(eklenecek);
               
               
               
           }
           
           
       }
       
       
       
       
       
       
       
       
       
       
   }
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalisanEkrani dialog = new CalisanEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton calisan_ekle;
    private javax.swing.JTable calisan_tablosu;
    private javax.swing.JTextField dep_alani;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField maas_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sil;
    private javax.swing.JTextField soyad_alani;
    // End of variables declaration//GEN-END:variables
}
