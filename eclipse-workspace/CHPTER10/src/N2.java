import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class N2 extends JFrame {
	public N2() {
		super("드래깅동안 YELLOW로 변경");	//타이틀 명
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN);	//배경 초록색
		MyMouseListener ml = new MyMouseListener();	 // 마우스 리스너
		c.addMouseMotionListener(ml);
		c.addMouseListener(ml);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);		// 배경 노란색
		}
		public void mouseMoved(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN);		//배경 초록색
		}		
	}
	static public void main(String [] args) {
		new N2();		// 객체생성
	}
}
