package hospitalms;

import girisCesitleri.Data;
import girisCesitleri.Doktor;
import girisCesitleri.Hasta;
import girisCesitleri.Ilac;
import girisCesitleri.Randevular;
import girisCesitleri.Users;
import girisCesitleri.Yonetici;
import girisCesitleri.labSonuclari;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tcArea = new javax.swing.JLabel();
        passArea = new javax.swing.JLabel();
        passwordArea = new javax.swing.JPasswordField();
        usernameArea = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        signinBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("HOSPITAL MANAGEMENT SYSTEM");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("HMS");

        tcArea.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tcArea.setText("TC KİMLİK NO");

        passArea.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        passArea.setText("ŞİFRE");

        usernameArea.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        loginBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        signinBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        signinBtn.setText("SIGN IN");
        signinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passArea, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcArea, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(loginBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(signinBtn)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameArea)
                            .addComponent(passwordArea))
                        .addGap(10, 10, 10))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameArea)
                    .addComponent(tcArea, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passArea, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordArea, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(signinBtn))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("MURAT KARADENİZ HASTANE OTOMASYON SİSTEMİ");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setText("1306200011");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(35, 35, 35))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        int sayac = 0;
        String kullaniciadi = usernameArea.getText();
        String sifre = passwordArea.getText();
        if (kullaniciadi.equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen TC KİMLİK NO giriniz...");
        } else if (sifre.equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen parola giriniz...");
        } else {

            for (int i = 0; i < Data.usersArrayList.size(); i++) {

                if (kullaniciadi.equals(Data.usersArrayList.get(i).getTc())) {
                    if (sifre.equals(Data.usersArrayList.get(i).getPassword())) {
                        new HomeMenu().setVisible(true);
                        this.dispose();
                        sayac = 1;
                        break;
                    }
                }
            }
            if (sayac == 0) {
                JOptionPane.showMessageDialog(null, "Hesap Bulunamadı.");
                usernameArea.setText("");
                passwordArea.setText("");
            }

        }


    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked

    }//GEN-LAST:event_loginBtnMouseClicked

    private void signinBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinBtnMouseClicked
        new SignIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signinBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Users user = new Hasta("password", "Murat Karadeniz", "hasta", "00000000000", "Baş Ağrısı");
                Users user1 = new Doktor("sifre123", "Ali Turhan", "doktor", "11111111111", "Cerrahi");
                Users user2 = new Hasta("deneme321", "Can Mert", "hasta", "12345678912", "Omurga Kırığı");
                Users user3 = new Hasta("1234567", "Ayşe Öz", "hasta", "14785236978", "Mide Bulantısı");
                Users user4 = new Doktor("1a2b3c4d5e", "Merve Çiçek", "doktor", "987456321753", "İç Hastalıkları");
                Users user5 = new Yonetici("yonetici123", "Mert Karaduman", "doktor", "42561785499", "Müdür");
                Users user6 = new Hasta("admin", "admin", "admin", "admin", "admin");
                Ilac ilac1 = new Ilac("Majezik", "50");
                Ilac ilac2 = new Ilac("Dolarex", "150");
                Ilac ilac3 = new Ilac("Parol", "43");
                Ilac ilac4 = new Ilac("Serum", "94");
                Randevular randevu = new Randevular("Cerrahi", "Apandisit", "Selahattin Koçoğlu", "05.10.2023");
                Randevular randevu1 = new Randevular("Dahiliye", "Mide Ağrısı", "Sedat Akışık", "01.03.2023");
                Randevular randevu2 = new Randevular("Kardiyoloji", "Üfürüm", "Serpil Denkel", "02.05.2023");
                Randevular randevu3 = new Randevular("Çocuk Hastalıkları", "Ateş", "Ulus Sözeri", "01.01.2023");
                labSonuclari lab = new labSonuclari("Haşim Nalbantoğlu", "Çıktı");
                labSonuclari lab1 = new labSonuclari("Belma Akyürek", "Çıktı");
                labSonuclari lab2 = new labSonuclari("Gürhan Öymen", "Çıkmadı");
                labSonuclari lab3 = new labSonuclari("Hanefi Düşenkalkar", "Çıkmadı");
                labSonuclari lab4 = new labSonuclari("Nil Akaydın", "Çıktı");
                Data.usersArrayList.add(user);
                Data.usersArrayList.add(user1);
                Data.usersArrayList.add(user2);
                Data.usersArrayList.add(user3);
                Data.usersArrayList.add(user4);
                Data.usersArrayList.add(user5);
                Data.usersArrayList.add(user6);
                Data.ilacArrayList.add(ilac1);
                Data.ilacArrayList.add(ilac2);
                Data.ilacArrayList.add(ilac3);
                Data.ilacArrayList.add(ilac4);
                Data.randevuArrayList.add(randevu);
                Data.randevuArrayList.add(randevu1);
                Data.randevuArrayList.add(randevu2);
                Data.randevuArrayList.add(randevu3);
                Data.labArrayList.add(lab);
                Data.labArrayList.add(lab1);
                Data.labArrayList.add(lab2);
                Data.labArrayList.add(lab3);
                Data.labArrayList.add(lab4);

                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passArea;
    private javax.swing.JPasswordField passwordArea;
    private javax.swing.JButton signinBtn;
    private javax.swing.JLabel tcArea;
    private javax.swing.JTextField usernameArea;
    // End of variables declaration//GEN-END:variables
}
