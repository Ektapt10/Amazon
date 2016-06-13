package amazon;

import dealer.Product;

public class Modifiedproduct extends Product
{ 
    
	public Modifiedproduct() {
		super();
	}

	public Modifiedproduct(String variety) {
		super();
		this.variety = variety;
	}

	String variety;

	public String getVariety() {
		return variety;
	}

	@Override
	public String getName() {
		return super.getName();
	}


	public void setPrice(int Price) {
		if(Price>20)
		{
		System.out.println("the Price is less");
		}
		else{
			System.out.println("the price is more");
		}
		
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}
                      
	
	
}
