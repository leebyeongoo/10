import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouseMotion extends JFrame 
{
    JPanel jp = new JPanel();
    
    mouseMotion()
    {
        setTitle("드래깅");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jp);
        
        jp.addMouseMotionListener(new motionListener());
        //컨텐트팬에 마우스 리스너를 추가한다.
        jp.setBackground(Color.green);
        setSize(250,250);
        //포커스 강제 지정
        setVisible(true);
    }
    public class motionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e) 
        {
            jp = (JPanel)e.getSource();
            //배경색 노란색
            jp.setBackground(Color.yellow);
        }
        public void mouseMoved(MouseEvent e) 
        {
            jp = (JPanel)e.getSource();
            //배경색 그린
            jp.setBackground(Color.GREEN);
        }
        
    }
    public static void main(String[] args)
    {
        new mouseMotion();
    }
}
