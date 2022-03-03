package Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    double price;

    public Product( int id, String name, double price ){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class filterDemo4 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add( new Product(1,"Hp",25000) );
        productList.add( new Product(2,"Lenevo",35000) );
        productList.add( new Product(3,"Asus",45000) );
        productList.add( new Product(4,"Macbook",55000) );

        // filtering the object 
        productList.stream().filter( p -> p.name == "Asus").forEach(pr -> System.out.println(pr.price));

        List<String> value =  productList.stream().filter( p -> p.name == "Asus").map( n -> n.name ).collect(Collectors.toList());
        System.out.println(value);
    }
    
}
