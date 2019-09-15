package vista2;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfaz2 extends JFrame {
	private JPanel panel1;
	private JTextField caja1,caja2;
	
	public Interfaz2() {
		setTitle("Editor de diagramas logicos");
		setSize(1300,700);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panelP=new JPanel();
		panelP.setSize(getSize());
		panelP.setBackground(Color.WHITE);
		panelP.setLayout(null);
		panelP.setLocation(0, 0);
		
		for(int a=0;a<10;a++) {
			JPanel panel1=new JPanel();
			panel1.setSize(150, 100);
			panel1.setBackground(Color.black);
			panel1.setName("Compuerta: "+(a+1));
			panel1.setLayout(null);
			panel1.setLocation(950, 50);
			
			
			caja1 = new JTextField();
		    caja1.setBounds(10, 10, 20, 20);
		    caja1.setBackground(Color.YELLOW);
		    panel1.add(caja1);
		    
		    caja2 = new JTextField();
		    caja2.setBounds(10, 70, 20, 20);
		    caja2.setBackground(Color.YELLOW);
		    panel1.add(caja2);
			
			panelP.add(panel1);
			
		}
		
		Movimiento mv = new Movimiento(panelP.getComponents());
		
		add(panelP);
		setVisible(true);
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
	new Interfaz2();

	}

}
