
package practica1;

import javax.swing.JOptionPane;

public class Practica1 {

    public static void main(String[] args) {
        int num1,num2,sum, resta;
        
        JOptionPane.showMessageDialog(null, "Suma y resta de dos numeros");
        num1= Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero entero"));
        num2= Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero entero"));
        
        sum= num1 + num2;
        resta = num1 - num2;
        
        JOptionPane.showMessageDialog(null, "Suma " + sum + " resta " + resta);
    }
    
}
