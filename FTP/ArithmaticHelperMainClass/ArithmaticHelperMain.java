package AH;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.FlowLayout;

import java.util.*;


public class ArithmaticHelperMain extends JFrame {
	private JFrame addframe = new JFrame("Addition Helper");
	private JFrame subframe = new JFrame("Subtraction Helper");

	private JFrame multiplyframe = new JFrame("Multiplication Helper");

	private JFrame divideframe = new JFrame("Division Helper");
	
	
	




	private JPanel contentPane;
	private JTextField textField_Digits;
	private JTextField textfield_Name;
	private JTextField textfied_Number;
	private static int num1;
	private static int num2;
	private static double num3[] = new double[100] ;
	private static double num4[] = new double[100] ;
	private static double result[] = new double[100] ;
	private static double answer[] = new double[100] ;
	private static double count = 0;
	private static double count2 = 0;
	private static double score= 0;
	private static String name;
	private static String operation = "";
	private int i =0;
	private long start[] = new long[100];
	private long end[] = new long[100];
	private long time[] = new long[100];
	private JComboBox comboBox;
	User user = new User(num1,num2,name,operation);
	private String randum[] = {"Addition","Subtraction", "Multiplication", "Division"};
	Random rand = new Random();
	Random digit = new Random();
	Rank player;
	ArrayList<Rank> r = new ArrayList<Rank>();
	
	
	
	
	
