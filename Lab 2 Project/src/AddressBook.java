import java.util.Hashtable;

public class AddressBook {
    private Hashtable<String, BuddyInfo> book;
    public AddressBook(){
        book = new Hashtable<>();
    }
    public void addBuddy(BuddyInfo buddy){
        book.put(buddy.getName(), buddy);
    }
    public void removeBuddy(String name){
        if(book.containsKey(name))
            book.remove(name);
        else
            System.out.println("\nCan't remove. Buddy doesn't exist.");

    }

    public void printBuddyInfo(String name){
        if(book.containsKey(name))
            System.out.printf("Name: %s\nAddress:%s\nPhone Number:%s\n", name, book.get(name).getAddress(), book.get(name).getPhoneNumber());
        else
            System.out.println("\nBuddy doesn't exist.\n");
    }

    public static void main(String[] args){
        BuddyInfo bob = new BuddyInfo("Bob", "Carleton", "385-789-3129");
        BuddyInfo jim = new BuddyInfo("Jim", "uOttawa", "412-567-2342");
        BuddyInfo joe = new BuddyInfo("Joe", "Trent", "813-234-3534");

        AddressBook addBook = new AddressBook();
        addBook.addBuddy(bob);
        addBook.addBuddy(jim);

        addBook.printBuddyInfo(jim.getName());

        addBook.removeBuddy(jim.getName());
        addBook.printBuddyInfo(jim.getName());

        addBook.printBuddyInfo(bob.getName());

        addBook.removeBuddy(bob.getName());
        addBook.printBuddyInfo(bob.getName());

        addBook.removeBuddy(bob.getName());
    }
}
