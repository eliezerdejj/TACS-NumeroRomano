/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numerosromanos;

/**
 *
 * @author eliez
 */
public class NumerosRomanos {
    
    public String MostraCorrespondente(int numero){
        
        int numeroDecimal = numero;
        int resto = 0;
        String roma = "";
        
        if(numeroDecimal<4000){
            while (numeroDecimal>=1000){
                roma +="M";
                numeroDecimal -=1000;
            }
        
            while(numeroDecimal>=900){            
                roma +="CM";
                numeroDecimal -=900;
            }
        
            while(numeroDecimal>=500){            
                roma +="D";
                numeroDecimal -=500;
            }
        
            while(numeroDecimal>=400){            
                roma +="CD";
                numeroDecimal -=400;
            }
        
            while(numeroDecimal>=100){            
                roma +="C";
                numeroDecimal -=100;
            }
        
            while(numeroDecimal>=90){            
                roma +="XC";
                numeroDecimal -=90;
            }
        
            while(numeroDecimal>=50){            
                roma +="L";
                numeroDecimal -=50;
            }
        
            while(numeroDecimal>=40){            
                roma +="XL";
                numeroDecimal -=40;
            }
        
            while(numeroDecimal>=10){            
                roma +="X";
                numeroDecimal -=10;
            }
        
            while(numeroDecimal>=9){            
                roma +="IX";
                numeroDecimal -=9;
            }
        
            while(numeroDecimal>=5){            
                roma +="V";
                numeroDecimal -=5;
            }
        
            while(numeroDecimal>=4){            
                roma +="IV";
                numeroDecimal -=4;
            }
        
            while(numeroDecimal>=1){            
                roma +="I";
                numeroDecimal -=1;
            }
            //System.out.println("O Numero: "+numero+ " Corresponde a: "+roma);
            return roma;
        } else return "Numero invalido";
   } 
}
