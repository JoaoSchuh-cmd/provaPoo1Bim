package prova1Bim;

import java.util.Scanner;

public class StorageControl {
	double price, newPrice;
	int discount, storageQuantity, i = 0;
	String brand, color, id, storageMap;
	
	void operation() {
		Scanner opt = new Scanner(System.in);
		
		System.out.println("Choose an operation, please: ");
		System.out.println
		(
		  "[1] Verify Product Info \n" 
		+ "[2] Change Product Info"
		);
		
		int option = opt.nextInt();
		if (option == 1) {i++; productInfo();}
		if (option == 2) {selectProductInfoToChange();};
	}

	void selectProductInfoToChange() {
		System.out.println("Select any product info to change: \n");
		System.out.println(
				"ID \n"
				+ "Storage Map \n"
				+ "Color \n"
				+ "Price \n"
				+ "Brand \n"
				+ "Quantity in stock \n");
		Scanner slcInf = new Scanner(System.in);
		String infoToChange = slcInf.nextLine();
		
		switch (infoToChange) {
			case "ID":
				System.out.print("Write a new ID for the product selected: ");
				Scanner newId = new Scanner(System.in);
				id = newId.nextLine();
				updatedProductInfo();
				break;
			case "Storage Map":
				System.out.print("Write a new Storage Map for the product selected: ");
				Scanner newStMap = new Scanner(System.in);
				storageMap = newStMap.nextLine();
				updatedProductInfo();
				break;
			case "Color":
				System.out.print("Write a new Color for the product selected: ");
				Scanner newColor = new Scanner(System.in);
				color = newColor.nextLine();
				updatedProductInfo();
				break;
			case "Price":
				System.out.print("Write a new Price for the product selected: ");
				Scanner newPrice = new Scanner(System.in);
				price = newPrice.nextDouble();
				updatedProductInfo();
				break;
			case "Brand":
				System.out.print("Write a new Brand for the product selected: ");
				Scanner newBrand = new Scanner(System.in);
				brand = newBrand.nextLine();
				updatedProductInfo();
				break;
			case "Quantity in Stock":
				System.out.print("Write a new Quantity in Stock for the product selected: ");
				Scanner newQuantity = new Scanner(System.in);
				storageQuantity = newQuantity.nextInt();
				updatedProductInfo();
				break;
		}
		
	}
	
	void productInfo() {
		System.out.println("Product Info:");
		System.out.println("ID: " + id);
		System.out.println("Storage Map: " + storageMap);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Brand: " + brand);
		System.out.println("Quantity in stock: " + storageQuantity);
		
		if (i == 1) {
		System.out.println("This product have discount? [Y/N]");
		Scanner hd = new Scanner(System.in);
		String haveDiscount = hd.nextLine();
		switch (haveDiscount) {
			case "Y":
				i++;
				System.out.println("How much discount?");
				Scanner dv = new Scanner(System.in);
				discount = dv.nextInt();
				calculateDiscount();
				updatedProductInfo();
				break;
			case "N":
				i++;
				break;
		
		}} else {
		System.out.println("Would you like to do another operation? [Y/N]");
		Scanner ans = new Scanner(System.in);
		String answer = ans.next();
		switch (answer) {
			case "Y":
				operation();
				break;
			case "N":
				System.out.println("Thank you for using our services. Have a nice day :)");
				break;
		}
		}
	}
	
	void updatedProductInfo() {
		productInfo();
	}
	
	double calculateDiscount() {
		newPrice = price*discount/100;
		price = price - newPrice;
		return price; 
	}
	
