package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.DropMode;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator {

	private JFrame frmCalcuator;
	private JTextField textField;
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;
	String back=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalcuator.setVisible(true);
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
		frmCalcuator = new JFrame();
		frmCalcuator.addWindowListener(new WindowAdapter() {
			
		});
		frmCalcuator.addComponentListener(new ComponentAdapter() {
		
			
		});
		frmCalcuator.setAlwaysOnTop(true);
		frmCalcuator.setForeground(Color.WHITE);
		frmCalcuator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalcuator.setFont(new Font("Dialog", Font.BOLD, 12));
		frmCalcuator.setTitle("Calcuator");
		frmCalcuator.setBackground(Color.WHITE);
		frmCalcuator.getContentPane().setBackground(Color.DARK_GRAY);
		frmCalcuator.setBounds(100, 100, 296, 496);
		frmCalcuator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBounds(10, 11, 260, 70);
		frmCalcuator.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		// ---------ROW  1--------------------------
	
		JButton b7 = new JButton("7");
	
	b7.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	String EnterNo= textField.getText() + b7.getText();
	textField.setText(EnterNo);	
	}
		});
		b7.setBackground(Color.GRAY);
		b7.setFont(new Font("Tahoma", Font.BOLD, 20));
		b7.setBounds(10, 176, 60, 60);
		frmCalcuator.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNo= textField.getText() + b8.getText();
				textField.setText(EnterNo);
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 20));
		b8.setBackground(Color.GRAY);
		b8.setBounds(78, 176, 60, 60);
		frmCalcuator.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNo= textField.getText() + b9.getText();
				textField.setText(EnterNo);
			}
		});
		b9.setBackground(Color.GRAY);
		b9.setFont(new Font("Tahoma", Font.BOLD, 20));
		b9.setBounds(144, 176, 60, 60);
		frmCalcuator.getContentPane().add(b9);
		
		JButton bplus = new JButton("+");
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		bplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		bplus.setBackground(Color.GRAY);
		bplus.setBounds(210, 105, 60, 60);
		frmCalcuator.getContentPane().add(bplus);
		
	//-----------row 2-------------------------	
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNo= textField.getText() + b4.getText();
				textField.setText(EnterNo);
			}
		});
		b4.setBackground(Color.GRAY);
		b4.setFont(new Font("Tahoma", Font.BOLD, 20));
		b4.setBounds(10,247, 60, 60);
		frmCalcuator.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNo= textField.getText() + b5.getText();
				textField.setText(EnterNo);
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 20));
		b5.setBackground(Color.GRAY);
		b5.setBounds(78, 247, 60, 60);
		frmCalcuator.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNo= textField.getText() + b6.getText();
				textField.setText(EnterNo);
			}
		});
		b6.setBackground(Color.GRAY);
		b6.setFont(new Font("Tahoma", Font.BOLD, 20));
		b6.setBounds(144,247, 60, 60);
		frmCalcuator.getContentPane().add(b6);
		
		JButton bsub = new JButton("-");
		bsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		bsub.setFont(new Font("Tahoma", Font.BOLD, 20));
		bsub.setBackground(Color.GRAY);
		bsub.setBounds(210,176, 60, 60);
		frmCalcuator.getContentPane().add(bsub);
		
		//-----------row 3-------------------------	
		
				JButton b1 = new JButton("1");
				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNo= textField.getText() + b1.getText();
						textField.setText(EnterNo);
					}
				});
				b1.setBackground(Color.GRAY);
				b1.setFont(new Font("Tahoma", Font.BOLD, 20));
				b1.setBounds(10,318, 60, 60);
				frmCalcuator.getContentPane().add(b1);
				
				JButton b2 = new JButton("2");
				b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNo= textField.getText() + b2.getText();
						textField.setText(EnterNo);
					}
				});
				b2.setFont(new Font("Tahoma", Font.BOLD, 20));
				b2.setBackground(Color.GRAY);
				b2.setBounds(78, 318, 60, 60);
				frmCalcuator.getContentPane().add(b2);
				
				JButton b3 = new JButton("3");
				b3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNo= textField.getText() + b3.getText();
						textField.setText(EnterNo);
					}
				});
				b3.setBackground(Color.GRAY);
				b3.setFont(new Font("Tahoma", Font.BOLD, 20));
				b3.setBounds(144,318, 60, 60);
				frmCalcuator.getContentPane().add(b3);
				
				JButton bmulti = new JButton("*");
				bmulti.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum=Double.parseDouble(textField.getText());
						textField.setText("");
						operation="*";
					}
				});
				bmulti.setFont(new Font("Tahoma", Font.BOLD, 20));
				bmulti.setBackground(Color.GRAY);
				bmulti.setBounds(210,247, 60, 60);
				frmCalcuator.getContentPane().add(bmulti);
				
				//-----------row 4-------------------------	
				
				JButton bpoint = new JButton(".");
				bpoint.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNo= textField.getText() + bpoint.getText();
						textField.setText(EnterNo);
					}
				});
				bpoint.setBackground(Color.GRAY);
				bpoint.setFont(new Font("Tahoma", Font.BOLD, 20));
				bpoint.setBounds(10,385, 60, 60);
				frmCalcuator.getContentPane().add(bpoint);
				
				JButton bzero = new JButton("0");
				bzero.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNo= textField.getText() + bzero.getText();
						textField.setText(EnterNo);
					}
				});
				bzero.setFont(new Font("Tahoma", Font.BOLD, 20));
				bzero.setBackground(Color.GRAY);
				bzero.setBounds(78, 385, 60, 60);
				frmCalcuator.getContentPane().add(bzero);
				
				JButton bequal = new JButton("=");
				bequal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String answer;
						secondnum=Double.parseDouble(textField.getText());
						if(operation == "+")
						{
							result=firstnum+secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
							
						}
						else if(operation == "-")
						{
							result=firstnum- secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
							
						}
						else if(operation == "*")
						{
							result=firstnum*secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
							
						}
						else if(operation == "/")
						{
							result=firstnum/secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
							
						}
						else if(operation == "%")
						{
							result=firstnum%secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
							
						}
					}
				});
				bequal.setBackground(Color.GRAY);
				bequal.setFont(new Font("Tahoma", Font.BOLD, 20));
				bequal.setBounds(210,318, 60, 126);
				frmCalcuator.getContentPane().add(bequal);
				
				JButton bdiv = new JButton("/");
				bdiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum=Double.parseDouble(textField.getText());
						textField.setText("");
						operation="/";
					}
				});
				bdiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				bdiv.setBackground(Color.GRAY);
				bdiv.setBounds(144,385, 60, 60);
				frmCalcuator.getContentPane().add(bdiv);
				
				JButton bback = new JButton("<-");
				bback.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String backspace=null;
						if(textField.getText().length()>0) {
							StringBuilder strB=new StringBuilder(textField.getText());
							strB.deleteCharAt(textField.getText().length() -1);
							back=strB.toString();
							textField.setText(back);
						}
					}
				});
				bback.setFont(new Font("Tahoma", Font.BOLD, 20));
				bback.setBackground(Color.GRAY);
				bback.setBounds(10, 105, 60, 60);
				frmCalcuator.getContentPane().add(bback);
				
				JButton bC = new JButton("C");
				bC.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						textField.setText(null);
					}
				});
				bC.setFont(new Font("Tahoma", Font.BOLD, 20));
				bC.setBackground(Color.GRAY);
				bC.setBounds(78, 105, 60, 60);
				frmCalcuator.getContentPane().add(bC);
				
				JButton bmod = new JButton("%");
				bmod.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum=Double.parseDouble(textField.getText());
						textField.setText("");
						operation="%";
					}
				});
				bmod.setToolTipText("");
				bmod.setFont(new Font("Tahoma", Font.BOLD, 20));
				bmod.setBackground(Color.GRAY);
				bmod.setBounds(144, 105, 60, 60);
				frmCalcuator.getContentPane().add(bmod);
				
	}
}
