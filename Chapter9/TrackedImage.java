/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network_applet;

import java.awt.*;
import java.applet.*;

public class TrackedImage extends Applet implements Runnable {

    private Image picture;
    private MediaTracker tracker;

    public void init() {
        this.picture = this.getImage(this.getCodeBase(),
                "https://uneti.edu.vn/wp-content/uploads/2021/05/cb8cc961be014b5f1210.jpg");
        this.tracker = new MediaTracker(this);
        this.tracker.addImage(this.picture, 1);

        Thread play = new Thread(this);
        play.start();

    }

    public void run() {

        try {
            this.tracker.waitForID(1);
            this.repaint();
        } catch (InterruptedException ie) {
        }

    }

    public void paint(Graphics g) {

        if (this.tracker.checkID(1, true)) {
            g.drawImage(this.picture, 100, 100, this);
        } else {
            g.drawString("Loading Picture. Please hang on", 25, 50);
        }

    }

}
