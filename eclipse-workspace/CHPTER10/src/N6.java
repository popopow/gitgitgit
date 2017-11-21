import java.awt.*;	// import문
import java.awt.event.*;
import javax.swing.*;

public class N6 extends JFrame {
	public N6() {
		super("클릭 연습 용 응용프로그램");		//타이틀명
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("C");		//C를 출력
		label.setLocation(100,100);
		label.setSize(20, 20);	//size 20,20
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JLabel k = (JLabel)e.getSource();
				Container c = k.getParent();
				int xBound = c.getWidth() - k.getWidth(); // 레이블의 폭 만큼 감소
				int yBound = c.getHeight() - k.getHeight(); // 레이블의 높이 만큼 감소				
				int x = (int)(Math.random()*xBound);
				int y = (int)(Math.random()*yBound);				
				k.setLocation(x, y);
			}
		});
		add(label);
		setSize(300,300);	//size 300,300
		setVisible(true);
	}
	static public void main(String [] args) {
		new N6();
	}
}
