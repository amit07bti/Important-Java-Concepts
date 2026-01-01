package search;

public class DemoBinarySearh {
    public static void main(String[] args) {
        
        int r[]=    {1, 4, 6, 8, 9, 10 };
        int li=0;
        int target=1;
        int hi= r.length-1;
        int mi=(li+hi)/2;
        
        while(li<=hi){
            if(r[mi]==target){
                System.out.println(" the element are store at "+mi+"th" +" index ");
                break;
            } else if (r[mi] < target) {
                li=mi+1;
                
            }else {
                hi=mi-1;
            }
            mi=(li+hi)/2;


        }
        if (li>hi){
            System.out.println("Element are not found ...");
        }
        
        
        
        
        
        
        
        
    }
}
