package com.pruebaSofka.demo.vista;

import java.util.List;
import com.pruebaSofka.demo.JuegoApplication;
import com.pruebaSofka.demo.SpringContext;
import com.pruebaSofka.demo.modelos.Categoria;
import com.pruebaSofka.demo.modelos.Pregunta;
import com.pruebaSofka.demo.modelos.Usuario;
import com.pruebaSofka.demo.repositorios.RepositorioCategoria;
import com.pruebaSofka.demo.repositorios.RepositorioPregunta;
import com.pruebaSofka.demo.repositorios.RepositorioRespuesta;
import com.pruebaSofka.demo.repositorios.RepositorioUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.engine.jdbc.Size;

public class VentanaJuego extends javax.swing.JFrame {

    RepositorioPregunta repositorioPregunta;
    RepositorioCategoria repositorioCategoria;
    RepositorioRespuesta repositorioRespuesta;
    RepositorioUsuario repositorioUsuario;
    
    List<Pregunta> preguntasNivel1 = new ArrayList<Pregunta>();
    List<Pregunta> preguntasNivel2 = new ArrayList<Pregunta>();
    List<Pregunta> preguntasNivel3 = new ArrayList<Pregunta>();
    List<Pregunta> preguntasNivel4 = new ArrayList<Pregunta>();
    List<Pregunta> preguntasNivel5 = new ArrayList<Pregunta>();
    
    Pregunta preguntaMomento;
    int opcionSeleccionada;

