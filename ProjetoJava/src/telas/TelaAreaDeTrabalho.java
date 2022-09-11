package telas;

import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calendario.AgendaCirurgica;
import listas.ListaEnfermeiros;
import listas.ListaMeusDados;
import listas.ListaMedicoAux;
import listas.ListaPaciente;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TelaAreaDeTrabalho extends JFrame {

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
					TelaAreaDeTrabalho frame = new TelaAreaDeTrabalho();
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
	public TelaAreaDeTrabalho() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 352);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		configurarJanela();

		JButton btnListaPacientes = new JButton("Lista de Pacientes");
		btnListaPacientes.setForeground(Color.DARK_GRAY);
		btnListaPacientes.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnListaPacientes.setBackground(Color.WHITE);
		btnListaPacientes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ListaPaciente().setVisible(true);
				dispose();
			}
		});
		btnListaPacientes.setBounds(99, 114, 140, 23);
		contentPane.add(btnListaPacientes);

		JButton btnPerfilMedico = new JButton("Perfil M\u00E9dico");
		btnPerfilMedico.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ListaMeusDados().setVisible(true);
				dispose();
			}
		});
		btnPerfilMedico.setForeground(Color.DARK_GRAY);
		btnPerfilMedico.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnPerfilMedico.setBackground(Color.WHITE);
		btnPerfilMedico.setBounds(99, 82, 140, 23);
		contentPane.add(btnPerfilMedico);

		JButton btnEnfermeiros = new JButton("Enfermeiros(as)");
		btnEnfermeiros.setForeground(Color.DARK_GRAY);
		btnEnfermeiros.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnEnfermeiros.setBackground(Color.WHITE);
		btnEnfermeiros.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ListaEnfermeiros().setVisible(true);
				dispose();
			}
		});

		btnEnfermeiros.setBounds(99, 180, 140, 23);
		contentPane.add(btnEnfermeiros);

		JButton btnAgenda = new JButton("Agenda Cir\u00FArgica");
		btnAgenda.setForeground(Color.DARK_GRAY);
		btnAgenda.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnAgenda.setBackground(Color.WHITE);
		btnAgenda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AgendaCirurgica().setVisible(true);
				dispose();
			}
		});

		btnAgenda.setBounds(99, 148, 140, 23);
		contentPane.add(btnAgenda);

		JButton btnMedicosAux = new JButton("M\u00E9dicos Aux.");
		btnMedicosAux.setForeground(Color.DARK_GRAY);
		btnMedicosAux.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnMedicosAux.setBackground(Color.WHITE);
		btnMedicosAux.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ListaMedicoAux().setVisible(true);
				dispose();
			}
		});

		btnMedicosAux.setBounds(99, 214, 140, 23);
		contentPane.add(btnMedicosAux);

		JButton btnTelaCadastro = new JButton("Ir para Tela de Cadastro");
		btnTelaCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaDeCadastro().setVisible(true);
				dispose();

			}
		});
		btnTelaCadastro.setBackground(Color.WHITE);
		btnTelaCadastro.setForeground(Color.GRAY);
		btnTelaCadastro.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnTelaCadastro.setBounds(0, 290, 336, 23);
		contentPane.add(btnTelaCadastro);

		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(Color.WHITE);
		btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaDeLogin().setVisible(true);
				dispose();
			}
		});
		btnSair.setForeground(Color.DARK_GRAY);
		btnSair.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnSair.setBounds(137, 248, 67, 23);
		contentPane.add(btnSair);

		JLabel lblImagem = new JLabel("Imagem de fundo cadastro");
		lblImagem.setIcon(new ImageIcon(TelaAreaDeTrabalho.class.getResource("/imagens/Area de trabalho.png")));
		lblImagem.setBounds(0, 0, 336, 302);
		contentPane.add(lblImagem);
	}
	
	public void configurarJanela() {
		setTitle("Area de Trabalho");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(352, 352);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
