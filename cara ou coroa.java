 import java.util.Random;

 public class CaraOuCoroa {

     public static void main  (String[] args){
        //instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();
         
        boolean resultado = gerador.nextBoolean();
        
        //String contendo o lado da moeda
        String lado;
        
        //Condição para Cara ou Coroa
        if(resultado == true){
            lado = "Cara";
        }
        else{
            lado = "Coroa";
        }
 
        //Exibição do resultado
        System.out.println(lado);)
 }