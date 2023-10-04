class Main {
  public static void main(String[] args) {
		LightBoard sim1 = new LightBoard(100,100); 
		
		System.out.println("Testing Part A");
		System.out.println("Percent On: " +  sim1.percentOn());
		sim1 = new LightBoard(1000,1000); 
		System.out.println("Percent On: " +  sim1.percentOn());
		sim1 = new LightBoard(1000,1000); 
		System.out.println("Percent On: " +  sim1.percentOn());
		
		
		System.out.println("\nTesting Part B");
		LightBoard sim = new LightBoard(); 
		System.out.println("sim.evaluateLight(0, 3) - " + sim.evaluateLight(0, 3));
		System.out.println("sim.evaluateLight(6, 0) - " + sim.evaluateLight(6, 0));
		System.out.println("sim.evaluateLight(4, 1) - " + sim.evaluateLight(4, 1));
		System.out.println("sim.evaluateLight(5, 4) - " + sim.evaluateLight(5, 4));
  }
}