import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bank) {
        this.name = bank;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String name) {
        for (Branch b : branches) {
            String currentName = b.getName();
            if (currentName.equals(name)) {
                return b;
            }
        }
        return null;
    }
    public boolean addBranch(String name) {
        Branch branch = findBranch(name);
        if (branch == null) {
            return branches.add(new Branch(name));
        }
        return false;
    }

    // Iffy about this function
    public boolean addCustomer(String name, String customer, double transaction) {
        Branch foundBranch = findBranch(name);
        if (foundBranch != null) {
            return foundBranch.newCustomer(customer, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, String customer, double transaction) {
        Branch branch = findBranch(name);
        if(branch != null){
            return branch.addCustomerTransaction(customer,transaction);
            // return true;

        }
        return false;
    }

    public boolean listCustomers(String name, boolean printTransactions) {
        Branch searchedBranch = findBranch(name);
        if (searchedBranch == null) {
            return false;
        }

        for (Branch b : branches) {
            ArrayList<Customer> customers = b.getCustomers();
            System.out.println("Customer details for branch " + b.getName());
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                String customerName = customer.getName();
                ArrayList<Double> transactions = customer.getTransactions();
                System.out.println("Customer: " + customerName + "[" + (i+1) + "]");

                if (printTransactions) {
                    System.out.println("Transactions");

                    for (int j = 0; j < transactions.size(); j++) {
                        double amount = transactions.get(j);
                        System.out.println("[" + (j+1) + "]" + " Amount " + amount);
                    }
                }
            }
        }
        return true;
    }
}

/* Each Bank has an array of branches
   Each Branch has an array of customers
   Each customer has an array of transactions

 */