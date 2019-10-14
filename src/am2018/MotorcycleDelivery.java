package am2018;

public class MotorcycleDelivery {
	public static void main(String args[]) {
		
		MotorcycleDelivery exercice = new MotorcycleDelivery();
		
		
		// int [] packages = {70,10,20};
		int [] packages = {70,10,40,80,80,2};
		//int [] packages = {90,20,30};
		int maxWeight = 100;
		int result = exercice.minimunNumberOfTrips(maxWeight, packages);		
		System.out.println("Result : "+result);		
	}
	
	public int minimunNumberOfTrips(int maxWeight, int [] packages) {
		
		int [] wasDelivery =  new int[packages.length];
		
		int weighMotorcycle = 0;
		int elementsMortorcycle = 0;
		
		boolean finished = false;
		int elementsToSend = packages.length;
		int trips = 0;
		
		while(!finished) {
			for (int i = 0; i < packages.length; i++) {
				
				System.out.println("check " + packages[i] + ": " + wasDelivery[i] + " "+elementsMortorcycle+" "+weighMotorcycle);
				if( wasDelivery[i]==0 && elementsMortorcycle<=2 && ((packages[i]+weighMotorcycle)<maxWeight) ) {
					
					System.out.println("Put on motorcycle: "+ packages[i]);
					elementsMortorcycle++;
					weighMotorcycle += packages[i];
					wasDelivery[i] = 1;
					elementsToSend--;
					
					
				}else if(packages[i]>maxWeight){
					elementsToSend--;
					System.out.println();
				}
				
			}
			trips++;
			System.out.println("\tDeliver: "+java.util.Arrays.toString(wasDelivery));
			if(elementsToSend==0) {
				finished = true; 
			}
			elementsMortorcycle = 0;
			weighMotorcycle = 0;
		}
		
		return trips;		
				
	}
}
