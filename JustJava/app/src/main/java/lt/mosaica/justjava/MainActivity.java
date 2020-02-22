package lt.mosaica.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(createOrderSummary(price));

/*        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);*/
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }


    /**
     * Calculate the price of the order.
     *
     * @return total price
     */
    private int calculatePrice() {
        return quantity * 5;

    }

    /**
     * Create summary of the order.
     *
     * @param price of the order
     * @return total price
     */
    private String createOrderSummary(int price) {
        String priceMessage = "Name: Captain Kunal";
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal $" + price;
        priceMessage += "\nThank you";
        return priceMessage;
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        quantity = 1 + quantity;
        display(quantity);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        int someQuantity = 100;
        displayQuantity(someQuantity);
    }

    private void displayQuantity(int numero) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numero);
    }




    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);  // cos parameter is integer - this line or ->
        // -> this - quantityTextView.setText(String.valueOf(number));

    }


}
