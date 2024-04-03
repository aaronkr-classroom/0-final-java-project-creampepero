
public class CartItem {
	private String[] itembook = new String[7];
	private String bookID;
	private int quantity;
	private int totalPrice;
	
	public CartItem() {
		
	}
		public CartItem(String[] book) {  
			this.itembook = book;
			this.bookID = book[0];
			this.quantity = 1;
			updateTotalPrice();
		}
	public String[] getItembook(String[]itembook) {
		return itembook;
	}
	public void setItembook(String[]itembook) { 
		this.itembook = itembook;
}
	public String getBookID() {
		return bookID;
	}
	public void setbookID(String bookID) {
		this.bookID = bookID;
		this.updateTotalPrice();
	}
	public int getquantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void updateTotalPrice() {
		totalPrice = Integer.parseInt(this.itembook[2]) * this.quantity;
	}
}