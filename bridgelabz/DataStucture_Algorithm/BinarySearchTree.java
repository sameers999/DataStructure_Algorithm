package bridgelabz.DataStucture_Algorithm;

public class BinarySearchTree {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the total number");
		double number=Utility.inputDouble();
		
		while(number>0)
		{
			double totalNodes=Utility.inputDouble();
			int totalTree=Utility.numberOfBinarySearchTree(totalNodes);//calling the method
			System.out.println(totalTree);
			number--;
		}
		
}
}
