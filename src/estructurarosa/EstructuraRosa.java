
package estructurarosa;
import java.util.Scanner;
public class EstructuraRosa {

    public static void main(String[] args) {
        
     //   ejercicio3();
        
     ejercicio2();
    } 
                
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
    
        
        public  static void ejercicio2(){
        Scanner entrada=new Scanner(System.in); //escaner de la consola

        System.out.println("Dime la cantidad de filas  de la matriz");
        int i =entrada.nextInt(); // Guardo las columnas
        System.out.println("Dime la cantidad de columnas  de la matriz");
        int j =entrada.nextInt();// Guardo las filas

        int [][] Matriz= new int [i][j]; //se crea la matriz


        for (int x = 0; x <i; x++) {
            for (int y = 0; y < j; y++) {
                Matriz[x][y]=(23*(int) Math.pow(x, 4))+(20*(int) Math.pow(y, 3)-3); // se asignan los valores de la matriz por la formula
            }

        }

        //se imprime la matriz
        for (int x = 0; x <i; x++) {
            System.out.println();
            for (int y = 0; y < j; y++) {
                System.out.print(Matriz[x][y]+" "); 
            }

        }
    }
}  