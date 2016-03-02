
public class Calculate {
	
	public Double mpsToKmph(double num1){
		double meterpersec = num1;
		double kmperhour = (meterpersec * 18)/5;
		System.out.println("Converting "+meterpersec+" from meterpersec to kmperhour "); 
		return kmperhour;
	}
	public Double kmphToMps(double num1){
		double kmperhour = num1;
		double meterpersec = (kmperhour * 5)/18;
		System.out.println("Converting "+kmperhour+" from kmperhour to meterpersec "); 
		return meterpersec;
	}

}
