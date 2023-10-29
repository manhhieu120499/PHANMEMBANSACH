package CustomUI;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class MyCombobox extends JComboBox{
	public MyCombobox() {
		// xét border cho combobox
		this.setBorder(BorderFactory.createLineBorder(new Color(102, 109, 115)));
		this.setUI(new BasicComboBoxUI() {
			// bỏ đường viền trong của item
		    @Override
		    protected void installDefaults() {
		    } 
		    // chỉnh màu của dropdown
		    @Override
		    protected JButton createArrowButton() {
		        JButton button = super.createArrowButton();
		        button.setBackground(new Color(172, 192, 206));
		        return button;
		    }
		});
		// xét màu nền
		this.setBackground(new Color(230, 230, 230));
	}
}