import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouseMotion extends JFrame 
{
    JPanel jp = new JPanel();
    
    mouseMotion()
    {
        setTitle("�巡��");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jp);
        
        jp.addMouseMotionListener(new motionListener());
        //����Ʈ�ҿ� ���콺 �����ʸ� �߰��Ѵ�.
        jp.setBackground(Color.green);
        setSize(250,250);
        //��Ŀ�� ���� ����
        setVisible(true);
    }
    public class motionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e) 
        {
            jp = (JPanel)e.getSource();
            //���� �����
            jp.setBackground(Color.yellow);
        }
        public void mouseMoved(MouseEvent e) 
        {
            jp = (JPanel)e.getSource();
            //���� �׸�
            jp.setBackground(Color.GREEN);
        }
        
    }
    public static void main(String[] args)
    {
        new mouseMotion();
    }
}
