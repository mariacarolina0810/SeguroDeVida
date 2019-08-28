/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class SeguroDeVida {
     public SeguroDeVida(){
    
}
    public long Calcular(long valorBase,boolean fumador, boolean alcoholico, boolean drogadicto, boolean cardiaco){
        long total=0;
        double rgFumador= 0, rgAlcoholico=0,rgSustancias=0,rgCardiaco=0;
        if(fumador){
            rgFumador= valorBase * 0.10;
        }
        if(alcoholico){
            rgAlcoholico= valorBase*0.20;
        }
        if(drogadicto){
            rgSustancias= valorBase*0.25;
        }
        if(cardiaco){ 
            rgCardiaco=valorBase*0.30;
        }
        total=(long) (valorBase - (rgFumador+rgAlcoholico+rgSustancias+rgCardiaco));
        return total;
    }
}
