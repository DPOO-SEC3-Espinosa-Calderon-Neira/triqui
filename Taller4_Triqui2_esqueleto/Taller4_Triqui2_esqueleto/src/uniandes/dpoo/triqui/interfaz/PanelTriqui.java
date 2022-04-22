package uniandes.dpoo.triqui.interfaz;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import uniandes.dpoo.triqui.mundo.Triqui;


@SuppressWarnings("serial")
public class PanelTriqui extends JPanel implements MouseListener
{
	private int c = 0;
	private int f1c1=0, f1c2=0, f1c3=0, f2c1=0, f2c2=0, f2c3=0, f3c1=0, f3c2=0, f3c3=0;
	private VentanaTriqui vTriqui;

	public PanelTriqui(VentanaTriqui ventanaTriqui)
	{
		addMouseListener(this); 
		this.vTriqui = ventanaTriqui;
		
	}

	public void actualizarTablero(Triqui triqui)
	{
		repaint();
	}

	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;

		pintarLineas(g2d);
		pintarJugadas(g2d);
	}

	private void pintarJugadas(Graphics2D g2d)
	{
		//f1c1 = 1;
		//c=0;
		//g.drawOval(getWidth()/24, getHeight()/24, getWidth()/4, getHeight()/4);
	}

	private void pintarLineas(Graphics2D g2d)
	{
		g2d.drawLine(getWidth()/3, 0,getWidth()/3, getHeight());
		g2d.drawLine(2*getWidth()/3, 0,2*getWidth()/3, getHeight());
		g2d.drawLine(0, getHeight()/3, getWidth(), getHeight()/3);
		g2d.drawLine(0,2*getHeight()/3, getWidth(),2*getHeight()/3);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		int x = e.getX();
	    int y = e.getY();
		Graphics g = getGraphics(); 
		
		if (c == 1) {
			
			//Fila 1
			if (((x>0 && x<getWidth()/3) && (y>0 && y<getHeight()/3)) && f1c1 == 0) {
				vTriqui.jugar(1,1);
			}
			else if (((x>getWidth()/3 && x<2*getWidth()/3) && (y>0 && y<getHeight()/3)) && f1c2 == 0) {
				f1c2 = 1;
				c=0;
				g.drawOval(9*getWidth()/24, getHeight()/24, getWidth()/4, getHeight()/4);
			}
			else if (((x>2*getWidth()/3 && x<getWidth()) && (y>0 && y<getHeight()/3)) && f1c3 == 0) {
				f1c3 = 1;
				c=0;
				g.drawOval(17*getWidth()/24, getHeight()/24, getWidth()/4, getHeight()/4);
			}
			
			//Fila 2
			if (((x>0 && x<getWidth()/3) && (y>getHeight()/3 && y<2*getHeight()/3)) && f2c1 == 0) {
				f2c1 = 1;
				c=0;
				g.drawOval(getWidth()/24, 9*getHeight()/24, getWidth()/4, getHeight()/4);
			}
			else if (((x>getWidth()/3 && x<2*getWidth()/3) && (y>getHeight()/3 && y<2*getHeight()/3)) && f2c2 == 0) {
				f2c2 = 1;
				c=0;
				g.drawOval(9*getWidth()/24, 9*getHeight()/24, getWidth()/4, getHeight()/4);				
			}
			else if (((x>2*getWidth()/3 && x<getWidth()) && (y>getHeight()/3 && y<2*getHeight()/3)) && f2c3 == 0) {
				f2c3 = 1;
				c=0;
				g.drawOval(17*getWidth()/24, 9*getHeight()/24, getWidth()/4, getHeight()/4);
			}
			
			//Fila 3
			if (((x>0 && x<getWidth()/3) && (y>2*getHeight()/3 && y<getHeight())) && f3c1 == 0) {
				f3c1 = 1;
				c=0;
				g.drawOval(getWidth()/24, 17*getHeight()/24, getWidth()/4, getHeight()/4);				
			}
			else if (((x>getWidth()/3 && x<2*getWidth()/3) && (y>2*getHeight()/3 && y<getHeight())) && f3c2 == 0) {
				f3c2 = 1;
				c=0;
				g.drawOval(9*getWidth()/24, 17*getHeight()/24, getWidth()/4, getHeight()/4);		
			}
			else if (((x>2*getWidth()/3 && x<getWidth()) && (y>2*getHeight()/3 && y<getHeight())) && f3c3 == 0) {
				f3c3 = 1;
				c=0;
				g.drawOval(17*getWidth()/24, 17*getHeight()/24, getWidth()/4, getHeight()/4);		
			}
		}
		else {
			
			//Fila 1
			if (((x>0 && x<getWidth()/3) && (y>0 && y<getHeight()/3)) && f1c1 == 0) {
				f1c1 = 1;
				c=1;
				g.drawLine(getWidth()/24, getHeight()/24, 7*getWidth()/24, 7*getHeight()/24);
				g.drawLine(7*getWidth()/24, getHeight()/24, getWidth()/24, 7*getHeight()/24);
			}
			else if (((x>getWidth()/3 && x<2*getWidth()/3) && (y>0 && y<getHeight()/3)) && f1c2 == 0) {
				f1c2 = 1;
				c=1;
				g.drawLine(9*getWidth()/24, getHeight()/24, 15*getWidth()/24, 7*getHeight()/24);
				g.drawLine(15*getWidth()/24, getHeight()/24, 9*getWidth()/24, 7*getHeight()/24);
			}
			else if (((x>2*getWidth()/3 && x<getWidth()) && (y>0 && y<getHeight()/3)) && f1c3 == 0) {
				f1c3 = 1;
				c=1;
				g.drawLine(17*getWidth()/24, getHeight()/24, 23*getWidth()/24, 7*getHeight()/24);
				g.drawLine(23*getWidth()/24, getHeight()/24, 17*getWidth()/24, 7*getHeight()/24);
			}
			
			//Fila 2
			if (((x>0 && x<getWidth()/3) && (y>getHeight()/3 && y<2*getHeight()/3)) && f2c1 == 0) {
				f2c1 = 1;
				c=1;
				g.drawLine(getWidth()/24, 9*getHeight()/24, 7*getWidth()/24, 15*getHeight()/24);
				g.drawLine(7*getWidth()/24, 9*getHeight()/24, getWidth()/24, 15*getHeight()/24);
			}
			else if (((x>getWidth()/3 && x<2*getWidth()/3) && (y>getHeight()/3 && y<2*getHeight()/3)) && f2c2 == 0) {
				f2c2 = 1;
				c=1;
				g.drawLine(9*getWidth()/24, 9*getHeight()/24, 15*getWidth()/24, 15*getHeight()/24);
				g.drawLine(15*getWidth()/24, 9*getHeight()/24, 9*getWidth()/24, 15*getHeight()/24);
			}
			else if (((x>2*getWidth()/3 && x<getWidth()) && (y>getHeight()/3 && y<2*getHeight()/3)) && f2c3 == 0) {
				f2c3 = 1;
				c=1;
				g.drawLine(17*getWidth()/24, 9*getHeight()/24, 23*getWidth()/24, 15*getHeight()/24);
				g.drawLine(23*getWidth()/24, 9*getHeight()/24, 17*getWidth()/24, 15*getHeight()/24);
			}
			
			//Fila 3
			if (((x>0 && x<getWidth()/3) && (y>2*getHeight()/3 && y<getHeight())) && f3c1 == 0) {
				f3c1 = 1;
				c=1;
				g.drawLine(getWidth()/24, 17*getHeight()/24, 7*getWidth()/24, 23*getHeight()/24);
				g.drawLine(7*getWidth()/24, 17*getHeight()/24, getWidth()/24, 23*getHeight()/24);
			}
			else if (((x>getWidth()/3 && x<2*getWidth()/3) && (y>2*getHeight()/3 && y<getHeight())) && f3c2 == 0) {
				f3c2 = 1;
				c=1;
				g.drawLine(9*getWidth()/24, 17*getHeight()/24, 15*getWidth()/24, 23*getHeight()/24);
				g.drawLine(15*getWidth()/24, 17*getHeight()/24, 9*getWidth()/24, 23*getHeight()/24);
			}
			else if (((x>2*getWidth()/3 && x<getWidth()) && (y>2*getHeight()/3 && y<getHeight())) && f3c3 == 0) {
				f3c3 = 1;
				c=1;
				g.drawLine(17*getWidth()/24, 17*getHeight()/24, 23*getWidth()/24, 23*getHeight()/24);
				g.drawLine(23*getWidth()/24, 17*getHeight()/24, 17*getWidth()/24, 23*getHeight()/24);
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
	}

}
