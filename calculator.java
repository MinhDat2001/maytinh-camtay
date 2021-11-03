/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maytinh;

import java.util.Stack;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author datd6
 */
public class calculator extends javax.swing.JFrame implements Runnable{
    private String preAns="";
    private String preExpression;
    private boolean TinhLai=false;
    private Stack<String> st1=new Stack<>();
    private Stack<String> st2=new Stack<>();
    
    private tinhtoan tt=new tinhtoan();
    /**
     * Creates new form calculator
     */
    public calculator() {
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

        jButton10 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        txtBieuThuc = new javax.swing.JTextField();
        txtKetQua = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nhieuHon = new javax.swing.JButton();
        sangTrai = new javax.swing.JButton();
        sangPhai = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Thoat = new javax.swing.JButton();
        btnDate = new javax.swing.JButton();
        btnCalendar = new javax.swing.JButton();
        GiaiThua = new javax.swing.JButton();
        luyThua = new javax.swing.JButton();
        chiaDu = new javax.swing.JButton();
        Can = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        PhanTram = new javax.swing.JButton();
        moNgoac = new javax.swing.JButton();
        dongNgoac = new javax.swing.JButton();
        hangSoPI = new javax.swing.JButton();
        hangSoE = new javax.swing.JButton();
        LuuVaoX = new javax.swing.JButton();
        So7 = new javax.swing.JButton();
        So8 = new javax.swing.JButton();
        So9 = new javax.swing.JButton();
        xoaPhanTu = new javax.swing.JButton();
        xoaHet = new javax.swing.JButton();
        So4 = new javax.swing.JButton();
        So5 = new javax.swing.JButton();
        So6 = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        So1 = new javax.swing.JButton();
        So2 = new javax.swing.JButton();
        So3 = new javax.swing.JButton();
        cong = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        tram = new javax.swing.JButton();
        So0 = new javax.swing.JButton();
        dauCham = new javax.swing.JButton();
        KQtruoc = new javax.swing.JButton();
        ketQua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JlbDate = new javax.swing.JLabel();

        jButton10.setText("jButton10");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBieuThuc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtKetQua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtKetQua.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtBieuThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBieuThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(8, 5, 5, 5));

