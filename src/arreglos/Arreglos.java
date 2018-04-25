
package arreglos;

import javax.swing.JOptionPane;

public class Arreglos {

    public static void main(String[] args) {
       
        int menu=0;
       //Creamos la Matriz
       String paisesMatriz[][]={{"Colombia","Brasil","Argentina","Venezuela","Bolivia"},
                                {"Bogota","Brazilia","Buenos Aires","Caracas","La Paz"},
                                {"Barranquilla","Sao Paulo","Cordoba","Maracay","Potosi"}};
            
        do{
            try{
          menu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del número 1"
                  + "\n1. Paises"
                  + "\n2. Capitales"
                  + "\n3. Ciudades"
                  + "\n4. salir"));
          
        switch (menu){
            case 1:
                for (int p = 0; p < 1; p++) {
                    for (int c = 0; c < paisesMatriz[p].length; c++) {
                    JOptionPane.showMessageDialog(null,"Los paises son: "+paisesMatriz[0][c]);
                    }
                }
                   break;
            case 2:
                    for (int p = 1; p < 2; p++) {
                    for (int c = 0; c < paisesMatriz[p].length; c++) {
                    JOptionPane.showMessageDialog(null,"Las capitales son: "+paisesMatriz[1][c]);
                    }
                }
                    break;
            case 3:
                       for (int p = 2; p < 3; p++) {
                    for (int c = 0; c < paisesMatriz[p].length; c++) {
                    JOptionPane.showMessageDialog(null,"Las ciudades son: "+paisesMatriz[2][c]);
                    }
                }
                    break;
            case 4: JOptionPane.showMessageDialog(null, "Selecciono Salir");
                    break;
            
            default:
                    JOptionPane.showMessageDialog(null, "Selecciono una opción invalida");
                    break;                           
    }          
                
           }catch (Exception e) {
               System.exit(0);
               JOptionPane.showMessageDialog(null, "Error en la ejecución en: " + e.getMessage()+" <--Al Digitar");
            }
    
      } while (menu!=4);
        
    }   
}
