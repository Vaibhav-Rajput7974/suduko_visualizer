/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author hp
 */
import java.util.*;
import javax.swing.*;
public class NewJFrame1 extends javax.swing.JFrame {
    //JTextField j=new JTextField();

    /**
     * Creates new form NewJFrame1
     */
   /* int arr[][]={      { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
                       { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
                       { 0, 8, 7, 0, 0, 0, 0, 3, 1 }, 
                       { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
                       { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
                       { 0, 5, 0, 0, 9, 0, 6, 0, 0 }, 
                       { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
                       { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
                       { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
    
    */
    int arr[][]={   { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0, 0 }};
    
    public NewJFrame1() {
        initComponents();
        myInitComponents();
        
    }
    public void myInitComponents(){
        jField= new javax.swing.JTextField[9][9];
        jField[0][0]=jTextField1;        
        jField[1][0]=jTextField2;
        jField[2][0]=jTextField3;
        jField[3][0]=jTextField4;
        jField[4][0]=jTextField5;
        jField[5][0]=jTextField6;
        jField[6][0]=jTextField7;
        jField[7][0]=jTextField8;
        jField[8][0]=jTextField9;
        
        jField[0][1]=jTextField10;        
        jField[1][1]=jTextField11;
        jField[2][1]=jTextField12;
        jField[3][1]=jTextField13;
        jField[4][1]=jTextField14;
        jField[5][1]=jTextField15;
        jField[6][1]=jTextField16;
        jField[7][1]=jTextField17;
        jField[8][1]=jTextField18;
     
        jField[0][2]=jTextField19;        
        jField[1][2]=jTextField20;
        jField[2][2]=jTextField21;
        jField[3][2]=jTextField22;
        jField[4][2]=jTextField23;
        jField[5][2]=jTextField24;
        jField[6][2]=jTextField25;
        jField[7][2]=jTextField26;
        jField[8][2]=jTextField27;
      
        jField[0][3]=jTextField28;        
        jField[1][3]=jTextField29;
        jField[2][3]=jTextField30;
        jField[3][3]=jTextField31;
        jField[4][3]=jTextField32;
        jField[5][3]=jTextField33;
        jField[6][3]=jTextField34;
        jField[7][3]=jTextField35;
        jField[8][3]=jTextField36;
        
        jField[0][4]=jTextField37;        
        jField[1][4]=jTextField38;
        jField[2][4]=jTextField39;
        jField[3][4]=jTextField40;
        jField[4][4]=jTextField41;
        jField[5][4]=jTextField42;
        jField[6][4]=jTextField43;
        jField[7][4]=jTextField44;
        jField[8][4]=jTextField45;
        
        jField[0][5]=jTextField46;        
        jField[1][5]=jTextField47;
        jField[2][5]=jTextField48;
        jField[3][5]=jTextField49;
        jField[4][5]=jTextField50;
        jField[5][5]=jTextField51;
        jField[6][5]=jTextField52;
        jField[7][5]=jTextField53;
        jField[8][5]=jTextField54;
        
        jField[0][6]=jTextField55;        
        jField[1][6]=jTextField56;
        jField[2][6]=jTextField57;
        jField[3][6]=jTextField58;
        jField[4][6]=jTextField59;
        jField[5][6]=jTextField60;
        jField[6][6]=jTextField61;
        jField[7][6]=jTextField62;
        jField[8][6]=jTextField63;
        
        jField[0][7]=jTextField64;        
        jField[1][7]=jTextField65;
        jField[2][7]=jTextField66;
        jField[3][7]=jTextField67;
        jField[4][7]=jTextField68;
        jField[5][7]=jTextField69;
        jField[6][7]=jTextField70;
        jField[7][7]=jTextField71;
        jField[8][7]=jTextField72;
        
        
        jField[0][8]=jTextField73;        
        jField[1][8]=jTextField74;
        jField[2][8]=jTextField75;
        jField[3][8]=jTextField76;
        jField[4][8]=jTextField77;
        jField[5][8]=jTextField78;
        jField[6][8]=jTextField79;
        jField[7][8]=jTextField80;
        jField[8][8]=jTextField81;
        
    }
    public boolean Issafe(int row,int col,int value){
        for(int i=0;i<9;i++){
            if(arr[row][i] == value)
                return false;
        }
        
        for(int i=0;i<9;i++){
        if(arr[i][col] == value)
            return false;
        }
        
        int startrow=row-row%3;
        int startcol=col-col%3;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[startrow+i][startcol+j] == value){
                    return false;
                }
            }
        }
        return true;
        
    }
    public void Setvalue(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(arr[i][j] != 0){
                    jField[i][j].setBackground(new java.awt.Color(0, 255, 50));
                    jField[i][j].setText(""+arr[i][j]);
                }
                else{
                    jField[i][j].setText("");
                }
            }
        }
    }
    public void generate(){
        Random rand=new Random();
        int count_num=rand.nextInt((15-10)+1) + 10;
        
        while(count_num>0){
            int row=rand.nextInt((8)+1);
            int col=rand.nextInt((8)+1);
            for(int i=1;i<=9;i++){
                if(Issafe(row,col,i)){
                    count_num--;
                    arr[row][col]=i;
                    break;
                }
            }
        }
    }
    
    public boolean Solvesuduko(int row,int col){
        
        if(row == 8 && col == 9){
            return true;
        }
        //Setvalue();
        
        

        if(col == 9){
            row++;
            col=0;
        }
        if(arr[row][col] > 0){
            jField[row][col].setBackground(new java.awt.Color(0, 255, 50));
             jField[row][col].setText(""+arr[row][col]);
            return Solvesuduko(row,col+1);
        }
        
        for(int i=1;i<=9;i++){
            if(Issafe(row,col,i)){
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                
                arr[row][col]=i;jField[row][col].setText(""+arr[row][col]);
                if(Solvesuduko(row,col+1))
                    return true;
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                arr[row][col]=0;jField[row][col].setText("");
            }
        }
        return false;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        jTextField1.setAlignmentX(1.1F);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 0, 51));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setToolTipText("");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 0, 51));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setToolTipText("");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField3.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 0, 51));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setToolTipText("");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField4.setCaretColor(new java.awt.Color(204, 0, 0));
        jTextField4.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 0, 51));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setToolTipText("");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField5.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 0, 51));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setToolTipText("");
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField6.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 0, 51));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setToolTipText("");
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField7.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 0, 51));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setToolTipText("");
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField8.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 0, 51));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setToolTipText("");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField9.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 0, 51));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setToolTipText("");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 0, 51));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setToolTipText("");
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 0, 51));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setToolTipText("");
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 0, 51));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setToolTipText("");
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 0, 51));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setToolTipText("");
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 0, 51));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setToolTipText("");
        jTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 0, 51));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setToolTipText("");
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(255, 0, 51));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setToolTipText("");
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(255, 0, 51));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setToolTipText("");
        jTextField18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(255, 0, 51));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setToolTipText("");
        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField19.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(255, 0, 51));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setToolTipText("");
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(255, 0, 51));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setToolTipText("");
        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(255, 0, 51));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setToolTipText("");
        jTextField22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField22.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(255, 0, 51));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setToolTipText("");
        jTextField23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(255, 0, 51));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setToolTipText("");
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(255, 0, 51));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setToolTipText("");
        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jTextField26.setEditable(false);
        jTextField26.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(255, 0, 51));
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setToolTipText("");
        jTextField26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jTextField27.setEditable(false);
        jTextField27.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(255, 0, 51));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setToolTipText("");
        jTextField27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        jTextField28.setEditable(false);
        jTextField28.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(255, 0, 51));
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setToolTipText("");
        jTextField28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField28.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });

        jTextField29.setEditable(false);
        jTextField29.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(255, 0, 51));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setToolTipText("");
        jTextField29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField29.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jTextField30.setEditable(false);
        jTextField30.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(255, 0, 51));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setToolTipText("");
        jTextField30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField30.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jTextField31.setEditable(false);
        jTextField31.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField31.setForeground(new java.awt.Color(255, 0, 51));
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setToolTipText("");
        jTextField31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });

        jTextField32.setEditable(false);
        jTextField32.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField32.setForeground(new java.awt.Color(255, 0, 51));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setToolTipText("");
        jTextField32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField32.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });

        jTextField33.setEditable(false);
        jTextField33.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField33.setForeground(new java.awt.Color(255, 0, 51));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setToolTipText("");
        jTextField33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField33.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jTextField34.setEditable(false);
        jTextField34.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField34.setForeground(new java.awt.Color(255, 0, 51));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setToolTipText("");
        jTextField34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField34.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });

        jTextField35.setEditable(false);
        jTextField35.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField35.setForeground(new java.awt.Color(255, 0, 51));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setToolTipText("");
        jTextField35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField35.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });

        jTextField36.setEditable(false);
        jTextField36.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField36.setForeground(new java.awt.Color(255, 0, 51));
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setToolTipText("");
        jTextField36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField36.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });

        jTextField37.setEditable(false);
        jTextField37.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(255, 0, 51));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setToolTipText("");
        jTextField37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField37.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });

        jTextField38.setEditable(false);
        jTextField38.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(255, 0, 51));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setToolTipText("");
        jTextField38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField38.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });

        jTextField39.setEditable(false);
        jTextField39.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField39.setForeground(new java.awt.Color(255, 0, 51));
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setToolTipText("");
        jTextField39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField39.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });

        jTextField40.setEditable(false);
        jTextField40.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField40.setForeground(new java.awt.Color(255, 0, 51));
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setToolTipText("");
        jTextField40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField40.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });

        jTextField41.setEditable(false);
        jTextField41.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField41.setForeground(new java.awt.Color(255, 0, 51));
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setToolTipText("");
        jTextField41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField41.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });

        jTextField42.setEditable(false);
        jTextField42.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField42.setForeground(new java.awt.Color(255, 0, 51));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setToolTipText("");
        jTextField42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField42.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField42ActionPerformed(evt);
            }
        });

        jTextField43.setEditable(false);
        jTextField43.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(255, 0, 51));
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setToolTipText("");
        jTextField43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField43.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });

        jTextField44.setEditable(false);
        jTextField44.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField44.setForeground(new java.awt.Color(255, 0, 51));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setToolTipText("");
        jTextField44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField44.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField44ActionPerformed(evt);
            }
        });

        jTextField45.setEditable(false);
        jTextField45.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField45.setForeground(new java.awt.Color(255, 0, 51));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setToolTipText("");
        jTextField45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField45.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });

        jTextField46.setEditable(false);
        jTextField46.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField46.setForeground(new java.awt.Color(255, 0, 51));
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setToolTipText("");
        jTextField46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField46.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField46ActionPerformed(evt);
            }
        });

        jTextField47.setEditable(false);
        jTextField47.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField47.setForeground(new java.awt.Color(255, 0, 51));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setToolTipText("");
        jTextField47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField47.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField47ActionPerformed(evt);
            }
        });

        jTextField48.setEditable(false);
        jTextField48.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField48.setForeground(new java.awt.Color(255, 0, 51));
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setToolTipText("");
        jTextField48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField48.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        jTextField49.setEditable(false);
        jTextField49.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField49.setForeground(new java.awt.Color(255, 0, 51));
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setToolTipText("");
        jTextField49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField49.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField49ActionPerformed(evt);
            }
        });

        jTextField50.setEditable(false);
        jTextField50.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField50.setForeground(new java.awt.Color(255, 0, 51));
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.setToolTipText("");
        jTextField50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField50.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField50ActionPerformed(evt);
            }
        });

        jTextField51.setEditable(false);
        jTextField51.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField51.setForeground(new java.awt.Color(255, 0, 51));
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField51.setToolTipText("");
        jTextField51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField51.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField51ActionPerformed(evt);
            }
        });

        jTextField52.setEditable(false);
        jTextField52.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField52.setForeground(new java.awt.Color(255, 0, 51));
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField52.setToolTipText("");
        jTextField52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField52.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField52ActionPerformed(evt);
            }
        });

        jTextField53.setEditable(false);
        jTextField53.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField53.setForeground(new java.awt.Color(255, 0, 51));
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField53.setToolTipText("");
        jTextField53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField53.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField53ActionPerformed(evt);
            }
        });

        jTextField54.setEditable(false);
        jTextField54.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField54.setForeground(new java.awt.Color(255, 0, 51));
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField54.setToolTipText("");
        jTextField54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField54.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField54ActionPerformed(evt);
            }
        });

        jTextField55.setEditable(false);
        jTextField55.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField55.setForeground(new java.awt.Color(255, 0, 51));
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField55.setToolTipText("");
        jTextField55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField55.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField55ActionPerformed(evt);
            }
        });

        jTextField56.setEditable(false);
        jTextField56.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField56.setForeground(new java.awt.Color(255, 0, 51));
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField56.setToolTipText("");
        jTextField56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField56.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField56ActionPerformed(evt);
            }
        });

        jTextField57.setEditable(false);
        jTextField57.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField57.setForeground(new java.awt.Color(255, 0, 51));
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField57.setToolTipText("");
        jTextField57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField57.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField57ActionPerformed(evt);
            }
        });

        jTextField58.setEditable(false);
        jTextField58.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField58.setForeground(new java.awt.Color(255, 0, 51));
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField58.setToolTipText("");
        jTextField58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField58.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField58ActionPerformed(evt);
            }
        });

        jTextField59.setEditable(false);
        jTextField59.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField59.setForeground(new java.awt.Color(255, 0, 51));
        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField59.setToolTipText("");
        jTextField59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField59.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField59ActionPerformed(evt);
            }
        });

        jTextField60.setEditable(false);
        jTextField60.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField60.setForeground(new java.awt.Color(255, 0, 51));
        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField60.setToolTipText("");
        jTextField60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField60.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField60ActionPerformed(evt);
            }
        });

        jTextField61.setEditable(false);
        jTextField61.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField61.setForeground(new java.awt.Color(255, 0, 51));
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField61.setToolTipText("");
        jTextField61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField61.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField61ActionPerformed(evt);
            }
        });

        jTextField62.setEditable(false);
        jTextField62.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField62.setForeground(new java.awt.Color(255, 0, 51));
        jTextField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField62.setToolTipText("");
        jTextField62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField62.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField62ActionPerformed(evt);
            }
        });

        jTextField63.setEditable(false);
        jTextField63.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField63.setForeground(new java.awt.Color(255, 0, 51));
        jTextField63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField63.setToolTipText("");
        jTextField63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField63.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField63ActionPerformed(evt);
            }
        });

        jTextField64.setEditable(false);
        jTextField64.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField64.setForeground(new java.awt.Color(255, 0, 51));
        jTextField64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField64.setToolTipText("");
        jTextField64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField64.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField64ActionPerformed(evt);
            }
        });

        jTextField65.setEditable(false);
        jTextField65.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField65.setForeground(new java.awt.Color(255, 0, 51));
        jTextField65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField65.setToolTipText("");
        jTextField65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField65.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField65ActionPerformed(evt);
            }
        });

        jTextField66.setEditable(false);
        jTextField66.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField66.setForeground(new java.awt.Color(255, 0, 51));
        jTextField66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField66.setToolTipText("");
        jTextField66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField66.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField66ActionPerformed(evt);
            }
        });

        jTextField67.setEditable(false);
        jTextField67.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField67.setForeground(new java.awt.Color(255, 0, 51));
        jTextField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField67.setToolTipText("");
        jTextField67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField67.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField67ActionPerformed(evt);
            }
        });

        jTextField68.setEditable(false);
        jTextField68.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField68.setForeground(new java.awt.Color(255, 0, 51));
        jTextField68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField68.setToolTipText("");
        jTextField68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField68.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField68ActionPerformed(evt);
            }
        });

        jTextField69.setEditable(false);
        jTextField69.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField69.setForeground(new java.awt.Color(255, 0, 51));
        jTextField69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField69.setToolTipText("");
        jTextField69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField69.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField69ActionPerformed(evt);
            }
        });

        jTextField70.setEditable(false);
        jTextField70.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField70.setForeground(new java.awt.Color(255, 0, 51));
        jTextField70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField70.setToolTipText("");
        jTextField70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField70.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField70ActionPerformed(evt);
            }
        });

        jTextField71.setEditable(false);
        jTextField71.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField71.setForeground(new java.awt.Color(255, 0, 51));
        jTextField71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField71.setToolTipText("");
        jTextField71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField71.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField71ActionPerformed(evt);
            }
        });

        jTextField72.setEditable(false);
        jTextField72.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField72.setForeground(new java.awt.Color(255, 0, 51));
        jTextField72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField72.setToolTipText("");
        jTextField72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField72.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField72ActionPerformed(evt);
            }
        });

        jTextField73.setEditable(false);
        jTextField73.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField73.setForeground(new java.awt.Color(255, 0, 51));
        jTextField73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField73.setToolTipText("");
        jTextField73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField73.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField73ActionPerformed(evt);
            }
        });

        jTextField74.setEditable(false);
        jTextField74.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField74.setForeground(new java.awt.Color(255, 0, 51));
        jTextField74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField74.setToolTipText("");
        jTextField74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField74.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField74ActionPerformed(evt);
            }
        });

        jTextField75.setEditable(false);
        jTextField75.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField75.setForeground(new java.awt.Color(255, 0, 51));
        jTextField75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField75.setToolTipText("");
        jTextField75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField75.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField75ActionPerformed(evt);
            }
        });

        jTextField76.setEditable(false);
        jTextField76.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField76.setForeground(new java.awt.Color(255, 0, 51));
        jTextField76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField76.setToolTipText("");
        jTextField76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField76.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField76ActionPerformed(evt);
            }
        });

        jTextField77.setEditable(false);
        jTextField77.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField77.setForeground(new java.awt.Color(255, 0, 51));
        jTextField77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField77.setToolTipText("");
        jTextField77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField77.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField77ActionPerformed(evt);
            }
        });

        jTextField78.setEditable(false);
        jTextField78.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField78.setForeground(new java.awt.Color(255, 0, 51));
        jTextField78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField78.setToolTipText("");
        jTextField78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField78.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField78ActionPerformed(evt);
            }
        });

        jTextField79.setEditable(false);
        jTextField79.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField79.setForeground(new java.awt.Color(255, 0, 51));
        jTextField79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField79.setToolTipText("");
        jTextField79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField79.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField79ActionPerformed(evt);
            }
        });

        jTextField80.setEditable(false);
        jTextField80.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField80.setForeground(new java.awt.Color(255, 0, 51));
        jTextField80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField80.setToolTipText("");
        jTextField80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField80.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField80ActionPerformed(evt);
            }
        });

        jTextField81.setEditable(false);
        jTextField81.setFont(new java.awt.Font("Kozuka Gothic Pr6N H", 1, 48)); // NOI18N
        jTextField81.setForeground(new java.awt.Color(255, 0, 51));
        jTextField81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField81.setToolTipText("");
        jTextField81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTextField81.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField81ActionPerformed(evt);
            }
        });

        jButton1.setText("run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("generate ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(257, 257, 257))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(118, 118, 118)))))))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Setvalue();
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                if(Solvesuduko(0,0)){
                    javax.swing.JOptionPane.showMessageDialog (null, " Suduko Solved");
                }
                else
                {
                    javax.swing.JOptionPane.showMessageDialog (null, " Solution not possible");
                }
                     
                return null;
            }   
        };
        worker.execute();   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                arr[row][col]=0;
                jField[row][col].setBackground(new java.awt.Color(255, 255, 255));
            }
        }
        generate();
        Setvalue();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42ActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

    private void jTextField81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField81ActionPerformed

    private void jTextField80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField80ActionPerformed

    private void jTextField79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField79ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void jTextField78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField78ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void jTextField77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField77ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jTextField76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField76ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jTextField75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField75ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField74ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jTextField73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField73ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField72ActionPerformed

    private void jTextField71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField71ActionPerformed

    private void jTextField70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField70ActionPerformed

    private void jTextField69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField69ActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField68ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField67ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField66ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField65ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField64ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField63ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField62ActionPerformed

    private void jTextField61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField61ActionPerformed

    private void jTextField60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField60ActionPerformed

    private void jTextField59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField59ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField58ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField57ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField56ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField55ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField54ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField53ActionPerformed

    private void jTextField52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField52ActionPerformed

    private void jTextField51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField51ActionPerformed

    private void jTextField50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField50ActionPerformed

    private void jTextField49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField49ActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jTextField47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47ActionPerformed

    private void jTextField46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField46ActionPerformed

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void jTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44ActionPerformed

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
private javax.swing.JTextField jField[][]; 
}
