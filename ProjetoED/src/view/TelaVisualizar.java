package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Operacoes;
import Controller.Ordenacao;

public class TelaVisualizar extends JFrame 
{
	private JPanel contentPane;
	private Operacoes op;
	A
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					TelaVisualizar frame = new TelaVisualizar();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

public TelaVisualizar() 
{
		setTitle("Visualizar Dados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnShellsort = new JButton("Ordenar (Shellsort)");
		btnShellsort.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnShellsort.setBounds(53, 41, 135, 23);
		contentPane.add(btnShellsort);
		
		JButton btnBubblesort = new JButton("Ordenar (Bubblesort)");
		btnShellsort.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnBubblesort.setBounds(53, 92, 135, 23);
		contentPane.add(btnBubblesort);
		btnShellsort.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					op.getListaLeitos("entrada");
				} 
				catch (NumberFormatException e1) 
				{
					e1.printStackTrace();
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
	}
}
