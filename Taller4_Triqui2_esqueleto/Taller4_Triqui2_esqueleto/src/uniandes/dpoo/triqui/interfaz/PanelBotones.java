package uniandes.dpoo.triqui.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import uniandes.dpoo.triqui.mundo.Triqui;


@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{
	private Triqui triqui;
	private VentanaTriqui vTriqui;
	
	private JLabel jugadas;
	
	public PanelBotones(VentanaTriqui padre)
	{
		triqui = new Triqui();
		this.vTriqui = padre;
		JButton reiniciar = new JButton("Reiniciar");
		JLabel jugadas = new JLabel(triqui.darCantidadJugadas()+" Jugadas");
		this.jugadas = jugadas;
		reiniciar.addActionListener(this);
		add(reiniciar);
		add(jugadas);
	}

	public void actionPerformed(ActionEvent e)
	{
		vTriqui.reiniciar();
	}

	public void actualizarCantidadJugadas(int numero)
	{
		this.jugadas.setText(numero+" Jugadas");
	}
}
