
package demoreference;

import content.TheReferene;

public class DemoReference {

    public static void main(String[] args) {
       TheReferene one = new TheReferene(); 
       System.out.println(" one's number is " + one.number );
        
       TheReferene two = new TheReferene(); 
       System.out.println(" two's number is " + two.number );
        
        System.out.println(" The reference value " + one);
        System.out.println(" The reference two is " + two);
        
        one.number = 22;
        System.out.println(" one's number is " + one.number );
       System.out.println(" two's number is " + two.number );

       one = two ;
         
        System.out.println(" The reference value " + one);
        System.out.println(" The reference two is " + two);
         
        two.number = 55;
       System.out.println(" one's number is " + one.number );
       System.out.println(" two's number is " + two.number );
   
        
    }
    
}
