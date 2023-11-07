package core.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import customerManagementSystem.core.Customer;
import customerManagementSystem.core.ServicePlan;
import static java.time.LocalDate.*;
public class CustomerUtils {
	public static List<Customer> populateCustomer(){
			List<Customer> customers = new ArrayList<>();
			customers.add(new Customer("Aayush","Kumar","ayushfeb2000@gmail.com","geeks",1000,parse("2001-12-02"),ServicePlan.SILVER));
			customers.add(new Customer("Goutam","Tak","goutamtak1997@gmail.com","goutam",2000,parse("1998-02-25"),ServicePlan.GOLD));
			customers.add(new Customer("Haram","Sihor","akh@gmail.com","geeks",5000,parse("1998-02-25"),ServicePlan.DIAMOND));
			customers.add(new Customer("Govinda","tak","govindatak19@gmail.com","govinda",10000,parse("2002-01-02"),ServicePlan.PLATINUM));
			
			customers.add(new Customer("Rohan","Prajapati","rohankbc2@gmail.com","rihan",1000,parse("2003-09-12"),ServicePlan.SILVER));
			customers.add(new Customer("Nikhilesh","Sharma","snikhilesh694@gmail.com","azgar",2000,parse("2000-07-22"),ServicePlan.GOLD));
					
		return customers;
	}
	
	
	public static List<Customer> removePlan(List<Customer> customers,String plan) throws IllegalArgumentException{
		      ServicePlan spPlan = ServicePlan.valueOf(plan.toUpperCase());
		      Iterator<Customer> itr = customers.iterator();
		      while(itr.hasNext()) {
		    	  Customer c = itr.next();
		    	  if(c.getPlan()==spPlan) {
		    		  System.out.println("removed Customer"+c);
		    		  itr.remove();
		    	  }
		      }
		     return customers; 
	}
	
	public static void reverseIterator(List<Customer> customers) {
		ListIterator<Customer> itr = customers.listIterator(customers.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
