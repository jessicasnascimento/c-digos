package listas;

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
import javax.swing.border.EmptyBorder;

import dados.Medico;
import telas.TelaAreaDeTrabalho;

public class ListaMeusDados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					ListaMeusDados frame = new ListaMeusDados();
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
	public ListaMeusDados() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		configurarJanela();

		JLabel lblNome = new JLabel("Nome : ");
		lblNome.setForeground(Color.DARK_GRAY);
		lblNome.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNome.setBounds(75, 140, 46, 14);
		contentPane.add(lblNome);

		JLabel lblEspecializacao = new JLabel("Especializa\u00E7\u00E3o :");
		lblEspecializacao.setForeground(Color.DARK_GRAY);
		lblEspecializacao.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblEspecializacao.setBounds(75, 165, 103, 23);
		contentPane.add(lblEspecializacao);

		JButton btnVoltar = new JButton("Voltar para Area de Trabalho");
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setForeground(Color.GRAY);
		btnVoltar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaAreaDeTrabalho().setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(0, 290, 347, 23);
		contentPane.add(btnVoltar);

		JLabel lblNomeDados = new JLabel("");
		lblNomeDados.setForeground(Color.BLACK);
		lblNomeDados.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNomeDados.setBounds(118, 140, 186, 14);
		contentPane.add(lblNomeDados);
		lblNomeDados.setText(Medico.getNome());
		

		JLabel lblEspecializacaoDados = new JLabel("");
		lblEspecializacaoDados.setForeground(Color.BLACK);
		lblEspecializacaoDados.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblEspecializacaoDados.setBounds(175, 165, 103, 23);
		contentPane.add(lblEspecializacaoDados);
		lblEspecializacaoDados.setText(Medico.getEspecializacao());
		

		JLabel lblID = new JLabel("ID :");
		lblID.setForeground(Color.DARK_GRAY);
		lblID.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblID.setBounds(75, 193, 28, 23);
		contentPane.add(lblID);

		JLabel lblIDDados = new JLabel("");
		lblIDDados.setForeground(Color.BLACK);
		lblIDDados.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblIDDados.setBounds(103, 193, 103, 23);
		contentPane.add(lblIDDados);
		lblIDDados.setText(Medico.getId());

		JLabel lblImagem = new JLabel("Imagem fundo meus dados");
		lblImagem.setIcon(new ImageIcon(ListaMeusDados.class.getResource("/imagens/Meus Dados.png")));
		lblImagem.setBounds(0, 0, 336, 313);
		contentPane.add(lblImagem);
	}
	
	public void configurarJanela() {
		setTitle("Meus Dados");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(352, 352);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	

}
