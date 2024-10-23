
package estructurarosa;

public class EstructuraRosa {

    public static void main(String[] args) {
        
        ejercicio3(); }
                
       public  static void ejercicio3(){

        int [][] Matriz= new int[3][3];
        int difNum = 0; // Cantidad de numeros diferentes

        Matriz[0][0]=1;
        Matriz[0][1]=0;
        Matriz[0][2]=0;

        Matriz[1][0]=0;
        Matriz[1][1]=1;
        Matriz[1][2]=0;

        Matriz[2][0]=0;
        Matriz[2][1]=0;
        Matriz[2][2]=1;


        for (int i = 0; i < Matriz.length; i++) {  
            for (int j = 0; j <Matriz.length ; j++) {

                if (i == j) { // Revisa la diagonal
                    if (Matriz[i][j]!=1) {
                        difNum++; // Si en la diagonal es diferente de 1 suma un numero diferente 
                    }
                } else{ 
                    if (Matriz[i][j]!=0) { //Si es diferente de cero suma un error
                        difNum++; 
                    }
                }

            }
        }

        if (difNum<=0) { //Si hay 0 errores es identidad
            System.out.println("Tu matriz es identidad");
        } else {
            System.out.println("Tu matriz no es identidad");
        }

    }
    
        
        
}  