public class productsDB {
   private ArrayList<products> pList;
            
    public productsDB() {
        pList=new ArrayList<>();
    }
    
    
    public boolean add(products p){
        return pList.add(p);       
    }
    
    public products get(String pID){
        for(products p:pList){
            if(p.getProductID()==pID){
                return p;
            }
        }
        return null;
    }
    
    public boolean delete(String pID){
       products p= get(pID);
       if(p!=null){
           return pList.remove(p);
       }
       return false;
    }
    
    public boolean update(products pp){
       products p= get(pp.getProductID());
       if(p!=null){
            pList.remove(p);
            pList.add(pp);
            return true;
       }
       return false;
    }
    
    public ArrayList<products> getAll(){
        return pList;
    } 
}
