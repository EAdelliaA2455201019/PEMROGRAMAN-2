/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PERTEMUAN_8_GUI;

/**
 *
 * @author adellia
 */
// SEBAGAI FORM CLASS ANAK DARI javax.swing.JFrame
public class CATATAN__KEUANGAN extends javax.swing.JFrame {
    private double saldo = 0.0;
    private java.util.ArrayList<String> transaksi = new java.util.ArrayList<>();

    /**
     *
     */
    public CATATAN__KEUANGAN() {
        initComponents();
        // MEMBUAT IDENTITAS DARI SEBUAH APLIKASI
       this.setTitle ("CATATAN PENGELUARAN UANG");
       this.setLocationRelativeTo(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        popupMenu1 = new java.awt.PopupMenu();
        body = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        label_kronologi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_transaksi = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        radiobutton_pemasukan = new javax.swing.JRadioButton();
        radiobutton_pengeluaran = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        label_kebutuhan = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        label_jenis_transaksi = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        label_nominal_uang = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        combo_box_kebutuhan = new javax.swing.JComboBox<>();
        button_save = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        label_tgl_kejadian = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        button_riwayat = new javax.swing.JButton();
        button_kelola_akun = new javax.swing.JButton();
        button_analisis = new javax.swing.JButton();
        button_dashboard = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setText("DASHBOARD");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 180, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        label_kronologi.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        label_kronologi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PERTEMUAN_8_GUI/kronologi.gif"))); // NOI18N
        label_kronologi.setText("Kronologi           :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_kronologi)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_kronologi)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        body.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 170, 40));

        table_transaksi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        table_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "Transaksi", "Nominal", "Kebutuhan", "Deskripsi", "Aksi"
            }
        ));
        jScrollPane2.setViewportView(table_transaksi);

        body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 500, 430));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel6.setText("TRANSAKSI TERBARU");
        body.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        radiobutton_pemasukan.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        radiobutton_pemasukan.setText("Pemasukan");
        radiobutton_pemasukan.setBorder(null);
        radiobutton_pemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobutton_pemasukanActionPerformed(evt);
            }
        });

        radiobutton_pengeluaran.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        radiobutton_pengeluaran.setText("Pengeluaran");
        radiobutton_pengeluaran.setBorder(null);
        radiobutton_pengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobutton_pengeluaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radiobutton_pemasukan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radiobutton_pengeluaran, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(radiobutton_pemasukan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiobutton_pengeluaran)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        body.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 150, 50));

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        label_kebutuhan.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        label_kebutuhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PERTEMUAN_8_GUI/kebutuhan.gif"))); // NOI18N
        label_kebutuhan.setText("Kebutuhan          :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_kebutuhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_kebutuhan)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        body.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        label_jenis_transaksi.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        label_jenis_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PERTEMUAN_8_GUI/jenis_transaksi.gif"))); // NOI18N
        label_jenis_transaksi.setText("Jenis Transaksi   :");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_jenis_transaksi)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_jenis_transaksi)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        body.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 170, 40));

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        label_nominal_uang.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        label_nominal_uang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PERTEMUAN_8_GUI/nominal_uang.gif"))); // NOI18N
        label_nominal_uang.setText("Nominal Uang      :");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_nominal_uang)
                .addGap(119, 119, 119))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_nominal_uang)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        body.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 170, 40));

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        combo_box_kebutuhan.setBackground(new java.awt.Color(255, 255, 204));
        combo_box_kebutuhan.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        combo_box_kebutuhan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menabung", "Makanan & Minuman", "Transportasi", "Tagihan", "Belanja Kebutuhan", "Lainnya" }));
        combo_box_kebutuhan.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        combo_box_kebutuhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box_kebutuhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo_box_kebutuhan, 0, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(combo_box_kebutuhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        body.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 150, 40));

        button_save.setBackground(new java.awt.Color(255, 204, 204));
        button_save.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        button_save.setText("save :p");
        button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saveActionPerformed(evt);
            }
        });
        body.add(button_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        label_tgl_kejadian.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        label_tgl_kejadian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PERTEMUAN_8_GUI/tanggal_kejadian.gif"))); // NOI18N
        label_tgl_kejadian.setText("Tanggal Kejadian  :");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_tgl_kejadian)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_tgl_kejadian)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        body.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 170, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addGap(14, 14, 14))
        );

        body.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 150, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        jTextField2.setBackground(new java.awt.Color(255, 255, 204));
        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        body.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        jFormattedTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jFormattedTextField1.setBorder(null);
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        body.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 150, 40));

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        button_riwayat.setBackground(new java.awt.Color(255, 255, 204));
        button_riwayat.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\riwayat.gif")); // NOI18N
        button_riwayat.setText("RIWAYAT");
        button_riwayat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_riwayatActionPerformed(evt);
            }
        });

        button_kelola_akun.setBackground(new java.awt.Color(255, 255, 204));
        button_kelola_akun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PERTEMUAN_8_GUI/kelola_akun.gif"))); // NOI18N
        button_kelola_akun.setText("KELOLA AKUN");
        button_kelola_akun.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_kelola_akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kelola_akunActionPerformed(evt);
            }
        });

        button_analisis.setBackground(new java.awt.Color(255, 255, 204));
        button_analisis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PERTEMUAN_8_GUI/analisis.gif"))); // NOI18N
        button_analisis.setText("ANALISIS");
        button_analisis.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_analisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_analisisActionPerformed(evt);
            }
        });

        button_dashboard.setBackground(new java.awt.Color(255, 255, 204));
        button_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PERTEMUAN_8_GUI/dashboard.gif"))); // NOI18N
        button_dashboard.setText("DASHBOARD");
        button_dashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_riwayat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(button_analisis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(button_kelola_akun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(button_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(button_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_analisis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(button_kelola_akun, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(413, Short.MAX_VALUE))))
        );

        body.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 170, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_saveActionPerformed

    private void radiobutton_pemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_pemasukanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobutton_pemasukanActionPerformed

    private void radiobutton_pengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobutton_pengeluaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobutton_pengeluaranActionPerformed

    private void combo_box_kebutuhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_box_kebutuhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_box_kebutuhanActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void button_riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_riwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_riwayatActionPerformed

    private void button_kelola_akunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kelola_akunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_kelola_akunActionPerformed

    private void button_analisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_analisisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_analisisActionPerformed

    private void button_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_dashboardActionPerformed

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
            java.util.logging.Logger.getLogger(CATATAN__KEUANGAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CATATAN__KEUANGAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CATATAN__KEUANGAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CATATAN__KEUANGAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CATATAN__KEUANGAN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton button_analisis;
    private javax.swing.JButton button_dashboard;
    private javax.swing.JButton button_kelola_akun;
    private javax.swing.JButton button_riwayat;
    private javax.swing.JButton button_save;
    private javax.swing.JComboBox<String> combo_box_kebutuhan;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel label_jenis_transaksi;
    private javax.swing.JLabel label_kebutuhan;
    private javax.swing.JLabel label_kronologi;
    private javax.swing.JLabel label_nominal_uang;
    private javax.swing.JLabel label_tgl_kejadian;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JRadioButton radiobutton_pemasukan;
    private javax.swing.JRadioButton radiobutton_pengeluaran;
    private javax.swing.JTable table_transaksi;
    // End of variables declaration//GEN-END:variables
}
