package FUNCIONES;
public class funcion_multiplo {
    public String retornaMultiplo(int num){
        
        if( num % 3 == 0 && num % 5 == 0){
             return("TRIFIV");
         } else if( num % 3 == 0){
             return("TRI");
         } else if ( num % 5 == 0){
             return("FIV");
             
         }
        return "Ningun valor";
        
        
        
    }
}
