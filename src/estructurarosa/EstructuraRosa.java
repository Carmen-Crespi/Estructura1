
package estructurarosa;
import java.util.Scanner;
public class EstructuraRosa {

    public static void main(String[] args) {
        
     //   ejercicio3();
     
     //ejercicio2();
     
     ejercicio4();
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
        
        
        public static  void ejercicio4(){
        int [][] Matriz= new int[4][4];
        int errores=0; //cantidad de erroes

        Matriz[0][0]=8;
        Matriz[0][1]=0;
        Matriz[0][2]=0;
        Matriz[0][3]=0;

        Matriz[1][0]=9;
        Matriz[1][1]=8;
        Matriz[1][2]=0;
        Matriz[1][3]=0;

        Matriz[2][0]=1;
        Matriz[2][1]=3;
        Matriz[2][2]=4;
        Matriz[2][3]=0;

        Matriz[3][0]=8;
        Matriz[3][1]=9;
        Matriz[3][2]=6;
        Matriz[3][3]=5;

        //imprimimos las matriz
        for (int i = 0; i <Matriz.length ; i++) {
            System.out.println();
            for (int j = 0; j < Matriz.length; j++) {
                System.out.print(Matriz[i][j]+" ");
            }
        }
        System.out.println();
        //verificamos solo los numeros de la esquina superior
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = Matriz.length-1; j > i; j--) {
                if (Matriz[i][j] !=0){
                    errores++;
                }

            }
        }

        if (errores>0){
            System.out.println("La matriz no es triangular inferior");
        }else
        {
            System.out.println("La matriz es triangular inferior");
        }
    }
        
}  

