

public class Primes {
		int[] primes = new int[1000];
		int[] primes2 = new int[1000];
		boolean running = true;
		boolean running2 = true;
		int count = 0;
		int count2 = 1;
		int num2 = 3;
		int num = 2;
	public static void main(String[] args) throws InterruptedException {
		Primes P = new Primes();
	}
	Primes() throws InterruptedException{
		Thread t1 = new Thread(()-> {
			while(running) {
				if(isPrime(num)) {
					primes[count]=num;
					count++;
				}
				if(count==1000) {
					running=false;
				}
				num++;
			}
		for(int k : primes) {
			System.out.println(k);
		}
			System.out.println("t1 Complete");
		});
		
		Thread t2 = new Thread(()-> {
			primes2[0]=2;
			while(running2) {
				if(isPrime2(num2)) {
					primes2[count2]=num2;
					count2++;
				}
				if(count2==1000) {
					running2=false;
				}
				num2+=2;
			}

			for(int k : primes2) {
				System.out.println(k);
			}
			System.out.println("t2 Complete");
		});
		//t1.start();
		t2.start();
		//t1.join();
		t2.join();
	}
	boolean isPrime(int n) {
		for(int i = 2; i<n; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	boolean isPrime2(int n) {
		for(int i = 2; i<Math.sqrt(n); i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
}
