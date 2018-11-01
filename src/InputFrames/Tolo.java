/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InputFrames;

/**
 *
 * @author Saurabh
 */
import java.util.Random;
import java.util.*;
public class Tolo {
    int drawnnumbers []=new int[4];
    Set<Integer> generated = new LinkedHashSet<Integer>();
    Boolean lucky=Boolean.FALSE;
    int luckynumberdrawn;
    //int betresultnumbers [];
    int betamount;
    int goodnumbers=0;
    Random rand=new Random();
    
    void createBet1(int n1,int n2,int n3,int n4, int betmoney){
     
       while (generated.size() < 4)
        {
        Integer next = rand.nextInt(20) + 1;
    // As we're adding to a set, this will automatically do a containment check
        generated.add(next);
        }   
       //System.out.println(generated);
       Iterator<Integer> itr = generated.iterator();
       int j=0;
        while(itr.hasNext()){
            drawnnumbers[j]=itr.next();
            j++;
        }
        for(int i=0;i<4;i++){
          if(n1==drawnnumbers[i]||n2==drawnnumbers[i]||n3==drawnnumbers[i]||n4==drawnnumbers[i]){
              goodnumbers=goodnumbers+1;
          }
       }
    }
    void createBet2(int n1,int n2, int n3, int n4,int luckynumber, int betmoney){
        
         while (generated.size() < 4)
        {
        Integer next = rand.nextInt(20) + 1;
    // As we're adding to a set, this will automatically do a containment check
        generated.add(next);
        }   
       //System.out.println(generated);
       Iterator<Integer> itr = generated.iterator();
       int j=0;
        while(itr.hasNext()){
            drawnnumbers[j]=itr.next();
            j++;
        }
        for(int i=0;i<4;i++){
          if(n1==drawnnumbers[i]||n2==drawnnumbers[i]||n3==drawnnumbers[i]||n4==drawnnumbers[i]){
              goodnumbers=goodnumbers+1;
          }
       }
         luckynumberdrawn = rand.nextInt(10)+1;
        if(luckynumberdrawn==luckynumber){
            lucky= Boolean.TRUE;
        }
        else{
            lucky= Boolean.FALSE;
        }
        
    }
}
