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
    Lista playList;
    Nodo actual;

    //Creamos la variable de tipo String para almacenar la ruta del video
    public FrameReproductor() {
        initComponents();
        //Colocamos el Frame en el centro
        this.setLocationRelativeTo(null);
        //Intanciamos el objeto de la clase Reproductor
        this.reproductor = new Reproductor();
        this.playList = new Lista();
         Nodo actual = new Nodo();

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
        play = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        forward = new javax.swing.JButton();
        backward = new javax.swing.JButton();
        random = new javax.swing.JButton();
        volume = new javax.swing.JSlider();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        open = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

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

        play.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/play-7(72x72)@1x.png"))); // NOI18N
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        pause.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/pause-7(72x72)@1x.png"))); // NOI18N
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/forward(72x72)@1x.png"))); // NOI18N
        forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardActionPerformed(evt);
            }
        });

        backward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/backward(72x72)@1x.png"))); // NOI18N
        backward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardActionPerformed(evt);
            }
        });

        random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/random-1.1s-200px.png"))); // NOI18N
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });

        volume.setBackground(new java.awt.Color(41, 52, 73));
        volume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumeStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(random, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(backward, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(forward, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forward, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backward, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(random, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        title.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText("Titulo");

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 115, 115));
        jLabel1.setText("REPRODUCTOR MP4");

        list1.setBackground(new java.awt.Color(41, 52, 73));
        list1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        open.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/folder-add(72x72)@1x.png"))); // NOI18N
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(open)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(open, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
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

            if (this.reproductor.getMediaPlayer() != null) {
                this.reproductor.pausar();
            }

            String ruta = obtenerVideo();

            if (!ruta.isEmpty()) {
                String nombre = ruta.split("/")[ruta.split("/").length - 1];
                //agregando a play list
                Video video = new Video();
                video.setEnlace(ruta);
                video.setTitulo(nombre);
                playList.Insertar_Nodo(video);
                //agregando a Jlist
                list1.add(nombre);
               
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No selecciono un video para reproducir.");
        }
    }//GEN-LAST:event_openActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        if (list1.getSelectedItem() != null && actual==null ) {
            actual = playList.Buscar(list1.getSelectedItem(), playList.getFrente());
            System.out.println(actual.getVideo().getEnlace());
            this.reproductor.setRuta(actual.getVideo().getEnlace());
            this.reproductor.setJpanel(this.panel);
            this.title.setText(actual.getVideo().getTitulo());
            this.reproductor.mostrarVideo();
            this.reproductor.reproducir(); 
          
            
        }else{
             this.reproductor.reproducir(); 
        }
          
    }//GEN-LAST:event_playActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        this.reproductor.pausar();
    }//GEN-LAST:event_pauseActionPerformed

    private void volumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumeStateChanged
        this.reproductor.setVolumen((double) this.volume.getValue() / 100);
    }//GEN-LAST:event_volumeStateChanged

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

    private void backwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardActionPerformed
        // TODO add your handling code here:
        if (actual.getAnterior()!=null) {
            actual=actual.getAnterior();
            
            this.title.setText(actual.getVideo().getTitulo());
            Reproductor tmp=new Reproductor();
            reproductor.parar();
            
            tmp.setRuta(actual.getVideo().getEnlace());
            tmp.setJpanel(panel);
            reproductor=tmp;
            reproductor.mostrarVideo();
            reproductor.reproducir();
            
          
        }else{
            actual=playList.getFondo();
            this.title.setText(actual.getVideo().getTitulo());
             Reproductor tmp=new Reproductor();
            reproductor.parar();
            
            tmp.setRuta(actual.getVideo().getEnlace());
            tmp.setJpanel(panel);
            reproductor=tmp;
           
            reproductor.mostrarVideo();
            reproductor.reproducir();
        }
    }//GEN-LAST:event_backwardActionPerformed

    private void forwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardActionPerformed
        // TODO add your handling code here:
         if (actual.getSiguiente()!=null) {
            actual=actual.getSiguiente();
            this.title.setText(actual.getVideo().getTitulo());
            Reproductor tmp=new Reproductor();
            reproductor.parar();
            
            tmp.setRuta(actual.getVideo().getEnlace());
            tmp.setJpanel(panel);
            reproductor=tmp;
            reproductor.mostrarVideo();
            reproductor.reproducir();
            
          
        }else{
            actual=playList.getFrente();
            this.title.setText(actual.getVideo().getTitulo());
             Reproductor tmp=new Reproductor();
            reproductor.parar();
            
            
            tmp.setRuta(actual.getVideo().getEnlace());
            tmp.setJpanel(panel);
            reproductor=tmp;
//            reproductor.setRuta(actual.getVideo().getEnlace());
            reproductor.mostrarVideo();
            reproductor.reproducir();
            list1.revalidate();
        }
    }//GEN-LAST:event_forwardActionPerformed

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
        // TODO add your handling code here:
        int random = (int) Math.floor(Math.random() * playList.get_tamanio() + 1);
        if (this.reproductor.getMediaPlayer() != null) {
            System.out.println(playList.buscarRandom(1, playList.getFrente()).getVideo().getTitulo());
            actual = playList.buscarRandom(random, playList.getFrente());
                
            this.title.setText(actual.getVideo().getTitulo());
            Reproductor tmp=new Reproductor();
            reproductor.parar();

            tmp.setRuta(actual.getVideo().getEnlace());
            tmp.setJpanel(panel);
            reproductor=tmp;
            reproductor.mostrarVideo();
            reproductor.reproducir();
        }else{
            System.out.println(playList.buscarRandom(1, playList.getFrente()).getVideo().getTitulo());
            actual = playList.buscarRandom(random, playList.getFrente());
                
            this.title.setText(actual.getVideo().getTitulo());
            Reproductor tmp=new Reproductor();

            tmp.setRuta(actual.getVideo().getEnlace());
            tmp.setJpanel(panel);
            reproductor=tmp;
            reproductor.mostrarVideo();
            reproductor.reproducir();
        }
    }//GEN-LAST:event_randomActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backward;
    private javax.swing.JButton forward;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.List list1;
    private javax.swing.JButton open;
    private javax.swing.JPanel panel;
    private javax.swing.JButton pause;
    private javax.swing.JButton play;
    private javax.swing.JButton random;
    private javax.swing.JLabel title;
    private javax.swing.JSlider volume;
    // End of variables declaration//GEN-END:variables
}
