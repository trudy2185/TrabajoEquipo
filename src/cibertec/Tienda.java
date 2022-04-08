package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Datos mínimos de la primera maleta
	public static String modelo0 = "Aviator";
	public static double precio0 = 124.9;
	public static double ancho0 = 63.5;
	public static double alto0 = 30.9;
	public static double fondo0 = 29.2;
	// Datos mínimos del segundo maleta
	public static String modelo1 = "Century";
	public static double precio1 = 174.9;
	public static double ancho1 = 75.0;
	public static double alto1 = 28.5;
	public static double fondo1 = 30.0;
	// Datos mínimos del tercer maleta
	public static String modelo2 = "Benneton";
	public static double precio2 = 159.9;
	public static double ancho2 = 65.2;
	public static double alto2 = 31.2;
	public static double fondo2 = 29.4;
	// Datos mínimos del cuarto maleta
	public static String modelo3 = "Lucas";
	public static double precio3 = 99.9;
	public static double ancho3 = 45.0;
	public static double alto3 = 70.0;
	public static double fondo3 = 25.0;
	// Datos mínimos del quinto maleta
	public static String modelo4 = "Samsonite";
	public static double precio4 = 84.9;
	public static double ancho4 = 50.2;
	public static double alto4 = 60.4;
	public static double fondo4 = 25.0;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequios
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	public static String obsequio1 = "USB";
	public static String obsequio2 = "Cuaderno";
	public static String obsequio3 = "Lapicero";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 465);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar maleta");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarMaleta AbrirConsultarMaleta = new ConsultarMaleta();
				AbrirConsultarMaleta.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Modificar maleta");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Listar maletas");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Vender");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Generar reportes");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Configurar descuentos");
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Configurar obsequios");
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Configurar cantidad \u00F3ptima");
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Configurar cuota diaria");
		mnNewMenu_3.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_4 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Acerca de Tienda");
		mnNewMenu_4.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}

