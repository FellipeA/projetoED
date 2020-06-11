package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Tela {

	private JFrame frmCoview;

	public Tela() {
		initialize();
	}

	private void initialize() {
		frmCoview = new JFrame();
		frmCoview.setTitle("Co-View-19");
		frmCoview.setBounds(100, 100, 280, 350);
		frmCoview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCoview.getContentPane().setLayout(null);
		
		JButton btnCriarNovoArquivo = new JButton("Criar Novo Arquivo");
		btnCriarNovoArquivo.setBounds(52, 67, 150, 23);
		frmCoview.getContentPane().add(btnCriarNovoArquivo);
		
		JButton btnLerArquivo = new JButton("Ler Arquivo");
		btnLerArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLerArquivo.setBounds(52, 112, 150, 23);
		frmCoview.getContentPane().add(btnLerArquivo);
		
		JButton btnAtualizaArquivo = new JButton("Atualizar Arquivo");
		btnAtualizaArquivo.setBounds(52, 159, 150, 23);
		frmCoview.getContentPane().add(btnAtualizaArquivo);
		
		JButton btnDeletaDado = new JButton("Deletar Dado");
		btnDeletaDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeletaDado.setBounds(52, 206, 150, 23);
		frmCoview.getContentPane().add(btnDeletaDado);
		
		JButton btnPesquisaDado = new JButton("Pesquisar Dado");
		btnPesquisaDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisaDado.setBounds(52, 252, 150, 23);
		frmCoview.getContentPane().add(btnPesquisaDado);
		
		ImageIcon img = new ImageIcon("./resources/coronavirus.png");
		frmCoview.setIconImage(img.getImage());
		
		JLabel lblNewLabel = new JLabel("Co-View-19");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setBounds(52, 11, 143, 36);
		frmCoview.getContentPane().add(lblNewLabel);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frmCoview.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}