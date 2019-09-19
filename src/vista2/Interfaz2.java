package vista2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Random;
import Modelo.AND;
import Modelo.OR;


public class Interfaz2 extends JFrame implements ActionListener, MouseMotionListener, MouseListener, MouseWheelListener{
	//Declaracion de variables a utilizar y aplicacion de herencia
	private int x,y;
	private JPanel panelP;
	private JLabel E1, E5, LV;
	private JTextField caja1,caja2;
	private JButton boton, boton1,boton2,boton3,boton4,boton5,boton6, botonLineaH, botonLineaV,botonAND,botonOR,botonNAND,botonNOR, botonNOT, botonXOR, botonXNOR;
	int tamaño=100;
	
	AND AND= new AND();
	OR OR= new OR();
	
	//Creacion del constructor y de los componentes que integraran la aplicacion
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
		    
		    botonLineaH = new JButton();
		    botonLineaH.setBounds(0,0,200,20);
		    botonLineaH.setText("Insertar Conexion Horizontal");
			panelP.add(botonLineaH);
			botonLineaH.addActionListener(this);
			
			botonLineaV = new JButton();
		    botonLineaV.setBounds(201,0,200,20);
		    botonLineaV.setText("Insertar Conexion Vertical");
			panelP.add(botonLineaV);
			botonLineaV.addActionListener(this);
			
		    
		
		add(panelP);
		setVisible(true);
		
			}
	
	
	
	//Funcion que creca una compuerta and y la muestra en el panel
	
	public void creaAND() {
	
		
		boton = new JButton();
		boton.setBounds(500,300,90,70);
		boton.setText("");
		panelP.add(boton);
		boton.setIcon(new ImageIcon("AND.JPG"));
		boton.addMouseMotionListener(this);
		boton.addActionListener(this);
		boton.addMouseListener(this);
		}
	
	//Funcion que crea una compuerta or y la muestra en el panel
	
	public void creaOR() {
	
		boton1 = new JButton();
		boton1.setBounds(500,300,90,70);
		boton1.setText("");
		panelP.add(boton1);
		boton1.setIcon(new ImageIcon("OR.JPG"));
		boton1.addActionListener(this);
		boton1.addMouseMotionListener(this);
		boton1.addMouseListener(this);
		}
	
	public void creaNAND() {
		
		boton2 = new JButton();
		boton2.setBounds(500,300,90,70);
		boton2.setText("");
		panelP.add(boton2);
		boton2.setIcon(new ImageIcon("NAND.JPG"));
		boton2.addActionListener(this);
		boton2.addMouseMotionListener(this);
		boton2.addMouseListener(this);
		}
	
	public void creaNOR() {
		
		boton3 = new JButton();
		boton3.setBounds(500,300,90,70);
		boton3.setText("");
		panelP.add(boton3);
		boton3.setIcon(new ImageIcon("NOR.JPG"));
		boton3.addActionListener(this);
		boton3.addMouseMotionListener(this);
		boton3.addMouseListener(this);
		}
	
	public void creaNOT() {
		
		boton4 = new JButton();
		boton4.setBounds(500,300,90,70);
		boton4.setText("");
		panelP.add(boton4);
		boton4.setIcon(new ImageIcon("NOT.JPG"));
		boton4.addActionListener(this);
		boton4.addMouseMotionListener(this);
		boton4.addMouseListener(this);
		}
	
	public void creaXOR() {
		
		boton5 = new JButton();
		boton5.setBounds(500,300,90,70);
		boton5.setText("");
		panelP.add(boton5);
		boton5.setIcon(new ImageIcon("XOR.JPG"));
		boton5.addActionListener(this);
		boton5.addMouseMotionListener(this);
		boton5.addMouseListener(this);
		}
	
