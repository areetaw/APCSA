package textExcel;

public class FormulaCell extends RealCell {
	
	public FormulaCell(String text, Location loc) {
		super(text, loc);
	}
		
	@Override
	public String abbreviatedCellText() {
		return String.format("%-10.10s", getDoubleValue());
	}

	@Override
	public String fullCellText() {
		return String.format("%s", super.fullCellText());
	}
	
	public double getDoubleValue() {
		
		String[] formula = super.fullCellText().split(" ");
		int forLen = formula.length;
		double ans = Double.parseDouble(formula[1]);
		
		for(int i = 2; i < forLen-2; i = i+2) {
			if(formula[i].equals("+")){
				ans += Double.parseDouble(formula[i + 1]);
			} else if(formula[i].equals("-")){
				ans -= Double.parseDouble(formula[i + 1]);
			} else if(formula[i].equals("*")){
				ans *= Double.parseDouble(formula[i + 1]);
			} else if(formula[i].equals("/")){
				ans /= Double.parseDouble(formula[i + 1]);
			}
		}
		return ans ;
	}
}