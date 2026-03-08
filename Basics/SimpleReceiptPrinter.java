/*### Problem 4: Simple Receipt Printer
**Description:** Simulate a store receipt.

**Instructions:**
1. Declare variables: `String item`, `int quantity`, `double price`
2. Compute `total = quantity * price`
3. Print a formatted receipt with item, quantity, price, and total
4. Add a `String storeName` at the top of the receipt
5. *(Bonus)* Add tax (12%) and print the amount after tax

**Sample Output:**
```
===== Juan's Store =====
Item     : Notebook
Quantity : 3
Price    : ₱25.00
Total    : ₱75.00
========================
``` */
public class SimpleReceiptPrinter {
    public static void main(String[] args) {
        
        String storeName = "Jee Shop";
        String item = "Chippy";
        int quantity = 6;
        double price = 13;

        double total = price * quantity;
        double tax = price * 1.12;

        System.out.printf("""
                =====%2s=====
                Item     : %2s
                Quantity : %1d
                Price    : $%.2f
                Total    : $%.2f
                Tax      : $%.2f
                ========================
                """, storeName, item, quantity, price, total, tax);



    }
}