public void creaXNOR() {
		
		boton6 = new JButton();
		boton6.setBounds(500,300,90,70);
		boton6.setText("");
		panelP.add(boton6);
		boton6.setIcon(new ImageIcon("XNOR.JPG"));
		boton6.addActionListener(this);
		boton6.addMouseMotionListener(this);
		boton6.addMouseListener(this);
		}
	
	 
	//funcion encaragada de crear las lines para representar las conexiones entre compuertas
	
	public void LineaHorizontal() {
		E5 =new JLabel("---------------------------------------------");
	    E5.setFont(new Font("Serif", Font.PLAIN, 18));
	    E5.setForeground(new Color((int)(Math.random() * 0x1000000)));
	    E5.setBackground(Color.black);
	    E5.setBounds(100, 200, 100, 30);
	    E5.addMouseMotionListener(this);
	    E5.addMouseListener(this);
	    panelP.add(E5);	}
	
	//funcion encaragada de crear las lines para representar las conexiones entre compuertas
	
		public void LineaVerticall() {
			LV =new JLabel("|\n"+"|\n"+"|\n"+"|\n"+"|\n");
		    LV.setFont(new Font("Serif", Font.PLAIN, 18));
		    LV.setForeground(new Color((int)(Math.random() * 0x1000000)));
		    LV.setBackground(Color.black);
		    LV.setBounds(400, 200, 30, 100);
		    LV.addMouseMotionListener(this);
		    LV.addMouseListener(this);
		    panelP.add(LV);	}
	
	
	//posible funcion para crear compuertas mediante paneles
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
			
			if(evento1.getSource()==botonAND){
				System.out.println("hola");
				creaAND();
			}
			
			
			if(evento1.getSource()==boton) {
				System.out.println(AND.resultado());
				
			}
			
			if(evento1.getSource()==botonOR){
				System.out.println("hola");
				creaOR();
			}
			
			
			if(evento1.getSource()==boton1) {
				System.out.println(OR.resultado());
				
			}
			
			if(evento1.getSource()==botonNAND){
				System.out.println("hola");
				creaNAND();
			}
			
			
			if(evento1.getSource()==boton2) {
				System.out.println(OR.resultado());
				
			}
			
			if(evento1.getSource()==botonNOR){
				System.out.println("hola");
				creaNOR();
			}
			
			
			if(evento1.getSource()==boton3) {
				System.out.println(OR.resultado());
				
			}
			
			if(evento1.getSource()==botonNOT){
				System.out.println("hola");
				creaNOT();
			}
			
			
			if(evento1.getSource()==boton4) {
				System.out.println(OR.resultado());
				
			}
			
			if(evento1.getSource()==botonXOR){
				System.out.println("hola");
				creaXOR();
			}
			
			
			if(evento1.getSource()==boton5) {
				System.out.println(OR.resultado());
				
			}
			
			if(evento1.getSource()==botonXNOR){
				System.out.println("hola");
				creaXNOR();
			}
			
			
			if(evento1.getSource()==boton6) {
				System.out.println(OR.resultado());
				
			}
			
			if(evento1.getSource()==botonLineaH) {
				LineaHorizontal();
			
			}
			if(evento1.getSource()==botonLineaV) {
				LineaVerticall();}
			
			if(evento1.getSource()==botonNAND) {
				System.out.print("|\n"+"|\n"+"|\n"+"|\n"+"|\n");;}
			
			
			}
			catch (Exception E) {
				JOptionPane.showMessageDialog(null, E);}
		} 
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		Component c=arg0.getComponent();
		if (c instanceof JButton&&arg0.getComponent().getX()<1000) {
		arg0.getComponent().setLocation((arg0.getX()+arg0.getComponent().getX())-x, (arg0.getY()+arg0.getComponent().getY())-y);
		if (arg0.getComponent().getX()>=1000) {
			arg0.getComponent().setLocation(999, arg0.getComponent().getY());}
		if (arg0.getComponent().getX()<=1) {
			arg0.getComponent().setLocation(2, arg0.getComponent().getY());}
	
		if (arg0.getComponent().getY()<=70) {
			arg0.getComponent().setLocation(arg0.getComponent().getX(),71);}
		if (arg0.getComponent().getY()>600) {
			arg0.getComponent().setLocation(arg0.getComponent().getX(),599);}
		
			
			
			
		}
		if(c instanceof JLabel && c.getX()<1000 && c.getY()>100) {
			if(arg0.getX()==c.getX()) {
				E5.setBounds(100, 200, arg0.getX(), 30);
				
			}
			else
			arg0.getComponent().setLocation((arg0.getX()+arg0.getComponent().getX())-x, (arg0.getY()+arg0.getComponent().getY())-y);
			
			
		}
		
		
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		Component c=arg0.getComponent();
		if(c instanceof JLabel && c.getX()<1000 && c.getY()>100) {
		E5.setBounds(arg0.getX(), 300, tamaño+=50, 30);}
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		x=arg0.getX();
		y=arg0.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent evento1) {
		// TODO Auto-generated method stub
		
	}

	
	
	public static void main(String[] args) {
		new Interfaz2();

		}



	@Override
	public void mouseWheelMoved(MouseWheelEvent arg0) {
		Component c=arg0.getComponent();
		if(c instanceof JLabel && c.getX()<1000 && c.getY()>100) {
		E5.setBounds(100, 200, 50+1, 30);}
		
	}

	

	
		
		

	
		
	}


