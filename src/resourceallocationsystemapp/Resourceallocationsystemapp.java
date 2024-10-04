package resourceallocationsystemapp;
import java.util.*;
public class Resourceallocationsystemapp {
	        Scanner scanner = new Scanner(System.in);

	            public static void main(String[] args) {
	                Scanner scanner = new Scanner(System.in);
	                Map<String, Double> allocations = new HashMap<>();
	                
	                System.out.print("Enter your total budget: ");
	                double totalBudget = scanner.nextDouble();
	                double remainingBudget = totalBudget;

	                while (remainingBudget > 0) {
	                    System.out.print("Enter category name (or 'exit' to finish): ");
	                    String category = scanner.next();
	                    
	                    if (category.equalsIgnoreCase("exit")) {
	                        break;
	                    }

	                    System.out.print("Enter amount to allocate for " + category + ": ");
	                    double amount = scanner.nextDouble();

	                    if (amount > remainingBudget) {
	                        System.out.println("You do not have enough budget. Remaining budget: " + remainingBudget);
	                    } else {
	                        allocations.put(category, amount);
	                        remainingBudget -= amount;
	                        System.out.println("Allocated " + amount + " to " + category + ". Remaining budget: " + remainingBudget);
	                    }
	                }

	                System.out.println("\nFinal Allocations:");
	                for (Map.Entry<String, Double> entry : allocations.entrySet()) {
	                    System.out.println(entry.getKey() + ": " + entry.getValue());
	                }

	                System.out.println("Remaining Budget: " + remainingBudget);
	                scanner.close();
	            }
	        }



	    
	

