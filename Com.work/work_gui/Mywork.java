package work_gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mywork implements ActionListener{
	JFrame frame;
	JLabel ar= new JLabel(" Amount Requested ");
	JLabel dr= new JLabel(" Duration(Year) ");
	JLabel tr= new JLabel(" Total to Return ");
	JTextField artxf = new JTextField();
	JTextField drtxf = new JTextField();
	JTextField trtxf = new JTextField();
	JButton calc = new JButton(" Calculate ");


	//constructor
	public Mywork(){
		createWindow();
		setLocationAndSize();
		addcomponentsToFrame();
		addActionEvent();
	}

	private void addActionEvent() {
		calc.addActionListener(this);

	}

	private void addcomponentsToFrame() {
		frame.add(ar);
		frame.add(dr);
		frame.add(tr);
		frame.add(artxf);
		frame.add(drtxf);
		frame.add(trtxf);
		frame.add(calc);	
	}

	private void setLocationAndSize() {
		//Amount Requested
		ar.setBounds(10,10,100,30);
		artxf.setBounds(140,10,100,30);
		//Duration(Year)
		dr.setBounds(10,60,100,30);
		drtxf.setBounds(140,60,100,30);
		//Total to Return
		tr.setBounds(10,100,100,30);
		trtxf.setBounds(140,100,100,30);
		//Button
		calc.setBounds(90,140,100,30);	
	}

	private void createWindow() {
		frame = new JFrame();
		frame.setTitle("====Loan Calculation====");
		frame.setBounds(10,10,500,400);
		frame.getContentPane().setBackground(Color.blue);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

	}

	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==calc){
			int a_r=Integer.parseInt(artxf.getText());
			int d_r=Integer.parseInt(drtxf.getText());
			int t_r=a_r+(d_r*12000);
			trtxf.setText(String.valueOf(t_r));
		}

	}

}
