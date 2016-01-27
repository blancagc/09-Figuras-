package vista;

import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

import modelo.Equilatero;

/**
 * @author Blanca
 */
/**
 * 
 * La clase Equilatero se utliza para crear los objetos que estaran en la ventana
 *
 */

public class Equilaterovtn extends JFrame implements ActionListener{
	private JTextField txtN1= new JTextField();
		
	private JLabel lbN1= new JLabel("Ingresa valor de un lado:");
	
	private JLabel lbOperacion= new JLabel("Perimetro:");
	private JLabel lbOperacion1= new JLabel("Área:");
	
	private JButton btnCalcular= new JButton("Calcular");
	private JButton btnRegresar= new JButton("Regresar");
	
	private Container c= getContentPane();
	
	private Equilatero a = new Equilatero();
	
	
	//metodo para crear la ventana
	public Equilaterovtn(){
		super.setTitle("Equilátero");
		super.setSize(320, 270);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	/**
	 * Se cargan los objetos al panel
	 */
	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		
		btnCalcular.setBounds(10, 100, 180, 30);
		
		lbOperacion.setBounds(10,150, 280,30);
		lbOperacion1.setBounds(10,170, 280,30);
		
		btnRegresar.setBounds(200, 190, 90, 30);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(btnCalcular);
		c.add(lbOperacion);
		c.add(lbOperacion1);
		c.add(btnRegresar);
		btnCalcular.addActionListener(this);
		btnRegresar.addActionListener(this);
		

	}

	@Override
	
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		if(btn==btnCalcular){
		double r = a.perimetro(0, 0, 0,Integer.parseInt(txtN1.getText()), 0, 0, 0);
		lbOperacion.setText(String.format("Perimetro = %f", r));
		double r2 = a.area(0, 0, 0,Integer.parseInt(txtN1.getText()),0, 0, 0);
		lbOperacion1.setText(String.format("Área = %f", r2));

		}
		if(btn==btnRegresar){
			MenuTriangulo vtn= new MenuTriangulo();
			vtn.setVisible(true);
			this.setVisible(false);
			
			}
	}
	
	
}
