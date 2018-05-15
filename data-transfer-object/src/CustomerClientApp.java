import java.util.ArrayList;
import java.util.List;

/**
 * 출처 - https://github.com/iluwatar/java-design-patterns/tree/master/data-transfer-object
 * <p>
 * Created by ethan.kim on 2018. 5. 15..
 */
public class CustomerClientApp {

    public static void main(String[] args) {
        List<CustomerDto> customers = new ArrayList<>();
        CustomerDto customer1 = new CustomerDto("1", "Kelly", "Brown");
        CustomerDto customer2 = new CustomerDto("2", "Alfonso", "Bass");
        customers.add(customer1);
        customers.add(customer2);

        CustomerResource customerResource = new CustomerResource(customers);

        System.out.println("All customers:-");
        customerResource.getAllCustomers()
                .forEach(customer -> System.out.println(customer.getFirstName()));

        System.out.println("-----------------");

        customerResource.delete(customer1.getId());
        customerResource.getAllCustomers()
                .forEach(customer -> System.out.println(customer.getFirstName()));

        System.out.println("-----------------");

        CustomerDto customer3 = new CustomerDto("3", "Lynda", "Blair");
        customerResource.save(customer3);
        customerResource.getAllCustomers()
                .forEach(customer -> System.out.println(customer.getFirstName()));
    }
}
