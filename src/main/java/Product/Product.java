package product;

/**
 * Created by MARC LAZOLA TORRE on 21/01/2017.
 */
public enum Product {
    CARROT ("Carrot", "", 20, 1.25),
    TOMATO ("Tomato", "", 10, 2.00),
    POTATO ("Potato", "", 30, 3.10);

    private final String name;
    private final String image;
    private final double price;

    private final int initialQuantity;


    Product (String name, String image, int initialQuantity, double price){
        this.image = image;
        this.name = name;
        this.initialQuantity = initialQuantity;
        this.price = price;
    }


    public int getInitialQuantity (){
        return initialQuantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
