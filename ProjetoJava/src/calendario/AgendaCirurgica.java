package calendario;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import dados.Agenda;
import dados.DataBase;
import telas.TelaAreaDeTrabalho;

public class AgendaCirurgica extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDescricaoCirurgia;
	private JTextField textNomeMedico;
	private JTextField textPaciente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					AgendaCirurgica frame = new AgendaCirurgica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {

				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AgendaCirurgica() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		configurarJanela();

		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(Color.DARK_GRAY);
		lblDate.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblDate.setBounds(20, 182, 46, 14);
		contentPane.add(lblDate);

		JDateChooser textDataCirurgia = new JDateChooser();
		textDataCirurgia.setBounds(76, 182, 223, 20);
		contentPane.add(textDataCirurgia);

		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o Cirurgica");
		lblDescricao.setForeground(Color.DARK_GRAY);
		lblDescricao.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblDescricao.setBounds(20, 105, 133, 14);
		contentPane.add(lblDescricao);

		textDescricaoCirurgia = new JTextField();
		textDescricaoCirurgia.setColumns(10);
		textDescricaoCirurgia.setBounds(139, 105, 160, 20);
		contentPane.add(textDescricaoCirurgia);

		JLabel lblMedico = new JLabel("M\u00E9dico(a)");
		lblMedico.setForeground(Color.DARK_GRAY);
		lblMedico.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblMedico.setBounds(20, 130, 108, 14);
		contentPane.add(lblMedico);

		textNomeMedico = new JTextField();
		textNomeMedico.setColumns(10);
		textNomeMedico.setBounds(85, 129, 214, 20);
		contentPane.add(textNomeMedico);

		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setForeground(Color.DARK_GRAY);
		lblPaciente.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblPaciente.setBounds(20, 157, 108, 14);
		contentPane.add(lblPaciente);

		textPaciente = new JTextField();
		textPaciente.setColumns(10);
		textPaciente.setBounds(78, 154, 221, 20);
		contentPane.add(textPaciente);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setForeground(Color.DARK_GRAY);
		btnSalvar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

				Agenda agenda = new Agenda(textDescricaoCirurgia.getText(), textNomeMedico.getText(),
						textPaciente.getText(), textDataCirurgia.getDate());

				DataBase.agendas.add(agenda);
				

				new Agendamentos().setVisible(true);

			}
		});
		btnSalvar.setBounds(227, 213, 72, 23);
		contentPane.add(btnSalvar);

		JButton btnVoltar = new JButton("Voltar para Area de Trabalho");
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setForeground(Color.GRAY);
		btnVoltar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

				new TelaAreaDeTrabalho().setVisible(true);
			}
		});
		btnVoltar.setBounds(0, 290, 336, 23);
		contentPane.add(btnVoltar);

		JLabel lblImagem = new JLabel("Imagem fundo agenda");
		lblImagem.setIcon(new ImageIcon(AgendaCirurgica.class.getResource("/imagens/fundo agenda.png")));
		lblImagem.setBounds(0, 0, 336, 313);
		contentPane.add(lblImagem);
	}
	
	public void configurarJanela() {
		setTitle("Agenda");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(352, 352);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
