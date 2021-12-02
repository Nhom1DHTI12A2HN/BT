/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network_applet;

import java.applet.*;
import java.awt.*;

public class AppletBases extends Applet {

    public void paint(Graphics g) {

        g.drawString("Codebase: "
                + this.getCodeBase().toString(), 10, 40);
        g.drawString("Document base: "
                + this.getDocumentBase().toString(), 10, 65);

    }
}
