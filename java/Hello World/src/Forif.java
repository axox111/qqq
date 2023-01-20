public class Forif {
    
    public static void main(String[] s){

        for(int i = 0; i < 15; i = i + 1){
        if(i<5){
            System.out.println("if " + i);
        } else if(i>10) {
            System.out.println("else if " + i);
        } else {
            System.out.println("else " + i);
        }
    }
}
}
