/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network_applet;

import java.applet.*;
import java.awt.*;
import java.net.*;

public class ImageView extends Applet {

    Image picture;

    public void init() {

        try {
            URL u = new URL(this.getCodeBase(),
                    "https://uneti.edu.vn/wp-content/uploads/2020/12/Banner.jpg");
            this.picture = this.getImage(u);
            System.err.println(u);
        } catch (MalformedURLException e) {
            // shouldn't happen, the codebase is never malformed 
        }

    }

    public void paint(Graphics g) {
        g.drawImage(this.picture, 0, 0, this);
    }
}
