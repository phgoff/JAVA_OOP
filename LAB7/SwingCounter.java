import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCounter extends JFrame{

	private JLabel jlb;
	private JTextField jtf;
	private JButton jb;
	private int countn;
	public SwingCounter()
	{
		super("Swing Counter");

		jlb = new JLabel("Counter");
		jtf = new JTextField(5);
		jb = new JButton("count");

		countn = 0;
		jb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					countn++;
					jtf.setText(countn+"");
				}

		});

		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

		c.add(jlb);
		c.add(jtf);
		c.add(jb);

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(300,100);
	}

}
