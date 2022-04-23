package uniandes.dpoo.triqui.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{
	private VentanaTriqui vTriqui;
	private JLabel jugadas;
	
	public PanelBotones(VentanaTriqui padre)
	{
		JButton reiniciar = new JButton("Reiniciar");
		JLabel jugadas = new JLabel();
		this.vTriqui = padre;
		this.jugadas = jugadas;
		add(reiniciar);
		add(jugadas);
		reiniciar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		vTriqui.reiniciar();
	}

	public void actualizarCantidadJugadas(int numero)
	{
		jugadas.setText(numero + " Jugadas");
	}
}
