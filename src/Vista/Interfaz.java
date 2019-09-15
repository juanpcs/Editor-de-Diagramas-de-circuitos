package Vista;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Interfaz extends JFrame implements Runnable, MouseListener {

private Canvas canvas;
private static final int ANCHO=1200, ALTO=700;
private	Thread thread;
private boolean running=false;
private BufferStrategy b1;
private Graphics g;
int w=1000, z=200;

	public Interfaz(){
	
	
	canvas = new Canvas();
	
	canvas.setPreferredSize(new Dimension(ANCHO, ALTO));
	canvas.setMaximumSize(new Dimension(ANCHO, ALTO));
	canvas.setMinimumSize(new Dimension(ANCHO,ALTO));
	canvas.setFocusable(true);
	canvas.setBackground(Color.white);
	canvas.addMouseListener(this);
	
	add(canvas);
	}



	int x=1000,y=200;
	private void update() {
		x=w;
		y=z;
	}
	
	private void draw() {
	b1=canvas.getBufferStrategy();
	
	if (b1==null) {
		canvas.createBufferStrategy(3);return;
	}
	
	g=b1.getDrawGraphics();
	
	
	
	g.drawRect(x, y, 150, 100);
	
	
	
	g.dispose();
	b1.show();
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
	}	
	
	@Override
	public void run() {
		while(running)
		{
			update();
			draw();
			
		}
		
		stop();
	}
	
	private void start() {
		thread=new Thread(this);
		thread.start();
		running=true;
		
	}
	private void stop() {
		try {
			thread.join();
			running=false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}


	
	public static void main(String[] args) {
		new Interfaz().start();

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		w=arg0.getX();
		z=arg0.getY();
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
