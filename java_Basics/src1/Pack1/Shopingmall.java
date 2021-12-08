package Pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopingmall {
	public static void main(String[] args) {
		System.out.println("             --------->|🙏 WELCOME TO ML SHOPING MALL 🙏|<----------");
		String productName = null;
		int quantity = 0;
		double price = 0.0;
		double totalPrice = 0.0;
		double overAllPrice = 0.0;
		char choice = '0';
		Scanner scan = new Scanner(System.in);
		List<Product> product = new ArrayList<Product>();
		do {
			System.out.println("Enter Person type:-");
			System.out.println("1.men  2.women   3.kid");
			int in = scan.nextInt();
			if (in == 1 || in == 2 || in == 3) {
				System.out.println("Enter product details:-");
				System.out.print("Name: ");
				productName = scan.next();
				System.out.print("Quantity: ");
				quantity = scan.nextInt();
				System.out.print("Price (per item): ");
				price = scan.nextDouble();
				totalPrice = price * quantity;
				overAllPrice += totalPrice;
				product.add(new Product(in, productName, quantity, price, totalPrice));
				System.out.print("you Want to buy more items? (Yes or No): ");
				choice = scan.next().charAt(0);
				scan.nextLine();
			} else {
				System.out.println("enter valid credintials");
			}
		}
		while (choice == 'y' || choice == 'y');
		Product.displayFormat();
		for (Product p : product) {
			p.display();

		}
		System.out.println("Total Price = " + overAllPrice);
		System.out.println("                        --------->|Thanks for shoping🤝|<---------");
		System.out.println("--------->|Have a nice day😁|<------------------------------->|Visit again🙏|<---------");
		scan.close();
	}
}