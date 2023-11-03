package com.techelevator;

import com.techelevator.view.VendingMenu;

import java.util.Scanner;


public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String MAIN_MENU_SECRET_OPTION = "*Sales Report";

	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";

	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT, MAIN_MENU_SECRET_OPTION };
	private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION};

	private VendingMenu menu;

	public VendingMachineCLI(VendingMenu menu) {
		this.menu = menu;
	}

	public void run() {

		VendingMachine vendingMachine = new VendingMachine(); //set up the vending machine
		vendingMachine.getInventory(); //Get the inventory

		Scanner scanner = new Scanner(System.in); //****CI: Create a Scanner object to read user input


		boolean running = true;
		while (running) {


			System.out.println("**********************************");
			System.out.println("**********************************");
			System.out.println("**         Umbrella Corp.       **");
			System.out.println("**        Vendo-Matic 800       **");
			System.out.println("**********************************");
			System.out.println("**********************************");
			//*****CI: I mean, why not? lol! ^^



			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			// A switch statement could also be used here.  Your choice.
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items

				//System.out.println(vendingMachine.displayMenuItems());
				vendingMachine.displayMenuItems();

			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase

				System.out.println("Enter dollar amount: "); //CI:*** Prompt user to add money
				double balance = scanner.nextDouble();
				scanner.nextLine(); // Consume the newline character left in the buffer

				choice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
				vendingMachine.setBalance(balance); //CI: **** I changed the $50 to balance

				//System.out.println(vendingMachine.getBalance());  *****CI: I changed this to the line below
				System.out.println("Your current balance: " + vendingMachine.getBalance());



				//****CI: here I've added a while loop to ensure that the user can have the option to keep purchasing item with the same budget
				// create boolean

				boolean purchasing = true;
				while (purchasing) {

					System.out.println("Enter the product code you want to purchase (or type 'DONE' to finish): "); //****CI: prompts user to enter the product code eg. A1
					String productCode = scanner.nextLine(); //***CI: this print is out

					//*****CI: If statement ensures that when the user is done, they can leave the loop
					if (productCode.equalsIgnoreCase("DONE")) {
						purchasing = false;
					} else {
						vendingMachine.purchase(productCode);
						System.out.println("Remaining balance: " + vendingMachine.getBalance());
					}
				}



//****CI: This is the example he gave us in our session:
//				choice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
//				vendingMachine.setBalance(50);
//				System.out.println(vendingMachine.getBalance());
//
//				vendingMachine.purchase("C1");


			}
		}

		scanner.close(); //***CI: we have close the scanner when we're done with it
	}

	public static void main(String[] args) {
		VendingMenu menu = new VendingMenu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
