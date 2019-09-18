package vista2;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Movimiento implements MouseListener, MouseMotionListener, ActionListener{
	
	private int x,y;
	
	public Movimiento(Component...pns) {
		for(Component panel:pns) {
			panel.addMouseListener(this);
			panel.addMouseMotionListener(this);
			
		}
		
	}
	

	@Override
	public void mouseDragged(MouseEvent arg0) {
			Component c=arg0.getComponent();
		if ((c instanceof JPanel || c instanceof JButton)&&arg0.getComponent().getX()<1000) {
		arg0.getComponent().setLocation((arg0.getX()+arg0.getComponent().getX())-x, (arg0.getY()+arg0.getComponent().getY())-y);}
		if (arg0.getComponent().getX()>=1000) {
			arg0.getComponent().setLocation(995, arg0.getComponent().getY());}
		if (arg0.getComponent().getX()<=1) {
			arg0.getComponent().setLocation(2, arg0.getComponent().getY());}
	
		if (arg0.getComponent().getY()<=70) {
			arg0.getComponent().setLocation(arg0.getComponent().getX(),71);}
		if (arg0.getComponent().getY()>600) {
			arg0.getComponent().setLocation(arg0.getComponent().getX(),599);}
		
			
		}
			
		
	

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
