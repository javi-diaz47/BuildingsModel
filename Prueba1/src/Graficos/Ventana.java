package Graficos;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


public class Ventana extends javax.swing.JFrame {
//Atributos generales
    //DEfinicion de ArrayList
    public ArrayList<Nodo> ArregloNodo = new ArrayList();
    public ArrayList<Linea> ArregloLinea = new ArrayList();
    public ArrayList<JLabel> ArregloJLabel = new ArrayList();
    //public ArrayList<JLabel> ArregloJLabelArista = new ArrayList();

    public int [] x = new int[100]; 
    public int [] y = new int[100]; 
    public int r = 40; 
    public int indicador = 0; 
    public int contador = 1; 
    public int ThisLabel = 0;
    public boolean Nodob = false; 
    public boolean Moverb = false; 
    public boolean Lineab = false; 
    public boolean delete = false; 
    public boolean Editar = false;
    public int contadorArista = 0;
    
    
    public Ventana() {
        initComponents(); //Carga los elementos del jpanel
        setLocationRelativeTo(null);//Pone en el medio de la pantalla la 
        //this.setUndecorated(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        Nodo = new javax.swing.JButton();
        Mover = new javax.swing.JButton();
        Linea = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Panelp = new javax.swing.JPanel();
        PanelLinea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();
        Id = new javax.swing.JLabel();
        Text = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Cmaximo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IdArista = new javax.swing.JTextField();
        FlujoArista = new javax.swing.JTextField();
        LamArista = new javax.swing.JTextField();
        UpdateArista = new javax.swing.JButton();
        EditarArista = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NewModel = new javax.swing.JMenuItem();
        OpenModel = new javax.swing.JMenuItem();
        SaveModel = new javax.swing.JMenuItem();
        CloseApp = new javax.swing.JMenuItem();
        AboutUs = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grafos");

        Nodo.setText("Nodo");
        Nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodoActionPerformed(evt);
            }
        });

        Mover.setText("Mover");
        Mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverActionPerformed(evt);
            }
        });

        Linea.setText("Arista");
        Linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineaActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Edit.setText("Editar");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Panelp.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelpLayout = new javax.swing.GroupLayout(Panelp);
        Panelp.setLayout(PanelpLayout);
        PanelpLayout.setHorizontalGroup(
            PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelpLayout.setVerticalGroup(
            PanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelLinea.setBackground(new java.awt.Color(255, 255, 255));
        PanelLinea.setForeground(new java.awt.Color(204, 204, 204));

        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane1.setViewportView(Texto);

        Id.setText("C minima");

        Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });

        Update.setText("Actualizar nodo");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("C Maxima");

        jLabel2.setText("ID");

        jLabel3.setText("Flujo");

        jLabel4.setText("Lambda");

        jLabel5.setText("Aristas");

        jLabel6.setText("Nodos");

        IdArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdAristaActionPerformed(evt);
            }
        });

        FlujoArista.setEnabled(false);

        LamArista.setEnabled(false);

        UpdateArista.setText("Actualizar arista");
        UpdateArista.setEnabled(false);
        UpdateArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAristaActionPerformed(evt);
            }
        });

        EditarArista.setText("Editar");
        EditarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarAristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLineaLayout = new javax.swing.GroupLayout(PanelLinea);
        PanelLinea.setLayout(PanelLineaLayout);
        PanelLineaLayout.setHorizontalGroup(
            PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLineaLayout.createSequentialGroup()
                .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLineaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLineaLayout.createSequentialGroup()
                                .addComponent(IdArista, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditarArista, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                            .addComponent(LamArista)
                            .addComponent(FlujoArista)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLineaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLineaLayout.createSequentialGroup()
                                .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Text, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(Cmaximo)
                                    .addGroup(PanelLineaLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel6)))))))
                .addGap(15, 15, 15))
            .addGroup(PanelLineaLayout.createSequentialGroup()
                .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLineaLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel5))
                    .addGroup(PanelLineaLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLineaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(UpdateArista, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        PanelLineaLayout.setVerticalGroup(
            PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLineaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id))
                .addGap(18, 18, 18)
                .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Cmaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IdArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarArista))
                .addGap(18, 18, 18)
                .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FlujoArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PanelLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LamArista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(UpdateArista)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Linea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                        .addComponent(mostrar))
                    .addComponent(Panelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PanelLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Mover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mostrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelLinea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );

        jMenu1.setText("File");

        NewModel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        NewModel.setText("New model");
        NewModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewModelActionPerformed(evt);
            }
        });
        jMenu1.add(NewModel);

        OpenModel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        OpenModel.setText("Open model");
        OpenModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenModelActionPerformed(evt);
            }
        });
        jMenu1.add(OpenModel);

        SaveModel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SaveModel.setText("Save model");
        SaveModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveModelActionPerformed(evt);
            }
        });
        jMenu1.add(SaveModel);

        CloseApp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CloseApp.setText("Close app");
        CloseApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseAppActionPerformed(evt);
            }
        });
        jMenu1.add(CloseApp);

        jMenuBar1.add(jMenu1);

        AboutUs.setText("About us");
        AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsActionPerformed(evt);
            }
        });
        jMenuBar1.add(AboutUs);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodoActionPerformed
        Nodob = true;
        Lineab = false; 
        Moverb = false;
        delete =  false; 
        Raton(); 
        Mover.setEnabled(true);
        Eliminar.setEnabled(true);
        Nodo.setEnabled(false);
        Linea.setEnabled(true);
        Edit.setEnabled(true);
        Update.setEnabled(false);
    }//GEN-LAST:event_NodoActionPerformed

    private void MoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverActionPerformed
        // TODO add your handling code here:
        Moverb = true;
        Nodob = false;
        Lineab = false;
        delete =  false;
        Editar =  false;
        Mover.setEnabled(false);
        Eliminar.setEnabled(true);
        Nodo.setEnabled(true);
        Linea.setEnabled(true);
        Edit.setEnabled(true);
        Update.setEnabled(false);
        arrastrarNodo(); 
        
    }//GEN-LAST:event_MoverActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        System.out.println("\n");
        for (int i = 0; i < ArregloNodo.size(); i++) {
            System.out.println("[" + ArregloNodo.get(i).getX + "] [" + ArregloNodo.get(i).getY + "]");
        }
        System.out.println("ArregloJLabel.size(): [" + ArregloJLabel.size() + "]");
        Label label = new Label(); 
        for (int i = 0; i < ArregloJLabel.size(); i++) {
           label.CreateLabel(Panelp, ArregloJLabel, ArregloNodo.get(i).id, ArregloNodo.get(i).getX, ArregloNodo.get(i).getY, "", ArregloNodo); 
        }
    }//GEN-LAST:event_mostrarActionPerformed

    private void LineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineaActionPerformed
        // TODO add your handling code here:
        Lineab = true; 
        Nodob = false; 
        Moverb = false; 
        delete =  false;
        CrearLinea(); 
        Mover.setEnabled(true);
        Eliminar.setEnabled(true);
        Nodo.setEnabled(true);
        Linea.setEnabled(false);
        Edit.setEnabled(true);
        Update.setEnabled(false);
       
    }//GEN-LAST:event_LineaActionPerformed

    private void SaveModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveModelActionPerformed
        // TODO add your handling code here:
        SaveModel save = new SaveModel();
        
        save.Save(this.ArregloNodo, this.contador, ArregloLinea, ArregloJLabel);
    }//GEN-LAST:event_SaveModelActionPerformed

    private void NewModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewModelActionPerformed
        // TODO add your handling code here:
        System.out.println("Control + n");
        NewModel V2 = new NewModel(); 
        V2.NewModel();
    }//GEN-LAST:event_NewModelActionPerformed

    private void AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsActionPerformed
        // TODO add your handling code here:
        //System.out.println("Cualquier donacion es bienvenida, Gracias..!!!!");
    }//GEN-LAST:event_AboutUsActionPerformed

    private void OpenModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenModelActionPerformed
        // TODO add your handling code here:
        //NewModel V2 = new NewModel(); 
        //V2.NewModel();
        File dir = new File("Building-Models");
            
        if(!dir.exists()){
            dir.mkdir();
        }
        jFileChooser1.setCurrentDirectory(dir);
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == jFileChooser1.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            try {
                // What to do with the file, e.g. display it in a TextArea
                Texto.read( new FileReader( file.getAbsolutePath() ), null );
                
                Load(file);
                
            } catch (Exception ex) {
                System.out.println("problem accessing file"+file.getAbsolutePath());
            }
        } else {
        System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_OpenModelActionPerformed

    private void CloseAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseAppActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        dispose(); 
        
    }//GEN-LAST:event_CloseAppActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        Lineab = false; 
        Nodob = false; 
        Moverb = false; 
        delete =  true;
        DeleteNode();
        //DeleteNode();
       // Pintador_Emergencia();
        //VenidAPorMi
        Mover.setEnabled(true);
        Eliminar.setEnabled(false);
        Nodo.setEnabled(true);
        Linea.setEnabled(true);
        Edit.setEnabled(true);
        Update.setEnabled(false);
    }//GEN-LAST:event_EliminarActionPerformed

    private void TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        
        String TextLabel = Text.getText();
        String CmaximoText = Cmaximo.getText();
        if(IsNumeric(TextLabel) == true && IsNumeric(CmaximoText) == true){
            
            //int idConvertido = Integer.valueOf(TextLabel);
            Nodo n = new Nodo();
            n.setCminimo(TextLabel);
            n.setCmaximo(CmaximoText);
            ArregloNodo.get(ThisLabel).setCmaximo(CmaximoText);
            
            if(Integer.valueOf(CmaximoText) < Integer.valueOf(TextLabel)){
                alert("La capacidad minima no puede exceder a la capacidad maxima");
            }else{
                ArregloNodo.get(ThisLabel).setCminimo(TextLabel);
            }
            
            System.out.println("ThisLabel -> " + ThisLabel);
            ArregloJLabel.get(ThisLabel).setText(TextLabel);
            System.out.println("TextLabel = " + TextLabel);
            Panelp.removeAll();
            Panelp.repaint();
            
            Label LabelA =  new Label();
            //ArregloJLabelArista = LabelA.LabelArista(ArregloLinea, ArregloNodo, Panelp);
            LabelA.LabelArista(ArregloLinea, ArregloNodo, Panelp);
            
            hack_3(TextLabel, CmaximoText);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        
        Nodob = false;
        Lineab = false; 
        Moverb = false;
        delete =  false; 
        Editar = true;
        //Edit(1, "");
        Edit(indicador, "");
        Mover.setEnabled(true);
        Eliminar.setEnabled(true);
        Nodo.setEnabled(true);
        Linea.setEnabled(true);
        Edit.setEnabled(false);
        Update.setEnabled(false);
    }//GEN-LAST:event_EditActionPerformed

    private void UpdateAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAristaActionPerformed
        // TODO add your handling code here:
        EditarArista.setEnabled(false);
        if(IsNumeric(FlujoArista.getText()) && IsNumeric(LamArista.getText())){
            if(IsNumeric(IdArista.getText())){
                int id = Integer.valueOf(IdArista.getText());
                for (Linea linea : ArregloLinea) {
                    if(linea.getId() == id){
                        linea.setFlujo(Integer.valueOf(FlujoArista.getText()));
                        linea.setLam(Integer.valueOf(LamArista.getText()));
                        FlujoArista.setEnabled(false);
                        LamArista.setEnabled(false);
                        UpdateArista.setEnabled(false);
                        EditarArista.setEnabled(true);
                        IdArista.setEnabled(true);
                        break;
                    }
                        
                }
            }
        }
    }//GEN-LAST:event_UpdateAristaActionPerformed

    private void IdAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdAristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdAristaActionPerformed

    private void EditarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarAristaActionPerformed
        // TODO add your handling code here:
        boolean aux = false;
        if(IsNumeric(IdArista.getText())){
            int id = Integer.valueOf(IdArista.getText());
            for (Linea linea : ArregloLinea) {
                if(linea.getId() == id){
                    aux = true;
                    FlujoArista.setEnabled(true);
                    LamArista.setEnabled(true);
                    UpdateArista.setEnabled(true);
                    FlujoArista.setText(String.valueOf(linea.getFlujo()));
                    LamArista.setText(String.valueOf(linea.getLam()));
                    IdArista.setEnabled(false);
                    EditarArista.setEnabled(false);
                    break;
                }
            }
            
        }
        if(!aux){
            alert("Lo sentimos, pero esa arista no ha sido creada");
            FlujoArista.setText("");
            LamArista.setText("");
            FlujoArista.setEnabled(false);
            LamArista.setEnabled(false);
            UpdateArista.setEnabled(false);
            EditarArista.setEnabled(true);
        }
        
    }//GEN-LAST:event_EditarAristaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutUs;
    private javax.swing.JMenuItem CloseApp;
    private javax.swing.JTextField Cmaximo;
    private javax.swing.JButton Edit;
    private javax.swing.JButton EditarArista;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField FlujoArista;
    private javax.swing.JLabel Id;
    private javax.swing.JTextField IdArista;
    private javax.swing.JTextField LamArista;
    private javax.swing.JButton Linea;
    private javax.swing.JButton Mover;
    private javax.swing.JMenuItem NewModel;
    private javax.swing.JButton Nodo;
    private javax.swing.JMenuItem OpenModel;
    private javax.swing.JPanel PanelLinea;
    private javax.swing.JPanel Panelp;
    private javax.swing.JMenuItem SaveModel;
    private javax.swing.JTextField Text;
    private javax.swing.JTextArea Texto;
    private javax.swing.JButton Update;
    private javax.swing.JButton UpdateArista;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrar;
    // End of variables declaration//GEN-END:variables

    public void Raton(){
       
        MouseListener oyente;
        oyente = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                if(Moverb == true || Lineab == true || delete == true || Editar == true){
                   Panelp.removeMouseListener(this); 
                }
                int getX = e.getX() - 20; 
                int getY = e.getY() - 20;
                //int r = 30; 
                
                boolean isAlreadyNode = false;
                int tmp = ArregloNodo.size();
               
                if(tmp < 1){
                    tmp = 1;
                }
                
                for (int i = 0; i < ArregloNodo.size(); i++) {
                    //System.out.println("Hey, aca estamos");
                    System.out.println("ArrX range: (" + (ArregloNodo.get(i).getX - r - 5) + " - " + (ArregloNodo.get(i).getX + r - 5) + ")\n evX: " + getX);
                    if( (getX >= ArregloNodo.get(i).getX - r - 5) && (getX <= ArregloNodo.get(i).getX + r - 5) && (getY >= ArregloNodo.get(i).getY - r - 5) && (getY <= ArregloNodo.get(i).getY + r - 5) ){
                        System.out.println("Compa no se puede...!");
                        isAlreadyNode = true;
                        break;
                    } 
                }
   
                if(!isAlreadyNode){   
                    Nodo n = new Nodo(); 
                    n.Circulo(Panelp.getGraphics(), getX, getY, r, r, Color.yellow);
                    if(ArregloNodo.contains(n)){
                        ArregloNodo.remove(ArregloNodo.size()); 
                        System.out.println("Lo detecté...!");
                    }
                   
                    System.out.println("x " + e.getX() + " y " + e.getY());
                    //ArregloNodo.setGetX(getX,); 
                    n.setGetX(getX);
                    n.setGetY(getY);
                    n.setId(contador);
                    n.setCminimo("0");
                    n.setCmaximo("0");
                    n.setColor(Color.yellow);
                    ArregloNodo.add(n);
                    Panelp.setLayout(null);
                    JLabel label = new JLabel("q", SwingConstants.CENTER);
                    label.setText("[" + n.getCminimo() + "," + n.getCmaximo()+ "]");
                    Panelp.add(label);
                    label.setBackground(Color.white);
                    //label.setColor(Color.yellow);
                    label.setOpaque(true);
                    label.setBounds(e.getX()-24, e.getY()-40, 50,15);
                    //label.setVerticalAlignment(SwingConstants.CENTER);
                    ArregloJLabel.add(label);
                    contador++; 
                    //System.out.println(ArregloNodo); 
                    for (Nodo nodo : ArregloNodo) {
                        System.out.println("getX: " + nodo.getX + " getY: " + nodo.getY  +  " id: [" + nodo.id + "]");
                        Label labelId = new Label();
                        labelId.CreateId(Panelp, ArregloNodo, nodo.id);

                    }
                    
                    System.out.println("Contador: -> " + ArregloNodo.size());
                    
                }      
          
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        Panelp.addMouseListener(oyente);
        //Panelp.get
    }
    
   public boolean EstaDentro(MouseEvent e){
       for(int i = 0; i < ArregloNodo.size(); i++){
           if((e.getX() > ArregloNodo.get(i).getX) &&(e.getX() < (ArregloNodo.get(i).getX + r)) &&(e.getY() > ArregloNodo.get(i).getY) && (e.getY() < (ArregloNodo.get(i).getY + r))){
               indicador = i; 
               break; 
           }
       }
        if ((e.getX() > ArregloNodo.get(indicador).getX) &&(e.getX() < (ArregloNodo.get(indicador).getX + r)) &&(e.getY() > ArregloNodo.get(indicador).getY) && (e.getY() < (ArregloNodo.get(indicador).getY + r))){
             return true;
        }
       return false;
   }
     
     public void arrastrarNodo(){
         MouseMotionListener arrastrar = new MouseMotionListener() {
             private boolean arrastrando = false; 
             private int xAnteriorRaton;
             private int yAnteriorRaton;
             
             @Override
             public void mouseDragged(MouseEvent e) {
                  if(Nodob == true || Lineab == true || delete == true || Editar == true){
                   Panelp.removeMouseMotionListener(this);
                }
                 // Si comienza el arrastre ...
                if (!arrastrando){
                   // ... y el ratón está dentro del rectángulo
                   if (EstaDentro(e)){
                      // Se guardan las posiciones del ratón
                      xAnteriorRaton = e.getX();
                      yAnteriorRaton = e.getY();
                      // y se marca que ha comenzado el arrastre.
                      arrastrando = true;
                     
                   }
                   Nodo repintarNodo = new Nodo();
                   for (Nodo nodo : ArregloNodo) {
                       // System.out.println("Nodo ID: " + nodo.id);
                        if(Integer.valueOf(nodo.Cmaximo) >= 100) {
                            repintarNodo.Rectangulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.cyan);
                        }else if(Integer.valueOf(nodo.Cminimo) > 0){ 
                            repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.red);
                        }else{
                             repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.yellow);
                        }
                         Label labelId = new Label();
                        labelId.CreateId(Panelp, ArregloNodo, nodo.id);

                        //repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r ,Color.yellow);
                    }
                    
                   System.out.println("ArregloJLabel.size(): [" + ArregloJLabel.size() + "]");
                   Label label = new Label(); 

                   for (int i = 0; i < ArregloJLabel.size(); i++) {
                      //int aux = Integer.valueOf(ArregloNodo.get(i).getCminimo());
                      label.CreateLabel(Panelp, ArregloJLabel, ArregloNodo.get(i).id, ArregloNodo.get(i).getX, ArregloNodo.get(i).getY, "", ArregloNodo); 
                      
                   }
                   
                } else{   
                   // Si ya había empezado el arrastre, se calculan las nuevas
                   // coordenadas del rectángulo
                   int nuevaX = (ArregloNodo.get(indicador).getX + e.getX()) - xAnteriorRaton;
                   int nuevaY = (ArregloNodo.get(indicador).getY + e.getY()) - yAnteriorRaton;
                   
                   ArregloNodo.get(indicador).setGetX(nuevaX);
                   ArregloNodo.get(indicador).setGetY(nuevaY);
                   
                   // Se guarda la posición del ratón para el siguiente cálculo
                   xAnteriorRaton = e.getX();
                   yAnteriorRaton = e.getY();
                    
                    System.out.println("ArregloJLabel.size(): [" + ArregloJLabel.size() + "]");
                    Panelp.removeAll();
                    Panelp.repaint();
                    Nodo repintarNodo = new Nodo();

                    for (Linea linea : ArregloLinea) {
                        linea.LineaId(Panelp.getGraphics(), linea.id1, linea.id2, ArregloNodo, r, ArregloLinea ,Panelp);
                        System.out.println("ID1: " + linea.id1 + "\t ID2: " + linea.id2);
                    }
                    for (Nodo nodo : ArregloNodo) {

                        if(Integer.valueOf(nodo.Cmaximo) >= 100) {
                               repintarNodo.Rectangulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.cyan);
                        }else if(Integer.valueOf(nodo.Cminimo) > 0){ 
                           repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.red);
                        }else{
                            repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.yellow);
                        }

                    }
                  System.out.println("ArregloJLabel.size(): [" + ArregloJLabel.size() + "]");
                   Label label = new Label(); 

                   for (int i = 0; i < ArregloJLabel.size(); i++) {
                      label.CreateLabel(Panelp, ArregloJLabel, ArregloNodo.get(i).id, ArregloNodo.get(i).getX, ArregloNodo.get(i).getY, ArregloNodo.get(i).getCminimo(), ArregloNodo); 
                   }
                    
                    Label LabelA =  new Label();
                    //ArregloJLabelArista = LabelA.LabelArista(ArregloLinea, ArregloNodo, Panelp);
                    LabelA.LabelArista(ArregloLinea, ArregloNodo, Panelp);


