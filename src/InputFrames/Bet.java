/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InputFrames;

/**
 *
 * @author Saurabh
 */
public class Bet {
    int computeGain(Tolo t){
     int sum=0;
     if(t.lucky==Boolean.FALSE){
         if(t.goodnumbers==3){
            
             sum= t.betamount*5;

         }
         else if(t.goodnumbers==4){
             //System.out.println(t.betamount);
             sum= t.betamount*50;
         }
         else{
             sum=t.betamount;
         }
     }
     
     else{
              if(t.goodnumbers==3){
                 sum= t.betamount*5*5;

             }
             else if(t.goodnumbers==4){
                 //System.out.println(t.betamount);
                 sum= t.betamount*50*5;
             }
             else{
                 sum=t.betamount*5;
             }
     }
      
      return sum;
    }
    
}
