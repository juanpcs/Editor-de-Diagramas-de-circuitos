package vista2;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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
		arg0.getComponent().setLocation((arg0.getX()+arg0.getComponent().getX())-x, (arg0.getY()+arg0.getComponent().getY())-y);
		
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