	public static void main(String[] args) {
		StorageControl whiteShoe = new StorageControl();
		StorageControl blackShoe = new StorageControl();
		StorageControl greyShoe = new StorageControl();
		
		StorageControl whiteTshirt = new StorageControl();
		StorageControl blackTshirt = new StorageControl();
		StorageControl greyTshirt = new StorageControl();
			
		StorageControl whiteSuit = new StorageControl();
		StorageControl blackSuit = new StorageControl();
		StorageControl greySuit = new StorageControl();
		
		//*******************************************SHOES 
		whiteShoe.id = "152SHE"; 
		whiteShoe.storageMap = "12SHE13WH";
		whiteShoe.color = "White";
		whiteShoe.price = 300;
		whiteShoe.brand = "Nike";
		whiteShoe.storageQuantity = 150;
		
		blackShoe.id = "153SHE"; 
		blackShoe.storageMap = "12SHE13BL";
		blackShoe.color = "Black";
		blackShoe.price = 350;
		blackShoe.brand = "Nike";
		blackShoe.storageQuantity = 150;
		
		greyShoe.id = "154SHE"; 
		greyShoe.storageMap = "12SHE13GY";
		greyShoe.color = "Grey";
		greyShoe.price = 250;
		greyShoe.brand = "Nike";
		greyShoe.storageQuantity = 150;
		
		//*******************************************TSHIRT 
		whiteTshirt.id = "152TSH"; 
		whiteTshirt.storageMap = "12TSH13WH";
		whiteTshirt.color = "White";
		whiteTshirt.price = 270;
		whiteTshirt.brand = "Calvin Klein";
		whiteTshirt.storageQuantity = 200;
		
		blackTshirt.id = "153TSH"; 
		blackTshirt.storageMap = "12TSH13BL";
		blackTshirt.color = "Black";
		blackTshirt.price = 280;
		blackTshirt.brand = "Calvin Klein";
		blackTshirt.storageQuantity = 190;
		
		greyTshirt.id = "154TSH"; 
		greyTshirt.storageMap = "12TSH13GY";
		greyTshirt.color = "Grey";
		greyTshirt.price = 200;
		greyTshirt.brand = "Calvin Klein";
		greyTshirt.storageQuantity = 250;
		
		//*******************************************SUITS 
		whiteSuit.id = "152ST"; 
		whiteSuit.storageMap = "12ST13WH";
		whiteSuit.color = "White";
		whiteSuit.price = 2700;
		whiteSuit.brand = "Giorgio Armani";
		whiteSuit.storageQuantity = 300;
		
		blackSuit.id = "153ST"; 
		blackSuit.storageMap = "12ST13BL";
		blackSuit.color = "Black";
		blackSuit.price = 2800;
		blackSuit.brand = "Giorgio Armani";
		blackSuit.storageQuantity = 260;
		
		greySuit.id = "154ST"; 
		greySuit.storageMap = "12ST13GY";
		greySuit.color = "Grey";
		greySuit.price = 200;
		greySuit.brand = "Giorgio Armani";
		greySuit.storageQuantity = 250;
		
		//CALL OPERATION
		System.out.println("Choose a product to do an operation, please: ");
		System.out.println(
				"Avaiable Products: \n"
				+ "White Shoes \n"
				+ "Black Shoes \n"
				+ "Grey Shoes \n"
				+ "\n"
				+ "White Tshirts \n"
				+ "Black Tshirts \n"
				+ "Grey Tshirts \n"
				+ "\n"
				+ "White Suits \n"
				+ "Black Suits \n"
				+ "Grey Suits \n"
				);
		
		Scanner productOpt = new Scanner(System.in);
		String selectProduct = productOpt.nextLine();
		
		switch (selectProduct) {
			case "White Shoes":
				whiteShoe.operation();
				break;
			case "Black Shoes":
				blackShoe.operation();
				break;
			case "Grey Shoes":
				greyShoe.operation();
				break;
			case "White TShirt":
				whiteTshirt.operation();
				break;
			case "Black TShirt":
				blackTshirt.operation();
				break;
			case "Grey TShirt":
				greyTshirt.operation();
				break;
			case "White Suits":
				whiteSuit.operation();
				break;
			case "Black Suits":
				blackSuit.operation();
				break;
			case "Grey Suits":
				greySuit.operation();
				break;
		}
	}
}