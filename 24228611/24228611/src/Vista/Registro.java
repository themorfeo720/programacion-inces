package Vista;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Registro extends JFrame{

	private JPanel panel = null;
	private JDesktopPane ContenedorPrincipal = null;
	private JInternalFrame IntFrame = null;
	
	private JLabel inicio = null;
	
	private static final long serialVersionUID = 1459206530077350977L;

	public Registro(){
		Inicializar();
	}
	
	public void Inicializar(){
		this.setTitle("Registro");
		this.setSize(300,300);
		this.setLocation(200,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(getContenedorPrincipal());
		
	}
	
	private JDesktopPane getContenedorPrincipal() {
		if (ContenedorPrincipal == null) {
			ContenedorPrincipal = new JDesktopPane();
			ContenedorPrincipal.add(InternalFrame(), null);
		}
		return ContenedorPrincipal;
	}
	
	private JInternalFrame InternalFrame(){
		if (IntFrame == null){
			IntFrame = new JInternalFrame();
			IntFrame.setVisible(true);
			IntFrame.setBounds(new Rectangle(50,20,200,200));
			IntFrame.setContentPane(ContPanel());
			//Componentes
			
		}
		return IntFrame;
	}
	
	private JPanel ContPanel(){
		if (panel == null){
			panel = new JPanel();
			panel.setLayout(new BorderLayout());
		}
		return panel;
	}
	
	private JLabel getInicio(){
		if (inicio == null){
			inicio = new JLabel();
			inicio.setText("Iniciar Sesion");
			inicio.setBounds(new Rectangle(10,20,100,20));
		}
		return inicio;
	}
	
	public static void main(String[] args) {
		Registro ventana = new Registro();
		ventana.setVisible(true);

	}

}
