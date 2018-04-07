import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/*
<applet code = "Calculator2" width = 200 height =200>
</applet>
*/
public class Calculator2 extends JApplet implements ActionListener {
	String msg = "";
	int v1,v2,result;
	JTextField t1,t2,t3;
	JButton b[] = new JButton[10];
	JButton add,sub,mul,div,clear,mod,EQ;
	char OP;

 	public void init(){
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		GridLayout g1 = new GridLayout(4,5);
		setLayout(g1);
		add = new JButton("addition");
		sub = new JButton("subtraction");
		mul = new JButton("mulultiplication");
		div = new JButton("division");
		mod = new JButton("mod");
		clear = new JButton("clear");
		EQ = new JButton("EQ");
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		add(t1);
		add(t2);
		add(t3);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
		}
		
	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		char ch = str.charAt(0);
		if ( Character.isDigit(ch) ){
			t1.setText(t1.getText()+str);
		}
		
		else
		if(str.equals("add"))
		{
			v1 = Integer.parseInt(t1.getText());
			OP = '+';
		}
			else if(str.equals("sub"))
			{
			v1 = Integer.parseInt(t1.getText());
			OP = '-';
		}
			else if(str.equals("mul")){
			v1= Integer.parseInt(t1.getText());
			OP = '*';
		}
			else if(str.equals("div")){
			v1 = Integer.parseInt(t1.getText());
			OP = '/';
		}
			else if(str.equals("mod")){
			v1 = Integer.parseInt(t1.getText());
			OP = '%';
		}
		 if ( Character.isDigit(ch)){
                        t2.setText(t2.getText()+str);
                        
                }

		v2 = Integer.parseInt(t2.getText());
		if(str.equals("EQ")){
			if(OP=='+')
				result = v1+v2;
		  	else if(OP=='-')
				result = v1-v2;
			else if(OP=='*')
				result = v1*v2;
		  	else if(OP=='/')
				result = v1/v2;
		  	else if(OP=='%')
				result = v1%v2;
			t3.setText(""+result);
		}
		if(str.equals("clear"))
			{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			}	
		}
}
			
		
