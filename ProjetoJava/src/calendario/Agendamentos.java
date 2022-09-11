package calendario;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import dados.Agenda;

public class Agendamentos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textHorario;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					Agendamentos frame = new Agendamentos();
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
	public Agendamentos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		configurarJanela();

		JButton btnVoltar = new JButton("Voltar para Agenda Cirurgica");
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setForeground(Color.GRAY);
		btnVoltar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AgendaCirurgica().setVisible(true);
			}
		});

		btnVoltar.setBounds(0, 290, 336, 23);
		contentPane.add(btnVoltar);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		textHorario = new JTextField(dtf.format(LocalDateTime.now()));
		textHorario.setEditable(false);
		textHorario.setHorizontalAlignment(SwingConstants.CENTER);
		textHorario.setBorder(null);
		textHorario.setBackground(new Color(250, 240, 230));
		textHorario.setForeground(Color.DARK_GRAY);
		textHorario.setFont(new Font("SansSerif", Font.BOLD, 12));
		textHorario.setBounds(180, 148, 131, 23);
		contentPane.add(textHorario);
		textHorario.setColumns(10);
				
				JLabel lblhorario = new JLabel("Horario de Bras\u00EDlia :");
				lblhorario.setForeground(Color.DARK_GRAY);
				lblhorario.setFont(new Font("SansSerif", Font.BOLD, 13));
				lblhorario.setBounds(38, 150, 132, 18);
				contentPane.add(lblhorario);
				
				JLabel lblNPaciente = new JLabel("Paciente ");
				lblNPaciente.setForeground(Color.DARK_GRAY);
				lblNPaciente.setFont(new Font("SansSerif", Font.BOLD, 12));
				lblNPaciente.setBounds(38, 202, 56, 14);
				contentPane.add(lblNPaciente);
				
				JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o Cirurgia ");
				lblDescricao.setForeground(Color.DARK_GRAY);
				lblDescricao.setFont(new Font("SansSerif", Font.BOLD, 12));
				lblDescricao.setBounds(38, 241, 114, 14);
				contentPane.add(lblDescricao);
				
				JLabel lblDescricaoDados = new JLabel("");
				lblDescricaoDados.setFont(new Font("SansSerif", Font.PLAIN, 12));
				lblDescricaoDados.setForeground(Color.DARK_GRAY);
				lblDescricaoDados.setBounds(156, 241, 114, 14);
				contentPane.add(lblDescricaoDados);
				lblDescricaoDados.setText(Agenda.getDescricaoCirurgia());
				
	
				
				JLabel lblPacienteDados = new JLabel("");
				lblPacienteDados.setForeground(Color.DARK_GRAY);
				lblPacienteDados.setFont(new Font("SansSerif", Font.PLAIN, 12));
				lblPacienteDados.setBounds(98, 202, 114, 14);
				contentPane.add(lblPacienteDados);
				lblPacienteDados.setText(Agenda.getPacienteString());
				
				
				JLabel lblImagem = new JLabel("Imagem");
				lblImagem.setIcon(new ImageIcon(Agendamentos.class.getResource("/imagens/MensagemFinal5.png")));
				lblImagem.setBounds(0, 4, 336, 313);
				contentPane.add(lblImagem);
										
				
	}
	
	public void configurarJanela() {
		setTitle("Agendamentos");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(352, 352);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
