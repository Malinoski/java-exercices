package am2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Drones {
	
	public class Drone{
		int id;
		int range;
		
		public Drone(int id, int range) {
			this.setId(id);
			this.setRange(range);
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getRange() {
			return range;
		}
		public void setRange(int range) {
			this.range = range;
		}
		
	}
	
	public Drone createDrone(int id, int range)	{
		return new Drone(id, range);
	}
	
	public static void main(String args[]) {
		
		Drones exercice = new Drones();
		
		Integer numberOfRequiredDrones = 3;
		
		List<Drone> drones = new ArrayList<>();
		drones.add(exercice.createDrone(4,11));
		drones.add(exercice.createDrone(2,15));
		drones.add(exercice.createDrone(5,16));
		drones.add(exercice.createDrone(3,40));
		drones.add(exercice.createDrone(1,20));
		drones.add(exercice.createDrone(9,60));
		drones.add(exercice.createDrone(6,22));
		
		List<Integer> inMaintenanceDrones = Arrays.asList(3, 6, 2);
		
		List<Integer> result = exercice.greatestFlightRangeDrones(numberOfRequiredDrones, drones, inMaintenanceDrones);
		System.out.println("Result: "+result);
				
	}
	
	public List<Integer> greatestFlightRangeDrones(Integer numberOfRequiredDrones, List<Drone> drones, List<Integer> inMaintenanceDrones) {
		
		List<Integer> dronesInNotMaintanance = new ArrayList<>();
		
		// Create drone list in not maintanance
		for (Drone drone : drones) {
			System.out.println("Check drone: "+drone.getId());
			
			// In maintance?
			boolean inMaintance = false; 
			for (Integer integer : inMaintenanceDrones) {
				if(drone.getId()==integer) {
					inMaintance = true;
				}					
			}
			System.out.println("\t In maintance: "+inMaintance);
			
			if(!inMaintance) {
				dronesInNotMaintanance.add(drone.getId());
			}
				
		}
		
		// Sort in reverse order
		Collections.sort(dronesInNotMaintanance,Collections.reverseOrder());
		
		// Create list os required number of drones
		List<Integer> result = new ArrayList<>();
		int count = 0;
		for (Integer integer : dronesInNotMaintanance) {
			if(count<numberOfRequiredDrones) {
				result.add(integer);
			}	
			count++;
		}
		
		// Result
		return result;
				
	}
}


