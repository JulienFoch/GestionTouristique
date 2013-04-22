import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JSpinner;


public class ResponsableSite extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAffluenceMoyenne;
	private JTextField textFieldDureeMoyenneSite;
	private JTextField textFieldDureeMinimale;
	private JTextField textFieldDureeMaximale;
	private JList listSite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResponsableSite frame = new ResponsableSite();
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
	public ResponsableSite() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JButton btnCalculerStatistiques = new JButton("Calculer Statistiques");
		contentPane.add(btnCalculerStatistiques, "6, 6");
		
		listSite = new JList();
		contentPane.add(listSite, "8, 6, fill, fill");
		
		JLabel lblAffluenceMoyenne = new JLabel("Affluence moyenne :");
		contentPane.add(lblAffluenceMoyenne, "6, 10");
		
		textFieldAffluenceMoyenne = new JTextField();
		contentPane.add(textFieldAffluenceMoyenne, "8, 10, fill, default");
		textFieldAffluenceMoyenne.setColumns(10);
		
		JLabel lblDureMoyenneDu = new JLabel("Dur\u00E9e moyenne du site :");
		contentPane.add(lblDureMoyenneDu, "6, 12, left, default");
		
		textFieldDureeMoyenneSite = new JTextField();
		contentPane.add(textFieldDureeMoyenneSite, "8, 12, fill, default");
		textFieldDureeMoyenneSite.setColumns(10);
		
		JLabel lblDureMinimale = new JLabel("Dur\u00E9e minimale :");
		contentPane.add(lblDureMinimale, "6, 14, left, default");
		
		textFieldDureeMinimale = new JTextField();
		contentPane.add(textFieldDureeMinimale, "8, 14, fill, default");
		textFieldDureeMinimale.setColumns(10);
		
		JLabel lblDureMaximale = new JLabel("Dur\u00E9e maximale :");
		contentPane.add(lblDureMaximale, "6, 16, left, default");
		
		textFieldDureeMaximale = new JTextField();
		contentPane.add(textFieldDureeMaximale, "8, 16, fill, default");
		textFieldDureeMaximale.setColumns(10);
	}

}
