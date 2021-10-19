package vista;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ARZATE BELLO SERGIO SACHIEL 
 * MARTINEZ GAMBOA NATALIA
 */
public class AhorcadoUI extends JFrame {

	protected JPanel contentPane;
	protected JTextField txtPalabraSecreta;
	protected JTextField txtLetra;
	protected JTextField txtAciertos;
	protected JTextField txtFallos;
	protected JTextField txtMensaje;
	protected JLabel lblTitulo;
	protected JButton btnYa;
	protected JLabel lblPalabraSecreta; 


	
	public AhorcadoUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		lblPalabraSecreta = new JLabel("INGRESE LA PALABRA SECRETA");
		lblPalabraSecreta.setBounds(10, 11, 210, 14);
                lblPalabraSecreta.setForeground(Color.yellow);
		contentPane.add(lblPalabraSecreta);
		
		txtPalabraSecreta = new JTextField();
		txtPalabraSecreta.setBounds(200, 8, 252, 20);
		contentPane.add(txtPalabraSecreta);
		txtPalabraSecreta.setColumns(10);
		
		btnYa = new JButton("LISTO");		
		btnYa.setBounds(460, 7, 70, 23);
                btnYa.setForeground(Color.RED);
		contentPane.add(btnYa);
		
	
		JLabel lblLetra = new JLabel("INGRESE UNA LETRA");
		lblLetra.setBounds(26, 84, 200, 14);
		contentPane.add(lblLetra);
                lblLetra.setForeground(Color.yellow);
		
		txtLetra = new JTextField();
		txtLetra.setEditable(false);
		txtLetra.setBounds(150, 81, 49, 20);
                txtLetra.setForeground(Color.BLACK);
		contentPane.add(txtLetra);
		txtLetra.setColumns(1);
		
		txtAciertos = new JTextField();
		txtAciertos.setEditable(false);
		txtAciertos.setBounds(69, 156, 302, 20);
		contentPane.add(txtAciertos);
		txtAciertos.setColumns(10);
		
		JLabel lblAciertos = new JLabel("ACIERTOS");
		lblAciertos.setBounds(69, 131, 80, 14);
		contentPane.add(lblAciertos);
                lblAciertos.setForeground(Color.GREEN);
		
		JLabel lblFallos = new JLabel("ERRORES");
		lblFallos.setBounds(69, 187, 55, 14);
		contentPane.add(lblFallos);
                lblFallos.setForeground(Color.red);
		
		txtFallos = new JTextField();
		txtFallos.setEditable(false);
		txtFallos.setBounds(125, 187, 56, 20);
		contentPane.add(txtFallos);
		txtFallos.setColumns(10);
		
		JLabel lblMensaje = new JLabel("MENSAJE");
		lblMensaje.setBounds(16, 237, 64, 14);
		contentPane.add(lblMensaje);
                lblMensaje.setForeground(Color.red);
		
		txtMensaje = new JTextField();
		txtMensaje.setEditable(false);
		txtMensaje.setBounds(79, 234, 345, 20);
		contentPane.add(txtMensaje);
		txtMensaje.setColumns(10);
		
		lblTitulo = new JLabel("AHORCADO");
                lblTitulo.setForeground(Color.red);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(69, 11, 302, 39);
		lblTitulo.setVisible(false);
		contentPane.add(lblTitulo);
                
                JLabel lblCreditos = new JLabel("CREADO POR MARTINEZ GAMBOA NATALIA Y ARZATE BELLO SERGIO SACHIEL");
                lblCreditos.setForeground(Color.PINK);
                lblCreditos.setBounds(79 ,320, 1000, 39);
                contentPane.add(lblCreditos);
                
	}

}