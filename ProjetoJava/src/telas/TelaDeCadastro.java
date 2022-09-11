package telas;

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

import dados.DataBase;
import dados.Medico;

public class TelaDeCadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textLogin;
	private JTextField textNome;
	private JTextField textSenha;
	private JTextField textID;
	private JTextField textEspecializacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					TelaDeCadastro frame = new TelaDeCadastro();
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


	public TelaDeCadastro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 352);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		configurarJanela();

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblLogin.setForeground(Color.DARK_GRAY);
		lblLogin.setBounds(30, 127, 44, 14);
		contentPane.add(lblLogin);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNome.setForeground(Color.DARK_GRAY);
		lblNome.setBounds(30, 102, 70, 14);
		contentPane.add(lblNome);

		textLogin = new JTextField();
		textLogin.setBounds(73, 125, 234, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);

		textNome = new JTextField();
		textNome.setBounds(73, 100, 234, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnSalvar.setForeground(Color.DARK_GRAY);
		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Medico medico = new Medico(textNome.getText(), textLogin.getText(), textID.getText(),
						textSenha.getText(), textEspecializacao.getText());
				
				

				DataBase.medicos.add(medico);

				new TelaDeLogin().setVisible(true);
			}
		});
		btnSalvar.setBounds(237, 232, 70, 23);
		contentPane.add(btnSalvar);

		JButton btnVoltar = new JButton("Voltar para p\u00E1gina de Login");
		btnVoltar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setForeground(Color.GRAY);
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaDeLogin().setVisible(true);
				dispose();
			}

		});
		btnVoltar.setBounds(-6, 290, 342, 23);
		contentPane.add(btnVoltar);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblSenha.setForeground(Color.DARK_GRAY);
		lblSenha.setBounds(30, 179, 44, 14);
		contentPane.add(lblSenha);

		JLabel lblID = new JLabel("ID");
		lblID.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblID.setForeground(Color.DARK_GRAY);
		lblID.setBounds(30, 152, 70, 14);
		contentPane.add(lblID);

		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(73, 176, 234, 20);
		contentPane.add(textSenha);

		textID = new JTextField();
		textID.setColumns(10);
		textID.setBounds(73, 151, 234, 20);
		contentPane.add(textID);

		JLabel lblEspecializao = new JLabel("Especializa\u00E7\u00E3o");
		lblEspecializao.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblEspecializao.setForeground(Color.DARK_GRAY);
		lblEspecializao.setBounds(30, 203, 94, 14);
		contentPane.add(lblEspecializao);

		textEspecializacao = new JTextField();
		textEspecializacao.setColumns(10);
		textEspecializacao.setBounds(124, 201, 183, 20);
		contentPane.add(textEspecializacao);

		JLabel lblImagem = new JLabel("Imagem de fundo area de trabalho");
		lblImagem.setIcon(new ImageIcon(TelaDeCadastro.class.getResource("/imagens/FundoCadastro.png")));
		lblImagem.setForeground(Color.DARK_GRAY);
		lblImagem.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblImagem.setBounds(-6, 0, 342, 302);
		contentPane.add(lblImagem);
	}
	
	public void configurarJanela() {
		setTitle("Cadastro");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(352, 352);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
