package CustomUI;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class CustumImage {
	// Hàm chuyển ảnh thành hình tròn để làm avt
		public static ImageIcon taoHinhTronAvt(String fileName, int randius) {
			ImageIcon icon = new ImageIcon(fileName);
			int diameter = Math.min(icon.getIconWidth(), icon.getIconHeight());
			BufferedImage bi = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g2d = bi.createGraphics();
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			Shape circularShape = new Ellipse2D.Float(0, 0, diameter, diameter);
			g2d.clip(circularShape);
			g2d.drawImage(icon.getImage(), 0, 0, diameter, diameter, null);
			g2d.dispose();
			ImageIcon iconfinal = new ImageIcon(bi);
			iconfinal.setImage(iconfinal.getImage().getScaledInstance(randius, randius, Image.SCALE_SMOOTH));
			return iconfinal;
		}
}
