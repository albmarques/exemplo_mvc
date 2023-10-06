package Pck_View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Pck_Control.ExemploControl;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ExemploView extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel  jl_label;
	JTextField  jt_texto;	
	JButton jb_inserir;
	
	ExemploControl oExemploControl= new ExemploControl();
	
	public ExemploView() {
		setTitle("Exemplo MVC + DAO simplificado");
		setBounds(100,100,430,300);
		
		jl_label = new JLabel("Texto");
		jl_label.setBounds(20,20,100,20);
		
		jt_texto = new JTextField("");
		jt_texto.setBounds(130,20,100,20);
		
		jb_inserir = new JButton("Inserir");
		jb_inserir.setBounds(20,80,100,20);
		
		getContentPane().setLayout(null);
		getContentPane().add(jl_label);
		getContentPane().add(jt_texto);
		getContentPane().add(jb_inserir);
		
		jb_inserir.addActionListener(this);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==jb_inserir) oExemploControl.inserirExemplo(jt_texto.getText());		
	}
	
	public static void main (String[] args) {
		ExemploView obj_interface = new ExemploView();
		obj_interface.setVisible(true);
		
	}
}
