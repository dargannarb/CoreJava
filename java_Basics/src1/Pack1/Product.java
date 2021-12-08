package Pack1;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class Product {
		private int persontype;
		private String productname;
		private int quantity;
		private double price;
		private double totalPrice;

		Product(int in, String pname, int qty, double price, double totalPrice) {
			this.persontype = in;
			this.productname = pname;
			this.quantity = qty;
			this.price = price;
			this.totalPrice = totalPrice;
		}

		public int getPtype() {
			return persontype;
		}

		public String getPname() {
			return productname;
		}

		public int getQty() {
			return quantity;
		}

		public double getPrice() {
			return price;
		}

		public double getTotalPrice() {
			return totalPrice;
		}

		public static void displayFormat() {
			System.out.print("\nName      Quantity    Price   Total Price\n");
		}

		public void display() {
			System.out.format("%-9s %8d %10.2f %10.2f\n", productname, quantity, price, totalPrice);
		}
	}

