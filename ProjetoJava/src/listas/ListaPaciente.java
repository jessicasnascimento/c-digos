package listas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import telas.TelaAreaDeTrabalho;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ListaPaciente extends JFrame {

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
					ListaPaciente frame = new ListaPaciente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {

				}
			}
		});
	}

	String[] nomes = { "Alice Santos", "Berenice Santana", "Cintia Augusta", "Felipe Rosa", "Marcelo Matias",
			"Renato Franco", "Tiago Mendes" };

	JList<Object> lista = new JList<Object>(nomes);

	/**
	 * Create the frame.
	 */
	public ListaPaciente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 352, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		configurarJanela();
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lista.setForeground(Color.DARK_GRAY);
		lista.setFont(new Font("SansSerif", Font.BOLD, 12));
		lista.setModel(new AbstractListModel<Object>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] { "                                 Alice Santos", "",
					"                            Berenice Santana", "", "                              Cintia Augusta",
					"", "                                 Felipe Rosa", "",
					"                               Marcelo Matias", "",
					"                                Renato Franco ", "",
					"                                Tiago Mendes" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lista.setBorder(null);
		lista.setBackground(new Color(255, 228, 225));
		lista.setBounds(22, 98, 292, 143);
		getContentPane().add(lista);

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

		btnVoltar.setBounds(0, 290, 336, 23);
		contentPane.add(btnVoltar);

		JLabel lblImagem = new JLabel("Imagem fundo lista de pacientes");
		lblImagem.setIcon(new ImageIcon(ListaPaciente.class.getResource("/imagens/ListaPacientes.png")));
		lblImagem.setBounds(0, 0, 336, 313);
		contentPane.add(lblImagem);
	}

	public void configurarJanela() {
		setTitle("Lista de Pacientes");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(352, 352);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