	private JPanel HelperWindow;
	private JPanel CheckWindow;
	private JLabel lblHelperl;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnBegin;
	private JPanel SolvingWindow;
	private JLabel lblHelper;
	private JLabel lblProblemOf;
	private JLabel lblFirstNumber;
	private JLabel lblOperation;
	private JLabel lblSecondNumber;
	private JLabel lblEnterResult;
	private JTextField textField_3;
	private JLabel lblPressNextTo;
	private JButton btnNext;
	private JPanel ResultWindow;
	private JLabel lblPlayerName;
	private JLabel lblNumberOfProblems;
	private JLabel lblTimeTaken;
	private JLabel lblNumberOfCorrect;
	private JLabel lblAverageTimeTaken;
	private JLabel lblPercentage;
	private JLabel lblScoreArchived;
	private JLabel lblYourPlayingRecord;
	private JPanel PerformanceWindow;
	private JLabel lblNewLabel_5;
	private JLabel lblNumber;
	private JLabel lblAnswer;
	private JLabel lblRealAnswer;
	private JLabel LabelArr1[] = new JLabel[100];
	private JLabel LabelArr2[] = new JLabel[100];
	private JLabel LabelArr3[] = new JLabel[100];
	private JLabel LabelArr4[] = new JLabel[100];
	private JLabel LabelArr5[] = new JLabel[100];
	private JLabel LabelArr6[] = new JLabel[100];
	private JLabel lblPleaseChooseUp;
	private JLabel lblPleaseChooseUp_1;
	private JButton button;
	private JButton btnRanking;
	private JPanel RankingWindow;
	private JLabel lblRanking;
	private JButton btnMainWindow;
	private JLabel lblName;
	private JLabel lblScore;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArithmaticHelperMain frame= new ArithmaticHelperMain();
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
	public ArithmaticHelperMain() {
		
		
		
		
		
		
		setTitle("Arithmatic Helper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		SolvingWindow = new JPanel();
		SolvingWindow.setBounds(0, 0, 902, 639);
		contentPane.add(SolvingWindow);
		SolvingWindow.setLayout(null);
		SolvingWindow.setVisible(false);
		
		lblHelper = new JLabel("Helper");
		lblHelper.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblHelper.setBounds(310, 26, 203, 97);
		SolvingWindow.add(lblHelper);
		
		lblProblemOf = new JLabel("Problem    of  ");
		lblProblemOf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProblemOf.setBounds(125, 159, 239, 41);
		SolvingWindow.add(lblProblemOf);
		
		lblFirstNumber = new JLabel("First Number: ");
		lblFirstNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirstNumber.setBounds(125, 242, 239, 41);
		SolvingWindow.add(lblFirstNumber);
		
		lblOperation = new JLabel("Operation: ");
		lblOperation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOperation.setBounds(125, 327, 239, 41);
		SolvingWindow.add(lblOperation);
		
		lblSecondNumber = new JLabel("Second Number: ");
		lblSecondNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSecondNumber.setBounds(125, 407, 239, 41);
		SolvingWindow.add(lblSecondNumber);
		
		lblEnterResult = new JLabel("Enter Result: ");
		lblEnterResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterResult.setBounds(177, 458, 239, 41);
		SolvingWindow.add(lblEnterResult);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(369, 470, 140, 26);
		SolvingWindow.add(textField_3);
		textField_3.setColumns(10);
		
		lblPressNextTo = new JLabel("Press Next To See The Next Problem: ");
		lblPressNextTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPressNextTo.setBounds(177, 524, 360, 41);
		SolvingWindow.add(lblPressNextTo);
		
		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNext.setBounds(601, 538, 125, 48);
		SolvingWindow.add(btnNext);
		
		RankingWindow = new JPanel();
		RankingWindow.setBounds(0, 0, 902, 639);
		contentPane.add(RankingWindow);
		RankingWindow.setLayout(null);
		
		lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblRanking.setBounds(366, 45, 171, 76);
		RankingWindow.add(lblRanking);
		
		btnMainWindow = new JButton("Main Window");
		btnMainWindow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMainWindow.setBounds(703, 89, 171, 64);
		RankingWindow.add(btnMainWindow);
		btnMainWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield_Name.setText("");
				textfied_Number.setText("");
				textField_Digits.setText("");
				for(i=0;i<user.getNum2();i++)
				{
					
					LabelArr5[i].setText("");
					LabelArr6[i].setText("");
				}
				RankingWindow.setVisible(false);
				HelperWindow.setVisible(true);
				
				
			}
			});
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(161, 130, 163, 37);
		RankingWindow.add(lblName);
		
		lblScore = new JLabel("Score");
		lblScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblScore.setBounds(398, 131, 163, 37);
		RankingWindow.add(lblScore);
		RankingWindow.setVisible(false);
		
		PerformanceWindow = new JPanel();
		PerformanceWindow.setBounds(0, 0, 892, 619);
		contentPane.add(PerformanceWindow);
		PerformanceWindow.setLayout(null);
		PerformanceWindow.setVisible(false);
		
		lblYourPlayingRecord = new JLabel("Your Playing Record Below");
		lblYourPlayingRecord.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblYourPlayingRecord.setBounds(249, 23, 567, 68);
		PerformanceWindow.add(lblYourPlayingRecord);
		
		lblNewLabel_5 = new JLabel("Number1");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(70, 133, 147, 42);
		PerformanceWindow.add(lblNewLabel_5);
		
		lblNumber = new JLabel("Number2");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumber.setBounds(243, 133, 147, 42);
		PerformanceWindow.add(lblNumber);
		
		lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAnswer.setBounds(416, 133, 147, 42);
		PerformanceWindow.add(lblAnswer);
		
		lblRealAnswer = new JLabel("Real Answer");
		lblRealAnswer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRealAnswer.setBounds(589, 133, 147, 42);
		PerformanceWindow.add(lblRealAnswer);
		
		btnRanking = new JButton("Ranking");
		btnRanking.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRanking.setBounds(757, 176, 125, 68);
		PerformanceWindow.add(btnRanking);
		btnRanking.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				PerformanceWindow.setVisible(false);
				RankingWindow.setVisible(true);
				
				for(i=0;i<user.getNum1();i++)
				{
				
				LabelArr1[i].setText("");
				LabelArr2[i].setText("");
				LabelArr3[i].setText("");
				LabelArr4[i].setText("");
				}
				r.add(new Rank(user.getName(),score));
				Collections.sort(r,new Comparator<Rank>()
						{
							public int compare(Rank s1,Rank s2)
							{
								return Double.valueOf(s2.score).compareTo(s1.score);
							}
						});
				
				
				int y =213;
				
				try
				{
				
				ObjectInputStream txt = new ObjectInputStream(new FileInputStream("ranking.txt"));
				r=(ArrayList<Rank>)txt.readObject();

				}
				catch(FileNotFoundException exp)
				{
					 
					 JOptionPane.showMessageDialog(null,"File not Found");
				} catch (IOException e1) {
					
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {

					e1.printStackTrace();
				}
				 for(i=0;i<r.size();i++){ 
					 
						
					 
					 LabelArr5[i] = new JLabel(r.get(i).name  );
					 LabelArr5[i].setFont(new Font("Tahoma", Font.PLAIN, 20));
					 LabelArr5[i].setLayout(null);
					 LabelArr5[i].setBounds(161, y, 100, 42);
					 RankingWindow.add(LabelArr5[i]);
					 
					 
					 LabelArr6[i] = new JLabel(r.get(i).score+"" );
					 LabelArr6[i].setFont(new Font("Tahoma", Font.PLAIN, 20));
					 LabelArr6[i].setLayout(null);
					 LabelArr6[i].setBounds(398, y, 100, 42);
					 RankingWindow.add(LabelArr6[i]);
					 
					 y=y+80;
				 }
				 
				try {
					
					ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("ranking.txt"));
					file.writeObject(r);
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				

			}
		});
		
		
		button = new JButton("Finish");
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CloseJframe();
			}
		});
		button.setBounds(757, 295, 125, 68);
		PerformanceWindow.add(button);
	
		
		HelperWindow = new JPanel();
		HelperWindow.setBounds(0, 10, 902, 629);
		contentPane.add(HelperWindow);
		HelperWindow.setLayout(null);
		
		JLabel lblWelcomeToArithmatic = new JLabel("Welcome to Arithmatic Helper");
		lblWelcomeToArithmatic.setBounds(138, 51, 526, 49);
		HelperWindow.add(lblWelcomeToArithmatic);
		lblWelcomeToArithmatic.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		
		JLabel lblNewLabel = new JLabel("Enter Name:");
		lblNewLabel.setBounds(159, 163, 111, 25);
		HelperWindow.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textfield_Name = new JTextField();
		textfield_Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textfield_Name.setBounds(422, 163, 197, 25);
		HelperWindow.add(textfield_Name);
		textfield_Name.setColumns(10);
		
		
		JLabel lblEnterNumberOf = new JLabel("Enter Number of Problems:");
		lblEnterNumberOf.setBounds(159, 228, 242, 25);
		HelperWindow.add(lblEnterNumberOf);
		lblEnterNumberOf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textfied_Number = new JTextField();
		textfied_Number.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textfied_Number.setBounds(421, 228, 96, 26);
		HelperWindow.add(textfied_Number);
		textfied_Number.setColumns(10);
		
		JLabel lblEnterNumberOf_1 = new JLabel("Enter Number of Digits");
		lblEnterNumberOf_1.setBounds(159, 308, 203, 25);
		HelperWindow.add(lblEnterNumberOf_1);
		lblEnterNumberOf_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		textField_Digits = new JTextField();
		textField_Digits.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_Digits.setBounds(421, 309, 96, 25);
		HelperWindow.add(textField_Digits);
		textField_Digits.setColumns(10);
		
		JLabel lblChooseOperaton = new JLabel("Choose Operation");
		//comboBox.getSelectedItem().equals("+")
		lblChooseOperaton.setBounds(56, 446, 158, 25);
		HelperWindow.add(lblChooseOperaton);
		lblChooseOperaton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(328, 443, 165, 31);
		HelperWindow.add(comboBox);
		comboBox.addItem("Addition");
		comboBox.addItem("Subtraction");
		comboBox.addItem("Multiplication");
		comboBox.addItem("Division");
		comboBox.addItem("Random");
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(237, 533, 126, 41);
		HelperWindow.add(btnClose);
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CloseJframe();
			}
		});
		
		JButton btnNext_1 = new JButton("Next");
		
		
		btnNext_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNext_1.setBounds(450, 533, 126, 41);
		HelperWindow.add(btnNext_1);
		
		lblPleaseChooseUp = new JLabel("Please choose up to 5");
		lblPleaseChooseUp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPleaseChooseUp.setBounds(546, 234, 201, 16);
		HelperWindow.add(lblPleaseChooseUp);
		
		lblPleaseChooseUp_1 = new JLabel("Please choose up to 4");
		lblPleaseChooseUp_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPleaseChooseUp_1.setBounds(546, 308, 201, 16);
		HelperWindow.add(lblPleaseChooseUp_1);
		btnNext_1.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e) {
			
		try {
				
			
			
				
				name= textfield_Name.getText();
				user.setName(name);
				
				lblNewLabel_1.setText("Your Name: " + user.getName());
				
				
					
				num1= Integer.parseInt(textfied_Number.getText());
				
				user.setNum1(num1);
				lblNewLabel_2.setText("Number of Problems: " + user.getNum1());
				
				
				
				num2= Integer.parseInt(textField_Digits.getText());
				
				user.setNum2(num2);
				lblNewLabel_3.setText("Number of Digits: " + user.getNum2());
				
				
				
				
				if(comboBox.getSelectedItem().equals("Addition"))
				{
					operation = "Addition";
					user.setOperation(operation);
					lblHelperl.setText(user.getOp() + " Helper");
				}
				else if(comboBox.getSelectedItem().equals("Subtraction"))
				{
					operation = "Subtraction";
					user.setOperation(operation);
					lblHelperl.setText(user.getOp() + " Helper");
				}
				else if(comboBox.getSelectedItem().equals("Multiplication"))
				{
					operation = "Multiplication";
					user.setOperation(operation);
					lblHelperl.setText(user.getOp() + " Helper");
				}
				else if(comboBox.getSelectedItem().equals("Division"))
				{
					operation = "Division";
					user.setOperation(operation);
					lblHelperl.setText(user.getOp() + " Helper");
				}
				else 
				{
					operation = "Random";
					user.setOperation(operation);
					lblHelperl.setText(user.getOp() + " Helper");
				}
						
		}
		catch(Exception e1)
		{
			JOptionPane.showMessageDialog(null, "Textfields incomplete");
		}
		
		
		if(textfield_Name.getText().equals("")||textfied_Number.getText().equals("")||textField_Digits.getText().equals(""))
		{
		
		}
		
		else if(user.getNum1()>5||user.getNum2()>4)
		{
			JOptionPane.showMessageDialog(null, "Textfields invalid");
		}
		else
		{
				HelperWindow.setVisible(false);
				CheckWindow.setVisible(true);
		}
				
				
	}
		});
		
		ResultWindow = new JPanel();
		ResultWindow.setBounds(0, 0, 902, 639);
		contentPane.add(ResultWindow);
		ResultWindow.setLayout(null);
		ResultWindow.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("Arithmatic Helper Results");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(349, 26, 264, 82);
		ResultWindow.add(lblNewLabel_4);
		
		lblPlayerName= new JLabel("Player Name:");
		lblPlayerName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayerName.setBounds(97, 135, 646, 39);
		ResultWindow.add(lblPlayerName);
		
		lblNumberOfProblems= new JLabel("Number of Problems: "); 
		lblNumberOfProblems.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNumberOfProblems.setBounds(97, 204, 224, 39);
		ResultWindow.add(lblNumberOfProblems);
		
		lblTimeTaken = new JLabel("Time Taken: ");
		lblTimeTaken.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTimeTaken.setBounds(97, 345, 598, 39);
		ResultWindow.add(lblTimeTaken);
		
		lblNumberOfCorrect = new JLabel("Number of Correct Answers:"); 
		lblNumberOfCorrect.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNumberOfCorrect.setBounds(97, 268, 291, 39);
		ResultWindow.add(lblNumberOfCorrect);
		
		lblAverageTimeTaken = new JLabel("Average time taken for each problem: ");
		lblAverageTimeTaken.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAverageTimeTaken.setBounds(97, 414, 516, 39);
		ResultWindow.add(lblAverageTimeTaken);
		
		lblPercentage = new JLabel("Percentage: %");
		lblPercentage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPercentage.setBounds(97, 476, 264, 39);
		ResultWindow.add(lblPercentage);
		
		lblScoreArchived = new JLabel("Score Archived:");
		lblScoreArchived.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblScoreArchived.setBounds(97, 539, 195, 39);
		ResultWindow.add(lblScoreArchived);
		
		JButton btnHistory = new JButton("History");
		btnHistory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ResultWindow.setVisible(false);
				PerformanceWindow.setVisible(true);
				int y=213;
				for(i=0;i<user.getNum1();i++)
				{
					
					
					LabelArr1[i] = new JLabel(num3[i]+ "");
					LabelArr1[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
					LabelArr1[i].setLayout(null);
					
					LabelArr1[i].setBounds(70, y, 100, 42);
					PerformanceWindow.add(LabelArr1[i]);
					
					
					LabelArr2[i] = new JLabel(num4[i]+ "");
					LabelArr2[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
					LabelArr2[i].setLayout(null);
					
					LabelArr2[i].setBounds(243, y, 100, 42);
					PerformanceWindow.add(LabelArr2[i]);
					
					LabelArr3[i] = new JLabel(answer[i]+ "");
					LabelArr3[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
					LabelArr3[i].setLayout(null);
					
					LabelArr3[i].setBounds(416, y, 100, 42);
					PerformanceWindow.add(LabelArr3[i]);
					
					LabelArr4[i] = new JLabel(result[i]+ "");
					LabelArr4[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
					LabelArr4[i].setLayout(null);
					
					LabelArr4[i].setBounds(589, y, 200, 42);
					PerformanceWindow.add(LabelArr4[i]);
					
					
					
					y= y+80;
					
				}
			}
		});
		btnHistory.setBounds(657, 248, 127, 57);
		ResultWindow.add(btnHistory);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			CloseJframe();
		}
	});
		btnFinish.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFinish.setBounds(401, 549, 138, 51);
		ResultWindow.add(btnFinish);
		
		CheckWindow = new JPanel();
		CheckWindow.setBounds(0, 0, 902, 619);
		contentPane.add(CheckWindow);
		CheckWindow.setLayout(null);
		CheckWindow.setVisible(false);
		
		lblHelperl = new JLabel(user.getOp() + " Helper");
		
		lblHelperl.setBounds(344, 21, 314, 128);
		lblHelperl.setFont(new Font("Tahoma", Font.PLAIN, 28));
		CheckWindow.add(lblHelperl);
		
		lblNewLabel_1 = new JLabel("Your Name: " + name);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(79, 172, 176, 54);
		CheckWindow.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Number of Problems: " + user.getNum1());
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(79, 271, 264, 54);
		CheckWindow.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Number of Digits: " + user.getNum2());
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(79, 405, 242, 54);
		CheckWindow.add(lblNewLabel_3);
		
		btnBegin = new JButton("Begin");
		btnBegin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			i=0;
			
			CheckWindow.setVisible(false);
			SolvingWindow.setVisible(true);
			
			start[i] =  System.currentTimeMillis();
			
				
			lblProblemOf.setText("Problem " + (i+1) + " of " + user.getNum1());
			
			if(user.getNum2()==1)
			{
				num3[i] = (double)digit.nextInt(9)+0;
				num4[i] = (double)digit.nextInt(9)+0;
				
			}
			
			else if(user.getNum2()==2)
			{
				num3[i] = (double)digit.nextInt(99)+10;
				num4[i] = (double)digit.nextInt(99)+10;
				
			}
			else if(user.getNum2()==3)
			{
				num3[i] = (double)digit.nextInt(999)+100;
				num4[i] = (double)digit.nextInt(999)+100;
				
			}
			else
			{
				num3[i] = (double)digit.nextInt(9999)+1000;
				num4[i] = (double)digit.nextInt(9999)+1000;
				
			}
			
			lblFirstNumber.setText("First Number: " + num3[i]);
			
			
			if(user.getOp()=="Random")
			{
				int index = rand.nextInt(randum.length);
				
				operation = randum[index];
				
				user.setOperation(operation);
				user.getOp();
			}
			
			lblOperation.setText("Operation: " + user.getOp());
			
			lblSecondNumber.setText("Second Number: " + num4[i]);
			
			if(user.getOp() == "Addition")
			{
				result[i] =addition(num3[i],num4[i]);
				
			}
			
			else if(user.getOp() == "Subtraction")
			{
				result[i] =subtract(num3[i],num4[i]);
				
			}
			else if(user.getOp() == "Multiplication")
			{
				result[i] =multiply(num3[i],num4[i]);
				
			}
			else if(user.getOp() == "Division")
			{
				result[i] =divide(num3[i],num4[i]);
				
			}
			
			
			
			btnNext.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e) {
						
						if(textField_3.getText().equals(""))
						{
							JOptionPane.showMessageDialog(null, "Textfields incomplete");
							
						}
						else {
						answer[i] = Double.parseDouble(textField_3.getText());
						
						
						
						textField_3.setText("");
						end[i]=  System.currentTimeMillis();
						
						time[i]= (((end[i]-start[i])/1000));
						
						
						i++;
						if(i<user.getNum1()) {
						
						
						
						
						
						start[i]=  System.currentTimeMillis();
						
						textField_3.setText("");
						lblProblemOf.setText("Problem " + (i+1) + " of " + user.getNum1());
						if(user.getNum2()==1)
						{
							num3[i] = (double)digit.nextInt(9)+0;
							num4[i] = (double)digit.nextInt(9)+0;
							
						}
						
						else if(user.getNum2()==2)
						{
							num3[i] = (double)digit.nextInt(99)+10;
							num4[i] = (double)digit.nextInt(99)+10;
							
						}
						else if(user.getNum2()==3)
						{
							num3[i] = (double)digit.nextInt(999)+100;
							num4[i] = (double)digit.nextInt(999)+100;
							
						}
						else
						{
							num3[i] = (double)digit.nextInt(9999)+1000;
							num4[i] = (double)digit.nextInt(9999)+1000;
							
						}
						
						lblFirstNumber.setText("First Number: " + num3[i]);
						
						lblOperation.setText("Operation: " + user.getOp());
						
						lblSecondNumber.setText("Second Number: " + num4[i]);
						
						if(user.getOp() == "Addition")
						{
							result[i] =addition(num3[i],num4[i]);
							
						}
						
						else if(user.getOp() == "Subtraction")
						{
							result[i] =subtract(num3[i],num4[i]);
							
						}
						else if(user.getOp() == "Multiplication")
						{
							result[i] =multiply(num3[i],num4[i]);
							
						}
						else if(user.getOp() == "Division")
						{
							result[i] =divide(num3[i],num4[i]);
							
						}
						
						
						
						
						}
						
						else {
							
							
							for(i=0;i<user.getNum1();i++)
							{
							if(answer[i]==result[i])
							{
								count++;
							}
							
							count2 = count2 + time[i];
								
							}
							textField_3.setText("");
							
							lblPlayerName.setText("Player Name: " + name);
							
							lblNumberOfProblems.setText("Number of Problems: " + user.getNum1());
							lblTimeTaken.setText("Time Taken in Total: " + Math.round(count2/3600)+" Hours, " + Math.round(count2/60)+ " Minutes, " + Math.round(count2) + " Seconds");
							lblNumberOfCorrect.setText("Number of Correct Answers: " + count );
							
							
							lblAverageTimeTaken.setText("Average time for each Problem: "  + Math.round((count2/num1)) + " seconds" );
							lblPercentage.setText("Percentage: "+ ((count/user.getNum1())*100) + "%");
							
							score = user.getNum1()*count*100/count2;
							lblScoreArchived.setText("Score Archived: "+ score);
						
							
							SolvingWindow.setVisible(false);
							ResultWindow.setVisible(true);
						
						}
						
						
						}
					}
							});
			
			
		}});
		btnBegin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBegin.setBounds(379, 533, 85, 21);
		CheckWindow.add(btnBegin);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(737, 340, 116, 41);
		btnStart.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e) {
						
				
						CloseJframe();
					
			}
				});
		
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 26));
	}
	
