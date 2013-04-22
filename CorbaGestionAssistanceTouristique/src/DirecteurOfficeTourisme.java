import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class DirecteurOfficeTourisme extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSequenceFavorite;
	private JTextField textFieldTxSatisfactionGenerale;
	private JTextField textFieldAffluenceQuotidienneGenerale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DirecteurOfficeTourisme frame = new DirecteurOfficeTourisme();
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
	public DirecteurOfficeTourisme() {
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
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JButton btnCalculerStatistiques = new JButton("Calculer Statistiques");
		contentPane.add(btnCalculerStatistiques, "6, 6");
		
		JLabel lblSquenceFavorite = new JLabel("S\u00E9quence favorite : ");
		contentPane.add(lblSquenceFavorite, "6, 10, left, default");
		
		textFieldSequenceFavorite = new JTextField();
		contentPane.add(textFieldSequenceFavorite, "8, 10, fill, default");
		textFieldSequenceFavorite.setColumns(10);
		
		JLabel lblTauxDeSatisfaction = new JLabel("Taux de satisfaction g\u00E9n\u00E9rale : ");
		contentPane.add(lblTauxDeSatisfaction, "6, 14, left, default");
		
		textFieldTxSatisfactionGenerale = new JTextField();
		contentPane.add(textFieldTxSatisfactionGenerale, "8, 14, fill, default");
		textFieldTxSatisfactionGenerale.setColumns(10);
		
		JLabel lblAffluenceQuotidienneGnrale = new JLabel("Affluence quotidienne g\u00E9n\u00E9rale : ");
		contentPane.add(lblAffluenceQuotidienneGnrale, "6, 18, left, default");
		
		textFieldAffluenceQuotidienneGenerale = new JTextField();
		contentPane.add(textFieldAffluenceQuotidienneGenerale, "8, 18, fill, default");
		textFieldAffluenceQuotidienneGenerale.setColumns(10);
	}

}
