import java.awt.event.KeyAdapter; 
import java.awt.event.KeyEvent; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
public class Jlabel{ 
   public static void main(String[] args) { 
      JFrame jf = new JFrame(); 
      //������ ũ��
      jf.setSize(300, 300); 
      final JLabel lb = new JLabel("Love Java"); 
      jf.add(lb); 
      jf.setVisible(true); 
      jf.addKeyListener(new KeyAdapter() { 
         @Override 
         public void keyPressed(KeyEvent e) { 
        	 // ������ ����Ű�� �ԷµǸ�
            if (e.getKeyCode() == KeyEvent.VK_LEFT) { 
               String text = lb.getText(); 
               //beginIndex �ε������� �����ϴ� ���� ��Ʈ�� ����
               String temp1 = text.substring(1); 
               String temp2 = text.substring(0, 1); 
               lb.setText(temp1 + temp2); 
            } 
         } 
      }); 
   } 
} 