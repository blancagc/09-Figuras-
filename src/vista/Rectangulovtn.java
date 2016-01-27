package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import modelo.Rectangulo;
/**
 * 
 * @author Blanca
 *
 */
/*
 * Clase  principal donde se definen cada uno de los objetos a usar
 */
public class Rectangulovtn extends JFrame implements ActionListener{

	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	
	private JLabel lbN1= new JLabel("Ingresa valor del largo :");
	private JLabel lbN2= new JLabel("Ingresa el valor del ancho :");
	
	private JLabel lbOperacion= new JLabel("Perimetro:");
	private JLabel lbOperacion1= new JLabel("Área:");
	
	private JButton btnCalcular= new JButton("Calcular");
	private JButton btnRegresar= new JButton("Regresar");
	
	private Container c= getContentPane();
	
	private Rectangulo p = new Rectangulo();
	
	/**
	 * Se construye la ventana
	 */
	public Rectangulovtn(){
		super.setTitle("Rectangulo");
		super.setSize(320, 310);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
/**
 * Se dimencionan y posicionan los objetos además que se agregan al panel
 */
	private void cargarControles() {
		// TODO Auto-generated method stub
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		
		lbN2.setBounds(10,80, 280, 30);
		txtN2.setBounds(10, 120, 280, 30);
		
		btnCalcular.setBounds(10, 160, 180, 30);
		
		lbOperacion.setBounds(10,200, 280,30);
		lbOperacion1.setBounds(10,220, 280,30);
		
		btnRegresar.setBounds(200, 240, 90, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnCalcular);
		c.add(lbOperacion);
		c.add(lbOperacion1);
		c.add(btnRegresar);
		btnCalcular.addActionListener(this);
		btnRegresar.addActionListener(this);

	}

	@Override
	/*
	 * Metodo que recibe las acciones de los botones
	 */
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		if(btn==btnCalcular){
		int r = (int) p.perimetro(0,Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()),0,0,0,0);
		lbOperacion.setText(String.format("Perimetro = %d", r));
		int r2 = (int) p.area(0,Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()),0,0,0,0);
		lbOperacion1.setText(String.format("Área = %d", r2));
		}
		if(btn==btnRegresar){
			Menu vtn= new Menu();
			vtn.setVisible(true);
			this.setVisible(false);
			
			}
	}
	
}

