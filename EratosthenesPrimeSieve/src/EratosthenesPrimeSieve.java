import java.util.Arrays;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private boolean[] listOfPrim;
    int oberGrenze;
    int counter=0;
    public EratosthenesPrimeSieve(int oberGrenze){
        this.oberGrenze=oberGrenze;
        listOfPrim=new boolean[oberGrenze];
    }

    @Override
    public boolean isPrime(int p) {
        Arrays.fill(listOfPrim, true);

        for (int i = 2; i<oberGrenze; i++) {

            for (int j = 2;j<oberGrenze  ; j++) {

                if(j%i==0 && j!=i){
                        listOfPrim[j]=false;
                }
            }
        }
        for (int k = 0; k < listOfPrim.length; k++) {
            if(listOfPrim[p]){
                return true;
            }
        }


        return false;
    }

    @Override
    public void printPrimes() {
        for (int i = 2; i < listOfPrim.length; i++) {
            System.out.println(i+" "+listOfPrim[i]);
        }
    }
}
