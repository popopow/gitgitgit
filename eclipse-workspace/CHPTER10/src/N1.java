import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class N1 extends JFrame {
	public N1() {
		super("마우스 올리기 내리기");	//타이틀 명		
		setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Love Java");		//변형될 글씨
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent k) {
				JLabel w = (JLabel)k.getSource();
				w.setText("Love Java");		//변형될 글씨
			}
			
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");		//변형될 글씨
			}			
		});
		
		add(label);
		setSize(250,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new N1();		//객체 생성
	}
}
