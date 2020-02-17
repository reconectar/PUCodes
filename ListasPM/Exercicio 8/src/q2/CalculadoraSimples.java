package q2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class CalculadoraSimples extends JFrame {

	private JPanel contentPane;
	private JTextField valorOperador;
	public static int operador1 = 0;
	public static int operador2 = 0;
	public static int operacao = 0;
	public static int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSimples frame = new CalculadoraSimples();
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
	public CalculadoraSimples() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 172, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(74dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,},
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblOperador = new JLabel("Operador1:");
		contentPane.add(lblOperador, "2, 2");
		
		JLabel lblOp1 = new JLabel("OP 1: ");
		contentPane.add(lblOp1, "2, 14");
		
		JLabel lblOp2 = new JLabel("OP 2:");
		contentPane.add(lblOp2, "2, 16");
		
		JLabel lblOp = new JLabel("OP: ");
		contentPane.add(lblOp, "2, 18");
		
		valorOperador = new JTextField();
		valorOperador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i%2 == 1) {
					lblOperador.setText("Operador1:");
					operador1 = Integer.valueOf(valorOperador.getText());
					lblOp1.setText("OP 1: " + operador1);
					
				}else if(i%2 == 0){
					lblOperador.setText("Operador2:");
					operador2 = Integer.valueOf(valorOperador.getText());
					lblOp2.setText("OP 2: " + operador2);
				}else {
					i = 0;
					lblOperador.setText("Operador1:");
				}
				i++;
				valorOperador.setText(null);
			}
		});
		contentPane.add(valorOperador, "2, 4, fill, default");
		valorOperador.setColumns(10);
		
		JButton btnSomar = new JButton("+");
		btnSomar.setName("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operacao = 1;
				lblOp.setText("OP: " + btnSomar.getName());
			}
		});
		contentPane.add(btnSomar, "2, 6");
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.setName("Subtrair");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operacao  = 2;
				lblOp.setText("OP: " + btnSubtrair.getName());
			}
		});
		contentPane.add(btnSubtrair, "2, 8");
		
		JButton btnDividir = new JButton("/");
		btnDividir.setName("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = 3;
				lblOp.setText("OP: " + btnDividir.getName());
			}
		});
		contentPane.add(btnDividir, "2, 10");
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.setName("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = 4;
				lblOp.setText("OP: " + btnMultiplicar.getName());
			}
		});
		contentPane.add(btnMultiplicar, "2, 12");
		
		JButton Result = new JButton("=");
		Result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i=-1;
				lblOperador.setText("Resultado: ");
				lblOp.setText("OP:");
				int resultado = 0;
				switch(operacao) {
				case 1:
					resultado = operador1 + operador2;
					break;
				case 2:
					resultado = operador1 - operador2;
					break;
				case 3:
					resultado = operador1 / operador2;
					break;
				case 4:
					resultado = operador1 * operador2;
					break;
				}				
				valorOperador.setText(Integer.toString(resultado));				
			}
		});
		contentPane.add(Result, "2, 20");
	}

}
