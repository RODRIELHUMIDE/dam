import javax.swing.JOptionPane;


public class FuncionCalculadora {
    public static double suma (double n1, double n2){
        return n1 + n2;
    }
    public static double resta (double n1, double n2){
        return n1 - n2;
    }
    public static double Multiplicar (double n1, double n2){
        return n1 * n2;
    }
    public static double dividir (double n1, double n2){
        return n1 / n2;
    }
    public static double raiz (double n1){
        return Math.sqrt(n1);
    }
    public static double potencia (double n1, double n2){
        return Math.pow(n1, n2);
    }
    
    
  
        public static void main(String[] args)  {
            double primerNumero, segundoNumero;
            primerNumero =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
            int signo =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el signo (1= Suma, 2= Resta, 3=Multiplicar,  4=Dividir, 5= Raíz cuadrada, 6=Potencia)"));
            
           
            switch (signo) {
                case 1: 
                segundoNumero =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
               double suma= suma(primerNumero, segundoNumero);         
               JOptionPane.showMessageDialog(null,"La suma es: "+suma);       
                    break;
                case 2:
                segundoNumero =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                double resta = resta(primerNumero, segundoNumero);
                JOptionPane.showMessageDialog(null,"La resta es: "+resta);
                break;
                case 3:
                segundoNumero =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                double multiplicar = Multiplicar(primerNumero, segundoNumero);
                JOptionPane.showMessageDialog(null,"La multiplicación es: "+multiplicar);
                break;
                case 4:
                segundoNumero =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                double dividir = dividir(primerNumero, segundoNumero);
                JOptionPane.showMessageDialog(null,"La división es: "+dividir);
                break;
                case 5:
                double raiz = raiz(primerNumero);  
                JOptionPane.showMessageDialog(null,"La raíz cuadrada es: "+raiz);
                break;
                case 6:
                segundoNumero =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                double elevado = potencia(primerNumero, segundoNumero);
                JOptionPane.showMessageDialog(null,"El resultado de la potencia es: "+elevado);
                break;
                default: 
                JOptionPane.showMessageDialog(null,"Se ha producido un error, intentelo de nuevo");
    
                    break;
                    
            }
    
        }
    
}
