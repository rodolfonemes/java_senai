package br.senai.sp.informatica.objeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;

public class TelaCliente extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tbNome;
	private JTextField tbEmail;
	private JTextField tbIdade;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btSalvar;
	private JButton btListar;
	private JButton btSair;
	private JPanel panel;
	private List<Cliente> cadastro = new ArrayList<>();
	Cliente cli = new Cliente();
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	public TelaCliente() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tbNome = new JTextField();
		tbNome.setFont(new Font("Arial Black", Font.PLAIN, 17));
		tbNome.setColumns(10);
		
		tbEmail = new JTextField();
		tbEmail.setFont(new Font("Arial Black", Font.PLAIN, 17));
		tbEmail.setColumns(10);
		
		tbIdade = new JTextField();
		tbIdade.setFont(new Font("Arial Black", Font.PLAIN, 17));
		tbIdade.setColumns(10);
		
		lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 17));
		
		lblNewLabel_1 = new JLabel("E-MAIL:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 17));
		
		lblNewLabel_2 = new JLabel("IDADE:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 17));
		
		panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(67)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tbIdade, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
						.addComponent(tbEmail, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
						.addComponent(tbNome, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(222, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(126))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(tbNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1)
						.addComponent(tbEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		
		btSalvar = new JButton("SALVAR");
		btSalvar.addActionListener(this);
		panel.add(btSalvar);
		btSalvar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btListar = new JButton("LISTAR");
		btListar.addActionListener(this);
		panel.add(btListar);
		
		btSair = new JButton("SAIR");
		btSair.addActionListener(this);
		panel.add(btSair);
		contentPane.setLayout(gl_contentPane);
	}
	public void actionPerformed(ActionEvent ev) {
		Object botao = ev.getSource();
		
		if(botao.equals(btSalvar)) {
			
			cli.setNome(tbNome.getText());
			cli.setEmail(tbEmail.getText());
			cli.setIdade(Integer.parseInt(tbIdade.getText()));
			
			cadastro.add(cli);
			
			tbNome.setText("");
			tbEmail.setText("");
			tbIdade.setText("");
			
			tbNome.requestFocus();
			
			JOptionPane.showMessageDialog(null, "Dados Salvos");	
			
		}else if (botao.equals(btListar)){
			//JOptionPane.showMessageDialog(null, "nome : " + cli.getNome() + "\n" + "E-mail: " + cli.getEmail() + "\n" + "Idade: " + cli.getIdade());	
			JOptionPane.showMessageDialog(this, "Cadastro de Cliente\n\n" + 
			cadastro.stream()
			.map(Cliente::toString)
			.collect(Collectors.joining("\n")));
			
		}else {
			System.exit(0);
			
		}
		

		
	}
}
