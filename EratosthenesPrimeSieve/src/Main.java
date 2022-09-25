public class Main {
    public static void main(String[] args) {
        EratosthenesPrimeSieve eratosthenesPrimeSieve=new EratosthenesPrimeSieve(100);

        System.out.println(eratosthenesPrimeSieve.isPrime(97));
        eratosthenesPrimeSieve.printPrimes();
    }
}