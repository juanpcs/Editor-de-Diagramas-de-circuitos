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

import Controlador.controlador;

import java.util.Random;
import Modelo.AND;
import Modelo.Compuerta_Logica;
import Modelo.OR;
import Modelo.NAND;
import Modelo.NOR;
import Modelo.NOT;
import Modelo.XOR;
import Modelo.XNOR;

public class Interfaz2 extends JFrame implements ActionListener, MouseMotionListener, MouseListener, MouseWheelListener{
	//Declaracion de variables a utilizar y aplicacion de herencia
	private int x,y;
	private JPanel panelP;
	private JLabel E1, E5, LV;
	private JTextField caja1,caja2;
	private JButton botonprueba,boton, boton1,boton2,boton3,boton4,boton5,boton6, botonLineaH, botonLineaV,botonAND,botonOR,botonNAND,botonNOR, botonNOT, botonXOR, botonXNOR;
	int tama�o=100;
	
	AND AND= new AND();
	OR OR= new OR();
	NAND NAND = new NAND();
	NOR NOR = new NOR();
	NOT NOT = new NOT();
	XOR XOR = new XOR();
	XNOR XNOR = new XNOR();
	Compuerta_Logica Con = new Compuerta_Logica();
	controlador C=new controlador();
	
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
			
			botonprueba = new JButton();
		    botonprueba.setBounds(402,0,300,20);
		    botonprueba.setText("Mostrar compuertas en la lista");
			panelP.add(botonprueba);
			botonprueba.addActionListener(this);
			
		    
		
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
			LV =new JLabel("|");
		    LV.setFont(new Font("Serif", Font.PLAIN, 100));
		    LV.setForeground(new Color((int)(Math.random() * 0x1000000)));
		    LV.setBackground(Color.black);
		    LV.setBounds(400, 200, 30, 200);
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
			
			if(evento1.getSource()==botonprueba){
				JOptionPane.showMessageDialog(null, C.mostrar());
			}
			
			
			
			if(evento1.getSource()==botonAND){
				creaAND();
			}
			
			
			if(evento1.getSource()==boton) {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("�Que desea realizar?\n 1) Ingresar entradas manualmente\n 2) utilizar datos de otra compuerta"));
				if (numero==1) {
				 AND.resultado();
				
				 C.ingresarcompuerta(new Compuerta_Logica(AND.entrada1(),AND.entrada2(),AND.salida()));
				}
				else
					C.selecdatos(1);
				
			}
			
			if(evento1.getSource()==botonOR){
				creaOR();
			}
			
			
			if(evento1.getSource()==boton1) {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("�Que desea realizar?\n 1) Ingresar entradas manualmente\n 2) utilizar datos de otra compuerta"));
				if (numero==1) {
				 OR.resultado();
				
				 C.ingresarcompuerta(new Compuerta_Logica(OR.entrada1(),OR.entrada2(),OR.salida()));
				}
				else
					C.selecdatos(2);
				
			}
			
			if(evento1.getSource()==botonNAND){
				creaNAND();
			}
			
			
			if(evento1.getSource()==boton2) {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("�Que desea realizar?\n 1) Ingresar entradas manualmente\n 2) utilizar datos de otra compuerta"));
				if (numero==1) {
				 NAND.resultado();
				
				 C.ingresarcompuerta(new Compuerta_Logica(NAND.entrada1(),NAND.entrada2(),NAND.salida()));
				}
				else
					C.selecdatos(3);

			}
			
			if(evento1.getSource()==botonNOR){
				creaNOR();
			}
			
			
			if(evento1.getSource()==boton3) {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("�Que desea realizar?\n 1) Ingresar entradas manualmente\n 2) utilizar datos de otra compuerta"));
				if (numero==1) {
				 NOR.resultado();
				
				 C.ingresarcompuerta(new Compuerta_Logica(NOR.entrada1(),NOR.entrada2(),NOR.salida()));
				}
				else
					C.selecdatos(4);
				
			}
			
			if(evento1.getSource()==botonNOT){
				creaNOT();
			}
			
			
			if(evento1.getSource()==boton4) {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("�Que desea realizar?\n 1) Ingresar entrada manualmente\n 2) utilizar dato de otra compuerta"));
				if (numero==1) {
				 NOT.resultado();
				
				 C.ingresarcompuerta(new Compuerta_Logica(NOT.entrada1(),0,NOT.salida()));
				}
				else
					C.selecdatos(5);
				
			}
			
			if(evento1.getSource()==botonXOR){
				creaXOR();
			}
			
			
			if(evento1.getSource()==boton5) {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("�Que desea realizar?\n 1) Ingresar entradas manualmente\n 2) utilizar datos de otra compuerta"));
				if (numero==1) {
				 XOR.resultado();
				
				 C.ingresarcompuerta(new Compuerta_Logica(XOR.entrada1(),XOR.entrada2(),XOR.salida()));
				}
				else
					C.selecdatos(6);
				
			}
			
			if(evento1.getSource()==botonXNOR){
				creaXNOR();
			}
			
			
			if(evento1.getSource()==boton6) {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("�Que desea realizar?\n 1) Ingresar entradas manualmente\n 2) utilizar datos de otra compuerta"));
				if (numero==1) {
				 XNOR.resultado();
				
				 C.ingresarcompuerta(new Compuerta_Logica(XNOR.entrada1(),XNOR.entrada2(),XNOR.salida()));
				}
				else
					C.selecdatos(7);
				
			}
			
			if(evento1.getSource()==botonLineaH) {
				LineaHorizontal();
			
			}
			if(evento1.getSource()==botonLineaV) {
				LineaVerticall();}
			
			//if(evento1.getSource()==botonNAND) {
				//System.out.print("|\n"+"|\n"+"|\n"+"|\n"+"|\n");;}
			
			
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
		if(c instanceof JLabel && c.getX()<1000 && c.getY()>40) {
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
		E5.setBounds(arg0.getX(), 300, tama�o+=50, 30);}
		
		
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


