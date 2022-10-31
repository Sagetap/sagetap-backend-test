import org.junit.jupiter.api.Test;

public class ShoppingCartJavaTest {
    /*
        1) This test fails when it should be passing. Please dig in and find out what is wrong here, and please correct
        and improve any code you see along the way.
     */
    @Test
    public void addAndShowWorks() {
        // Get the shopping cart and add items to it
        new ShoppingCartManagerJava().get().addProduct("Apple");
        new ShoppingCartManagerJava().get().addProduct("Orange");
        // Print the contents of the shopping cart and make sure the output is correct
        assert (new ShoppingCartManagerJava().get().show().contains("Shopping Cart: Apple, Orange"));
    }

    /*
        2) What if we wanted to add prices to this implementation, and a sumOfContents() method to the cart? Can you
        write a test for this?
    */
    @Test
    public void sumOfContentsTest() {

    }

    /*
        3) What if we wanted there to be a single shopping cart _per user_?
            a) What are the implications of this implementation, in terms of where the user's cart contents are stored?
            b) Where might we want to store it instead?
            c) How would we store this information, in terms of request/syntax? Can you write an example of:
                i) Initially storing the data?
                ii) Updating the data?
                iii) Retrieving the data?
     */
}