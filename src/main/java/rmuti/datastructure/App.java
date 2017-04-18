package rmuti.datastructure;
public class App 
{
    public static void main( String[] args )
    {    	
       ArrayOperation ao= new ArrayOperation(); 
       System.out.println("Data = " + ao);
       System.out.println("SumArray = " + ao.sumArray());
       System.out.println("MAX = " + ao.maxItem());
       System.out.print("CoppyArray = ");
       
       int result [] = ao.copyArray(0,5);
       for (int i = 0; i < 10; i++){
    	   if(result[i] != 0){
    	   System.out.print(result[i] + " ");  
       }
       //System.out.println("Max = "+ao.maxItem());
    }
}
}