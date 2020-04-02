package mb;



import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import lombok.Data;
import service.BmiCalc;

@Data
@Named(value="bmiInputMB")
@RequestScoped
public class BmiInputMB{
	String name;
	double height;
	double weight;
	double bmi;
	
	@Inject
	BmiCalc bmiCalc;
	
	public BmiInputMB() {
		
	}
	
	public String submit() {
		if (height > 0) {
			bmi = bmiCalc.calcBmi(height, weight);
		} else {
			bmi = 0;
		}
		return "pages/BmiInputConfirm";
	}
}
