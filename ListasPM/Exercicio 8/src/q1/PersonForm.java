package q1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PersonForm extends JFrame {
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldIdade;
	public static ArrayList<Person> pessoas = new ArrayList<Person>();

	/**
	 * Launch the application.
	 */
	
	public static void addPerson(Person pessoa) {
		pessoas.add(pessoa);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonForm frame = new PersonForm();
					frame.setVisible(true);;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PersonForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNome = new JLabel("Nome:");
		contentPane.add(lblNome, "2, 2");
		
		textFieldNome = new JTextField();
		contentPane.add(textFieldNome, "4, 2, 5, 1");
		textFieldNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		contentPane.add(lblIdade, "2, 4");
		
		textFieldIdade = new JTextField();
		contentPane.add(textFieldIdade, "4, 4, 5, 1");
		textFieldIdade.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		contentPane.add(lblSexo, "2, 6");
		
		JComboBox<String> comboBoxSexo = new JComboBox<String>();
		comboBoxSexo.addItem(null);
		comboBoxSexo.addItem("Masculino");
		comboBoxSexo.addItem("Feminino");
		comboBoxSexo.addItem("Outros");		
		contentPane.add(comboBoxSexo, "4, 6, 5, 1");
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil: ");
		contentPane.add(lblEstadoCivil, "2, 8, right, default");
		
		JComboBox<Object> comboBoxEstadoCivil = new JComboBox<Object>();
		comboBoxEstadoCivil.addItem(null);
		comboBoxEstadoCivil.addItem("Solteiro(a)");
		comboBoxEstadoCivil.addItem("Casado(a)");
		comboBoxEstadoCivil.addItem("Viuvo(a)");
		//String sexoValue = 
		contentPane.add(comboBoxEstadoCivil, "4, 8, 5, 1, fill, default");
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Person pessoa = new Person(textFieldNome.getText(), comboBoxSexo.getSelectedItem().toString(), textFieldIdade.getText(), comboBoxEstadoCivil.getSelectedItem().toString());
				addPerson(pessoa);
				System.out.println(pessoa.getNome() + " registrado(a)!");
				textFieldIdade.setText(null);
				textFieldNome.setText(null);
				comboBoxEstadoCivil.setSelectedIndex(0);
				comboBoxSexo.setSelectedIndex(0);
			}
		});
		contentPane.add(btnOk, "4, 18");
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldIdade.setText(null);
				textFieldNome.setText(null);
				comboBoxEstadoCivil.setSelectedIndex(0);
				comboBoxSexo.setSelectedIndex(0);
			}
		});
		contentPane.add(btnCancel, "6, 18");
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder stringFinal = new StringBuilder();
				for(int i=0; i<pessoas.size(); i++) {
					stringFinal.append(pessoas.get(i).toString() + System.lineSeparator());
				}
				JOptionPane.showMessageDialog(null, stringFinal.toString());				
			}
		});
		contentPane.add(btnExibir, "8, 18");
	}

}
