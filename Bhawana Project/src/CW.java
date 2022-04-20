import javax.swing.*;

public class CW {
    public static void main(String[] args) {
        double m1,m2,m3,m4,total;
         m1=Double.parseDouble(JOptionPane.showInputDialog("Enter first marks"));
         m2= Double.parseDouble(JOptionPane.showInputDialog("Enter second marks"));
         m3= Double.parseDouble(JOptionPane.showInputDialog("Enter third marks"));
         m4= Double.parseDouble(JOptionPane.showInputDialog("Enter fourth marks"));
         total= (m1+m2+m3+m4)/4;
         int castedtotal=(int)(total);
         JOptionPane.showMessageDialog(null,total);




    }
}
