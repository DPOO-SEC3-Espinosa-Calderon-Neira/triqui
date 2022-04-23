package uniandes.dpoo.triqui.interfaz;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelTriqui extends JPanel implements MouseListener {
	private VentanaTriqui vTriqui;

	public PanelTriqui(VentanaTriqui ventanaTriqui) {
		this.vTriqui = ventanaTriqui;
		addMouseListener(this);
	}

	public void actualizarTablero() {
		//validate();
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		pintarLineas(g2d);
		pintarJugadas(g2d);
	}

	private void pintarJugadas(Graphics2D g2d) {

	}

	private void pintarLineas(Graphics2D g2d) {
		g2d.drawLine(getWidth() / 3, 0, getWidth() / 3, getHeight());
		g2d.drawLine(2 * getWidth() / 3, 0, 2 * getWidth() / 3, getHeight());
		g2d.drawLine(0, getHeight() / 3, getWidth(), getHeight() / 3);
		g2d.drawLine(0, 2 * getHeight() / 3, getWidth(), 2 * getHeight() / 3);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int marcador = 0;
		int fila = 0;
		int columna = 0;
		int x = e.getX();
		int y = e.getY();
		Graphics g = getGraphics();
		Graphics2D g2d = (Graphics2D) g;

		if (((x > 0 && x < getWidth() / 3) && (y > 0 && y < getHeight() / 3))) {

		} else if (((x > getWidth() / 3 && x < 2 * getWidth() / 3) && (y > 0 && y < getHeight() / 3))) {
			fila = 0;
			columna = 1;
			marcador = 1;
		} else if (((x > 2 * getWidth() / 3 && x <= getWidth()) && (y > 0 && y < getHeight() / 3))) {
			fila = 0;
			columna = 2;
			marcador = 2;
		}

		// Fila 2
		else if (((x > 0 && x < getWidth() / 3) && (y > getHeight() / 3 && y < 2 * getHeight() / 3))) {
			fila = 1;
			columna = 0;
			marcador = 3;
		} else if (((x > getWidth() / 3 && x < 2 * getWidth() / 3)
				&& (y > getHeight() / 3 && y < 2 * getHeight() / 3))) {
			fila = 1;
			columna = 1;
			marcador = 4;
		} else if (((x > 2 * getWidth() / 3 && x < getWidth()) && (y > getHeight() / 3 && y < 2 * getHeight() / 3))) {
			fila = 1;
			columna = 2;
			marcador = 5;
		}

		// Fila 3
		else if (((x > 0 && x < getWidth() / 3) && (y > 2 * getHeight() / 3 && y < getHeight()))) {
			fila = 2;
			columna = 0;
			marcador = 6;

		} else if (((x > getWidth() / 3 && x < 2 * getWidth() / 3) && (y > 2 * getHeight() / 3 && y < getHeight()))) {
			fila = 2;
			columna = 1;
			marcador = 7;

		} else if (((x > 2 * getWidth() / 3 && x < getWidth()) && (y > 2 * getHeight() / 3 && y < getHeight()))) {
			fila = 2;
			columna = 2;
			marcador = 8;

		}
		if (vTriqui.puedeJugar(fila, columna) == true) {
			if (vTriqui.actualizar() % 2 == 0) {
				if (marcador == 0) {
					g2d.drawOval(getWidth() / 24, getHeight() / 24, getWidth() / 4, getHeight() / 4);
				} else if (marcador == 1) {
					g2d.drawOval(9 * getWidth() / 24, getHeight() / 24, getWidth() / 4, getHeight() / 4);
				} else if (marcador == 2) {
					g2d.drawOval(17 * getWidth() / 24, getHeight() / 24, getWidth() / 4, getHeight() / 4);
				} else if (marcador == 3) {
					g2d.drawOval(getWidth() / 24, 9 * getHeight() / 24, getWidth() / 4, getHeight() / 4);

				} else if (marcador == 4) {
					g2d.drawOval(9 * getWidth() / 24, 9 * getHeight() / 24, getWidth() / 4, getHeight() / 4);

				} else if (marcador == 5) {
					g2d.drawOval(17 * getWidth() / 24, 9 * getHeight() / 24, getWidth() / 4, getHeight() / 4);

				} else if (marcador == 6) {
					g2d.drawOval(getWidth() / 24, 17 * getHeight() / 24, getWidth() / 4, getHeight() / 4);

				} else if (marcador == 7) {
					g2d.drawOval(9 * getWidth() / 24, 17 * getHeight() / 24, getWidth() / 4, getHeight() / 4);

				} else if (marcador == 8) {
					g2d.drawOval(17 * getWidth() / 24, 17 * getHeight() / 24, getWidth() / 4, getHeight() / 4);

				}
			} else if (vTriqui.actualizar() % 2 == 1) {
				if (marcador == 0) {
					g2d.drawLine(getWidth() / 24, getHeight() / 24, 7 * getWidth() / 24, 7 * getHeight() / 24);
					g2d.drawLine(7 * getWidth() / 24, getHeight() / 24, getWidth() / 24, 7 * getHeight() / 24);
				} else if (marcador == 1) {
					g2d.drawLine(9 * getWidth() / 24, getHeight() / 24, 15 * getWidth() / 24, 7 * getHeight() / 24);
					g2d.drawLine(15 * getWidth() / 24, getHeight() / 24, 9 * getWidth() / 24, 7 * getHeight() / 24);
				} else if (marcador == 2) {
					g2d.drawLine(17 * getWidth() / 24, getHeight() / 24, 23 * getWidth() / 24, 7 * getHeight() / 24);
					g2d.drawLine(23 * getWidth() / 24, getHeight() / 24, 17 * getWidth() / 24, 7 * getHeight() / 24);
				} else if (marcador == 3) {
					g2d.drawLine(getWidth() / 24, 9 * getHeight() / 24, 7 * getWidth() / 24, 15 * getHeight() / 24);
					g2d.drawLine(7 * getWidth() / 24, 9 * getHeight() / 24, getWidth() / 24, 15 * getHeight() / 24);
				} else if (marcador == 4) {
					g2d.drawLine(9 * getWidth() / 24, 9 * getHeight() / 24, 15 * getWidth() / 24,
							15 * getHeight() / 24);
					g2d.drawLine(15 * getWidth() / 24, 9 * getHeight() / 24, 9 * getWidth() / 24,
							15 * getHeight() / 24);
				} else if (marcador == 5) {
					g2d.drawLine(17 * getWidth() / 24, 9 * getHeight() / 24, 23 * getWidth() / 24,
							15 * getHeight() / 24);
					g2d.drawLine(23 * getWidth() / 24, 9 * getHeight() / 24, 17 * getWidth() / 24,
							15 * getHeight() / 24);
				} else if (marcador == 6) {
					g2d.drawLine(getWidth() / 24, 17 * getHeight() / 24, 7 * getWidth() / 24, 23 * getHeight() / 24);
					g2d.drawLine(7 * getWidth() / 24, 17 * getHeight() / 24, getWidth() / 24, 23 * getHeight() / 24);
				} else if (marcador == 7) {
					g2d.drawLine(9 * getWidth() / 24, 17 * getHeight() / 24, 15 * getWidth() / 24,
							23 * getHeight() / 24);
					g2d.drawLine(15 * getWidth() / 24, 17 * getHeight() / 24, 9 * getWidth() / 24,
							23 * getHeight() / 24);
				} else if (marcador == 8) {
					g2d.drawLine(17 * getWidth() / 24, 17 * getHeight() / 24, 23 * getWidth() / 24,
							23 * getHeight() / 24);
					g2d.drawLine(23 * getWidth() / 24, 17 * getHeight() / 24, 17 * getWidth() / 24,
							23 * getHeight() / 24);
				}
			}
		}
		vTriqui.jugar(fila, columna);
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
