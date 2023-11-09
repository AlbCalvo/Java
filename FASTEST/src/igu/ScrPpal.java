/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.Alumno;
import logic.Config;
import logic.Controladora;

/**
 *
 * @author acmmi
 */
public class ScrPpal extends javax.swing.JFrame {

    Controladora ctrl;
    Config configBdd;
    private int x;
        
    public ScrPpal() {
        ctrl = new Controladora(); //Se crea instancia/espacio al abrirse ventana.
        configBdd = new Config();
        initComponents();
    }
    public static int idAlumnoFastest = 0; //Dni k pasará de la 1ªpantalla a la 2ª. 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Scr01Cabecera = new javax.swing.JLabel();
        Scr01PanelInformativo = new javax.swing.JPanel();
        Scr01P01Asignatura = new javax.swing.JTextField();
        Scr01P01Fecha = new javax.swing.JTextField();
        Scr01P01Fp1Fp2 = new javax.swing.JTextField();
        Scr01P01CriterioCorrecc = new javax.swing.JTextField();
        Scr01P01DescripTest = new javax.swing.JTextField();
        Scr01P01Observaciones = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Scr01PanelEntradaDatosPersonales = new javax.swing.JPanel();
        Scr01Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Scr01Apellido1 = new javax.swing.JTextField();
        Scr01Apellido2 = new javax.swing.JTextField();
        Lavel_IntroduceTusDatos = new javax.swing.JTextField();
        Scr01email = new javax.swing.JTextField();
        Lavel_Nombre = new javax.swing.JTextField();
        Lavel_Apellido1 = new javax.swing.JTextField();
        Lavel_Apellido2 = new javax.swing.JTextField();
        Lavel_email = new javax.swing.JTextField();
        BtnGoToExam = new javax.swing.JButton();
        BtnLimpiarDatosPantalla = new javax.swing.JButton();
        Lavel_email1 = new javax.swing.JTextField();
        Scr01dni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Scr01Cabecera.setIcon(new javax.swing.ImageIcon("C:\\Users\\acmmi\\Downloads\\test de conocimientos v1.png")); // NOI18N

        Scr01PanelInformativo.setBackground(new java.awt.Color(255, 255, 255));

