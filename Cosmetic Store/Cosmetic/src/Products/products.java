package Products;

public abstract class products{
    private String productID;
    private String productCategory;
    private String productName;
    private String productPrice;
    
    public products(String productID, String productCategory, String productName, String productPrice){
        this.productID=productID;
        this.productCategory=productCategory;
        this.productName=productName;
        this.productPrice=productPrice;
        
        
    }
    
    protected abstract void displayInformation();

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
