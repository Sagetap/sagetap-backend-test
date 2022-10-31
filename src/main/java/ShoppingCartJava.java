import java.util.ArrayList;
import java.util.List;

public class ShoppingCartJava {
    private List<String> p = new ArrayList<String>();

    public void addProduct(String product) {
        p.add(product);
    }
    
    public String show() {
        var string = "";

        for (String p : p) {
            string = string + p + ", ";
        }

        return "Shopping Cart: " + string;
    }
}