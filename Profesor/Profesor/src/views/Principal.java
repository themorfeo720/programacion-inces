package views;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuBar barraMenu = null;
	private JMenu menuOpciones = null;
	private JMenuItem menuItemCalculadora = null;
	private JMenu menuAyuda = null;
	private JMenuItem menuItemSalir = null;

	/**
	 * This method initializes barraMenu
	 * 
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getBarraMenu() {
		if (barraMenu == null) {
			barraMenu = new JMenuBar();
			barraMenu.setToolTipText("Barra de Menus");
			barraMenu.add(getMenuOpciones());
			barraMenu.add(getMenuAyuda());
		}
		return barraMenu;
	}

	/**
	 * This method initializes menuOpciones
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getMenuOpciones() {
		if (menuOpciones == null) {
			menuOpciones = new JMenu();
			menuOpciones.setText("Menu Opciones");
			menuOpciones.add(getMenuItemCalculadora());
		}
		return menuOpciones;
	}

	/**
	 * This method initializes menuItemCalculadora
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemCalculadora() {
		if (menuItemCalculadora == null) {
			menuItemCalculadora = new JMenuItem();
			menuItemCalculadora.setText("Calculadora");
		}
		return menuItemCalculadora;
	}

	/**
	 * This method initializes menuAyuda
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getMenuAyuda() {
		if (menuAyuda == null) {
			menuAyuda = new JMenu();
			menuAyuda.setText("Ayuda");
			menuAyuda.add(getMenuItemSalir());
		}
		return menuAyuda;
	}

	/**
	 * This method initializes menuItemSalir
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getMenuItemSalir() {
		if (menuItemSalir == null) {
			menuItemSalir = new JMenuItem();
			menuItemSalir.setText("Salir");
		}
		return menuItemSalir;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Principal thisClass = new Principal();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);

	}

	/**
	 * This is the default constructor
	 */
	public Principal() {

		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setJMenuBar(getBarraMenu());
		this.setTitle("Ventana Principal");

	}

}
