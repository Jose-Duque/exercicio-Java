package entities;

public class Aluno {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double gradeFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double passOrFailed() {
		if(gradeFinal() < 60) {
			return 60 - gradeFinal();
		}
		return 0;
	}
	
	public String toString() {
		if(gradeFinal() > 60) {
			
			return "Final Grade = " +
					String.format("%.2f", gradeFinal()) +
					" PASS";
		}
		else {
			return "Final Grade = " +
					String.format("%.2f", gradeFinal()) +
					" FAILED "
					+ " MISSING " + String.format("%.2f",passOrFailed()) +
					" POINTS";
					
		}
		
				
	}
}
