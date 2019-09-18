package vista2;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Modelo.AND;


public class Interfaz2 extends JFrame implements ActionListener{
	private JPanel panelP;
	private JLabel E1;
	private JTextField caja1,caja2;
	private JButton boton,botonAND,botonOR,botonNAND,botonNOR, botonNOT, botonXOR, botonXNOR;
	AND A= new AND();
	
	public Interfaz2() {
		setTitle("Editor de diagramas logicos");
		setSize(1300,700);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panelP=new JPanel();
		panelP.setSize(getSize());
		panelP.setBackground(Color.white);
		panelP.setLayout(null);
		panelP.setLocation(0, 0);
		
		E1=new JLabel("Palette:");
		E1.setFont(new Font("Serif", Font.PLAIN, 24));
	    E1.setBounds(1165, 1, 300, 50);
	    E1.setForeground(Color.white);
	    E1.setBackground(Color.black);
	    panelP.add(E1);
	    
		
		botonAND = new JButton();
		botonAND.setBounds(1150,50,100,75);
		botonAND.setText("");
		panelP.add(botonAND);
		botonAND.setIcon(new ImageIcon("AND.JPG"));
		botonAND.addActionListener(this);
		
		botonOR = new JButton();
		botonOR.setBounds(1150,140,100,75);
		botonOR.setText("");
		panelP.add(botonOR);
		botonOR.setIcon(new ImageIcon("OR.JPG"));
		botonOR.addActionListener(this);
		
		botonNAND = new JButton();
		botonNAND.setBounds(1150,230,100,75);
		botonNAND.setText("");
		panelP.add(botonNAND);
		botonNAND.setIcon(new ImageIcon("NAND.JPG"));
		botonNAND.addActionListener(this);
		
		botonNOR = new JButton();
		botonNOR.setBounds(1150,320,100,75);
		botonNOR.setText("");
		panelP.add(botonNOR);
		botonNOR.setIcon(new ImageIcon("NOR.JPG"));
		botonNOR.addActionListener(this);
		
		botonNOT = new JButton();
		botonNOT.setBounds(1150,410,100,75);
		botonNOT.setText("");
		panelP.add(botonNOT);
		botonNOT.setIcon(new ImageIcon("NOT.JPG"));
		botonNOT.addActionListener(this);
		
		botonXOR = new JButton();
		botonXOR.setBounds(1150,500,100,75);
		botonXOR.setText("");
		panelP.add(botonXOR);
		botonXOR.setIcon(new ImageIcon("XOR.JPG"));
		botonXOR.addActionListener(this);
		
		botonXNOR = new JButton();
		botonXNOR.setBounds(1150,590,100,75);
		botonXNOR.setText("");
		panelP.add(botonXNOR);
		botonXNOR.setIcon(new ImageIcon("XNOR.JPG"));
		botonXNOR.addActionListener(this);
		
		 JLabel E2 =new JLabel("");
		    E2.setFont(new Font("Serif", Font.PLAIN, 18));
		    E2.setBounds(1100, 0, 200, 700);
		    E2.setForeground(Color.red);
		    E2.setBackground(Color.BLUE);
		    E2.setIcon(new ImageIcon("fondo.JPG"));
		    panelP.add(E2);
		    

		    JLabel E4 =new JLabel("");
		    E4.setFont(new Font("Serif", Font.PLAIN, 18));
		    E4.setBounds(400,25 , 300, 40);
		    E4.setIcon(new ImageIcon("Titulo.JPG"));
		    panelP.add(E4);
		    
		    JLabel E3 =new JLabel("Circuit Designer");
		    E3.setFont(new Font("Serif", Font.PLAIN, 18));
		    E3.setBounds(0, 20, 1100, 50);
		    E3.setIcon(new ImageIcon("fondo2.JPG"));
		    panelP.add(E3);
		  
		    
		    
		
		
		add(panelP);
		setVisible(true);
		
			}
	
	public void componentes() {
	
		
		boton = new JButton();
		boton.setBounds(500,300,90,70);
		boton.setText("");
		panelP.add(boton);
		boton.setIcon(new ImageIcon("AND.JPG"));
		boton.addActionListener(this);
		}
	
	public void paneles() {
		JPanel panel1=new JPanel();
		panel1.setSize(150, 100);
		panel1.setBackground(Color.black);
		panel1.setName("Compuerta: ");
		panel1.setLayout(null);
		panel1.setLocation(500, 50);
		
		
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
	
	
	@Override
	public void actionPerformed(ActionEvent evento1) {
		try {
			evento1.getSource();
			if(evento1.getSource()==botonAND){
				System.out.println("hola");
				componentes();
				Movimiento mv = new Movimiento(panelP.getComponents());
			
			}
			
			if(evento1.getSource()==boton) {
				A.resultado();
				
			}
			}
			catch (Exception E) {
				JOptionPane.showMessageDialog(null, E);}
		} 

	
	
	public static void main(String[] args) {
		new Interfaz2();

		}
		
		

	
		
	}


