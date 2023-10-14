package ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.JFrame;

import connect.ConnectDB;

public class GUI_TrangChu extends JFrame{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GUI_TrangChu() {
		   init();
		   connectDatabase();
	}
	
	public void init() {
		   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	       setSize(screenSize);
	       setLocation(0, 0);
		   setTitle("Phần Mềm Quản Lý Hiệu Sách HBDK");
		   setDefaultCloseOperation(EXIT_ON_CLOSE);
		   setLocationRelativeTo(null);
	}
	
	public void connectDatabase() {
		try {
			ConnectDB.getInstance().connect();
			System.out.println("Kết nối thành công");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
