
package ordenamientoobjetos;

public class OrdenamientoObjetos {
    
    public static void main (String[] args) {
        Estudiante [] arrayEstudiantes = new Estudiante [5];
        arrayEstudiantes[0] = new Estudiante ("raul", "farfan","123", 5, 5.0);
        arrayEstudiantes[0] = new Estudiante ("delman", "suarez","123", 4, 4.5);
        arrayEstudiantes[0] = new Estudiante ("sebastian", "hernandez","123", 3, 4.8);
        arrayEstudiantes[0] = new Estudiante ("alberto", "bolano","123", 2, 4.2);
        arrayEstudiantes[0] = new Estudiante ("nicolas", "ramos","123", 1, 2.0);
        arrayEstudiantes[0] = new Estudiante ("juan", "jaime","123", 6, 3.5);
        
         
       int temp;
        for(int i=1;i < arrayEstudiantes.length;i++){
            for (int j=0 ; j < arrayEstudiantes.length- 1; j++){
                if (arrayEstudiantes[j].getNota () < arrayEstudiantes[j+1].getNota()){
                    temp = arrayEstudiantes[j].getPuesto();
                    arrayEstudiantes[j].setPuesto (arrayEstudiantes[j+1].getPuesto());
                    arrayEstudiantes[j+1].setPuesto(temp);
                }   
            }  
        }
    }
}