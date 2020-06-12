package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Operacoes;
import Entity.Leito;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaInserir extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtData;
	private JTextField txtDistrito;
	private JTextField txtLeitos;
	private JTextField txtPopulacao;
	private JTextField txtLeitosporPessoa;
	private JTextField txtInternacoes7;
	private JTextField txtInternacoes7di;
	private JTextField txtInternacoes7v7;


	public TelaInserir() {
		setTitle("Inserir Leito");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Leito leito = new Leito();
				leito.setData(txtData.getText());
				leito.setInternacoes7d(Integer.parseInt(txtInternacoes7.getText()));
				leito.setInternacoes7di(Integer.parseInt(txtInternacoes7di.getText()));
				leito.setLeitospc(Double.parseDouble(txtLeitosporPessoa.getText()));
				leito.setNomedistrito(txtDistrito.getText());
				leito.setPopulacao(Integer.parseInt((txtPopulacao.getText())));
				leito.setTotalcovidleito(Integer.parseInt(txtLeitos.getText()));
				leito.setInternacoes7v7(Double.parseDouble(txtInternacoes7v7.getText()));
				
				Operacoes.Insert(leito);
				JOptionPane.showMessageDialog(null, "Leito Inserido com Sucesso!");
			}
		});
		btnInserir.setBounds(169, 201, 89, 23);
		contentPane.add(btnInserir);
		
		txtData = new JTextField();
		txtData.setBounds(46, 22, 113, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		txtDistrito = new JTextField();
		txtDistrito.setBounds(212, 22, 188, 20);
		contentPane.add(txtDistrito);
		txtDistrito.setColumns(10);
		
		txtLeitos = new JTextField();
		txtLeitos.setBounds(46, 62, 86, 20);
		contentPane.add(txtLeitos);
		txtLeitos.setColumns(10);
		
		txtPopulacao = new JTextField();
		txtPopulacao.setBounds(197, 62, 97, 20);
		contentPane.add(txtPopulacao);
		txtPopulacao.setColumns(10);
		
		txtLeitosporPessoa = new JTextField();
		txtLeitosporPessoa.setBounds(358, 62, 66, 20);
		contentPane.add(txtLeitosporPessoa);
		txtLeitosporPessoa.setColumns(10);
		
		txtInternacoes7 = new JTextField();
		txtInternacoes7.setBounds(105, 103, 89, 20);
		contentPane.add(txtInternacoes7);
		txtInternacoes7.setColumns(10);
		
		JLabel lblData = new JLabel("Distrito");
		lblData.setBounds(169, 25, 46, 14);
		contentPane.add(lblData);
		
		JLabel lblData_1 = new JLabel("Data");
		lblData_1.setBounds(10, 25, 46, 14);
		contentPane.add(lblData_1);
		
		JLabel lblData_1_1 = new JLabel("Leitos");
		lblData_1_1.setBounds(10, 65, 46, 14);
		contentPane.add(lblData_1_1);
		
		JLabel lblData_1_1_1 = new JLabel("Popula\u00E7\u00E3o");
		lblData_1_1_1.setBounds(142, 65, 59, 14);
		contentPane.add(lblData_1_1_1);
		
		JLabel lblData_1_1_1_1 = new JLabel("Leitos p/h");
		lblData_1_1_1_1.setBounds(304, 65, 59, 14);
		contentPane.add(lblData_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Novas Interna\u00E7\u00F5es");
		lblNewLabel.setBounds(10, 106, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblUltimasInternaes = new JLabel("Ultimas Interna\u00E7\u00F5es");
		lblUltimasInternaes.setBounds(208, 106, 97, 14);
		contentPane.add(lblUltimasInternaes);
		
		txtInternacoes7di = new JTextField();
		txtInternacoes7di.setBounds(315, 103, 109, 20);
		contentPane.add(txtInternacoes7di);
		txtInternacoes7di.setColumns(10);
		
		JLabel lblVariao = new JLabel("Varia\u00E7\u00E3o");
		lblVariao.setBounds(10, 147, 97, 14);
		contentPane.add(lblVariao);
		
		txtInternacoes7v7 = new JTextField();
		txtInternacoes7v7.setEditable(false);
		txtInternacoes7v7.setBounds(60, 144, 86, 20);
		contentPane.add(txtInternacoes7v7);
		txtInternacoes7v7.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			txtInternacoes7v7.setText(String.valueOf(
					Integer.parseInt(txtInternacoes7.getText()) - 
					Integer.parseInt(txtInternacoes7di.getText()) /
					Integer.parseInt(txtInternacoes7di.getText())));
			
			}
		});
		btnCalcular.setBounds(156, 143, 82, 23);
		contentPane.add(btnCalcular);
		
		ImageIcon img = new ImageIcon("./resources/coronavirus.png");
		setIconImage(img.getImage());
	}
	
	
	
	
}
