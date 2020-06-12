package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Operacoes;
import Controller.Ordenacao;
import Entity.Leito;

public class TelaVisualizar extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public TelaVisualizar() {
		setVisible(true);
		setTitle("Visualizar Dados");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 250, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnShellsort = new JButton("Ordenar Shellsort");
		btnShellsort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<Leito> lista = new ArrayList<Leito>();
					lista.addAll(Operacoes.getListaLeitos("entrada"));
					long tempo = Ordenacao.shellSort(lista);
					JOptionPane.showMessageDialog(null, "Arquivo SHELLSORT criado com sucesso!\n Tempo para a ordenação: "+tempo+"ms");
				} 
				catch (NumberFormatException | IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnShellsort.setBounds(53, 41, 135, 23);
		contentPane.add(btnShellsort);
		
		JButton btnBubblesort = new JButton("Ordenar Bubblesort");
		btnBubblesort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					long tempo = Ordenacao.bubblesort(Operacoes.getListaLeitos("entrada"));
					JOptionPane.showMessageDialog(null, "Arquivo BUBBLESORT criado com sucesso!\n Tempo para a ordenação: "+tempo+"ms");
				} catch (NumberFormatException | IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBubblesort.setBounds(53, 92, 135, 23);
		contentPane.add(btnBubblesort);
		

		ImageIcon img = new ImageIcon("./resources/coronavirus.png");
		setIconImage(img.getImage());
		
	}
}
