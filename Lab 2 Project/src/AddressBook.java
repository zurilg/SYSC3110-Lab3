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
            System.out.printf("Searching address book for %s.\nName: %s\nAge:%d\n", name, book.get(name).getName(), book.get(name).getAge());
        else
            System.out.println("\nBuddy doesn't exit.");
    }

    public static void main(String[] args){
        BuddyInfo bob = new BuddyInfo("Bob", 21);
        BuddyInfo jim = new BuddyInfo("Jim", 23);

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
