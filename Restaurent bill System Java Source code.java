import java.util.ArrayList;

public class Bill {
	private ArrayList<String>orderedFood;
	private ArrayList<Integer>orderedQuantity;
	
	public Bill() {
		
		orderedFood =new ArrayList<String>();
		orderedQuantity =new ArrayList<Integer>();
		
	}
	private double totalCost;
	
	public double getTotal() {
		return totalCost;
	}
	
	public void addOrder(String meal,int quantity,String[]dish , double cost[]) {
		
		orderedFood.add(meal);
		orderedQuantity.add(quantity);
		
		for (int i =0;i<dish.length;i++) {
			if (meal.equals(dish[i])) {
				totalCost += quantity*cost[i];
			}
		}
	}
		
	
	
	public void getOrder() {
		for(int i = 0;i<orderedFood.size();i++) {
			System.out.println(orderedFood.get(i)+" "+orderedQuantity.get(i));
		}
	}

}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]dish = {"Idli","Dosa","Vada","Puri","Tea","Cofee"};
		double[]cost = {20.5,30.6,12.5,50.2,15.7,10.6};
		
		Bill myBill = new Bill() ;
		
		myBill.addOrder("Idli",3,dish,cost);
		myBill.addOrder("Dosa",2,dish,cost);
		myBill.addOrder("Tea",2,dish,cost);
		
		myBill.getOrder();
		System.out.println(myBill.getTotal());
	}
}







