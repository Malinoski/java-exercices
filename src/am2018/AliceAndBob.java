// cd /Users/iuri/eclipse-workspace/java-exercices ; /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/bin/java -Dfile.encoding=UTF-8 -cp /Users/iuri/eclipse-workspace/java-exercices/bin am2018.AliceAndBob 

package am2018;

public class AliceAndBob {
	
	public static void main(String ars[]) {
		AliceAndBob exercice = new AliceAndBob();
		
		int [] A = new int [] {6,1,4,6,3,2,7,4};
		int K=3;
		int L=2;
		int result = exercice.solution(A, K, L);
		System.out.println("RESPONSE: " + result);
	}
	
	public int solution(int[]A, int K, int L) {
		
		int maxNumberOfAppleCollected = -1;
		int i=0;

		// Best sum possible for K
		System.out.println("#  Best sum possible for K");
		int maxSumForK = -1;
		int selectedIndexForK = -1;
		for(int k=0; k<(A.length-K+1); k++){
			System.out.print(A[k]+" - ");
			
			int sum = 0;
			for(i=k; i<(k+K); i++){
				sum += A[i];
				System.out.print(A[i]+" ");
			}
			System.out.println("("+sum+")");			
			
			if(sum>maxSumForK){
				maxSumForK = sum;
				selectedIndexForK = k;
			}
		}

		System.out.println("maxSumForK: "+maxSumForK);
		System.out.println("selectedIndexForK: "+selectedIndexForK);
		System.out.println();

		// Best sum possible for L
		System.out.println("#  Best sum possible for L");
		int maxSumForL = 0;
		int selectedIndexForL = -1;

		for(int l=0; l<(A.length-L+1); l++){
			System.out.print(A[l]+" - ");
			int sum = 0;

			if( (l<selectedIndexForK) || (l>=(selectedIndexForK+K))){
				for(i=l; i<(l+L); i++){

					// Filter by K
					sum += A[i];
					System.out.print(A[i]+" ");				
					
				}
				System.out.println("("+sum+")");
			} else {
				System.out.println("(not allowed)");
			}

			if(sum>maxSumForL){
				maxSumForL = sum;
				selectedIndexForL = l;
			}
		}

		System.out.println("maxSumForL: "+maxSumForL);
		System.out.println("selectedIndexForL: "+selectedIndexForL);
		System.out.println();

		// Calc result
		maxNumberOfAppleCollected = maxSumForK+maxSumForL;
		return maxNumberOfAppleCollected;
	}
}
