package matrixCalculator;

public class MainMenu {
	public static void main(String[] args) {
		MatrixCalc m1 = new MatrixCalc(3, 3);
		MatrixCalc m2 = new MatrixCalc(3, 3);
		
		m1.fillMatrix();
		m2.fillMatrix();
		
		m1.printMatrix();
		m2.printMatrix();
		
		m1.sum(m2);
		
		m1.difference(m2);
		
		m1.transpose();
		
		MatrixCalc m3 = new MatrixCalc(3, 2);
		MatrixCalc m4 = new MatrixCalc(2, 3);
		
		m3.fillMatrix();
		m4.fillMatrix();
		
		m3.product(m4);
		
		
	}
}
