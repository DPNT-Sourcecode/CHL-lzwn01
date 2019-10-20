package befaster.solutions.CHL;

import com.google.common.base.Strings;

import befaster.runner.SolutionNotImplementedException;

public class CheckliteSolution {
    public Integer checklite(String skus) {
    	if(Strings.isNullOrEmpty(skus) || !skus.equals(skus.toUpperCase())){
    		return -1;
    	}
    	return 0;
    }
    
    private Integer calculateSkusWithDiscounts(String skus){
    	
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



