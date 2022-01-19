package interfaces;

import java.awt.EventQueue;

public class MainGeetOutMasters {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new InicioGUI();
			}

		});
	}

}