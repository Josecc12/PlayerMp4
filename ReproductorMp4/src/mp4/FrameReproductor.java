package mp4;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class FrameReproductor extends javax.swing.JFrame {

    //Creamos un objeto de la clase Reproductor
    Reproductor reproductor;
    //Creamos la variable de tipo String para almacenar la ruta del video
    
    public FrameReproductor() {
        initComponents();
        //Colocamos el Frame en el centro
        this.setLocationRelativeTo(null);
        //Intanciamos el objeto de la clase Reproductor
        this.reproductor = new Reproductor();
    }

    /**
     * Método para buscar e iniciar el video
     */
    private String obtenerVideo() {
        JFileChooser archivo = new JFileChooser();
        int resultado = archivo.showOpenDialog(this);
        if (resultado != JFileChooser.CANCEL_OPTION) {
            return archivo.getSelectedFile().getAbsolutePath().replace("\\", "/");
        }
        return null;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        open = new javax.swing.JButton();
        play = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        volume = new javax.swing.JSlider();
        forward = new javax.swing.JButton();
        backward = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 52, 73));

        panel.setBackground(new java.awt.Color(41, 52, 73));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 115, 115), 2));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(41, 52, 73));

        open.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        play.setBackground(new java.awt.Color(41, 52, 73));
        play.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/play-7(72x72)@1x.png"))); // NOI18N
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        pause.setBackground(new java.awt.Color(41, 52, 73));
        pause.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/pause-7(72x72)@1x.png"))); // NOI18N
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        stop.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        stop.setText("Stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        volume.setBackground(new java.awt.Color(41, 52, 73));
        volume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumeStateChanged(evt);
            }
        });

        forward.setBackground(new java.awt.Color(41, 52, 73));
        forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/forward(72x72)@1x.png"))); // NOI18N

        backward.setBackground(new java.awt.Color(41, 52, 73));
        backward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/backward(72x72)@1x.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(open)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(backward, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forward, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(stop)
                .addGap(29, 29, 29)
                .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(stop)
                                    .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(open))
                                    .addComponent(backward, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(forward, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        title.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText("Titulo");

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 115, 115));
        jLabel1.setText("REPRODUCTOR MP4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        try {

            if (this.reproductor.getMediaPlayer() != null) 
                this.reproductor.parar();
                       
            String ruta = obtenerVideo();
            if (!ruta.isEmpty()) {                            
                String nombre = ruta.split("/")[ruta.split("/").length-1];                
                this.title.setText(nombre);
                
                this.reproductor.setRuta(ruta);
                this.reproductor.setJpanel(this.panel);
                this.reproductor.mostrarVideo();
                this.reproductor.reproducir();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No selecciono un video para reproducir.");
        }
    }//GEN-LAST:event_openActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        this.reproductor.reproducir();
    }//GEN-LAST:event_playActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        this.reproductor.pausar();
    }//GEN-LAST:event_pauseActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        this.reproductor.parar();
    }//GEN-LAST:event_stopActionPerformed

    private void volumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumeStateChanged
        this.reproductor.setVolumen((double)this.volume.getValue()/100);
    }//GEN-LAST:event_volumeStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backward;
    private javax.swing.JButton forward;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton open;
    private javax.swing.JPanel panel;
    private javax.swing.JButton pause;
    private javax.swing.JButton play;
    private javax.swing.JButton stop;
    private javax.swing.JLabel title;
    private javax.swing.JSlider volume;
    // End of variables declaration//GEN-END:variables
}
