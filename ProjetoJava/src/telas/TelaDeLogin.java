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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dados.DataBase;
import dados.Medico;

import javax.swing.JPasswordField;

public class TelaDeLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textLogin;
	private JButton btnCadastre;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					TelaDeLogin frame = new TelaDeLogin();
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
	public TelaDeLogin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		configurarJanela();

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.DARK_GRAY);
		lblLogin.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblLogin.setBounds(54, 173, 41, 14);
		contentPane.add(lblLogin);

		textLogin = new JTextField();
		textLogin.setBackground(Color.WHITE);
		textLogin.setBounds(92, 170, 192, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.DARK_GRAY);
		lblSenha.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblSenha.setBounds(54, 201, 41, 14);
		contentPane.add(lblSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(Color.WHITE);
		btnEntrar.setForeground(Color.DARK_GRAY);
		btnEntrar.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnEntrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (checkLogin(textLogin.getText(), new String(textSenha.getPassword()))) {

					JOptionPane.showMessageDialog(null, "Bem vindo(a) ao sistema do Hospital!");
					new TelaAreaDeTrabalho().setVisible(true);
						dispose();
				}

				else {
					JOptionPane.showMessageDialog(null, "Dados inválidos!");
				}
				

			}
		});
		btnEntrar.setBounds(148, 229, 69, 23);
		contentPane.add(btnEntrar);

		JButton btnCadastre = new JButton("N\u00E3o tem uma conta? Cadastre-se");
		btnCadastre.setBackground(Color.WHITE);
		btnCadastre.setForeground(Color.GRAY);
		btnCadastre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaDeCadastro().setVisible(true);
				dispose();
			}
		});
		btnCadastre.setBounds(0, 290, 336, 23);
		contentPane.add(btnCadastre);

		textSenha = new JPasswordField();
		textSenha.setBounds(102, 201, 182, 20);
		contentPane.add(textSenha);

		JLabel lblImagem = new JLabel("Imagem de fundo login");
		lblImagem.setIcon(new ImageIcon(TelaDeLogin.class.getResource("/imagens/Fundologin.png")));
		lblImagem.setBounds(0, 0, 336, 313);
		contentPane.add(lblImagem);
	}
	
	public void configurarJanela() {
		setTitle("Login");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(352, 352);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public boolean checkLogin(String login, String senha) {

		if (login.equals("adm") && senha.equals("123")) {
			return true;
		}

		for (Medico medico : DataBase.medicos) {

			if (medico.getLogin().equals(login) && medico.getSenha().equals(senha)) {
				return true;

			}

		}

		return false;

	}

	public JButton getBtnCadastre() {
		return btnCadastre;
	}

	public void setBtnCadastre(JButton btnCadastre) {
		this.btnCadastre = btnCadastre;
	}
	
	
}
