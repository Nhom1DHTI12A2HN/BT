/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network_applet;

import java.awt.*;
import java.applet.*;
import java.awt.image.*;

public class DelayedImageView extends Applet {

    private Image picture;

    public void init() {
        this.picture = this.getImage(this.getDocumentBase(), "http://media.vietteltelecom.vn/upload/InternetInternetPackageBuyData/6f/db/b6/cb7e6b1f9a60365c80726f970ed52105e86c4fdb.jpg");
    }

    public void paint(Graphics g) {

        if (!g.drawImage(this.picture, 0, 0, this)) {
            g.drawString("Đang tải ảnh. Vui lòng chờ", 25, 50);
        }

    }

    public boolean imageUpdate(Image image, int infoflags, int x, int y,
            int width, int height) {

        if ((infoflags & ImageObserver.ALLBITS) == ImageObserver.ALLBITS) {
            this.repaint();
            return false;
        } else {
            return true;
        }

    }

}
