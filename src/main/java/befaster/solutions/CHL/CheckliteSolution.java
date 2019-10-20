package befaster.solutions.CHL;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Strings;

import befaster.runner.SolutionNotImplementedException;

public class CheckliteSolution {
	
	List<SKU> memorySKUs = null;
	
	/**
	 * In real applications this data is available in the DB or other memory format.
	 */
	public CheckliteSolution(){
		memorySKUs = new ArrayList<SKU>();
		SKU sku1 = new SKU();
		sku1.setSkuName("A");
		sku1.setPrice(50);
		Discount disc1 = new Discount();
		disc1.setNumberOfItems(3);
		disc1.setPrice(130);
		sku1.setDiscount(disc1);
		memorySKUs.add(sku1);
		
		SKU sku2 = new SKU();
		sku2.setSkuName("B");
		sku2.setPrice(30);
		Discount disc2 = new Discount();
		disc2.setNumberOfItems(2);
		disc2.setPrice(45);
		sku2.setDiscount(disc2);
		memorySKUs.add(sku2);
		
		SKU sku3 = new SKU();
		sku3.setSkuName("C");
		sku3.setPrice(20);
		memorySKUs.add(sku3);
		
		SKU sku4 = new SKU();
		sku4.setSkuName("D");
		sku4.setPrice(15);
		memorySKUs.add(sku4);
	}
	
    public Integer checklite(String skus) {
    	if(Strings.isNullOrEmpty(skus) || !skus.equals(skus.toUpperCase())){
    		return -1;
    	}
    	return calculateSkusWithDiscounts(skus);
    }
    
    /**
     * A better approach can be found but I am running out of time.
     * @param skus
     * @return Integer
     */
    private Integer calculateSkusWithDiscounts(String skus){
    	long countA = skus.chars().filter(ch -> ch == 'A').count();
    	long countB = skus.chars().filter(ch -> ch == 'B').count();
    	long countC = skus.chars().filter(ch -> ch == 'C').count();
    	long countD = skus.chars().filter(ch -> ch == 'D').count();
    	
    	return null;
    }
    
    class SKU{
    	
    	private String skuName;
    	private Integer price;
    	private Discount discount;
		public String getSkuName() {
			return skuName;
		}
		public void setSkuName(String skuName) {
			this.skuName = skuName;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public Discount getDiscount() {
			return discount;
		}
		public void setDiscount(Discount discount) {
			this.discount = discount;
		}
    }
    
    class Discount{
    	private Integer numberOfItems;
    	private Integer price;
		public Integer getNumberOfItems() {
			return numberOfItems;
		}
		public void setNumberOfItems(Integer numberOfItems) {
			this.numberOfItems = numberOfItems;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
    }
}


