package chap02.inheritance;

public class Boeing {
		

		public static void main(String[] args) {
			Boeing737 Boeing737 = new Boeing737(); //구분??
			
			System.out.println("#########Boeing737#########");
			System.out.println("speed: " + Boeing737.speed);
			System.out.println("type: " + Boeing737.type);
			System.out.println("Range: " + Boeing737.Range());
			System.out.println("RPM: " + Boeing737.RPM());
			
			System.out.println();
			
			Boeing737 Boeing737MAX = new Boeing737(700, "Middle-range");
			
			System.out.println("#########Boeing737MAX#########");
			System.out.println("speed: " + Boeing737MAX.speed);
			System.out.println("type: " + Boeing737MAX.type);
			System.out.println("Range: " + Boeing737MAX.Range());
			System.out.println("RPM: " + Boeing737MAX.RPM());
			
			System.out.println();
			
			Boeing787 Boeing787 = new Boeing787();
			System.out.println("#########Boeing787#########");
			System.out.println("speed: " + Boeing787.speed);
			System.out.println("type: " + Boeing787.type);
			System.out.println("Range: " + Boeing787.Range());
			System.out.println("RPM: " + Boeing787.RPM());
			
			System.out.println();
			
			Boeing787 NewBoeing787 = new Boeing787(900, "eco-Long-Range");
			System.out.println("#########NewBoeing787#########");
			System.out.println("speed: " + NewBoeing787.speed);
			System.out.println("type: " + NewBoeing787.type);
			System.out.println("Range: " + NewBoeing787.Range());
			System.out.println("RPM: " + NewBoeing787.RPM());
			
			
			
		}

}
