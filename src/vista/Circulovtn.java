package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;


import modelo.Circulo;

/**
 * 
 * @author Blanca
 *
 */
public class Circulovtn extends JFrame implements ActionListener{
	private JTextField txtN1= new JTextField();
		
	private JLabel lbN1= new JLabel("Ingresa el valor:");
	
	private JLabel lbOperacion= new JLabel("Resultado:");
	private JLabel lbOperacion2= new JLabel("Resultado:");
	
	private JButton btnCalcular= new JButton("Calcular");
	private JButton btnRegresar = new JButton("Regresar");
	
	private Container c= getContentPane();
	
	private Circulo a = new Circulo();
	
	/**
	 * Se crea la ventana
	 */
	public Circulovtn(){
		super.setTitle("Área del circulo");
		super.setSize(320, 290);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	/**
	 * Se agregan y posicionan los objetos a la ventana
	 */
	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		
		btnCalcular.setBounds(10, 100, 180, 30);
		
		lbOperacion.setBounds(10,150, 280,30);
		lbOperacion2.setBounds(10,170, 280,30);
		
		btnRegresar.setBounds(200, 190, 90, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(btnCalcular);
		c.add(lbOperacion);
		c.add(lbOperacion2);
		c.add(btnRegresar);
		btnCalcular.addActionListener(this);
		btnRegresar.addActionListener(this);
		

	}

	@Override
	/**
	 * Se tiene la accion del boton al pulsarlo
	 */
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		if(btn==btnCalcular){
		double r =  a.perimetro(0, 0, 0, 0, 0, 0, Double.parseDouble(txtN1.getText()));
		lbOperacion.setText(String.format("Perimetro = %f", r));	
		double r2 =  a.area(0, 0, 0, 0, 0, 0,Double.parseDouble(txtN1.getText()));
		lbOperacion2.setText(String.format("Área = %f", r2));	
	}if(btn==btnRegresar){
		Menu vtn= new Menu();
		vtn.setVisible(true);
		this.setVisible(false);
		
		}
	}
	
	
}


