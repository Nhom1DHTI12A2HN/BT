/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network_applet;

import java.applet.*;
import java.awt.*;
import java.net.*;

public class PlaySound extends Applet {

    public void init() {

        try {
            URL u = new URL(this.getCodeBase(),
                    "http://metalab.unc.edu/java/course/week9/spacemusic.au" );
            this.play(u);
        } catch (MalformedURLException e) {
        }

    }
}
