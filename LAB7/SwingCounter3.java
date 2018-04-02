import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Event handler another type - 3
public class SwingCounter3 extends JFrame{

	private JLabel jlb;
	private JTextField jtf;
	private JButton jb;
	private int countn;
	public SwingCounter3()
	{
		super("Swing Counter");

		jlb = new JLabel("Counter");
		jtf = new JTextField(5);
		jb = new JButton("count");

		countn = 0;
		
		//Event will call actionPorformed
		jb.addActionListener(new onClick());

		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

		c.add(jlb);
		c.add(jtf);
		c.add(jb);

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(300,100);
	}

	//Action Perform
	public class onClick implements ActionListener
	{
		public void actionPerformed(ActionEvent e){		
		   if(e.getSource() == jb){
			  countn++;
			  jtf.setText(countn+"");
  			 }
		   }
	}
	
}
