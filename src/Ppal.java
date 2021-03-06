// Java program to Sort ArrayList using Comparator
  
import java.util.*;
  
// create the Shop class
class Shop {
    int ProductNo;
    String name;
    int stock;
  
    // constructor
    Shop(int ProductNo, String name, int stock)
    {
        this.ProductNo = ProductNo;
        this.name = name;
        this.stock = stock;
    }
    
    int getStock() {
    	return this.stock;
    }
    
    String getName() {
    	return this.name;
    }
    
    void setName(String n) {
    	this.name = n;
    }
}
  
// creates the comparator for comparing stock value
//class StockComparator implements Comparator<Shop> {
//  
//    // override the compare() method
//    public int compare(Shop s1, Shop s2)
//    {
//        if (s1.stock == s2.stock)
//            return 0;
//        else if (s1.stock > s2.stock)
//            return 1;
//        else
//            return -1;
//    }
//}
  
class Ppal {
    public static void main(String[] args)
    {
        // create the ArrayList object
        ArrayList<Shop> s = new ArrayList<Shop>();
        s.add(new Shop(423, "Books", 101));
        s.add(new Shop(218, "Pen", 520));
        s.add(new Shop(223, "Pencil", 213));
        s.add(new Shop(512, "Toy", 59));
        s.add(new Shop(723, "Bottle", 10));
  
        @SuppressWarnings("unchecked")
		ArrayList<Shop> s2 = (ArrayList<Shop>) s.clone();
        
        System.out.println("before sorting");
        for (Shop shop : s) {
            System.out.println(shop.stock + " " + shop.name
                               + " " + shop.ProductNo);
        }
        
        System.out.println("\nAfter sorting(sorted by Stock)");
  
        // call the sort function
//        Collections.sort(s, new StockComparator());
//        Collections.sort(s,Comparator.comparing(Shop::getStock));
       	s.sort(Comparator.comparing(Shop::getStock)); 
        for (Shop shop : s) {
            System.out.println(shop.stock + " " + shop.name
                               + " " + shop.ProductNo);
            shop.setName(shop.name+"*");
        }
        System.out.println("---");
        for (Shop shop : s2) {
            System.out.println(shop.stock + " " + shop.name +  " " + shop.ProductNo);
        }
       
    }
}
