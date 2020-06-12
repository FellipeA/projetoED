package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.portable.ApplicationException;

import javax.swing.JButton;

public class TelaVisualizar extends JFrame 
{
	private JPanel contentPane;
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
		setBounds(100, 100, 255, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnShellsort = new JButton("Ordenar (Shellsort)");
		btnShellsort.setBounds(53, 96, 135, 23);
		contentPane.add(btnShellsort);
		
		JButton btnBubblesort = new JButton("Ordenar (Bubblesort)");
		btnBubblesort.setBounds(53, 152, 135, 23);
		contentPane.add(btnBubblesort);
		
		JButton btnDesordenado = new JButton("Desordenado");
		btnDesordenado.setBounds(53, 39, 135, 23);
		contentPane.add(btnDesordenado);
	}
}