        nhieuHon.setBackground(new java.awt.Color(93, 141, 212));
        nhieuHon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nhieuHon.setText("more");
        nhieuHon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhieuHonActionPerformed(evt);
            }
        });
        jPanel2.add(nhieuHon);

        sangTrai.setBackground(new java.awt.Color(147, 147, 161));
        sangTrai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sangTrai.setText("<-");
        sangTrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sangTraiActionPerformed(evt);
            }
        });
        jPanel2.add(sangTrai);

        sangPhai.setBackground(new java.awt.Color(147, 147, 161));
        sangPhai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sangPhai.setText("->");
        sangPhai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sangPhaiActionPerformed(evt);
            }
        });
        jPanel2.add(sangPhai);

        X.setBackground(new java.awt.Color(147, 147, 161));
        X.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(X);

        Thoat.setBackground(new java.awt.Color(255, 153, 204));
        Thoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Thoat.setText("Exit");
        Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatActionPerformed(evt);
            }
        });
        jPanel2.add(Thoat);

        btnDate.setBackground(new java.awt.Color(147, 147, 161));
        btnDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDate.setText("date");
        btnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateActionPerformed(evt);
            }
        });
        jPanel2.add(btnDate);

        btnCalendar.setBackground(new java.awt.Color(147, 147, 161));
        btnCalendar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalendar.setText("calendar");
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCalendar);

        GiaiThua.setBackground(new java.awt.Color(147, 147, 161));
        GiaiThua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GiaiThua.setText("!");
        GiaiThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(GiaiThua);

        luyThua.setBackground(new java.awt.Color(147, 147, 161));
        luyThua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        luyThua.setText("^");
        luyThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(luyThua);

        chiaDu.setBackground(new java.awt.Color(147, 147, 161));
        chiaDu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chiaDu.setText(":");
        chiaDu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(chiaDu);

        Can.setBackground(new java.awt.Color(147, 147, 161));
        Can.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Can.setText("sqrt(");
        Can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(Can);

        sin.setBackground(new java.awt.Color(147, 147, 161));
        sin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sin.setText("sin(");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(sin);

        cos.setBackground(new java.awt.Color(147, 147, 161));
        cos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cos.setText("cos(");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(cos);

        tan.setBackground(new java.awt.Color(147, 147, 161));
        tan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tan.setText("tan(");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(tan);

        PhanTram.setBackground(new java.awt.Color(147, 147, 161));
        PhanTram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PhanTram.setText("%");
        PhanTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(PhanTram);

        moNgoac.setBackground(new java.awt.Color(147, 147, 161));
        moNgoac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        moNgoac.setText("(");
        moNgoac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(moNgoac);

        dongNgoac.setBackground(new java.awt.Color(147, 147, 161));
        dongNgoac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dongNgoac.setText(")");
        dongNgoac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(dongNgoac);

        hangSoPI.setBackground(new java.awt.Color(147, 147, 161));
        hangSoPI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hangSoPI.setText("pi");
        hangSoPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(hangSoPI);

        hangSoE.setBackground(new java.awt.Color(147, 147, 161));
        hangSoE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hangSoE.setText("e");
        hangSoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(hangSoE);

        LuuVaoX.setBackground(new java.awt.Color(147, 147, 161));
        LuuVaoX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LuuVaoX.setText("m(X)");
        LuuVaoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuVaoXActionPerformed(evt);
            }
        });
        jPanel2.add(LuuVaoX);

        So7.setBackground(new java.awt.Color(205, 205, 190));
        So7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        So7.setText("7");
        So7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(So7);

        So8.setBackground(new java.awt.Color(205, 205, 190));
        So8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        So8.setText("8");
        So8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(So8);

        So9.setBackground(new java.awt.Color(205, 205, 190));
        So9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        So9.setText("9");
        So9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(So9);

        xoaPhanTu.setBackground(new java.awt.Color(220, 220, 134));
        xoaPhanTu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        xoaPhanTu.setText("DEL");
        xoaPhanTu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaPhanTuActionPerformed(evt);
            }
        });
        jPanel2.add(xoaPhanTu);

        xoaHet.setBackground(new java.awt.Color(220, 220, 134));
        xoaHet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        xoaHet.setText("AC");
        xoaHet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaHetActionPerformed(evt);
            }
        });
        jPanel2.add(xoaHet);

        So4.setBackground(new java.awt.Color(205, 205, 190));
        So4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        So4.setText("4");
        So4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(So4);

        So5.setBackground(new java.awt.Color(205, 205, 190));
        So5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        So5.setText("5");
        So5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(So5);

        So6.setBackground(new java.awt.Color(205, 205, 190));
        So6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        So6.setText("6");
        So6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(So6);

        nhan.setBackground(new java.awt.Color(205, 205, 190));
        nhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nhan.setText("*");
        nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(nhan);

        chia.setBackground(new java.awt.Color(205, 205, 190));
        chia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chia.setText("/");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(chia);

        So1.setBackground(new java.awt.Color(205, 205, 190));
        So1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        So1.setText("1");
        So1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(So1);

        So2.setBackground(new java.awt.Color(205, 205, 190));
        So2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        So2.setText("2");
        So2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(So2);

        So3.setBackground(new java.awt.Color(205, 205, 190));
        So3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        So3.setText("3");
        So3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(So3);

        cong.setBackground(new java.awt.Color(205, 205, 190));
        cong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cong.setText("+");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(cong);

        tru.setBackground(new java.awt.Color(205, 205, 190));
        tru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tru.setText("-");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(tru);

        tram.setBackground(new java.awt.Color(205, 205, 190));
        tram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tram.setText("00");
        tram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(tram);

        So0.setBackground(new java.awt.Color(205, 205, 190));
        So0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        So0.setText("0");
        So0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(So0);

        dauCham.setBackground(new java.awt.Color(205, 205, 190));
        dauCham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dauCham.setText(".");
        dauCham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
        });
        jPanel2.add(dauCham);

        KQtruoc.setBackground(new java.awt.Color(205, 205, 190));
        KQtruoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        KQtruoc.setText("PA");
        KQtruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KQtruocActionPerformed(evt);
            }
        });
        jPanel2.add(KQtruoc);

        ketQua.setBackground(new java.awt.Color(205, 205, 190));
        ketQua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ketQua.setText("=");
        ketQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketQuaActionPerformed(evt);
            }
        });
        jPanel2.add(ketQua);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CALCULATOR");

        JlbDate.setBackground(new java.awt.Color(255, 0, 102));
        JlbDate.setDisplayedMnemonic(getExtendedState());
        JlbDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JlbDate.setForeground(new java.awt.Color(0, 51, 51));
        JlbDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlbDate.setText("HELLO");
        JlbDate.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
