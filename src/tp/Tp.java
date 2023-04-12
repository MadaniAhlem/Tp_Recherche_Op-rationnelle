
package tp;

import static java.lang.Math.log;
import java.util.*;
 
/**
  @author ahlem
 */
public class Tp {

   
   
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
     double  A,B,C,d,e,f,g;
    /*
     Lecteur des noms des devices
     
     
     
     
     */
     System.out.println("Entrer le nom principales devise :");
        String a = scanner.next();
     System.out.println("Entrer le nom  deuxième devise : ");
        String b = scanner.next();
     System.out.println("Entrer le nom troisième devise :");
        String c = scanner.next();
        
        System.out.println("---------------------------------------------------");
        
     /*
       Lecteur de taux de change annoncé
        
        */   
        try {
             System.out.println("Entrer le taux de change annoncé de devise "+a+"  vers le devise  "+b+" : ");
               d =scanner.nextDouble() ; 
        } catch (Exception z) {
             System.out.println("Rueuntrer le taux de change annoncé  "+a+"  vers le devise  "+b+" : ");
             d =scanner.nextDouble() ; 
        }
        
        try {
            System.out.println("Entrer le taux de change annoncé de devise  "+a+"  vers le devise "+c+" : ");
            e = scanner.nextDouble();
        } catch (Exception z) {
            System.out.println("Ruentrer le taux de change annoncé de devise  "+a+"  vers le devise  "+c+" : ");
            e = scanner.nextDouble();
        }
        
        try {
             System.out.println("Entrer le taux de change annoncé de devise  "+b+"  vers le devise  "+c+" : ");
           f = scanner.nextDouble();
        } catch (Exception z) {
             System.out.println("Ruentrer le taux de change annoncé de devise  "+b+"  vers le devise  "+c+" : ");
           f = scanner.nextDouble();
        }
        
        try {
             System.out.println("Entrer le taux de change annoncé de devise  "+c+"  vers le devise  "+b+" : ");
             g = scanner.nextDouble(); 
        } catch (Exception z) {
             System.out.println("Ruentrer le taux de change annoncé de devise  "+c+"  vers le devise  "+b+" : ");
            g = scanner.nextDouble(); 
        }
   

        System.out.println("------------------------------------------");
        
        /* 
        
        Detecter l'arbitrage triangulaire
        
        */
        try {
        /*
               Calculer le taux de change dérivé 
        */
            A=e /d ; 
            C=d/e;
  
            
            
        /*
            pour faire l'arbitrage triangulaire il faut assurer que :
              le taux de change direct entre les deux devises est n'est pas équivalent à le taux de change dérivé
            
            */    
     if(A < f){
         System.out.println("vous pouvez faire l'arbitrage triangulaire de devise "+a+" vers le devise "+b+" puis vers le device "+c+" et apres vers le device  "+a+" .");
         /*
           Calculer le benefit 
         */
          B=-log(d)-log(e)-log(f);
           System.out.println(" Le benefit est : " +B);
           
     
     } else if(C < g){
         
          System.out.println("vous pouvez faire l'arbitrage triangulaire de devise "+a+" vers le devise "+c+" puis vers le device "+b+" et apres vers le device  "+a+" .");
            /*
           Calculer le benefit 
         */
          B=-log(e)-log(d)-log(g);  
            System.out.println("  Le benefit est : " +B);
     }else{
         System.out.println("----- vous pouvez pas faire l'arbitrage triangulaire entre ces trois devices -------");
         System.exit(0);
          }
     
     
         } catch (Exception z) {
              System.out.println("  essayer à nouveau ! ");
             
        }
        }
    
    
}
