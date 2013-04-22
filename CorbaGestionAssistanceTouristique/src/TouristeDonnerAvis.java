import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JList;


public class TouristeDonnerAvis extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TouristeDonnerAvis frame = new TouristeDonnerAvis();
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
	public TouristeDonnerAvis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListeDesSites = new JLabel("Liste des sites");
		lblListeDesSites.setBounds(101, 105, 90, 16);
		contentPane.add(lblListeDesSites);
		
		JLabel lblAvisVisite = new JLabel("Avis visite");
		lblAvisVisite.setBounds(287, 105, 65, 16);
		contentPane.add(lblAvisVisite);
		
		JList listSite = new JList();
		listSite.setBounds(101, 133, 90, 16);
		contentPane.add(listSite);
		
		JList listAvisVisite = new JList();
		listAvisVisite.setBounds(287, 133, 65, 15);
		contentPane.add(listAvisVisite);
	}
}
