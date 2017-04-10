
import java.util.Scanner;


/**
 *
 * @author internet
 */
public class ArrayExercicio2 {
    
    public static void main(String args[]){
        
        Scanner obj = new Scanner(System.in);
        
        int[] vetA;
        vetA = new int[10];
        int[] vetB;
        vetB = new int[10];
        
        int i = 0,b = 0,c = 0,resultado = 0;
        
        for(i=0;i<10;i++){
            System.out.println("Digite um número: ");
            vetA[i] = obj.nextInt();
            
        }
        for(b = 0;b<10;b++){
            
            vetB[b] = vetA[b];
        }
        for(c = 0;c<10;c++){
            if((vetB[c]%2) != 0){
                resultado = resultado + vetB[c];
            }
        }
        
        System.out.println("O resultado é igual a: "+resultado);
    }
}
