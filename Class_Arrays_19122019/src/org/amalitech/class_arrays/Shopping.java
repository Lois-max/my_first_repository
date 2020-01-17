package org.amalitech.class_arrays;

import java.util.Scanner;

public class Shopping {


	static String [] listOfStoreItems = {
			"Milo", "Chips", "Candle", "Shoe"};
	
	static double [] priceList = { 20.00,50.00,30.00,29.00};
	
	static double userAccountBalance;
	
	static String specialSearchActivator = "0";
	
	
	public static void main(String[] args) {
					
			double account_balance = 580.0;
			
			
			setUserAccountBalance(account_balance);
			
			tellUserAccountBalance("GHS", getUserAccountBalance());
			
			
			System.out.println("The items currently available are : ");
			
				
			for (int x=0; x<listOfStoreItems.length; x++) {
				System.out.println(Integer.toString(x+1)+ "." + listOfStoreItems[x] + " Price : GHS " + priceList[x]);
				
						
			}
					//setUserAccountBalance(1234.56);
					
					//tellUserAccountBalance();
					// tellUserAccountBalance (9999.00);
					// tellUserAccountBalance("Euro ", getUserAccountBalance());
			
			System.out.println("Please choose an item number to buy, or press " + specialSearchActivator + " to search");
			
			
			
			Scanner scan = new Scanner(System.in);
			String choice = scan.nextLine();
			
			if (inputCheckerValidSelection(choice)){
				
				//we've converted the String back to an integer
				int index_of_item = Integer.parseInt(choice)-1;
				
				String purchaseValidity = "";
				
				if (priceList[index_of_item]> account_balance) {
					
					 purchaseValidity = "Please top up and try again.";
				}else {
				purchaseValidity = "  Balance is enough. You can buy.";
				}
				
				System.out.println("You chose "  + listOfStoreItems[index_of_item] + " and the price is: GH " + priceList[index_of_item]
				+ purchaseValidity);	
			}
			else
				{
				
				 String c = scan.nextLine();
				if( c.equals(specialSearchActivator)) {
				System.out.println("Enter product to search for");
				}
				for (int i=0; i<listOfStoreItems.length; i++) {
				 listOfStoreItems[i] = c;
				
				System.out.println(listOfStoreItems[i]);
				System.out.println(priceList[i]);
				}
				
				}
				
				 System.out.println("Item does not exist");	
				
				 {
						System.out.println("Please enter the right number");
					}
					scan.close();
			}
				
					
				
		
		
				public static void setUserAccountBalance(double currentUserAccountBalance) {
					userAccountBalance = currentUserAccountBalance;
				}
				
				public static double getUserAccountBalance() {
					return userAccountBalance;
				}
				
				public static String balanceStmnt(String currency_str) {
				String outputStatement = "Your account balance is : " + currency_str + "";	
					return outputStatement;
				}
				
				public static void tellUserAccountBalance () {
				
								System.out.println(balanceStmnt("") + getUserAccountBalance());
				}
				
				public static void tellUserAccountBalance (String currency_str, double accountBal) {
					
					System.out.println(balanceStmnt(currency_str) + accountBal);
				
					
			}

				public static boolean inputCheckerValidSelection(String userInput_str) {
					boolean validSel_bool = false;
					for(int x=0;x<listOfStoreItems.length; x++) {
						if(Integer.toString(x+1).equals(userInput_str)) {
							validSel_bool = true;
							break;
						}/*else {
							validSel_bool = false;
						}*/
					}return validSel_bool;
				}
				
				public static void searchItem () {
					//Scanner input = new Scanner(System.in);
					//String test = input.nextLine();
				
					
				}
	}


