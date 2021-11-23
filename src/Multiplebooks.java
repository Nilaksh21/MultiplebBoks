import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Multiplebooks {


    Integer id, quantity;
    String name, author, publisher;

    public Multiplebooks(Integer id, Integer quantity, String name, String author, String publisher) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    public static void main(String[] args) {

        Map<Integer, Multiplebooks> map = new HashMap<>();
        Multiplebooks b1 = new Multiplebooks(101, 5, "Mc Graw Hill", "Data Structure", "Forouzan");
        Multiplebooks b2 = new Multiplebooks(102, 4, "Prantice hall", "System Analysis & design", "Igor Hawrsyszkiewyez");
        Multiplebooks b3 = new Multiplebooks(103, 2, "Igi Global Inc", "E-Commerce", "Ashish kumar");
        Multiplebooks b4 = new Multiplebooks(104, 8, "Mc Graw Hills", "Core Java", "E Balagurusamy");
        Multiplebooks b5 = new Multiplebooks(105, 1, "Tata Mc Graw Hill", "Networking Technologies", "William Stallings");
        Multiplebooks b6 = new Multiplebooks(106, 3, "TMH", "PHP", "Steven Holzener");


        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        map.put(4, b4);
        map.put(5, b5);
        map.put(6, b6);

        for (Map.Entry<Integer, Multiplebooks> entry : map.entrySet()) {
            int key = entry.getKey();
            Multiplebooks b = entry.getValue();

            System.out.println(key + " Details:");
                int n = 1;

                Scanner sc = new Scanner(System.in);
                for (int i = 0; i<n; i++) {

                    String str = sc.nextLine();
                    System.out.println("Enter the number of books: ");
                    System.out.println(str);

            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);




            }
        }
    }
}
