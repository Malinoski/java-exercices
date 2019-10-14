package am2018;

public class AliceAndBob {
	
	public static void main(String ars[]) {
		AliceAndBob exercice = new AliceAndBob();
		
		int [] A = new int [] {6,1,4,6,3,2,7,4};
		int K=3;
		int L=2;
		int result = exercice.solution(A, K, L);
		System.out.println(result);
	}
	
	public int solution(int[]A, int K, int L) {
		
		int [] appleTrees = A;
		
		int aliceConsec = K;
		int bobConsec = L;
		
		int maxNumberOfAppleCollected = -1;
		int treesEnd = (appleTrees.length)-aliceConsec+1;
		
		for (int i = 0; i < treesEnd; i++) {
			
			System.out.print("Alice: ");
			int aliceIni = i;
			int aliceEnd = i+aliceConsec;
			for (int j = aliceIni; j < aliceEnd; j++) {
				System.out.print(appleTrees[j]+",");			
			}
			System.out.println();
			
			for (int j = 0; j < treesEnd; j++) {
				
				// Back to alice
				if( (j+bobConsec)<(aliceIni)) {
					System.out.print("\tBob (back): ");
					for (int j2 = j; j2 < j+bobConsec+1; j2++) {
						System.out.print(appleTrees[j2]+",");			
					}
					System.out.println();
				}
				
				// Front to alice
				if( (j+aliceEnd+1)<(treesEnd-bobConsec) ) {
					System.out.print("\tBob (front): ");
					for (int j2 = aliceEnd+1; j2 < (j+bobConsec+1); j2++) {
						System.out.print(appleTrees[j2]+",");
					}
					System.out.println();
				}
			}
			
			
		}
		
		return maxNumberOfAppleCollected;
	}
}