//    private void dangTinh(){
//        String res="";
//        String duoi="";
//        if(tt.tinh(tt.ghepKhongConTro(st1, st2))=="ERROR"){
//            res+="ERROR";
//        }
//        else{
//            double kq=Double.parseDouble(tt.tinh(tt.ghepKhongConTro(st1, st2)));
//            kq=Math.round(kq*1000000);//lam tron den chu so thap phan so 6
//            kq/=1000000;
//            if(kq>1000000000){ // neu qua lon thi in ra *10^6
//                kq/=1000000;
//                kq=Math.round(kq*1000);//lam tron den chu so thap phan so 3
//                kq/=1000;
//                duoi+="*10^6";
//            }
//            if((long)(kq)==kq){
//                res=Long.toString((long)(kq));
//            }
//            else res=Double.toString(kq);
//        }
//        res+=duoi;
//        txtKetQua.setText(res);
//    }

    private void So2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_So2ActionPerformed
        // TODO add your handling code here:
        String cmd=evt.getActionCommand();
        if(!TinhLai){
            st1.push(cmd);
            txtBieuThuc.setText(tt.ghepCoConTro(st1, st2));
        }
        else{
            st1.clear();
            st2.clear();
            st1.push(cmd);
            txtBieuThuc.setText(tt.ghepCoConTro(st1, st2));
            txtKetQua.setText("");
            TinhLai=false;
        }
        //dangTinh();
    }//GEN-LAST:event_So2ActionPerformed
    // xoa di mot phan tu
    private void xoaPhanTuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaPhanTuActionPerformed
        // TODO add your handling code here:
        if(st1.size()>0){
            st1.pop();
        }
        txtBieuThuc.setText(tt.ghepCoConTro(st1, st2));
