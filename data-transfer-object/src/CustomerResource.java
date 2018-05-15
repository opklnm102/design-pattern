import java.util.List;

/**
 * The resource class which serves customer information.
 * This class act as server in the demo. Which has all customer details.
 */
public class CustomerResource {

    private List<CustomerDto> customers;

    public CustomerResource(List<CustomerDto> customers) {
        this.customers = customers;
    }

    public List<CustomerDto> getAllCustomers() {
        return customers;
    }

    public void save(CustomerDto customer) {
        customers.add(customer);
    }

    public void delete(String customerId) {
        customers.removeIf(customer -> customer.getId().equals(customerId));
    }
}