//                    for (int i = 0; i < ArregloJLabelArista.size(); i++) {
//                        ArregloJLabelArista.set(i, LabelA.LabelArista(ArregloLinea, ArregloNodo, Panelp));
//                    }
                    
//                    for (JLabel jLabel : ArregloJLabelArista) {
//                         Panelp.add(jLabel);
//                     }
//                
                    
                   hack_2();
                }
             }

             @Override
             public void mouseMoved(MouseEvent e) {
                if(Nodob == true || Lineab == true || delete == true){
                   Panelp.removeMouseMotionListener(this);
                }
                 arrastrando = false;
                }
         }; 
         Panelp.addMouseMotionListener(arrastrar);
     }
     
     public void CrearLinea(){
         MouseListener linea = new MouseListener() {
             
             @Override
             public void mouseClicked(MouseEvent e) {
             }
             int inicioX = 0; 
             int inicioY = 0; 
             int LlegadaX = 0; 
             int LlegadaY = 0; 
             @Override
             public void mousePressed(MouseEvent e) {
                 //inicioX = 0; 
                 //inicioY = 0;
                 inicioX = e.getX(); 
                 inicioY = e.getY(); 
                 
             }

             @Override
             public void mouseReleased(MouseEvent e) {
                 if(Moverb == true || Nodob == true || delete == true){
                   Panelp.removeMouseListener(this); 
                  }
                 //LlegadaX = 0; 
                 //LlegadaY = 0;
                 LlegadaX = e.getX(); 
                 LlegadaY = e.getY();
                 Linea l = new Linea(); 
                 contadorArista = l.Linea(Panelp.getGraphics(), inicioX, inicioY, LlegadaX, LlegadaY, ArregloNodo, r, ArregloLinea, l, ArregloJLabel, Panelp, contadorArista);

//                 Label labelArista = new Label();
//                ArregloJLabelArista.add(labelArista.LabelArista(ArregloLinea, ArregloNodo));
                //System.out.println("ArregloJLabelArista.size() = " + ArregloJLabelArista.size());
//                 for (JLabel label : ArregloJLabelArista) {
//                     Panelp.add(label);
//                 }
                //System.out.println("ArregloJLabelArista.size() = " + ArregloJLabelArista.size());
                hack_2();

             }

             @Override
             public void mouseEntered(MouseEvent e) {
             }

             @Override
             public void mouseExited(MouseEvent e) {
             }
         }; 
         Panelp.addMouseListener(linea);
     }
     
     
     //Cargando un Modelo
     public void Load(File file){
         
        int cont = 0; 
        Scanner scan;
        try {
            
            scan = new Scanner(file);
            
            int k = 0;
            while(scan.hasNextLine()){
             String data = scan.nextLine();

             String[] properties = data.split(";");
             
             if(properties[0].equals("Node")){
    
                int getX= Integer.parseInt(properties[1]);
                int getY = Integer.parseInt(properties[2]);
                int Id = Integer.parseInt(properties[3]);
                String TextNodoLoad = properties[4];
                String CmaximaLoad = properties[5];
                int  ColorId= Integer.parseInt(properties[6]);
//                x[cont] = Integer.parseInt(properties[1]);
//                y[cont] = Integer.parseInt(properties[2]);
               
                //Nodo
                Nodo n = new Nodo(); 
                n.Circulo(Panelp.getGraphics(), getX, getY, r, r,Color.yellow);
                n.setGetX(getX);
                n.setGetY(getY);
                n.setId(Id);
                n.setCminimo(TextNodoLoad);
                n.setCmaximo(CmaximaLoad);
                if(ColorId == 1){
                    n.setColor(Color.yellow);
                }else if(ColorId == 2){
                    n.setColor(Color.cyan);
                }else{
                    n.setColor(Color.red);
                }
                     
                
                ArregloNodo.add(n);
                Label labelId = new Label();
                labelId.CreateId(Panelp, ArregloNodo, n.id);
                //Label
                JLabel label = new JLabel("", SwingConstants.CENTER);
                label.setText(TextNodoLoad);
                Panelp.add(label);
                label.setBackground(Color.white);
                label.setOpaque(true);
                ArregloJLabel.add(label);
                
                //Repinta todos los nodos
                for (Nodo nodo : ArregloNodo) {
                    System.out.println("getX: " + nodo.getX + " getY: " + nodo.getY);
                }
                System.out.println("Node Done!");
                cont += 1; 
             }
             
            if(properties[0].equals("Line")){
                int getId1 = Integer.parseInt(properties[1]);
                int getId2 = Integer.parseInt(properties[2]);
                int getFlujo = Integer.parseInt(properties[3]);
                int getLam = Integer.parseInt(properties[4]);
                
                System.out.println("Id1: " + getId1);
                System.out.println("Id2: " + getId2);
                Linea l = new Linea(); 
                l.setInicio(getId1);
                l.setEnd(getId2);
                l.id1 = getId1;
                l.id2 = getId2;
                l.id = ArregloLinea.size() + 1;
                l.setFlujo(getFlujo);
                l.setLam(getLam);
                ArregloLinea.add(l);
                
                for (Nodo nodo : ArregloNodo) {
                    System.out.println("getX: " + nodo.getX + " getY: " + nodo.getY);
                }
                Label label2 = new Label(); 
                for (int i = 0; i < ArregloJLabel.size(); i++) {
                   //int aux = Integer.valueOf(ArregloNodo.get(i).getCminimo());
                   label2.CreateLabel(Panelp, ArregloJLabel, ArregloNodo.get(i).getId(), ArregloNodo.get(i).getX, ArregloNodo.get(i).getY, ArregloNodo.get(i).getCminimo(), ArregloNodo); 
                }
                 System.out.println("Line Done!");
             }
            System.out.println("ArregloLinea.size() = " + ArregloLinea.size());
            this.contador =  ArregloNodo.size()+1;
          
            for (Linea linea : ArregloLinea) {
                linea.LineaId(Panelp.getGraphics(), linea.id1, linea.id2, ArregloNodo, r,ArregloLinea ,Panelp);
                System.out.println("ID1: " + linea.id1 + "\t ID2: " + linea.id2);
                Label LabelA =  new Label();
                LabelA.LabelArista(ArregloLinea, ArregloNodo, Panelp);
            }
            
            
            if(properties[0].equals("Label")){
                
                String textValue = properties[1];

                k++;//Contador de los label
            } 
          
          } //While
            
            Label LabelA =  new Label();
            LabelA.CrearLabelArista(ArregloLinea, ArregloNodo, Panelp);
            hack();
//            Label LabelA =  new Label();
//            LabelA.LabelArista(ArregloLinea, ArregloNodo, Panelp);
                        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void DeleteNode(){
        MouseListener Delete = new MouseListener() {
           @Override
           public void mouseClicked(MouseEvent e) {
                if(Moverb == true || Nodob == true || Lineab == true || Editar == true){
                    Panelp.removeMouseListener(this); 
                }
                
                System.out.println("Estoy en eliminar..!");
                int getX = e.getX();
                int getY = e.getY(); 

                int tmp = ArregloNodo.size();
                int deleteNode = -1;
                if(tmp > 0){
                    
                    for (int i = 0; i < tmp; i++) {
                      //System.out.println("Hey, aca estamos");
                     // System.out.println("ArrX range: (" + (ArregloNodo.get(i).getX - r - 5) + " - " + (ArregloNodo.get(i).getX + r - 5) + ")\n evX: " + getX);
                      if( (getX >= ArregloNodo.get(i).getX - r - 5) && (getX <= ArregloNodo.get(i).getX + r - 5) && (getY >= ArregloNodo.get(i).getY - r - 5) && (getY <= ArregloNodo.get(i).getY + r - 5) ){
                          System.out.println("Compa se eliminó...!");
                          
                          lastMoveX = ArregloNodo.get(i).getX + 5;
                          lastMoveY = ArregloNodo.get(i).getY + 5;
                          deleteNode = ArregloNodo.get(i).id; 
                          ArregloNodo.remove(i);
                          ArregloJLabel.remove(i);
                     
                          break;
                        } 
                      
                    }
                    System.out.println("BORRANDO LINEA");
                    System.out.println("BEFORE - ArregloLinea.size() = " + ArregloLinea.size());
                    final int a = deleteNode;
                    ArregloLinea.removeIf(l -> l.id1 ==  a || l.id2 == a);
                    System.out.println("AFTER - ArregloLinea.size() = " + ArregloLinea.size());
                    System.out.println("So far so good");
                    System.out.println("ArregloJLabel.size(): [" + ArregloJLabel.size() + "]");

                    if(deleteNode > -1){
                        Panelp.removeAll();
                        Panelp.repaint();
                               
                        Label LabelA =  new Label();
                       // ArregloJLabelArista = LabelA.LabelArista(ArregloLinea, ArregloNodo, Panelp);
                        LabelA.LabelArista(ArregloLinea, ArregloNodo, Panelp);
                        hack();
                        
                    }
                }
           }

           @Override
           public void mousePressed(MouseEvent e) {
           }

           @Override
           public void mouseReleased(MouseEvent e) {
           }

           @Override
           public void mouseEntered(MouseEvent e) {
           }

           @Override
           public void mouseExited(MouseEvent e) {
               
           }
       }; 
       Panelp.addMouseListener(Delete);
     }
  
    public void hack(){
         MouseMotionListener arrashack = new MouseMotionListener() {
             @Override
             public void mouseDragged(MouseEvent e) {}
             
             @Override
             public void mouseMoved(MouseEvent e) {
                if(Nodob == true || Lineab == true || Moverb == true || Editar == true){
                   Panelp.removeMouseMotionListener(this);
                } 
                 Nodo repintarNodo = new Nodo();
                 for (Nodo nodo : ArregloNodo) {
                    if(Integer.valueOf(nodo.Cmaximo) >= 100) {
                            repintarNodo.Rectangulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.cyan);
                    }else if(Integer.valueOf(nodo.Cminimo) > 0){ 
                        repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.RED);
                    }else{
                         repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.yellow);
                    }
                    Label labelId = new Label();
                    labelId.CreateId(Panelp, ArregloNodo, nodo.id);
                 }
                
                
                 
                for (Linea linea : ArregloLinea) {
                     linea.LineaId(Panelp.getGraphics(), linea.id1, linea.id2, ArregloNodo, r,ArregloLinea ,Panelp);
                 }
                
               
                 
                Label label = new Label(); 
                for (int i = 0; i < ArregloJLabel.size(); i++) {
                   int aux = Integer.valueOf(ArregloNodo.get(i).getCminimo());
                   label.CreateLabel(Panelp, ArregloJLabel, ArregloNodo.get(i).getId(), ArregloNodo.get(i).getX, ArregloNodo.get(i).getY, ArregloNodo.get(i).getCminimo(), ArregloNodo); 
                }
                
            
                Panelp.removeMouseMotionListener(this);
             }
             
         
         }; 
         Panelp.addMouseMotionListener(arrashack);
         
         try {
            Robot robot = new Robot();

            // Move mouse cursor to 200, 200
//          // Press the mouse button #1.
            robot.mouseMove(300, 300);
//
//            // Scroll the screen up for a mouse with a wheel support.
            robot.mouseWheel(-100);
       } catch (AWTException e) {
           e.printStackTrace();
       }
         
      }
    
    int lastMoveX = 0;
    int lastMoveY = 0;
    
    private void alert(String s){
        JOptionPane.showMessageDialog(null, s);
    }
    
    public void hack_2(){
         MouseMotionListener arrashack = new MouseMotionListener() {
             @Override
             public void mouseDragged(MouseEvent e) {}
             
             @Override
             public void mouseMoved(MouseEvent e) {
                 
                if(Nodob == true || Lineab == true || Moverb == true || Editar == true){
                   Panelp.removeMouseMotionListener(this);
                } 
                 Nodo repintarNodo = new Nodo();
                 for (Nodo nodo : ArregloNodo) {
                     if(Integer.valueOf(nodo.Cmaximo) >= 100) {
                            repintarNodo.Rectangulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.cyan);
                     }else if(Integer.valueOf(nodo.Cminimo) > 0){ 
                        repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.red);
                     }else{
                         repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.yellow);
                     }
                      Label labelId = new Label();
                        labelId.CreateId(Panelp, ArregloNodo, nodo.id);

                 }
                
                for (Linea linea : ArregloLinea) {
                     linea.LineaId(Panelp.getGraphics(), linea.id1, linea.id2, ArregloNodo, r,ArregloLinea ,Panelp);
                     System.out.println("ID1: " + linea.id1 + "\t ID2: " + linea.id2);
                 }
                 
                
              
                
                 System.out.println("Repintante liniesita!");
                 Panelp.removeMouseMotionListener(this);
             }
             
         
         }; 
         Panelp.addMouseMotionListener(arrashack);

    }
    
    boolean callTextListenerOneTime = true;
    public void Edit(int Indicador, String TextLabel){
        MouseListener edit = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                if(Moverb == true || Nodob == true || Lineab == true || delete == true){
                    Panelp.removeMouseListener(this); 
                }
                 //Panelp.removeMouseMotionListener(this);
                for(int i = 0; i < ArregloNodo.size(); i++){
                    if((e.getX() > ArregloNodo.get(i).getX) &&(e.getX() < (ArregloNodo.get(i).getX + r)) &&(e.getY() > ArregloNodo.get(i).getY) && (e.getY() < (ArregloNodo.get(i).getY + r))){
                        ThisLabel = i; 
                        Update.setEnabled(true);
                        break; 
                    }
                }
                System.out.println("Id del Nodo [" + ThisLabel + "] -> " + ArregloNodo.get(ThisLabel).id);
                Text.setText(String.valueOf(ArregloNodo.get(ThisLabel).getCminimo()));
                Cmaximo.setText(String.valueOf(ArregloNodo.get(ThisLabel).getCmaximo()));

               if(callTextListenerOneTime){
                    textListener();
                    callTextListenerOneTime = false;            
               }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        Panelp.addMouseListener(edit);
    }
    
    public void textListener(){
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Update.doClick();
                Text.removeMouseListener(this);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Update.doClick();
                Text.removeMouseListener(this);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Update.doClick();
                Text.removeMouseListener(this);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Update.doClick();
                Text.removeMouseListener(this);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Update.doClick();
                Text.removeMouseListener(this);
            }
        };
        
        Text.addMouseListener(mouseListener);
        
    }
    
    public boolean IsNumeric(String string){
        boolean resultado;
        try{
            Integer.parseInt(string);
            resultado = true;
        } catch(NumberFormatException excepcion){
            resultado = false;
            
        }
        
        return resultado;
    }
    
    public void EditArista(){
        IdArista.setEnabled(true);
        int id = Integer.valueOf(IdArista.getText());
        if(ArregloLinea.get(id).getId() == id){
            
        }
    }
    
    
    
    
    public void hack_3(String TextLabel, String CmaximoText){
         MouseMotionListener arrashack = new MouseMotionListener() {
             @Override
             public void mouseDragged(MouseEvent e) {}
             
             @Override
             public void mouseMoved(MouseEvent e) {
                if(Nodob == true || Lineab == true || Moverb == true || Editar == true){
                   Panelp.removeMouseMotionListener(this);
                } 
                 Nodo repintarNodo = new Nodo();
                 
                 int iterator = 0;
                 for (Nodo nodo : ArregloNodo) {
                    if(Integer.valueOf(nodo.Cmaximo) >= 100) {
                        repintarNodo.Rectangulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.cyan);
                        ArregloNodo.get(iterator).setColor(Color.cyan);
                    }else if(Integer.valueOf(nodo.Cminimo) > 0){ 
                        repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.red);
                        ArregloNodo.get(iterator).setColor(Color.red);
                    }else{
                         repintarNodo.Circulo(Panelp.getGraphics(), nodo.getX, nodo.getY, r, r,Color.yellow);
                        ArregloNodo.get(iterator).setColor(Color.yellow);
                    }
                     
                    Label labelId = new Label();
                    labelId.CreateId(Panelp, ArregloNodo, nodo.id);
                     
                     iterator++;
                     
                   
                 }
                for (Linea linea : ArregloLinea) {
                     linea.LineaId(Panelp.getGraphics(), linea.id1, linea.id2, ArregloNodo, r,ArregloLinea,Panelp);
                     System.out.println("ID1: " + linea.id1 + "\t ID2: " + linea.id2);
                 }
                System.out.println("ArregloJLabel.size(): [" + ArregloJLabel.size() + "]");
                Label label = new Label(); 
                for(int i = 0; i < ArregloJLabel.size(); i++) { 
                   //int aux = Integer.valueOf(ArregloNodo.get(i).getCminimo());
                   if(ArregloNodo.get(i).id== ThisLabel+1){
                       label.CreateLabel(Panelp, ArregloJLabel, ArregloNodo.get(i).id, ArregloNodo.get(i).getX, ArregloNodo.get(i).getY, TextLabel, ArregloNodo);
                       
                   }else{
                       label.CreateLabel(Panelp, ArregloJLabel, ArregloNodo.get(i).id, ArregloNodo.get(i).getX, ArregloNodo.get(i).getY, "", ArregloNodo);
                   }
                }
                hack();
                 System.out.println("Repintante liniesita!");
                 Panelp.removeMouseMotionListener(this);
             }
         
         }; 
         System.out.println("we're in hack!");
         Panelp.addMouseMotionListener(arrashack);
         
         try {
            Robot robot = new Robot();
          // Move mouse cursor to 300, 300
           robot.mouseMove(300, 300);
          // Scroll the screen up for a mouse with a wheel support.
           robot.mouseWheel(-100);
        } catch (AWTException e) {
           e.printStackTrace();
        }
         
      }
}