///USER CLASS
	
	class User
	{
		
		public int num1;
		public int num2;
		public String name;
		public String operation;
		
	User(int num1, int num2,String name, String operaton)
	{
		
	}
		
	
	void setNum1(int num1)
	{
		this.num1=num1;
	}
	
	void setNum2(int num2)
	{
		this.num2=num2;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setOperation(String op)
	{
		this.operation= op;
	}
	int getNum1()
	
	{
	return num1;
	
	}
	
	int getNum2()
	
	{
	return num2;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getOp()
	{
		return operation;
	}
	
	}
	double addition(double num1, double num2)
	{
	
		double sum;
		
		sum = num1 + num2;
		
		return sum;
	}
	
	double subtract(double num1, double num2)
	{
	
		double difference;
		
		difference = num1 - num2;
		
		return difference;
	}
	
	double multiply(double num1, double num2)
	{
	
		double product;
		
		product = num1 * num2;
		
		return product;
	}
	
	double divide(double num1, double num2)
	{
	
		double quotient;
		
		quotient = num1 / num2;
		
		return quotient;
	}
	
	double random(double num1, double num2)
	{
		double c = rand.nextInt(4)+1;
		
		if(c==1)
		{
			return addition(num1,num2);
		}
		
		else if (c==2)
		{
			return subtract(num1,num2);
		}
		
		else if(c==3)
		{
			return multiply(num1,num2);
		}
		
		else
		{
			return divide(num1,num2);
		}
		
	}
	
	public void CloseJframe(){
	    super.dispose();
	}
}

class Rank {
	public String name;
	public double score;
	
	public Rank(String name, double score)
	{
		this.name = name;
		this.score = score;
		
	}
	
	void setPlayer(String name)
	{
		this.name=name;
	}
	
	void setScore(double score)
	{
		this.score=score;
	}
	
	String getName()
	{
		return name;
	}
	
	double getScore()
	{
		return score;
	}
	
	
	class GarageTest {
		
		private PrintWriter output;
		
		private void openFile(String filename)
		{
			try
			{
				output = new PrintWriter(filename);
			}
			catch(FileNotFoundException exp)
			{
				System.out.println("File not found");
			}
		}
		
		private  void closeFile()
		{
			if(output!=null)
			{
				output.flush();
				output.close();
				
			}
		}
		

}
}



