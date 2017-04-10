
import java.util.Scanner;



/**
 *
 * @author internet
 */
public class ArrayExercicio1 {
    
    public static void main(String args[]){
        
        int num = 0,i=0,b=0,resultado = 0,total = 0;
        int[] vetA;
        vetA = new int[100];
        Scanner obj = new Scanner(System.in);
    
        for(i=0;i<100;i++){
            System.out.println("Digite um número: ");
            num = obj.nextInt();
            
            if(num < 0){
                
               break;
            }else{
                vetA[i] = num;
                
            }
        }

        for(b=0;b<100;b++){
            resultado = resultado + vetA[b];
        }
   
        System.out.println("O resultado é igual à: "+resultado);
       
        
    }
    
    
}