        Scr01P01Asignatura.setEditable(false);
        Scr01P01Asignatura.setBackground(new java.awt.Color(255, 255, 255));
        Scr01P01Asignatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Scr01P01Asignatura.setText("     Asignatura");
        Scr01P01Asignatura.setBorder(null);
        Scr01P01Asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01P01AsignaturaActionPerformed(evt);
            }
        });

        Scr01P01Fecha.setEditable(false);
        Scr01P01Fecha.setBackground(new java.awt.Color(255, 255, 255));
        Scr01P01Fecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Scr01P01Fecha.setText("     Fecha de hoy");
        Scr01P01Fecha.setBorder(null);
        Scr01P01Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01P01FechaActionPerformed(evt);
            }
        });

        Scr01P01Fp1Fp2.setEditable(false);
        Scr01P01Fp1Fp2.setBackground(new java.awt.Color(255, 255, 255));
        Scr01P01Fp1Fp2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Scr01P01Fp1Fp2.setForeground(new java.awt.Color(223, 221, 221));
        Scr01P01Fp1Fp2.setText("      FP1 o FP2");
        Scr01P01Fp1Fp2.setBorder(null);
        Scr01P01Fp1Fp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01P01Fp1Fp2ActionPerformed(evt);
            }
        });

        Scr01P01CriterioCorrecc.setEditable(false);
        Scr01P01CriterioCorrecc.setBackground(new java.awt.Color(255, 255, 255));
        Scr01P01CriterioCorrecc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Scr01P01CriterioCorrecc.setText("Explicar los criterios de corrección.");
        Scr01P01CriterioCorrecc.setBorder(null);
        Scr01P01CriterioCorrecc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01P01CriterioCorreccActionPerformed(evt);
            }
        });

        Scr01P01DescripTest.setEditable(false);
        Scr01P01DescripTest.setBackground(new java.awt.Color(255, 255, 255));
        Scr01P01DescripTest.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Scr01P01DescripTest.setText("Descripción de la prueba. Breve explicación,");
        Scr01P01DescripTest.setBorder(null);
        Scr01P01DescripTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01P01DescripTestActionPerformed(evt);
            }
        });

        Scr01P01Observaciones.setEditable(false);
        Scr01P01Observaciones.setBackground(new java.awt.Color(255, 255, 255));
        Scr01P01Observaciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Scr01P01Observaciones.setText("Observaciones sobre algún punto no contemplado en los dos anteriores");
        Scr01P01Observaciones.setBorder(null);
        Scr01P01Observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01P01ObservacionesActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acmmi\\Downloads\\linea simple.png")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout Scr01PanelInformativoLayout = new javax.swing.GroupLayout(Scr01PanelInformativo);
        Scr01PanelInformativo.setLayout(Scr01PanelInformativoLayout);
        Scr01PanelInformativoLayout.setHorizontalGroup(
            Scr01PanelInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Scr01PanelInformativoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Scr01PanelInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Scr01P01CriterioCorrecc, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scr01P01DescripTest, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scr01P01Observaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 1324, Short.MAX_VALUE))
                .addGroup(Scr01PanelInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Scr01PanelInformativoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Scr01P01Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Scr01PanelInformativoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Scr01P01Asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Scr01PanelInformativoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Scr01P01Fp1Fp2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Scr01PanelInformativoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );
        Scr01PanelInformativoLayout.setVerticalGroup(
            Scr01PanelInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Scr01PanelInformativoLayout.createSequentialGroup()
                .addGroup(Scr01PanelInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Scr01PanelInformativoLayout.createSequentialGroup()
                        .addGroup(Scr01PanelInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Scr01P01DescripTest, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Scr01P01Asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Scr01P01CriterioCorrecc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Scr01P01Fp1Fp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Scr01PanelInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scr01P01Observaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Scr01P01Fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Scr01PanelEntradaDatosPersonales.setBackground(new java.awt.Color(255, 255, 255));

        Scr01Nombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Scr01Nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Scr01Nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Scr01Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01NombreActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\acmmi\\Downloads\\linea simple.png")); // NOI18N
        jLabel2.setText("jLabel1");

        Scr01Apellido1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Scr01Apellido1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Scr01Apellido1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Scr01Apellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01Apellido1ActionPerformed(evt);
            }
        });

        Scr01Apellido2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Scr01Apellido2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Scr01Apellido2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Scr01Apellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01Apellido2ActionPerformed(evt);
            }
        });

        Lavel_IntroduceTusDatos.setEditable(false);
        Lavel_IntroduceTusDatos.setBackground(new java.awt.Color(255, 255, 255));
        Lavel_IntroduceTusDatos.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        Lavel_IntroduceTusDatos.setForeground(new java.awt.Color(204, 204, 204));
        Lavel_IntroduceTusDatos.setText("Introduce tus datos:");
        Lavel_IntroduceTusDatos.setBorder(null);
        Lavel_IntroduceTusDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Lavel_IntroduceTusDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lavel_IntroduceTusDatosActionPerformed(evt);
            }
        });

        Scr01email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Scr01email.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Scr01email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Scr01email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01emailActionPerformed(evt);
            }
        });

        Lavel_Nombre.setEditable(false);
        Lavel_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Lavel_Nombre.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        Lavel_Nombre.setText("Nombre:");
        Lavel_Nombre.setBorder(null);
        Lavel_Nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Lavel_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lavel_NombreActionPerformed(evt);
            }
        });

        Lavel_Apellido1.setEditable(false);
        Lavel_Apellido1.setBackground(new java.awt.Color(255, 255, 255));
        Lavel_Apellido1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        Lavel_Apellido1.setText("1er Apellido:");
        Lavel_Apellido1.setBorder(null);
        Lavel_Apellido1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Lavel_Apellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lavel_Apellido1ActionPerformed(evt);
            }
        });

        Lavel_Apellido2.setEditable(false);
        Lavel_Apellido2.setBackground(new java.awt.Color(255, 255, 255));
        Lavel_Apellido2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        Lavel_Apellido2.setText("2nd Apellido:");
        Lavel_Apellido2.setBorder(null);
        Lavel_Apellido2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Lavel_Apellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lavel_Apellido2ActionPerformed(evt);
            }
        });

        Lavel_email.setEditable(false);
        Lavel_email.setBackground(new java.awt.Color(255, 255, 255));
        Lavel_email.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        Lavel_email.setText("E-mail:");
        Lavel_email.setBorder(null);
        Lavel_email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Lavel_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lavel_emailActionPerformed(evt);
            }
        });

        BtnGoToExam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnGoToExam.setText("Ir al Test");
        BtnGoToExam.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGoToExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGoToExamActionPerformed(evt);
            }
        });

        BtnLimpiarDatosPantalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnLimpiarDatosPantalla.setIcon(new javax.swing.ImageIcon("C:\\Users\\acmmi\\Documents\\Docencia\\Java\\limpiar pequeño.png")); // NOI18N
        BtnLimpiarDatosPantalla.setText("  Limpiar");
        BtnLimpiarDatosPantalla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLimpiarDatosPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarDatosPantallaActionPerformed(evt);
            }
        });

        Lavel_email1.setEditable(false);
        Lavel_email1.setBackground(new java.awt.Color(255, 255, 255));
        Lavel_email1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        Lavel_email1.setText("Dni (Sin letra):");
        Lavel_email1.setBorder(null);
        Lavel_email1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Lavel_email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lavel_email1ActionPerformed(evt);
            }
        });

        Scr01dni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Scr01dni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Scr01dni.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Scr01dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scr01dniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Scr01PanelEntradaDatosPersonalesLayout = new javax.swing.GroupLayout(Scr01PanelEntradaDatosPersonales);
        Scr01PanelEntradaDatosPersonales.setLayout(Scr01PanelEntradaDatosPersonalesLayout);
        Scr01PanelEntradaDatosPersonalesLayout.setHorizontalGroup(
            Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Lavel_Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lavel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lavel_email1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Scr01Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Scr01email, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Scr01dni, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(Lavel_Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Scr01Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(Lavel_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lavel_IntroduceTusDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Scr01Nombre))))))
                .addContainerGap(1175, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnLimpiarDatosPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnGoToExam, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        Scr01PanelEntradaDatosPersonalesLayout.setVerticalGroup(
            Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lavel_IntroduceTusDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lavel_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Scr01Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lavel_Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Scr01Apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Scr01Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lavel_Apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lavel_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Scr01email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lavel_email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Scr01dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(BtnLimpiarDatosPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Scr01PanelEntradaDatosPersonalesLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(BtnGoToExam, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(590, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Scr01Cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Scr01PanelInformativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Scr01PanelEntradaDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Scr01Cabecera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scr01PanelInformativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Scr01PanelEntradaDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Scr01P01AsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01P01AsignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01P01AsignaturaActionPerformed

    private void Scr01P01FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01P01FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01P01FechaActionPerformed

    private void Scr01P01Fp1Fp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01P01Fp1Fp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01P01Fp1Fp2ActionPerformed

    private void Scr01P01CriterioCorreccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01P01CriterioCorreccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01P01CriterioCorreccActionPerformed

    private void Scr01P01DescripTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01P01DescripTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01P01DescripTestActionPerformed

    private void Scr01P01ObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01P01ObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01P01ObservacionesActionPerformed

    private void Scr01emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01emailActionPerformed

    private void Lavel_IntroduceTusDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lavel_IntroduceTusDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lavel_IntroduceTusDatosActionPerformed

    private void Scr01Apellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01Apellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01Apellido2ActionPerformed

    private void Scr01Apellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01Apellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01Apellido1ActionPerformed

    private void Scr01NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01NombreActionPerformed

    private void Lavel_Apellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lavel_Apellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lavel_Apellido2ActionPerformed

    private void Lavel_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lavel_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lavel_emailActionPerformed

    private void Lavel_Apellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lavel_Apellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lavel_Apellido1ActionPerformed

    private void Lavel_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lavel_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lavel_NombreActionPerformed

    private void BtnLimpiarDatosPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarDatosPantallaActionPerformed
        // Limpiar datos de pantalla.
        Scr01Nombre.setText("");
        Scr01Apellido1.setText("");
        Scr01Apellido2.setText("");
        Scr01email.setText("");
        Scr01dni.setText("");
        
        
    }//GEN-LAST:event_BtnLimpiarDatosPantallaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        // Método creado por el evento:Abrir ventana. 
        configBdd = ctrl.buscaBddConfig(); // Al abrir la ventana debe aparecer con la info de los exámenes.
          
        Scr01P01DescripTest.setText(configBdd.getConfigDescripcionExamen());
        Scr01P01CriterioCorrecc.setText(configBdd.getConfigCriterioCorreccion());
        Scr01P01Observaciones.setText(configBdd.getConfigObservaciones());
        Scr01P01Asignatura.setText(configBdd.getConfigAsignatura());
        Scr01P01Fp1Fp2.setText(configBdd.getConfigFP1FP2());
        Scr01P01Fecha.setText(configBdd.getConfigFecha());
   
    }//GEN-LAST:event_formWindowOpened

    private void Lavel_email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lavel_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lavel_email1ActionPerformed

    private void Scr01dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scr01dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Scr01dniActionPerformed

    private void BtnGoToExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGoToExamActionPerformed
        Alumno aluAGrabar = new Alumno();
        // Ir a realizar el test
        //Validar que se han introducido todos.
        if (Scr01Nombre.getText().isEmpty()) {
            ctrl.mostrarAviso( "Falta por informar el campo: Nombre","Faltan datos por introducir.", "Error");
        }else {
            if (Scr01Apellido1.getText().isEmpty()) {
                ctrl.mostrarAviso( "Falta por informar el campo: Primer apellido ", "Faltan datos por introducir.","Error");
            } else {
               if (Scr01Apellido2.getText().isEmpty()) {
                    ctrl.mostrarAviso( "Falta por informar el campo: Segundo apellido ", "Faltan datos por introducir.", "Error");
                } else {
                   if (Scr01email.getText().isEmpty()) {
                    ctrl.mostrarAviso( "Falta por informar el campo: e-mail ","Faltan datos por introducir.", "Error");
                }else {
                       if (Scr01dni.getText().isEmpty()) {
                            ctrl.mostrarAviso( "Falta por informar el campo: D.N.I. (Sin letra) ","Faltan datos por introducir.", "Error");
                          } else {
                           // El dni sin letra.
                           int dniSinLetra = parseInt( Scr01dni.getText().substring(0, 8));
                           Scr01dni.setText( Scr01dni.getText().substring(0, 8) );
                           //Crear registro ALUMNO
                           //aluAGrabar.setId_Alu(dniSinLetra );
                           idAlumnoFastest = dniSinLetra; // Paso de parámetros entre ventanas
                           aluAGrabar.setNombre(Scr01Nombre.getText()); 
                           aluAGrabar.setApellido1(Scr01Apellido1.getText());
                           aluAGrabar.setApellido2(Scr01Apellido2.getText());
                           aluAGrabar.setEmail(Scr01email.getText());
                           try {
                               ctrl.crearAlumnoBdd(aluAGrabar);
                           } catch (Exception ex) {
                               Logger.getLogger(ScrPpal.class.getName()).log(Level.SEVERE, null, ex);
                           }
                           // Ir a la pantalla del examen.
                           ScrTest PantallaPpal = new ScrTest();
                           PantallaPpal.setExtendedState(MAXIMIZED_BOTH);
                           PantallaPpal.setVisible(true); 
                                                    
                           
                           }
                      }
                }
            }
        }
    
        
        
        
    }//GEN-LAST:event_BtnGoToExamActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGoToExam;
    private javax.swing.JButton BtnLimpiarDatosPantalla;
    private javax.swing.JTextField Lavel_Apellido1;
    private javax.swing.JTextField Lavel_Apellido2;
    private javax.swing.JTextField Lavel_IntroduceTusDatos;
    private javax.swing.JTextField Lavel_Nombre;
    private javax.swing.JTextField Lavel_email;
    private javax.swing.JTextField Lavel_email1;
    private javax.swing.JTextField Scr01Apellido1;
    private javax.swing.JTextField Scr01Apellido2;
    private javax.swing.JLabel Scr01Cabecera;
    private javax.swing.JTextField Scr01Nombre;
    private javax.swing.JTextField Scr01P01Asignatura;
    private javax.swing.JTextField Scr01P01CriterioCorrecc;
    private javax.swing.JTextField Scr01P01DescripTest;
    private javax.swing.JTextField Scr01P01Fecha;
    private javax.swing.JTextField Scr01P01Fp1Fp2;
    private javax.swing.JTextField Scr01P01Observaciones;
    private javax.swing.JPanel Scr01PanelEntradaDatosPersonales;
    private javax.swing.JPanel Scr01PanelInformativo;
    private javax.swing.JTextField Scr01dni;
    private javax.swing.JTextField Scr01email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /*private Config  mostrarInfoEnScr01() {
        //Obtener info de la bdd para mostrarla por pantalla al abrirse.
        return ( ctrl.buscaBddConfig() );
    }
    */
       
}