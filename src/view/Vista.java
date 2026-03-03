package view;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame {

    public int accion = 0;

    public Vista() {
        initComponents();
        fecha3.setDateFormatString("yyyy-MM-dd");
        fecha3.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    Date selectedDate = (Date) evt.getNewValue();
                    if (selectedDate != null) {
                        java.sql.Date sqlDate = new java.sql.Date(fecha3.getDate().getTime());
                        contr3.setText(sqlDate.toString());
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabbed = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        titulotxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        generotxt = new javax.swing.JTextField();
        añotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        autortxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        editorialtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btNo = new javax.swing.JButton();
        btSi = new javax.swing.JButton();
        btInsertar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btMostrar = new javax.swing.JButton();
        btForeign = new javax.swing.JButton();
        lbReloj = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        teltxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        idtxt1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btNo1 = new javax.swing.JButton();
        btSi1 = new javax.swing.JButton();
        btInsertar1 = new javax.swing.JButton();
        btBuscar1 = new javax.swing.JButton();
        btModificar1 = new javax.swing.JButton();
        btEliminar1 = new javax.swing.JButton();
        btMostrar1 = new javax.swing.JButton();
        lbReloj1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Contratacion = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btNo3 = new javax.swing.JButton();
        btSi3 = new javax.swing.JButton();
        btInsertar3 = new javax.swing.JButton();
        btBuscar3 = new javax.swing.JButton();
        btModificar3 = new javax.swing.JButton();
        btEliminar3 = new javax.swing.JButton();
        btMostrar3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        puesto3 = new javax.swing.JTextField();
        fecha3 = new com.toedter.calendar.JDateChooser();
        contr3 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        idtxt3 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        nombretxt3 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        ap_pat3 = new javax.swing.JTextField();
        ap_mat3 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        lbReloj2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Contratacion1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        idtxt4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btNo4 = new javax.swing.JButton();
        btSi4 = new javax.swing.JButton();
        btInsertar4 = new javax.swing.JButton();
        btBuscar4 = new javax.swing.JButton();
        btModificar4 = new javax.swing.JButton();
        btEliminar4 = new javax.swing.JButton();
        btMostrar4 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        tel4 = new javax.swing.JTextField();
        ap_mat4 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        nombretxt4 = new javax.swing.JTextField();
        ap_pat4 = new javax.swing.JTextField();
        lbReloj3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        usuariotxt6 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        fechatxt6 = new javax.swing.JTextField();
        clientetxt = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        idtxt6 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        btNo6 = new javax.swing.JButton();
        btSi6 = new javax.swing.JButton();
        btInsertar6 = new javax.swing.JButton();
        btBuscar6 = new javax.swing.JButton();
        btModificar6 = new javax.swing.JButton();
        btEliminar6 = new javax.swing.JButton();
        btMostrar6 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        btForeign3 = new javax.swing.JButton();
        spinner = new javax.swing.JLabel();
        btAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        venta_libro = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btQuitar = new javax.swing.JButton();
        lbReloj4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 79));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        tabbed.setBackground(new java.awt.Color(153, 153, 153));
        tabbed.setForeground(new java.awt.Color(0, 0, 0));
        tabbed.setPreferredSize(new java.awt.Dimension(701, 500));
        tabbed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 79));
        jPanel2.setPreferredSize(new java.awt.Dimension(624, 500));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Titulo");

        titulotxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        titulotxt.setForeground(new java.awt.Color(2, 51, 65));
        titulotxt.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genero");

        generotxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        generotxt.setForeground(new java.awt.Color(2, 51, 65));
        generotxt.setBorder(null);
        generotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generotxtActionPerformed(evt);
            }
        });

        añotxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        añotxt.setForeground(new java.awt.Color(2, 51, 65));
        añotxt.setToolTipText("Solo numeros");
        añotxt.setBorder(null);
        añotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añotxtActionPerformed(evt);
            }
        });
        añotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                añotxtKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año publicacion");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Autor");

        autortxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        autortxt.setForeground(new java.awt.Color(2, 51, 65));
        autortxt.setBorder(null);
        autortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autortxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Editorial");

        editorialtxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        editorialtxt.setForeground(new java.awt.Color(2, 51, 65));
        editorialtxt.setToolTipText("Solo numeros");
        editorialtxt.setBorder(null);
        editorialtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorialtxtActionPerformed(evt);
            }
        });
        editorialtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editorialtxtKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Libro");

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Id");

        idtxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        idtxt.setForeground(new java.awt.Color(2, 51, 65));
        idtxt.setToolTipText("Solo numeros");
        idtxt.setBorder(null);
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        idtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idtxtKeyTyped(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(2, 51, 65));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img1.png"))); // NOI18N

        btNo.setBackground(new java.awt.Color(102, 0, 0));
        btNo.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btNo.setForeground(new java.awt.Color(255, 255, 255));
        btNo.setText("No");
        btNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNoActionPerformed(evt);
            }
        });

        btSi.setBackground(new java.awt.Color(0, 102, 0));
        btSi.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btSi.setForeground(new java.awt.Color(255, 255, 255));
        btSi.setText("Si");
        btSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSiActionPerformed(evt);
            }
        });

        btInsertar.setBackground(new java.awt.Color(0, 51, 153));
        btInsertar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btInsertar.setForeground(new java.awt.Color(204, 204, 204));
        btInsertar.setText("Insertar");
        btInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertarActionPerformed(evt);
            }
        });

        btBuscar.setBackground(new java.awt.Color(0, 51, 153));
        btBuscar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btBuscar.setForeground(new java.awt.Color(204, 204, 204));
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btModificar.setBackground(new java.awt.Color(0, 51, 153));
        btModificar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btModificar.setForeground(new java.awt.Color(204, 204, 204));
        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(0, 51, 153));
        btEliminar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btEliminar.setForeground(new java.awt.Color(204, 204, 204));
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btMostrar.setBackground(new java.awt.Color(0, 51, 153));
        btMostrar.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btMostrar.setForeground(new java.awt.Color(204, 204, 204));
        btMostrar.setText("Mostrar");
        btMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarActionPerformed(evt);
            }
        });

        btForeign.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btForeign.setText("...");
        btForeign.setToolTipText("Ver tabla de editoriales");
        btForeign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btForeignActionPerformed(evt);
            }
        });

        lbReloj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbReloj.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel13))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(añotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(autortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(editorialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btForeign, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(generotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btNo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addComponent(lbReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSi)
                            .addComponent(btNo))
                        .addGap(18, 18, 18)
                        .addComponent(btInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(generotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(añotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editorialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btForeign, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(autortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tabbed.addTab("Libro", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 79));
        jPanel3.setPreferredSize(new java.awt.Dimension(624, 500));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre");

        nombretxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        nombretxt.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telefono");

        teltxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        teltxt.setToolTipText("Solo numeros");
        teltxt.setBorder(null);
        teltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teltxtActionPerformed(evt);
            }
        });
        teltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                teltxtKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Editorial");

        jLabel23.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Id");

        idtxt1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        idtxt1.setToolTipText("Solo numeros");
        idtxt1.setBorder(null);
        idtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxt1ActionPerformed(evt);
            }
        });
        idtxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idtxt1KeyTyped(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img2.png"))); // NOI18N

        btNo1.setBackground(new java.awt.Color(102, 0, 0));
        btNo1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btNo1.setForeground(new java.awt.Color(255, 255, 255));
        btNo1.setText("No");
        btNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNo1ActionPerformed(evt);
            }
        });

        btSi1.setBackground(new java.awt.Color(0, 102, 0));
        btSi1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btSi1.setForeground(new java.awt.Color(255, 255, 255));
        btSi1.setText("Si");
        btSi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSi1ActionPerformed(evt);
            }
        });

        btInsertar1.setBackground(new java.awt.Color(0, 51, 153));
        btInsertar1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btInsertar1.setForeground(new java.awt.Color(204, 204, 204));
        btInsertar1.setText("Insertar");
        btInsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertar1ActionPerformed(evt);
            }
        });

        btBuscar1.setBackground(new java.awt.Color(0, 51, 153));
        btBuscar1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btBuscar1.setForeground(new java.awt.Color(204, 204, 204));
        btBuscar1.setText("Buscar");
        btBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscar1ActionPerformed(evt);
            }
        });

        btModificar1.setBackground(new java.awt.Color(0, 51, 153));
        btModificar1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btModificar1.setForeground(new java.awt.Color(204, 204, 204));
        btModificar1.setText("Modificar");
        btModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificar1ActionPerformed(evt);
            }
        });

        btEliminar1.setBackground(new java.awt.Color(0, 51, 153));
        btEliminar1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btEliminar1.setForeground(new java.awt.Color(204, 204, 204));
        btEliminar1.setText("Eliminar");
        btEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminar1ActionPerformed(evt);
            }
        });

        btMostrar1.setBackground(new java.awt.Color(0, 51, 153));
        btMostrar1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btMostrar1.setForeground(new java.awt.Color(204, 204, 204));
        btMostrar1.setText("Mostrar");
        btMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrar1ActionPerformed(evt);
            }
        });

        lbReloj1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbReloj1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbReloj1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSi1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btInsertar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbReloj1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSi1)
                            .addComponent(btNo1))
                        .addGap(18, 18, 18)
                        .addComponent(btInsertar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(idtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(teltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8)
                            .addGap(17, 17, 17)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        tabbed.addTab("Editorial", jPanel3);

        jPanel5.setBackground(new java.awt.Color(0, 0, 79));
        jPanel5.setPreferredSize(new java.awt.Dimension(624, 500));

        Contratacion.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        Contratacion.setForeground(new java.awt.Color(255, 255, 255));
        Contratacion.setText("Fecha contratacion");

        jLabel20.setFont(new java.awt.Font("Footlight MT Light", 0, 60)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Empleado");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img4.png"))); // NOI18N

        btNo3.setBackground(new java.awt.Color(102, 0, 0));
        btNo3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btNo3.setForeground(new java.awt.Color(255, 255, 255));
        btNo3.setText("No");
        btNo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNo3ActionPerformed(evt);
            }
        });

        btSi3.setBackground(new java.awt.Color(0, 102, 0));
        btSi3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btSi3.setForeground(new java.awt.Color(255, 255, 255));
        btSi3.setText("Si");
        btSi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSi3ActionPerformed(evt);
            }
        });

        btInsertar3.setBackground(new java.awt.Color(0, 51, 153));
        btInsertar3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btInsertar3.setForeground(new java.awt.Color(204, 204, 204));
        btInsertar3.setText("Insertar");
        btInsertar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertar3ActionPerformed(evt);
            }
        });

        btBuscar3.setBackground(new java.awt.Color(0, 51, 153));
        btBuscar3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btBuscar3.setForeground(new java.awt.Color(204, 204, 204));
        btBuscar3.setText("Buscar");
        btBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscar3ActionPerformed(evt);
            }
        });

        btModificar3.setBackground(new java.awt.Color(0, 51, 153));
        btModificar3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btModificar3.setForeground(new java.awt.Color(204, 204, 204));
        btModificar3.setText("Modificar");
        btModificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificar3ActionPerformed(evt);
            }
        });

        btEliminar3.setBackground(new java.awt.Color(0, 51, 153));
        btEliminar3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btEliminar3.setForeground(new java.awt.Color(204, 204, 204));
        btEliminar3.setText("Eliminar");
        btEliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminar3ActionPerformed(evt);
            }
        });

        btMostrar3.setBackground(new java.awt.Color(0, 51, 153));
        btMostrar3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btMostrar3.setForeground(new java.awt.Color(204, 204, 204));
        btMostrar3.setText("Mostrar");
        btMostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrar3ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Puesto");

        puesto3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        puesto3.setBorder(null);
        puesto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puesto3ActionPerformed(evt);
            }
        });

        fecha3.setDateFormatString("YYYY-MM-dd");
        fecha3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecha3MouseClicked(evt);
            }
        });

        contr3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        contr3.setBorder(null);
        contr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contr3ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Id");

        idtxt3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        idtxt3.setToolTipText("Solo numeros");
        idtxt3.setBorder(null);
        idtxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxt3ActionPerformed(evt);
            }
        });
        idtxt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idtxt3KeyTyped(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Nombre");

        nombretxt3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        nombretxt3.setBorder(null);

        jLabel45.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Apellido paterno");

        ap_pat3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        ap_pat3.setBorder(null);
        ap_pat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap_pat3ActionPerformed(evt);
            }
        });

        ap_mat3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        ap_mat3.setToolTipText("");
        ap_mat3.setBorder(null);
        ap_mat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap_mat3ActionPerformed(evt);
            }
        });
        ap_mat3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap_mat3KeyTyped(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Apellido materno");

        jLabel47.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Nombre usuario");

        usertxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        usertxt.setBorder(null);

        jLabel48.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Contraseña");

        passtxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        passtxt.setBorder(null);

        lbReloj2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbReloj2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel45)
                                        .addComponent(jLabel44)
                                        .addComponent(jLabel46)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel47)
                                        .addComponent(jLabel43))
                                    .addGap(12, 12, 12))
                                .addComponent(Contratacion, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ap_mat3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ap_pat3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombretxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(usertxt)
                                .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(contr3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(puesto3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(idtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 65, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSi3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btInsertar3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMostrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbReloj2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel20))
                    .addComponent(lbReloj2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSi3)
                            .addComponent(btNo3))
                        .addGap(18, 18, 18)
                        .addComponent(btInsertar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btModificar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMostrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel43)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(idtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombretxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel44))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ap_pat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel45))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ap_mat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel46))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fecha3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(contr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Contratacion)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(puesto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel47))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel48)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        tabbed.addTab("Empleado", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 0, 79));
        jPanel6.setPreferredSize(new java.awt.Dimension(624, 500));

        Contratacion1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        Contratacion1.setForeground(new java.awt.Color(255, 255, 255));
        Contratacion1.setText("Telefono");

        jLabel22.setFont(new java.awt.Font("Footlight MT Light", 0, 60)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Cliente");

        jLabel27.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Id");

        idtxt4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        idtxt4.setToolTipText("Solo numeros");
        idtxt4.setBorder(null);
        idtxt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxt4ActionPerformed(evt);
            }
        });
        idtxt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idtxt4KeyTyped(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img5.png"))); // NOI18N

        btNo4.setBackground(new java.awt.Color(102, 0, 0));
        btNo4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btNo4.setForeground(new java.awt.Color(255, 255, 255));
        btNo4.setText("No");
        btNo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNo4ActionPerformed(evt);
            }
        });

        btSi4.setBackground(new java.awt.Color(0, 102, 0));
        btSi4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btSi4.setForeground(new java.awt.Color(255, 255, 255));
        btSi4.setText("Si");
        btSi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSi4ActionPerformed(evt);
            }
        });

        btInsertar4.setBackground(new java.awt.Color(0, 51, 153));
        btInsertar4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btInsertar4.setForeground(new java.awt.Color(204, 204, 204));
        btInsertar4.setText("Insertar");
        btInsertar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertar4ActionPerformed(evt);
            }
        });

        btBuscar4.setBackground(new java.awt.Color(0, 51, 153));
        btBuscar4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btBuscar4.setForeground(new java.awt.Color(204, 204, 204));
        btBuscar4.setText("Buscar");
        btBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscar4ActionPerformed(evt);
            }
        });

        btModificar4.setBackground(new java.awt.Color(0, 51, 153));
        btModificar4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btModificar4.setForeground(new java.awt.Color(204, 204, 204));
        btModificar4.setText("Modificar");
        btModificar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificar4ActionPerformed(evt);
            }
        });

        btEliminar4.setBackground(new java.awt.Color(0, 51, 153));
        btEliminar4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btEliminar4.setForeground(new java.awt.Color(204, 204, 204));
        btEliminar4.setText("Eliminar");
        btEliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminar4ActionPerformed(evt);
            }
        });

        btMostrar4.setBackground(new java.awt.Color(0, 51, 153));
        btMostrar4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btMostrar4.setForeground(new java.awt.Color(204, 204, 204));
        btMostrar4.setText("Mostrar");
        btMostrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrar4ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Direccion");

        direccion.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        direccion.setBorder(null);
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        tel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tel4.setToolTipText("Solo numeros");
        tel4.setBorder(null);
        tel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel4ActionPerformed(evt);
            }
        });
        tel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tel4KeyTyped(evt);
            }
        });

        ap_mat4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        ap_mat4.setToolTipText("");
        ap_mat4.setBorder(null);
        ap_mat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap_mat4ActionPerformed(evt);
            }
        });
        ap_mat4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap_mat4KeyTyped(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Apellido materno");

        jLabel51.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Apellido paterno");

        jLabel52.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Nombre");

        nombretxt4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        nombretxt4.setBorder(null);

        ap_pat4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        ap_pat4.setBorder(null);
        ap_pat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap_pat4ActionPerformed(evt);
            }
        });

        lbReloj3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbReloj3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel51)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Contratacion1))
                                    .addComponent(jLabel29))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ap_mat4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ap_pat4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombretxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idtxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btNo4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSi4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btModificar4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btInsertar4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMostrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(lbReloj3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel22))
                    .addComponent(lbReloj3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSi4)
                    .addComponent(btNo4))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btInsertar4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btModificar4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMostrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idtxt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombretxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ap_pat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ap_mat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contratacion1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        tabbed.addTab("Cliente", jPanel6);

        jPanel8.setBackground(new java.awt.Color(0, 0, 79));
        jPanel8.setPreferredSize(new java.awt.Dimension(624, 500));

        jLabel36.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Usuario");

        usuariotxt6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        usuariotxt6.setBorder(null);

        jLabel37.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Fecha");

        fechatxt6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        fechatxt6.setBorder(null);
        fechatxt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechatxt6ActionPerformed(evt);
            }
        });

        clientetxt.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        clientetxt.setToolTipText("Solo numeros");
        clientetxt.setBorder(null);
        clientetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientetxtActionPerformed(evt);
            }
        });
        clientetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clientetxtKeyTyped(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Cliente");

        jLabel39.setFont(new java.awt.Font("Footlight MT Light", 0, 60)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Venta");

        jLabel40.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Id");

        idtxt6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        idtxt6.setToolTipText("Solo numeros");
        idtxt6.setBorder(null);
        idtxt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxt6ActionPerformed(evt);
            }
        });
        idtxt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idtxt6KeyTyped(evt);
            }
        });

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img88.png"))); // NOI18N

        btNo6.setBackground(new java.awt.Color(102, 0, 0));
        btNo6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btNo6.setForeground(new java.awt.Color(255, 255, 255));
        btNo6.setText("No");
        btNo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNo6ActionPerformed(evt);
            }
        });

        btSi6.setBackground(new java.awt.Color(0, 102, 0));
        btSi6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btSi6.setForeground(new java.awt.Color(255, 255, 255));
        btSi6.setText("Si");
        btSi6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSi6ActionPerformed(evt);
            }
        });

        btInsertar6.setBackground(new java.awt.Color(0, 51, 153));
        btInsertar6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btInsertar6.setForeground(new java.awt.Color(204, 204, 204));
        btInsertar6.setText("Insertar");
        btInsertar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertar6ActionPerformed(evt);
            }
        });

        btBuscar6.setBackground(new java.awt.Color(0, 51, 153));
        btBuscar6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btBuscar6.setForeground(new java.awt.Color(204, 204, 204));
        btBuscar6.setText("Buscar");
        btBuscar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscar6ActionPerformed(evt);
            }
        });

        btModificar6.setBackground(new java.awt.Color(0, 51, 153));
        btModificar6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btModificar6.setForeground(new java.awt.Color(204, 204, 204));
        btModificar6.setText("Modificar");
        btModificar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificar6ActionPerformed(evt);
            }
        });

        btEliminar6.setBackground(new java.awt.Color(0, 51, 153));
        btEliminar6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btEliminar6.setForeground(new java.awt.Color(204, 204, 204));
        btEliminar6.setText("Eliminar");
        btEliminar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminar6ActionPerformed(evt);
            }
        });

        btMostrar6.setBackground(new java.awt.Color(0, 51, 153));
        btMostrar6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btMostrar6.setForeground(new java.awt.Color(204, 204, 204));
        btMostrar6.setText("Mostrar");
        btMostrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrar6ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Libros");

        btForeign3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btForeign3.setText("...");
        btForeign3.setToolTipText("Ver tabla de clientes");
        btForeign3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btForeign3ActionPerformed(evt);
            }
        });

        spinner.setBackground(new java.awt.Color(0, 0, 79));
        spinner.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        spinner.setForeground(new java.awt.Color(153, 153, 153));
        spinner.setOpaque(true);

        btAgregar.setBackground(new java.awt.Color(153, 153, 153));
        btAgregar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        venta_libro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Venta", "Libro", "Cantidad", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        venta_libro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                venta_libroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(venta_libro);

        btEditar.setBackground(new java.awt.Color(153, 153, 153));
        btEditar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btEditar.setForeground(new java.awt.Color(0, 0, 0));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btQuitar.setBackground(new java.awt.Color(153, 153, 153));
        btQuitar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btQuitar.setForeground(new java.awt.Color(0, 0, 0));
        btQuitar.setText("Quitar");
        btQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuitarActionPerformed(evt);
            }
        });

        lbReloj4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbReloj4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel36)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel37))
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel42))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addComponent(clientetxt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btForeign3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addComponent(btQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btAgregar))
                                            .addComponent(idtxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(fechatxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(usuariotxt6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(btNo6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btSi6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btModificar6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btBuscar6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btInsertar6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btMostrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btEliminar6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
                            .addComponent(lbReloj4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel41))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel39)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idtxt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usuariotxt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechatxt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(btForeign3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel42)
                                .addComponent(btAgregar)
                                .addComponent(btEditar)
                                .addComponent(btQuitar))
                            .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(lbReloj4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSi6)
                            .addComponent(btNo6))
                        .addGap(18, 18, 18)
                        .addComponent(btInsertar6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btModificar6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEliminar6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btMostrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tabbed.addTab("Venta", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editorialtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorialtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editorialtxtActionPerformed

    private void generotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generotxtActionPerformed

    private void autortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autortxtActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void añotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añotxtKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_añotxtKeyTyped

    private void idtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idtxtKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_idtxtKeyTyped

    private void editorialtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editorialtxtKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_editorialtxtKeyTyped

    private void añotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añotxtActionPerformed

    private void btNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNoActionPerformed
        Deshabilitar();
        DesTextf();
        LimpiarTxtf();
    }//GEN-LAST:event_btNoActionPerformed

    private void btSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSiActionPerformed

    }//GEN-LAST:event_btSiActionPerformed

    private void btInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertarActionPerformed
        idtxt.setEditable(false);
        idtxt.setBackground(Color.gray);
        titulotxt.setEditable(true);
        titulotxt.setBackground(Color.white);
        generotxt.setEditable(true);
        generotxt.setBackground(Color.white);
        añotxt.setEditable(true);
        añotxt.setBackground(Color.white);
        editorialtxt.setEditable(true);
        editorialtxt.setBackground(Color.white);
        btForeign.setEnabled(true);
        autortxt.setEditable(true);
        autortxt.setBackground(Color.white);
        btBuscar.setEnabled(false);
        btModificar.setEnabled(false);
        btEliminar.setEnabled(false);
        btMostrar.setEnabled(false);
        btSi.setEnabled(true);
        btNo.setEnabled(true);
        LimpiarTxtf();
        accion = 1;
    }//GEN-LAST:event_btInsertarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        idtxt.setEditable(true);
        idtxt.setBackground(Color.white);
        btInsertar.setEnabled(false);
        btModificar.setEnabled(false);
        btEliminar.setEnabled(false);
        btMostrar.setEnabled(false);
        btSi.setEnabled(true);
        btNo.setEnabled(true);
        LimpiarTxtf();
        accion = 2;
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        if (idtxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes hacer una busqueda primero");
            accion = 0;
        } else {
            idtxt.setEditable(false);
            idtxt.setBackground(Color.gray);
            titulotxt.setEditable(true);
            titulotxt.setBackground(Color.white);
            generotxt.setEditable(true);
            generotxt.setBackground(Color.white);
            añotxt.setEditable(true);
            añotxt.setBackground(Color.white);
            editorialtxt.setEditable(true);
            editorialtxt.setBackground(Color.white);
            btForeign.setEnabled(true);
            autortxt.setEditable(true);
            autortxt.setBackground(Color.white);
            btBuscar.setEnabled(false);
            btInsertar.setEnabled(false);
            btEliminar.setEnabled(false);
            btMostrar.setEnabled(false);
            btSi.setEnabled(true);
            btNo.setEnabled(true);
            accion = 3;
        }

    }//GEN-LAST:event_btModificarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed

    }//GEN-LAST:event_btEliminarActionPerformed

    private void btMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarActionPerformed

        accion = 5;
        btSi.setEnabled(true);
        btSi.doClick();
        btSi.setEnabled(false);
    }//GEN-LAST:event_btMostrarActionPerformed

    private void teltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teltxtActionPerformed

    private void idtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxt1ActionPerformed

    private void idtxt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idtxt1KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_idtxt1KeyTyped

    private void btNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNo1ActionPerformed
        Deshabilitar1();
        DesTextf1();
        LimpiarTxtf1();
    }//GEN-LAST:event_btNo1ActionPerformed

    private void btSi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSi1ActionPerformed

    }//GEN-LAST:event_btSi1ActionPerformed

    private void btInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertar1ActionPerformed
        idtxt1.setEditable(false);
        idtxt1.setBackground(Color.gray);
        nombretxt.setEditable(true);
        nombretxt.setBackground(Color.white);
        teltxt.setEditable(true);
        teltxt.setBackground(Color.white);
        btBuscar1.setEnabled(false);
        btModificar1.setEnabled(false);
        btEliminar1.setEnabled(false);
        btMostrar1.setEnabled(false);
        btSi1.setEnabled(true);
        btNo1.setEnabled(true);
        LimpiarTxtf1();
        accion = 1;
    }//GEN-LAST:event_btInsertar1ActionPerformed

    private void btBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscar1ActionPerformed
        idtxt1.setEditable(true);
        idtxt1.setBackground(Color.white);
        btInsertar1.setEnabled(false);
        btModificar1.setEnabled(false);
        btEliminar1.setEnabled(false);
        btMostrar1.setEnabled(false);
        btSi1.setEnabled(true);
        btNo1.setEnabled(true);
        LimpiarTxtf1();
        accion = 2;
    }//GEN-LAST:event_btBuscar1ActionPerformed

    private void btModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificar1ActionPerformed
        if (idtxt1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes hacer una busqueda primero");
            accion = 0;
        } else {
            idtxt1.setEditable(false);
            idtxt1.setBackground(Color.gray);
            nombretxt.setEditable(true);
            nombretxt.setBackground(Color.white);
            teltxt.setEditable(true);
            teltxt.setBackground(Color.white);
            btBuscar1.setEnabled(false);
            btInsertar1.setEnabled(false);
            btEliminar1.setEnabled(false);
            btMostrar1.setEnabled(false);
            btSi1.setEnabled(true);
            btNo1.setEnabled(true);
            accion = 3;
        }
    }//GEN-LAST:event_btModificar1ActionPerformed

    private void btEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminar1ActionPerformed

    }//GEN-LAST:event_btEliminar1ActionPerformed

    private void btMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrar1ActionPerformed
        accion = 5;
        btSi1.setEnabled(true);
        btSi1.doClick();
        btSi1.setEnabled(false);
    }//GEN-LAST:event_btMostrar1ActionPerformed

    private void btForeignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btForeignActionPerformed

    }//GEN-LAST:event_btForeignActionPerformed

    private void btNo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNo3ActionPerformed
        Deshabilitar3();
        DesTextf3();
        LimpiarTxtf3();
    }//GEN-LAST:event_btNo3ActionPerformed

    private void btSi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSi3ActionPerformed

    }//GEN-LAST:event_btSi3ActionPerformed

    private void btInsertar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertar3ActionPerformed
        idtxt3.setEditable(false);
        idtxt3.setBackground(Color.gray);
        nombretxt3.setEditable(true);
        nombretxt3.setBackground(Color.white);
        ap_pat3.setEditable(true);
        ap_pat3.setBackground(Color.white);
        ap_mat3.setEditable(true);
        ap_mat3.setBackground(Color.white);
        contr3.setBackground(Color.white);
        fecha3.setEnabled(true);
        fecha3.getDateEditor().setEnabled(false);
        puesto3.setEditable(true);
        puesto3.setBackground(Color.white);
        usertxt.setEditable(true);
        usertxt.setBackground(Color.white);
        passtxt.setEditable(true);
        passtxt.setBackground(Color.white);
        btBuscar3.setEnabled(false);
        btModificar3.setEnabled(false);
        btEliminar3.setEnabled(false);
        btMostrar3.setEnabled(false);
        btSi3.setEnabled(true);
        btNo3.setEnabled(true);
        LimpiarTxtf3();
        accion = 1;
    }//GEN-LAST:event_btInsertar3ActionPerformed

    private void btBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscar3ActionPerformed
        idtxt3.setEditable(true);
        idtxt3.setBackground(Color.white);
        btInsertar3.setEnabled(false);
        btModificar3.setEnabled(false);
        btEliminar3.setEnabled(false);
        btMostrar3.setEnabled(false);
        btSi3.setEnabled(true);
        btNo3.setEnabled(true);
        LimpiarTxtf3();
        accion = 2;
    }//GEN-LAST:event_btBuscar3ActionPerformed

    private void btModificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificar3ActionPerformed
        if (idtxt3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes hacer una busqueda primero");
            accion = 0;
        } else {
            idtxt3.setEditable(false);
            idtxt3.setBackground(Color.gray);
            nombretxt3.setEditable(true);
            nombretxt3.setBackground(Color.white);
            ap_pat3.setEditable(true);
            ap_pat3.setBackground(Color.white);
            ap_mat3.setEditable(true);
            ap_mat3.setBackground(Color.white);
            contr3.setBackground(Color.white);
            fecha3.setEnabled(true);
            fecha3.getDateEditor().setEnabled(false);
            puesto3.setEditable(true);
            puesto3.setBackground(Color.white);
            usertxt.setEditable(true);
            usertxt.setBackground(Color.white);
            passtxt.setEditable(true);
            passtxt.setBackground(Color.white);
            
            
            btBuscar3.setEnabled(false);
            btInsertar3.setEnabled(false);
            btEliminar3.setEnabled(false);
            btMostrar3.setEnabled(false);
            btSi3.setEnabled(true);
            btNo3.setEnabled(true);
            accion = 3;
        }
    }//GEN-LAST:event_btModificar3ActionPerformed

    private void btEliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminar3ActionPerformed

    }//GEN-LAST:event_btEliminar3ActionPerformed

    private void btMostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrar3ActionPerformed
        accion = 5;
        btSi3.setEnabled(true);
        btSi3.doClick();
        btSi3.setEnabled(false);
    }//GEN-LAST:event_btMostrar3ActionPerformed

    private void puesto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puesto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puesto3ActionPerformed

    private void fecha3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecha3MouseClicked
        contr3.setText(fecha3.getDateFormatString());
    }//GEN-LAST:event_fecha3MouseClicked

    private void idtxt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxt4ActionPerformed

    private void idtxt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idtxt4KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_idtxt4KeyTyped

    private void btNo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNo4ActionPerformed
        Deshabilitar4();
        DesTextf4();
        LimpiarTxtf4();
    }//GEN-LAST:event_btNo4ActionPerformed

    private void btSi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSi4ActionPerformed

    }//GEN-LAST:event_btSi4ActionPerformed

    private void btInsertar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertar4ActionPerformed
        idtxt4.setEditable(false);
        idtxt4.setBackground(Color.gray);
        nombretxt4.setEditable(true);
        nombretxt4.setBackground(Color.white);
        ap_pat4.setEditable(true);
        ap_pat4.setBackground(Color.white);
        ap_mat4.setEditable(true);
        ap_mat4.setBackground(Color.white);
        tel4.setEditable(true);
        tel4.setBackground(Color.white);
        direccion.setEditable(true);
        direccion.setBackground(Color.white);
        btBuscar4.setEnabled(false);
        btModificar4.setEnabled(false);
        btEliminar4.setEnabled(false);
        btMostrar4.setEnabled(false);
        btSi4.setEnabled(true);
        btNo4.setEnabled(true);
        LimpiarTxtf4();
        accion = 1;
    }//GEN-LAST:event_btInsertar4ActionPerformed

    private void btBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscar4ActionPerformed
        idtxt4.setEditable(true);
        idtxt4.setBackground(Color.white);
        btInsertar4.setEnabled(false);
        btModificar4.setEnabled(false);
        btEliminar4.setEnabled(false);
        btMostrar4.setEnabled(false);
        btSi4.setEnabled(true);
        btNo4.setEnabled(true);
        LimpiarTxtf();
        accion = 2;
    }//GEN-LAST:event_btBuscar4ActionPerformed

    private void btModificar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificar4ActionPerformed
        if (idtxt4.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes hacer una busqueda primero");
            accion = 0;
        } else {
            idtxt4.setEditable(false);
            idtxt4.setBackground(Color.gray);
            nombretxt4.setEditable(true);
            nombretxt4.setBackground(Color.white);
            ap_pat4.setEditable(true);
            ap_pat4.setBackground(Color.white);
            ap_mat4.setEditable(true);
            ap_mat4.setBackground(Color.white);
            tel4.setEditable(true);
            tel4.setBackground(Color.white);
            direccion.setEditable(true);
            direccion.setBackground(Color.white);
            btBuscar4.setEnabled(false);
            btInsertar4.setEnabled(false);
            btEliminar4.setEnabled(false);
            btMostrar4.setEnabled(false);
            btSi4.setEnabled(true);
            btNo4.setEnabled(true);
            accion = 3;
        }
    }//GEN-LAST:event_btModificar4ActionPerformed

    private void btEliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminar4ActionPerformed

    }//GEN-LAST:event_btEliminar4ActionPerformed

    private void btMostrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrar4ActionPerformed

        accion = 5;
        btSi4.setEnabled(true);
        btSi4.doClick();
        btSi4.setEnabled(false);
    }//GEN-LAST:event_btMostrar4ActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void tel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel4ActionPerformed

    private void contr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contr3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contr3ActionPerformed

    private void tabbedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedMouseClicked
        Configurar();
    }//GEN-LAST:event_tabbedMouseClicked

    private void fechatxt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechatxt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechatxt6ActionPerformed

    private void clientetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientetxtActionPerformed

    private void clientetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientetxtKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_clientetxtKeyTyped

    private void idtxt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxt6ActionPerformed

    private void idtxt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idtxt6KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_idtxt6KeyTyped

    private void btNo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNo6ActionPerformed
        Deshabilitar6();
        DesTextf6();
        LimpiarTxtf6();
    }//GEN-LAST:event_btNo6ActionPerformed

    private void btSi6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSi6ActionPerformed

    }//GEN-LAST:event_btSi6ActionPerformed

    private void btInsertar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertar6ActionPerformed
        idtxt6.setEditable(false);
        idtxt6.setBackground(Color.gray);
        clientetxt.setEditable(true);
        clientetxt.setBackground(Color.white);
        btBuscar6.setEnabled(false);
        btModificar6.setEnabled(false);
        btEliminar6.setEnabled(false);
        btMostrar6.setEnabled(false);
        btSi6.setEnabled(true);
        btNo6.setEnabled(true);
        btForeign3.setEnabled(true);
        btAgregar.setEnabled(true);
        btEditar.setEnabled(true);
        btQuitar.setEnabled(true);
        accion = 1;
    }//GEN-LAST:event_btInsertar6ActionPerformed

    private void btBuscar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscar6ActionPerformed
        idtxt6.setEditable(true);
        idtxt6.setBackground(Color.white);
        btInsertar6.setEnabled(false);
        btModificar6.setEnabled(false);
        btEliminar6.setEnabled(false);
        btMostrar6.setEnabled(false);
        btSi6.setEnabled(true);
        btNo6.setEnabled(true);
        LimpiarTxtf6();
        accion = 2;
    }//GEN-LAST:event_btBuscar6ActionPerformed

    private void btModificar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificar6ActionPerformed
        if (idtxt6.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes hacer una busqueda primero");
            accion = 0;
        } else {
            idtxt6.setEditable(false);
            idtxt6.setBackground(Color.gray);
            clientetxt.setEditable(true);
            clientetxt.setBackground(Color.white);
            btBuscar6.setEnabled(false);
            btInsertar6.setEnabled(false);
            btEliminar6.setEnabled(false);
            btMostrar6.setEnabled(false);
            btSi6.setEnabled(true);
            btNo6.setEnabled(true);
            btForeign3.setEnabled(true);
            btAgregar.setEnabled(true);
            btEditar.setEnabled(true);
            btQuitar.setEnabled(true);
            accion = 3;
        }
    }//GEN-LAST:event_btModificar6ActionPerformed

    private void btEliminar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminar6ActionPerformed

    }//GEN-LAST:event_btEliminar6ActionPerformed

    private void btMostrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrar6ActionPerformed

        accion = 5;
        btSi6.setEnabled(true);
        btSi6.doClick();
        btSi6.setEnabled(false);
    }//GEN-LAST:event_btMostrar6ActionPerformed

    private void btForeign3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btForeign3ActionPerformed

    }//GEN-LAST:event_btForeign3ActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed

    }//GEN-LAST:event_btAgregarActionPerformed

    private void idtxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxt3ActionPerformed

    private void idtxt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idtxt3KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_idtxt3KeyTyped

    private void ap_pat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap_pat3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ap_pat3ActionPerformed

    private void ap_mat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap_mat3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ap_mat3ActionPerformed

    private void ap_mat3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap_mat3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ap_mat3KeyTyped

    private void ap_mat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap_mat4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ap_mat4ActionPerformed

    private void ap_mat4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap_mat4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ap_mat4KeyTyped

    private void ap_pat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap_pat4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ap_pat4ActionPerformed

    private void venta_libroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venta_libroMouseClicked
        int accion = 10;
    }//GEN-LAST:event_venta_libroMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarActionPerformed

    private void tel4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tel4KeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_tel4KeyTyped

    private void btQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btQuitarActionPerformed

    private void teltxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teltxtKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_teltxtKeyTyped

    public void Configurar() {
        Deshabilitar();
        DesTextf();
        LimpiarTxtf();
        Deshabilitar1();
        DesTextf1();
        LimpiarTxtf1();
        Deshabilitar3();
        DesTextf3();
        LimpiarTxtf3();
        Deshabilitar4();
        DesTextf4();
        LimpiarTxtf4();
        Deshabilitar6();
        DesTextf6();
        LimpiarTxtf6();
    }

    public void Deshabilitar() {
        btBuscar.setEnabled(true);
        btInsertar.setEnabled(true);
        btModificar.setEnabled(true);
        btEliminar.setEnabled(true);
        btMostrar.setEnabled(true);
        btSi.setEnabled(false);
        btNo.setEnabled(false);
    }

    public void DesTextf() {
        idtxt.setEditable(false);
        idtxt.setBackground(Color.gray);
        titulotxt.setEditable(false);
        titulotxt.setBackground(Color.gray);
        generotxt.setEditable(false);
        generotxt.setBackground(Color.gray);
        añotxt.setEditable(false);
        añotxt.setBackground(Color.gray);
        editorialtxt.setEditable(false);
        editorialtxt.setBackground(Color.gray);
        btForeign.setEnabled(false);
        autortxt.setEditable(false);
        autortxt.setBackground(Color.gray);
    }

    public void LimpiarTxtf() {
        idtxt.setText("");
        titulotxt.setText("");
        generotxt.setText("");
        añotxt.setText("");
        editorialtxt.setText("");
        autortxt.setText("");
    }

    public void Deshabilitar1() {
        btBuscar1.setEnabled(true);
        btInsertar1.setEnabled(true);
        btModificar1.setEnabled(true);
        btEliminar1.setEnabled(true);
        btMostrar1.setEnabled(true);
        btSi1.setEnabled(false);
        btNo1.setEnabled(false);
    }

    public void DesTextf1() {
        idtxt1.setEditable(false);
        idtxt1.setBackground(Color.GRAY);
        nombretxt.setEditable(false);
        nombretxt.setBackground(Color.GRAY);
        teltxt.setEditable(false);
        teltxt.setBackground(Color.GRAY);
    }

    public void LimpiarTxtf1() {
        idtxt1.setText("");
        nombretxt.setText("");
        teltxt.setText("");
    }

    public void Deshabilitar3() {
        btBuscar3.setEnabled(true);
        btInsertar3.setEnabled(true);
        btModificar3.setEnabled(true);
        btEliminar3.setEnabled(true);
        btMostrar3.setEnabled(true);
        btSi3.setEnabled(false);
        btNo3.setEnabled(false);
    }

    public void DesTextf3() {
        idtxt3.setEditable(false);
        idtxt3.setBackground(Color.GRAY);
        nombretxt3.setEditable(false);
        nombretxt3.setBackground(Color.GRAY);
        ap_pat3.setEditable(false);
        ap_pat3.setBackground(Color.GRAY);
        ap_mat3.setEditable(false);
        ap_mat3.setBackground(Color.GRAY);
        contr3.setEditable(false);
        contr3.setBackground(Color.gray);
        fecha3.setEnabled(false);
        fecha3.setBackground(Color.GRAY);
        puesto3.setEditable(false);
        puesto3.setBackground(Color.GRAY);
        usertxt.setEditable(false);
        usertxt.setBackground(Color.GRAY);
        passtxt.setEditable(false);
        passtxt.setBackground(Color.GRAY);
    }

    public void LimpiarTxtf3() {
        idtxt3.setText("");
        nombretxt3.setText("");
        ap_pat3.setText("");
        ap_mat3.setText("");
        contr3.setText("");
        fecha3.setDate(null);
        puesto3.setText("");
        usertxt.setText("");
        passtxt.setText("");
    }

    public void Deshabilitar4() {
        btBuscar4.setEnabled(true);
        btInsertar4.setEnabled(true);
        btModificar4.setEnabled(true);
        btEliminar4.setEnabled(true);
        btMostrar4.setEnabled(true);
        btSi4.setEnabled(false);
        btNo4.setEnabled(false);
    }

    public void DesTextf4() {
        idtxt4.setEditable(false);
        idtxt4.setBackground(Color.GRAY);
        nombretxt4.setEditable(false);
        nombretxt4.setBackground(Color.GRAY);
        ap_pat4.setEditable(false);
        ap_pat4.setBackground(Color.GRAY);
        ap_mat4.setEditable(false);
        ap_mat4.setBackground(Color.GRAY);
        tel4.setEditable(false);
        tel4.setBackground(Color.GRAY);
        direccion.setEditable(false);
        direccion.setBackground(Color.GRAY);
    }

    public void LimpiarTxtf4() {
        idtxt4.setText("");
        nombretxt4.setText("");
        ap_pat4.setText("");
        ap_mat4.setText("");
        tel4.setText("");
        direccion.setText("");
    }

    public void Deshabilitar6() {
        btBuscar6.setEnabled(true);
        btInsertar6.setEnabled(true);
        btModificar6.setEnabled(true);
        btEliminar6.setEnabled(true);
        btMostrar6.setEnabled(true);
        btSi6.setEnabled(false);
        btNo6.setEnabled(false);
    }

    public void DesTextf6() {
        idtxt6.setEditable(false);
        idtxt6.setBackground(Color.GRAY);
        usuariotxt6.setEditable(false);
        usuariotxt6.setBackground(Color.GRAY);
        fechatxt6.setEditable(false);
        fechatxt6.setBackground(Color.GRAY);
        clientetxt.setEditable(false);
        clientetxt.setBackground(Color.GRAY);
        btForeign3.setEnabled(false);
        btAgregar.setEnabled(false);
        btEditar.setEnabled(false);
        btQuitar.setEnabled(false);
    }

    public void LimpiarTxtf6() {
        idtxt6.setText("");
        usuariotxt6.setText("");
        fechatxt6.setText("");
        clientetxt.setText("");
        spinner.setText("");
        DefaultTableModel model = (DefaultTableModel) venta_libro.getModel();
        model.setRowCount(0);
    }

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contratacion;
    private javax.swing.JLabel Contratacion1;
    public javax.swing.JTextField ap_mat3;
    public javax.swing.JTextField ap_mat4;
    public javax.swing.JTextField ap_pat3;
    public javax.swing.JTextField ap_pat4;
    public javax.swing.JTextField autortxt;
    public javax.swing.JTextField añotxt;
    public javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btBuscar1;
    private javax.swing.JButton btBuscar3;
    private javax.swing.JButton btBuscar4;
    private javax.swing.JButton btBuscar6;
    public javax.swing.JButton btEditar;
    public javax.swing.JButton btEliminar;
    public javax.swing.JButton btEliminar1;
    public javax.swing.JButton btEliminar3;
    public javax.swing.JButton btEliminar4;
    public javax.swing.JButton btEliminar6;
    public javax.swing.JButton btForeign;
    public javax.swing.JButton btForeign3;
    private javax.swing.JButton btInsertar;
    private javax.swing.JButton btInsertar1;
    private javax.swing.JButton btInsertar3;
    private javax.swing.JButton btInsertar4;
    public javax.swing.JButton btInsertar6;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btModificar1;
    private javax.swing.JButton btModificar3;
    private javax.swing.JButton btModificar4;
    private javax.swing.JButton btModificar6;
    public javax.swing.JButton btMostrar;
    public javax.swing.JButton btMostrar1;
    public javax.swing.JButton btMostrar3;
    public javax.swing.JButton btMostrar4;
    public javax.swing.JButton btMostrar6;
    private javax.swing.JButton btNo;
    private javax.swing.JButton btNo1;
    private javax.swing.JButton btNo3;
    private javax.swing.JButton btNo4;
    private javax.swing.JButton btNo6;
    public javax.swing.JButton btQuitar;
    public javax.swing.JButton btSi;
    public javax.swing.JButton btSi1;
    public javax.swing.JButton btSi3;
    public javax.swing.JButton btSi4;
    public javax.swing.JButton btSi6;
    public javax.swing.JTextField clientetxt;
    public javax.swing.JTextField contr3;
    public javax.swing.JTextField direccion;
    public javax.swing.JTextField editorialtxt;
    public com.toedter.calendar.JDateChooser fecha3;
    public javax.swing.JTextField fechatxt6;
    public javax.swing.JTextField generotxt;
    public javax.swing.JTextField idtxt;
    public javax.swing.JTextField idtxt1;
    public javax.swing.JTextField idtxt3;
    public javax.swing.JTextField idtxt4;
    public javax.swing.JTextField idtxt6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbReloj;
    public javax.swing.JLabel lbReloj1;
    public javax.swing.JLabel lbReloj2;
    public javax.swing.JLabel lbReloj3;
    public javax.swing.JLabel lbReloj4;
    public javax.swing.JTextField nombretxt;
    public javax.swing.JTextField nombretxt3;
    public javax.swing.JTextField nombretxt4;
    public javax.swing.JPasswordField passtxt;
    public javax.swing.JTextField puesto3;
    public javax.swing.JLabel spinner;
    public javax.swing.JTabbedPane tabbed;
    public javax.swing.JTextField tel4;
    public javax.swing.JTextField teltxt;
    public javax.swing.JTextField titulotxt;
    public javax.swing.JTextField usertxt;
    public javax.swing.JTextField usuariotxt6;
    public javax.swing.JTable venta_libro;
    // End of variables declaration//GEN-END:variables
}