//        dangTinh();
    }//GEN-LAST:event_xoaPhanTuActionPerformed
    //xoa het tat ca bieu thuc
    private void xoaHetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaHetActionPerformed
        // TODO add your handling code here:
        st1.clear();
        st2.clear();
        txtBieuThuc.setText("");
        txtKetQua.setText("");
    }//GEN-LAST:event_xoaHetActionPerformed
    // thoat khoi chuong trinh
    private void ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ThoatActionPerformed
    // hien thi ket qua
    private void ketQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketQuaActionPerformed
        // TODO add your handling code here
        String res="";
        String duoi="";
        preExpression=tt.ghepKhongConTro(st1, st2)+"|";
        if(tt.tinh(tt.ghepKhongConTro(st1, st2))=="ERROR"){
            res+="ERROR";
        }
        else{
            double kq=Double.parseDouble(tt.tinh(tt.ghepKhongConTro(st1, st2)));
            kq=Math.round(kq*1000000);//lam tron den chu so thap phan so 6
            kq/=1000000;
            if(kq>1000000000){ // neu qua lon thi in ra *10^6
                kq/=1000000;
                kq=Math.round(kq*1000);//lam tron den chu so thap phan so 3
                kq/=1000;
                duoi+="*10^6";
            }
            if((long)(kq)==kq){
                res=Long.toString((long)(kq));
            }
            else res=Double.toString(kq);
        }
        res+=duoi;
        txtKetQua.setText(res);
        preAns=res;
        TinhLai=true;
    }//GEN-LAST:event_ketQuaActionPerformed
    // hien thi ket qua truoc do
    private void KQtruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KQtruocActionPerformed
        // TODO add your handling code here:
        txtKetQua.setText(preAns);
        txtBieuThuc.setText(preExpression);
    }//GEN-LAST:event_KQtruocActionPerformed
    // di chuyen con tro sang phai
    private void sangPhaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sangPhaiActionPerformed
        // TODO add your handling code here:
        if(st2.size()>0){
            st1.push(st2.pop());
        }
        txtBieuThuc.setText(tt.ghepCoConTro(st1, st2));
    }//GEN-LAST:event_sangPhaiActionPerformed
    // di chuyen con tro sang ben trai
    private void sangTraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sangTraiActionPerformed
        // TODO add your handling code here:
        if(st1.size()>0){
            st2.push(st1.pop());
        }
        txtBieuThuc.setText(tt.ghepCoConTro(st1, st2));
    }//GEN-LAST:event_sangTraiActionPerformed
    // hien thi ngay thang nam
    private void btnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateActionPerformed
        // TODO add your handling code here:
        
        if(JlbDate.getText().equalsIgnoreCase("hello")){
            LocalDate lcDate=LocalDate.now();
            String date[]=lcDate.toString().split("-");
            JlbDate.setText((date[2]+"-"+date[1]+"-"+date[0]));
        }
        else{
            JlbDate.setText("Hello");
        }
    }//GEN-LAST:event_btnDateActionPerformed
    // luu ket qua vao bien X
    private void LuuVaoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuVaoXActionPerformed
        // TODO add your handling code here:
        if(txtKetQua.getText().length()>0){
            tt.setX(Double.parseDouble(txtKetQua.getText()));
            txtBieuThuc.setText(txtKetQua.getText()+" -> X");
        }
    }//GEN-LAST:event_LuuVaoXActionPerformed

    private void nhieuHonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhieuHonActionPerformed
        // TODO add your handling code here:
        new more().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nhieuHonActionPerformed

    private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
        // TODO add your handling code here:
        new calendars().setVisible(true);
    }//GEN-LAST:event_btnCalendarActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Can;
    private javax.swing.JButton GiaiThua;
    private javax.swing.JLabel JlbDate;
    private javax.swing.JButton KQtruoc;
    private javax.swing.JButton LuuVaoX;
    private javax.swing.JButton PhanTram;
    private javax.swing.JButton So0;
    private javax.swing.JButton So1;
    private javax.swing.JButton So2;
    private javax.swing.JButton So3;
    private javax.swing.JButton So4;
    private javax.swing.JButton So5;
    private javax.swing.JButton So6;
    private javax.swing.JButton So7;
    private javax.swing.JButton So8;
    private javax.swing.JButton So9;
    private javax.swing.JButton Thoat;
    private javax.swing.JButton X;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnDate;
    private javax.swing.JButton chia;
    private javax.swing.JButton chiaDu;
    private javax.swing.JButton cong;
    private javax.swing.JButton cos;
    private javax.swing.JButton dauCham;
    private javax.swing.JButton dongNgoac;
    private javax.swing.JButton hangSoE;
    private javax.swing.JButton hangSoPI;
    private javax.swing.JButton jButton10;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ketQua;
    private javax.swing.JButton luyThua;
    private javax.swing.JButton moNgoac;
    private javax.swing.JButton nhan;
    private javax.swing.JButton nhieuHon;
    private javax.swing.JButton sangPhai;
    private javax.swing.JButton sangTrai;
    private javax.swing.JButton sin;
    private javax.swing.JButton tan;
    private javax.swing.JButton tram;
    private javax.swing.JButton tru;
    private javax.swing.JTextField txtBieuThuc;
    private javax.swing.JTextField txtKetQua;
    private javax.swing.JButton xoaHet;
    private javax.swing.JButton xoaPhanTu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
