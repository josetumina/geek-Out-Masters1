package interfaces;

import javax.swing.*;
import java.awt.*;


public class InicioGUI extends JFrame {

    private JPanel principal, dadosActivos, dadosEnJuego, dadosUtilizados;
    private JButton salir, ayuda, lanzar;

    public InicioGUI() {
        this.setTitle("Prueba 1");
		this.setSize(350, 220);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
    }

    public void inicioGUI(){
        principal = new PonerFondoPanel("");
        principal.setPreferredSize(new Dimension(ancho, altura));
        principal.setBackground(new Color(0, 0, 0, 0));
    }

}