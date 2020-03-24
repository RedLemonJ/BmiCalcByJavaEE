package mb;



import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named(value="bmiInputMB")
@RequestScoped
public class BmiInputMB{
	String name;
	double height;
	double weight;
	double bmi;
	
	public BmiInputMB() {
		
	}
	
	public String submit() {
		return "BmiInputConfirm";
	}
}
