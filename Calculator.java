import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JLabel AnswerLabel;
	private JTextField textFieldNumber1;
	private JTextField textFieldNumber2;
	private JTextField textFieldAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 28));
		frame.setBounds(100, 100, 521, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton AddButton = new JButton("ADD");
		AddButton.setBackground(SystemColor.activeCaption);
		AddButton.setForeground(Color.BLACK);
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, answer;
				
				try {
					num1 = Integer.parseInt(textFieldNumber1.getText());
					num2 = Integer.parseInt(textFieldNumber2.getText());
					answer = num1 + num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid number. Please try again.");
			     }
		    }
		});
		AddButton.setFont(new Font("Bodoni MT", Font.BOLD, 20));
		AddButton.setBounds(58, 149, 156, 37);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("MINUS");
		MinusButton.setForeground(Color.BLACK);
		MinusButton.setBackground(SystemColor.activeCaption);
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, answer;
				
				try {
					num1 = Integer.parseInt(textFieldNumber1.getText());
					num2 = Integer.parseInt(textFieldNumber2.getText());
					answer = num1 - num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid number. Please try again.");
				}
			}
		});
		MinusButton.setFont(new Font("Bodoni MT", Font.BOLD, 20));
		MinusButton.setBounds(293, 149, 156, 37);
		frame.getContentPane().add(MinusButton);
		
		AnswerLabel = new JLabel("Answer");
		AnswerLabel.setFont(new Font("Perpetua", Font.BOLD, 26));
		AnswerLabel.setBounds(81, 232, 109, 72);
		frame.getContentPane().add(AnswerLabel);
		
		textFieldNumber1 = new JTextField();
		textFieldNumber1.setBounds(42, 57, 195, 43);
		frame.getContentPane().add(textFieldNumber1);
		textFieldNumber1.setColumns(10);
		
		textFieldNumber2 = new JTextField();
		textFieldNumber2.setColumns(10);
		textFieldNumber2.setBounds(267, 57, 195, 43);
		frame.getContentPane().add(textFieldNumber2);
		
	
		textFieldAnswer = new JTextField();
		textFieldAnswer.setColumns(10);
		textFieldAnswer.setBounds(200, 246, 195, 43);
		frame.getContentPane().add(textFieldAnswer);
	}
}

