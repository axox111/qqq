public class MathString {
    public static void main(String [] values){
        int a = 7;
        int b = 5;
        System.out.println("a=" + a + "b="+ b);
        
        int i = 0;
        while(i < 5){
            System.out.println("while " + i);
            i = i + 1;
        }
        for(int j = 0; j < 10; j = j + 1){
            j = j + 1; 
            System.out.println(j );    
        }
        int[] s = {57, 24 ,72};
        for(int num : s) {
            int numa = num + 12;
            System.out.println(numa);
        }
        int iif = 17;
        if (iif < 1) {
            System.out.println("if = " + iif);
        } else {
            System.out.println("else = " + iif);
        }        
    }
}
