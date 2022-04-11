package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ModificarMaleta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarMaleta frame = new ModificarMaleta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ModificarMaleta() {
		setTitle("Modificar Maleta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(22, 40, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(22, 76, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ancho (cm)");
		lblNewLabel_2.setBounds(22, 117, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Alto (cm)");
		lblNewLabel_3.setBounds(22, 156, 115, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fondo (cm)");
		lblNewLabel_4.setBounds(22, 194, 104, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(118, 73, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 114, 153, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 153, 153, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(118, 191, 153, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.setBounds(315, 36, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Grabar");
		btnNewButton_1.setBounds(315, 98, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(118, 36, 153, 22);
		contentPane.add(comboBox);
	}
}