    public VentanaJuego() {
        
        JuegoApplication.iniciarSpring();
        repositorioPregunta = SpringContext.getBean(RepositorioPregunta.class);
        repositorioCategoria = SpringContext.getBean(RepositorioCategoria.class);
        repositorioRespuesta = SpringContext.getBean(RepositorioRespuesta.class);
        repositorioUsuario = SpringContext.getBean(RepositorioUsuario.class);

        initComponents();
        OrdenarPreguntas();
        botonAbandonar.setEnabled(false);
        botonResponder.setEnabled(false);
        respuestaUno.setEnabled(false);
        respuestaDos.setEnabled(false);
        respuestaTres.setEnabled(false);
        respuestaCuatro.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoCedula = new javax.swing.JTextField();
        botonIniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoPuntaje = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        campoPregunta = new javax.swing.JLabel();
        respuestaUno = new javax.swing.JRadioButton();
        respuestaDos = new javax.swing.JRadioButton();
        respuestaTres = new javax.swing.JRadioButton();
        respuestaCuatro = new javax.swing.JRadioButton();
        botonResponder = new javax.swing.JButton();
        botonAbandonar = new javax.swing.JButton();
        nivelActual = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVisualizacion = new javax.swing.JTable();
        botonActualizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campoPreguntaNueva = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoOp1Nuevo = new javax.swing.JTextField();
        campoOp2Nuevo = new javax.swing.JTextField();
        campoOp3Nuevo = new javax.swing.JTextField();
        campoOp4Nuevo = new javax.swing.JTextField();
        selectorRespuesta = new javax.swing.JComboBox<>();
        selectorNivel = new javax.swing.JComboBox<>();
        botonAgregarPregunta = new javax.swing.JButton();
        mensajePregunta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONCURSO DE PREGUNTAS");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jLabel1.setText("NOMBRE: ");

        jLabel2.setText("CEDULA:");

        campoNombre.setColumns(20);

        campoCedula.setColumns(20);

        botonIniciar.setText("INICIAR");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        jLabel3.setText("PUNTAJE: ");

        campoPuntaje.setText("...");

        jLabel5.setText("NIVEL: ");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("PREGUNTA:");

        campoPregunta.setText("Para Comenzar presione Iniciar");

        respuestaUno.setText("...");
        respuestaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaUnoActionPerformed(evt);
            }
        });

        respuestaDos.setText("...");
        respuestaDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaDosActionPerformed(evt);
            }
        });

        respuestaTres.setText("...");
        respuestaTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaTresActionPerformed(evt);
            }
        });

        respuestaCuatro.setText("...");
        respuestaCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaCuatroActionPerformed(evt);
            }
        });

        botonResponder.setText("RESPONDER");
        botonResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResponderActionPerformed(evt);
            }
        });

        botonAbandonar.setText("ABANDONAR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(respuestaTres)
                    .addComponent(respuestaUno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(respuestaDos)
                    .addComponent(respuestaCuatro))
                .addGap(52, 52, 52))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(botonResponder)
                        .addGap(44, 44, 44)
                        .addComponent(botonAbandonar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(campoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respuestaUno)
                    .addComponent(respuestaDos))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respuestaTres)
                    .addComponent(respuestaCuatro))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonResponder)
                    .addComponent(botonAbandonar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        campoPregunta.getAccessibleContext().setAccessibleName("campoPregunta");
        respuestaUno.getAccessibleContext().setAccessibleName("respuestaUno");
        botonResponder.getAccessibleContext().setAccessibleName("botonResponder");
        botonAbandonar.getAccessibleContext().setAccessibleName("botonAbandonar");

        nivelActual.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(158, 158, 158)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoPuntaje))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(nivelActual))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(botonIniciar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(campoPuntaje))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(nivelActual)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonIniciar)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        campoNombre.getAccessibleContext().setAccessibleName("campoNombre");
        campoCedula.getAccessibleContext().setAccessibleName("campoCedula");
        botonIniciar.getAccessibleContext().setAccessibleName("botonIniciar");

        jTabbedPane1.addTab("JUGAR", jPanel2);

        tablaVisualizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVisualizacion);

        botonActualizar.setText("ACTUALIZAR");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(botonActualizar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonActualizar)
                .addGap(21, 21, 21))
        );

        botonActualizar.getAccessibleContext().setAccessibleName("botonActualizar");

        jTabbedPane1.addTab("HISTORIAL", jPanel3);

        jLabel8.setText("Pregunta : ");

        campoPreguntaNueva.setColumns(35);

        jLabel9.setText("Opcion 1 :");

        jLabel10.setText("Opcion 2 :");

        jLabel11.setText("Opcion 3 :");

        jLabel12.setText("Opcion 4 :");

        campoOp1Nuevo.setColumns(25);

        campoOp2Nuevo.setColumns(25);

        campoOp3Nuevo.setColumns(25);

        campoOp4Nuevo.setColumns(25);

        selectorRespuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Respuesta", "1", "2", "3", "4" }));

        selectorNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nivel", "1", "2", "3", "4" }));

        botonAgregarPregunta.setText("AGREGAR");
        botonAgregarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPreguntaActionPerformed(evt);
            }
        });

        mensajePregunta.setText("...");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoPreguntaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoOp1Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoOp2Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectorRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(selectorNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(campoOp3Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(campoOp4Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(botonAgregarPregunta))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(mensajePregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoPreguntaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(campoOp1Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectorRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(campoOp2Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(selectorNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(campoOp3Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(campoOp4Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonAgregarPregunta)
                        .addGap(16, 16, 16)
                        .addComponent(mensajePregunta)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONFIGURACIÓN", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("JUGAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void botonAgregarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPreguntaActionPerformed
        
        String enunciadoNuevo;
        String op1Nueva, op2Nueva, op3Nueva, op4Nueva;
        int respuestaNueva;
        Categoria categoriaNuevo;
        enunciadoNuevo = campoPreguntaNueva.getText();
        op1Nueva = campoOp1Nuevo.getText();
        op2Nueva = campoOp2Nuevo.getText();
        op3Nueva = campoOp3Nuevo.getText();
        op4Nueva = campoOp4Nuevo.getText();
        respuestaNueva = selectorRespuesta.getSelectedIndex();

        categoriaNuevo = repositorioCategoria.getById(selectorNivel.getSelectedIndex());
        Pregunta preguntaNueva = new Pregunta(enunciadoNuevo, op1Nueva, op2Nueva, op3Nueva, op4Nueva, respuestaNueva, categoriaNuevo);
        repositorioPregunta.save(preguntaNueva);
        mensajePregunta.setText("Agregada Correctamente");
        LimpiarConfiguracion();
        

    }//GEN-LAST:event_botonAgregarPreguntaActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        try{
        String nombreJugador;
        Long cedula;
        nombreJugador=campoNombre.getText();
        cedula=Long.parseLong(campoCedula.getText());
        Usuario jugador =new Usuario(cedula,nombreJugador,0,0);
        repositorioUsuario.save(jugador);
        iniciarPregunta(preguntasNivel1);
        campoPuntaje.setText("0");
        nivelActual.setText("Iniciante");
        botonAbandonar.setEnabled(true);
        botonResponder.setEnabled(true);
        botonIniciar.setEnabled(false);
        
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos NO Validos");
            JOptionPane.showMessageDialog(null, "Ingrese Nombre y Cedula");
        }
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void respuestaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaUnoActionPerformed
        // TODO add your handling code here:
        respuestaDos.setEnabled(false);
        respuestaTres.setEnabled(false);
        respuestaCuatro.setEnabled(false);
        opcionSeleccionada=1;
    }//GEN-LAST:event_respuestaUnoActionPerformed

    private void botonResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResponderActionPerformed
        // TODO add your handling code here:
        if(preguntaMomento.getRespuesta()==opcionSeleccionada){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");}
    }//GEN-LAST:event_botonResponderActionPerformed

    private void respuestaDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaDosActionPerformed
        // TODO add your handling code here:
        respuestaUno.setEnabled(false);
        respuestaTres.setEnabled(false);
        respuestaCuatro.setEnabled(false);
        opcionSeleccionada=2;
    }//GEN-LAST:event_respuestaDosActionPerformed

    private void respuestaTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaTresActionPerformed
        // TODO add your handling code here:
        respuestaDos.setEnabled(false);
        respuestaUno.setEnabled(false);
        respuestaCuatro.setEnabled(false);
        opcionSeleccionada=3;
    }//GEN-LAST:event_respuestaTresActionPerformed

    private void respuestaCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaCuatroActionPerformed
        // TODO add your handling code here:
        respuestaDos.setEnabled(false);
        respuestaTres.setEnabled(false);
        respuestaUno.setEnabled(false);
        opcionSeleccionada=4;
    }//GEN-LAST:event_respuestaCuatroActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        // TODO add your handling code here:
        llenarTabla();
    }//GEN-LAST:event_botonActualizarActionPerformed

   
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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);

            }
        });
    }

    public void OrdenarPreguntas() {
        
        List<Pregunta> listapreguntas = repositorioPregunta.findAll();
        for (int i = 0; i < listapreguntas.size(); i++) {

            if (listapreguntas.get(i).getCategoria().getId() == 1) {
                preguntasNivel1.add(listapreguntas.get(i));
            }
            if (listapreguntas.get(i).getCategoria().getId() == 2) {
                preguntasNivel2.add(listapreguntas.get(i));
            }
            if (listapreguntas.get(i).getCategoria().getId() == 3) {
                preguntasNivel3.add(listapreguntas.get(i));
            }
            if (listapreguntas.get(i).getCategoria().getId() == 4) {
                preguntasNivel4.add(listapreguntas.get(i));
            }
            if (listapreguntas.get(i).getCategoria().getId() == 5) {
                preguntasNivel5.add(listapreguntas.get(i));
            }
        }
        

    }
    
    public void iniciarPregunta(List<Pregunta> preguntasNivel) {
        
        int numeroAleatorio = (int) (Math.random() * 5) + 1;
        preguntaMomento = preguntasNivel.get(numeroAleatorio);
        campoPregunta.setText(preguntaMomento.getEnunciado());
        respuestaUno.setText(preguntaMomento.getOpcion1());
        respuestaDos.setText(preguntaMomento.getOpcion2());
        respuestaTres.setText(preguntaMomento.getOpcion3());
        respuestaCuatro.setText(preguntaMomento.getOpcion4());
        
        respuestaUno.setEnabled(true);
        respuestaDos.setEnabled(true);
        respuestaTres.setEnabled(true);
        respuestaCuatro.setEnabled(true);
    }

    public void LimpiarConfiguracion() {
        
        campoPreguntaNueva.setText("");
        campoOp1Nuevo.setText("");
        campoOp2Nuevo.setText("");
        campoOp3Nuevo.setText("");
        campoOp4Nuevo.setText("");
        selectorRespuesta.setSelectedIndex(0);
        selectorNivel.setSelectedIndex(0);

    }
    
     public void llenarTabla() {
        List<Usuario> listaJugadores = repositorioUsuario.findAll();
        int n = listaJugadores.size();
        String nombresColomnas[] = {"Cedula", "Nombre", "Nivel", "Puntaje"};
        String data[][] = new String[n][4];
        for (int i = 0; i < n; i++) {
            data[i][0] = "" + listaJugadores.get(i).getCc();
            data[i][1] = listaJugadores.get(i).getNombre();
            data[i][2] = ""+listaJugadores.get(i).getNivel();
            data[i][3] = "" + listaJugadores.get(i).getPuntaje();
            
        }
        tablaVisualizacion.setModel(new DefaultTableModel(data, nombresColomnas));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAbandonar;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregarPregunta;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonResponder;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoOp1Nuevo;
    private javax.swing.JTextField campoOp2Nuevo;
    private javax.swing.JTextField campoOp3Nuevo;
    private javax.swing.JTextField campoOp4Nuevo;
    private javax.swing.JLabel campoPregunta;
    private javax.swing.JTextField campoPreguntaNueva;
    private javax.swing.JLabel campoPuntaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel mensajePregunta;
    private javax.swing.JLabel nivelActual;
    private javax.swing.JRadioButton respuestaCuatro;
    private javax.swing.JRadioButton respuestaDos;
    private javax.swing.JRadioButton respuestaTres;
    private javax.swing.JRadioButton respuestaUno;
    private javax.swing.JComboBox<String> selectorNivel;
    private javax.swing.JComboBox<String> selectorRespuesta;
    private javax.swing.JTable tablaVisualizacion;
    // End of variables declaration//GEN-END:variables
}
