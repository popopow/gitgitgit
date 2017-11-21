import java.awt.*;		//import문
import java.awt.event.*;
import javax.swing.*;

public class N3 extends JFrame {
	public N3() {
		super("Left 키로 문자열 이동");	//타이틀
		setLayout(new FlowLayout());	//흐르는 레이아웃
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Love Java");		//출력문
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {		//조건 성립시 
					JLabel la = (JLabel)e.getSource();
					String text  = la.getText();
					String a = text.substring(0,1);
					String b = text.substring(1);
					la.setText(b.concat(a));
				}
			}
		});
		add(label);
		setSize(250,100);
		setVisible(true);
		label.requestFocus();
	}
	static public void main(String [] args) {
		new N3();		// 객체 생성
	}
}
