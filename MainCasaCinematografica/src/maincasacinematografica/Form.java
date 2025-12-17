/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package maincasacinematografica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author sarap
 */
public class Form extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Form.class.getName());
    private Attore a;
    private Regista r;
    private Camera c;
    private Genere genere;
    private Tipo tipo;
    private Film f;
    private Set s;
    private Luogo luogo;
            
    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
    }
    
    public void Camera(){
        String scelta = cmbCamera.getSelectedItem().toString();
        String percorso = "";
        switch (scelta) {
        case "Z_CAM_E2_M4":
            percorso = "/maincasacinematografica/foto/Z_CAM_E2_M4.jpg";
            break;
        case "PANASONIC_LUMIX_BGH1":
            percorso = "/maincasacinematografica/foto/PANASONIC_LUMIX_BGH1.jpg";
            break;
        case "BLACKMAGIC_PYXIS_6K":
            percorso = "/maincasacinematografica/foto/BLACKMAGIC_PYXIS_6K.jpg";
            break;
        default:
            lblCamera.setIcon(null);
            return;
        }
        lblCamera.setIcon(new ImageIcon(getClass().getResource(percorso)));
        f.diminuisciBudget(c.getCosto());
        lblBudget.setText(String.valueOf(f.getBudget()));
    }
    
    public void Regista(){
        String scelta = cmbRegista.getSelectedItem().toString();
        String percorso = "";
        switch (scelta) {
        case "Steven Spielberg":
            percorso = "/maincasacinematografica/foto/Steven Spielberg.jpg";
            break;
        case "Jon Favreau":
            percorso = "/maincasacinematografica/foto/Jon Favreau.jpg";
            break;
        case "Tim Burton":
            percorso = "/maincasacinematografica/foto/Tim Burton.jpg";
            break;
        case "Christopher Nolan":
            percorso = "/maincasacinematografica/foto/Christopher Nolan.jpg";
            break;    
        default:
            lblRegista.setIcon(null);
            return;
        }
        lblRegista.setIcon(new ImageIcon(getClass().getResource(percorso)));
        f.diminuisciBudget(r.getCosto());
        lblBudget.setText(String.valueOf(f.getBudget()));
    }
    
    public void Set(){
        String scelta = cmbSet.getSelectedItem().toString();
        String percorso = "";
        switch (scelta) {
        case "BIBLIOTECA":
            percorso = "/maincasacinematografica/foto/BIBLIOTECA.jpg";
            break;
        case "OSPEDALE":
            percorso = "/maincasacinematografica/foto/OSPEDALE.jpg";
            break;
        case "SALOTTO":
            percorso = "/maincasacinematografica/foto/SALOTTO.jpg";
            break;
        case "CROCIERA":
            percorso = "/maincasacinematografica/foto/CROCIERA.jpg";
            break;
        case "SPAZIO":
            percorso = "/maincasacinematografica/foto/SPAZIO.jpg";
            break;
        case "RISTORANTE":
            percorso = "/maincasacinematografica/foto/RISTORANTE.jpg";
            break;    
        default:
            lblSet.setIcon(null);
            return;
        }
        lblSet.setIcon(new ImageIcon(getClass().getResource(percorso)));
        f.diminuisciBudget(s.getCosto());
        lblBudget.setText(String.valueOf(f.getBudget()));
    }
        
    
    public void Attore(){
        String scelta = cmbAttore.getSelectedItem().toString();
        String percorso = "";
        switch (scelta) {
        case "Cillian Murphy":
            percorso = "/maincasacinematografica/foto/Cillian Murphy.jpg";
            break;
        case "Scarlett Johansson":
            percorso = "/maincasacinematografica/foto/Scarlett Johansson.jpg";
            break;
        case "Meryl Streep":
            percorso = "/maincasacinematografica/foto/Meryl Streep.jpg";
            break;
        case "Tom Cruise":
            percorso = "/maincasacinematografica/foto/Tom Cruise.jpg";
            break;    
        default:
            lblAttore.setIcon(null);
            return;
        }
        lblAttore.setIcon(new ImageIcon(getClass().getResource(percorso)));
        f.diminuisciBudget(a.getCosto());
        lblBudget.setText(String.valueOf(f.getBudget()));
    }
    
    public void CostoAttore(){
        String scelta = cmbAttore.getSelectedItem().toString();
        switch(scelta){
            case "Cillian Murphy":
            a = new Attore("Cillian","Murphy","protagonista",500,9);
            break;
        case "Scarlett Johansson":
            a = new Attore("Scarlett","Johansson","co-protagonista",400,7);
            break;
        case "Meryl Streep":
            a = new Attore("Meryl","Streep","protagonista",425,7);
            break;
        case "Tom Cruise":
            a = new Attore("Tom","Cruise","co-protagonista",450,7);
            break; 
        }
        lblCostoAttore.setText(String.valueOf(a.getCosto()));
    }
    
    public void CostoCamera(){
        String scelta = cmbCamera.getSelectedItem().toString();
        tipo = Tipo.valueOf(scelta);
        switch(scelta){
            case "Z_CAM_E2_M4":
            c = new Camera(5,40,tipo,6);
            break;
        case "PANASONIC_LUMIX_BGH1":
            c = new Camera(6,60,tipo,7);
            break;
        case "BLACKMAGIC_PYXIS_6K":
            c = new Camera(5,70,tipo,5);
            break; 
        }
        lblCostoCamera.setText(String.valueOf(c.getCosto()));
    }
    
    public void CostoRegista(){
        String scelta = cmbRegista.getSelectedItem().toString();
        switch(scelta){
        case "Steven Spielberg":
            r = new Regista("Steven","Spielberg",300,6);
            break;
        case "Jon Favreau":
            r = new Regista("Jon","Favreau",350,6);
            break;
        case "Tim Burton":
            r = new Regista("Tim","Burton",600,6);
            break;
        case "Christopher Nolan":
            r = new Regista("Christopher","Nolan",700,6);
            break; 
        }
        lblCostoRegista.setText(String.valueOf(r.getCosto()));
    }
    
    public void CostoSet(){
        String scelta = cmbSet.getSelectedItem().toString();
        double costo = 0;
        int luce = 0;
        switch (scelta) {
        case "BIBLIOTECA":
            costo = 20;
            luce = 9;
            break;
        case "OSPEDALE":
            costo = 66;
            luce = 10;
            break;
        case "SALOTTO":
            costo = 55.5;
            luce = 6;
            break;
        case "CROCIERA":
            costo = 34.8;
            luce = 8;
            break;
        case "SPAZIO":
            costo = 99;
            luce = 2;
            break;
        case "RISTORANTE":
            costo = 45.2;
            luce = 10;
            break; 
        }
        luogo = Luogo.valueOf(scelta);
        s = new Set(luce,costo,luogo);
        lblCostoSet.setText(String.valueOf(s.getCosto()));
    }
    
    public void Film(){
        String g = cmbGenere.getSelectedItem().toString();
        double budget = 0;
        switch(g){
        case "COMMEDIA":
            budget = 12000;
            break;
        case "AZIONE":
            budget = 16000;
            break;
        case "GIALLO":
            budget = 18000;
            break;
        case "FANTASY":
            budget = 13000;
            break;
        case "AVVENTURA":
            budget = 15000;
            break;
        case "ROMANCE":
            budget = 10000;
            break;
        }
        genere = Genere.valueOf(g);
        f = new Film(budget,genere);
        lblBudget.setText(String.valueOf(f.getBudget()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbSet = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbCamera = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbAttore = new javax.swing.JComboBox<>();
        cmbRegista = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        lblCamera = new javax.swing.JLabel();
        lblRegista = new javax.swing.JLabel();
        lblSet = new javax.swing.JLabel();
        lblAttore = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbGenere = new javax.swing.JComboBox<>();
        lblDurata = new javax.swing.JLabel();
        lblBudget = new javax.swing.JLabel();
        btnIstruzioni = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblCostoCamera = new javax.swing.JLabel();
        lblCostoRegista = new javax.swing.JLabel();
        lblCostoSet = new javax.swing.JLabel();
        lblCostoAttore = new javax.swing.JLabel();
        btnCamera = new javax.swing.JButton();
        btnRegista = new javax.swing.JButton();
        btnSet = new javax.swing.JButton();
        btnAttore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 124, 189));
        jLabel1.setText("CASA CINEMATOGRAFICA");

        cmbSet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbSet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SPAZIO", "OSPEDALE", "SALOTTO", "RISTORANTE", "BIBLIOTECA", "CROCIERA" }));
        cmbSet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cmbSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CAMERA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("REGISTA");

        cmbCamera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCamera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Z_CAM_E2_M4", "PANASONIC_LUMIX_BGH1", "BLACKMAGIC_PYXIS_6K" }));
        cmbCamera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cmbCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCameraActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("SET");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ATTORE");

        cmbAttore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbAttore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cillian Murphy", "Scarlett Johansson", "Meryl Streep", "Tom Cruise" }));
        cmbAttore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cmbAttore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAttoreActionPerformed(evt);
            }
        });

        cmbRegista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbRegista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Christopher Nolan", "Tim Burton", "Jon Favreau", "Steven Spielberg" }));
        cmbRegista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cmbRegista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRegistaActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 153, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setForeground(new java.awt.Color(255, 153, 204));

        jSeparator3.setForeground(new java.awt.Color(255, 153, 204));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("REGISTRA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblCamera.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCamera.setText("FOTO-CAMERA");
        lblCamera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204)));

        lblRegista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRegista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRegista.setText("FOTO-REGISTA");
        lblRegista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204)));

        lblSet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSet.setText("FOTO-SET");
        lblSet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204)));

        lblAttore.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAttore.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAttore.setText("FOTO-ATTORE");
        lblAttore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("QUALITA'");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maincasacinematografica/foto/cu.png"))); // NOI18N
        jLabel11.setText("S1");
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maincasacinematografica/foto/cu.png"))); // NOI18N
        jLabel12.setText("★");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maincasacinematografica/foto/cu.png"))); // NOI18N
        jLabel13.setText("★");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maincasacinematografica/foto/cu.png"))); // NOI18N
        jLabel14.setText("S4");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maincasacinematografica/foto/cu.png"))); // NOI18N
        jLabel15.setText("S5");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("DURATA");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("GENERE");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("BUDGET");

        cmbGenere.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbGenere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMMEDIA", "FANTASY", "ROMANCE", "AVVENTURA", "AZIONE", "GIALLO" }));
        cmbGenere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenereActionPerformed(evt);
            }
        });

        lblDurata.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDurata.setText("...");

        lblBudget.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBudget.setText("...");

        btnIstruzioni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIstruzioni.setText("ISTRUZIONI");
        btnIstruzioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIstruzioniActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("NUOVO");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("EVENTO CASUALE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("COSTO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("COSTO");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("COSTO");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel21.setText("COSTO");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblCostoCamera.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblCostoCamera.setText("...");

        lblCostoRegista.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblCostoRegista.setText("...");

        lblCostoSet.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblCostoSet.setText("...");

        lblCostoAttore.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblCostoAttore.setText("...");

        btnCamera.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCamera.setText("+");
        btnCamera.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204)));
        btnCamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCameraActionPerformed(evt);
            }
        });

        btnRegista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegista.setText("+");
        btnRegista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204)));
        btnRegista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistaActionPerformed(evt);
            }
        });

        btnSet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSet.setText("+");
        btnSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204)));
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });

        btnAttore.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAttore.setText("+");
        btnAttore.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(255, 153, 204), new java.awt.Color(255, 153, 204)));
        btnAttore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbGenere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(lblBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(28, 28, 28)
                                .addComponent(lblDurata, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIstruzioni)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCostoSet))
                                            .addComponent(cmbSet, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCostoAttore))
                                            .addComponent(cmbAttore, 0, 1, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAttore, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCostoCamera))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbCamera, 0, 1, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCostoRegista))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmbRegista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnRegista, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAttore, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbCamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCamera))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblCostoCamera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbRegista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegista))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblCostoRegista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbSet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSet))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblCostoSet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbAttore, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAttore)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(lblCostoAttore))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDurata)
                            .addComponent(jLabel16))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(cmbGenere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lblBudget))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIstruzioni)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRegista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCamera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblSet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAttore, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIstruzioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIstruzioniActionPerformed
        JOptionPane.showMessageDialog(null,"Obiettivo: Creare un film di alta qualità \n(Con 5 cuori il film è perfetto) \n Prima cosa da fare è scegliere il genere e in base a quello vi verrà assegnato un budget \n Seconda cosa da fare è scegliere (considerando il costo) un attore, un regista, un set e una camera e registrare \n Ogni volta che si pigia sul tasto registra ","Istruzioni",1);
    }//GEN-LAST:event_btnIstruzioniActionPerformed

    private void cmbCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCameraActionPerformed
        CostoCamera();
    }//GEN-LAST:event_cmbCameraActionPerformed

    private void cmbRegistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRegistaActionPerformed
        CostoRegista();
    }//GEN-LAST:event_cmbRegistaActionPerformed

    private void cmbAttoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAttoreActionPerformed
        CostoAttore();
    }//GEN-LAST:event_cmbAttoreActionPerformed

    private void btnCameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCameraActionPerformed
        Camera();
    }//GEN-LAST:event_btnCameraActionPerformed

    private void btnRegistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistaActionPerformed
        Regista();
    }//GEN-LAST:event_btnRegistaActionPerformed

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        Set();
    }//GEN-LAST:event_btnSetActionPerformed

    private void btnAttoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttoreActionPerformed
        Attore();
    }//GEN-LAST:event_btnAttoreActionPerformed

    private void cmbGenereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenereActionPerformed
        Film();
    }//GEN-LAST:event_cmbGenereActionPerformed

    private void cmbSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSetActionPerformed
        CostoSet();
    }//GEN-LAST:event_cmbSetActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Form().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttore;
    private javax.swing.JButton btnCamera;
    private javax.swing.JButton btnIstruzioni;
    private javax.swing.JButton btnRegista;
    private javax.swing.JButton btnSet;
    private javax.swing.JComboBox<String> cmbAttore;
    private javax.swing.JComboBox<String> cmbCamera;
    private javax.swing.JComboBox<String> cmbGenere;
    private javax.swing.JComboBox<String> cmbRegista;
    private javax.swing.JComboBox<String> cmbSet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAttore;
    private javax.swing.JLabel lblBudget;
    private javax.swing.JLabel lblCamera;
    private javax.swing.JLabel lblCostoAttore;
    private javax.swing.JLabel lblCostoCamera;
    private javax.swing.JLabel lblCostoRegista;
    private javax.swing.JLabel lblCostoSet;
    private javax.swing.JLabel lblDurata;
    private javax.swing.JLabel lblRegista;
    private javax.swing.JLabel lblSet;
    // End of variables declaration//GEN-END:variables
}
