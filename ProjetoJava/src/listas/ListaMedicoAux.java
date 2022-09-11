package listas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import telas.TelaAreaDeTrabalho;

public class ListaMedicoAux extends JFrame {

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
					ListaMedicoAux frame = new ListaMedicoAux();
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

	String[] nomes = { "Alessandra Sousa", "Alex Silva", "Ludmila Fonseca", "Matheus Nascimento", "Maria Martins",
			"Katia Teixeira", "Rogério Andrade" };

	JList<Object> lista = new JList<Object>(nomes);

	public ListaMedicoAux() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		configurarJanela();
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lista.setForeground(Color.DARK_GRAY);
		lista.setFont(new Font("SansSerif", Font.BOLD, 12));
		lista.setModel(new AbstractListModel<Object>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"                               Alessandra Sousa", "", "                                      Alex Silva", "", "                                Ludmila Fonseca ", "", "                             Matheus Nascimento", "", "                                   Maria Martins", "", "                                   Katia Teixeira ", "", "                                 Rog\u00E9rio Andrade"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lista.setBorder(null);
		lista.setBackground(new Color(255, 228, 225));
		lista.setBounds(22, 98, 291, 143);
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

		btnVoltar.setBounds(0, 290, 348, 23);
		contentPane.add(btnVoltar);

		JLabel lblImagem = new JLabel("Imagem de fundo lista m\u00E9dicos aux");
		lblImagem.setIcon(new ImageIcon(ListaMedicoAux.class.getResource("/imagens/Lista M\u00E9dico Aux.png")));
		lblImagem.setBounds(0, 0, 336, 313);
		contentPane.add(lblImagem);

	}

	public void configurarJanela() {
		setTitle("Lista de Médicos Aux");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(352, 352);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
