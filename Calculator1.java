import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
/*
<applet code = "Calculator1" width = 300 height = 300>
</applet>
*/
public class Calculator1 extends Applet implements ActionListener {
	String msg = "";
	int v1,v2,result;
	TextField t1,t2,t3;
	Button b[] = new Button[10];
	Button add,sub,mul,div,clear,mod,EQ;
	char OP;

 	public void init(){
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		GridLayout g1 = new GridLayout(4,5);
		setLayout(g1);
//		for(int i=0;i<10;i++){
//			b[i] = new Button(""+i);
//			}
		add = new Button("add");
		sub = new Button("sub");
		mul = new Button("mul");
		div = new Button("div");
		mod = new Button("mod");
		clear = new Button("clear");
		EQ = new Button("EQ");
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
		add(t1);
		add(t2);
		add(t3);
//		for(int i=0;i<10;i++)
//		{
//			add(b[i]);
//		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
//		for(int i=0;i<10;i++){
//			b[i].addActionListener(this);
//		}
		
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
//		char ch1 = str.charAt(1);
		//int n = 0;
		if ( Character.isDigit(ch) ){
			t1.setText(t1.getText()+str);
		//	n++;
		}
		
		else
		if(str.equals("add"))
		{
			v1 = Integer.parseInt(t1.getText());
			OP = '+';
			//t1.setText("");
		}
			else if(str.equals("sub"))
			{
			v1 = Integer.parseInt(t1.getText());
			OP = '-';
		//	t1.setText("");
		}
			else if(str.equals("mul")){
			v1= Integer.parseInt(t1.getText());
			OP = '*';
		//	t1.setText("");
		}
			else if(str.equals("div")){
			v1 = Integer.parseInt(t1.getText());
			OP = '/';
		//	t1.setText("");
		}
			else if(str.equals("mod")){
			v1 = Integer.parseInt(t1.getText());
			OP = '%';
		//	t1.setText("");
		}
		 if ( Character.isDigit(ch)){
                        t2.setText(t2.getText()+str);
                        
                }

		v2 = Integer.parseInt(t2.getText());
		if(str.equals("EQ")){
		//	v2 = Integer.parseInt(t2.getText());
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
		
		
