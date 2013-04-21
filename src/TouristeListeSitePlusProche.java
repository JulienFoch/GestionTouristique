import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;


public class TouristeListeSitePlusProche extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldX;
	private JTextField textFieldY;
	private JTextField textFieldZ;
	private JTable tableResultats;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TouristeListeSitePlusProche frame = new TouristeListeSitePlusProche();
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
	public TouristeListeSitePlusProche() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCoordonnesGps = new JLabel("Coordonn\u00E9es GPS ");
		lblCoordonnesGps.setBounds(30, 35, 114, 16);
		contentPane.add(lblCoordonnesGps);
		
		JLabel lblX = new JLabel("X :");
		lblX.setBounds(164, 35, 21, 16);
		contentPane.add(lblX);
		
		JLabel lblY = new JLabel("Y : ");
		lblY.setBounds(249, 35, 21, 16);
		contentPane.add(lblY);
		
		JLabel lblZ = new JLabel("Z : ");
		lblZ.setBounds(334, 35, 21, 16);
		contentPane.add(lblZ);
		
		textFieldX = new JTextField();
		textFieldX.setBounds(186, 29, 51, 28);
		contentPane.add(textFieldX);
		textFieldX.setColumns(10);
		
		textFieldY = new JTextField();
		textFieldY.setBounds(271, 29, 51, 28);
		contentPane.add(textFieldY);
		textFieldY.setColumns(10);
		
		textFieldZ = new JTextField();
		textFieldZ.setBounds(356, 29, 51, 28);
		contentPane.add(textFieldZ);
		textFieldZ.setColumns(10);
		
		JLabel lblModeDeDplacement = new JLabel("Mode de d\u00E9placement : ");
		lblModeDeDplacement.setBounds(30, 73, 155, 16);
		contentPane.add(lblModeDeDplacement);
		
		JList listModeDeplacement = new JList();
		listModeDeplacement.setBounds(187, 73, 220, 16);
		contentPane.add(listModeDeplacement);
		
		JLabel lblResultats = new JLabel("R\u00E9sultats : ");
		lblResultats.setBounds(30, 111, 70, 16);
		contentPane.add(lblResultats);
		
		tableResultats = new JTable();
		tableResultats.setBounds(30, 152, 398, 105);
		contentPane.add(tableResultats);
	}
}
