package rpl2;

/**
 *
 * @author Praktikan
 */
public class Rpl2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Eko Pramono (103510281)");
        System.out.println("");
        int x = 1;
        int tingkat = 10;
        int n = 12/2;
        for(int i=1;i<=n;i++){
        for(int k=n;k>i;k--){
        System.out.print(" ");
        }
        for(int j=1;j<=x;j++){
        System.out.print("+");
        }
        x+=2;

        System.out.println("");
        }
        x -= 4;

        for(int i=(n-1);i>=1;i--){
        for(int k=i;k<=(n-1);k++){
        System.out.print(" ");
           }
        for(int j=x;j>=1;j--){
        System.out.print("+");
        }
        x-=2;

        System.out.println("");
        }
    }
    
}
