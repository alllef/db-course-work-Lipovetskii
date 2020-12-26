package com.example.dbcourseworkLipovetskii;

import com.example.dbcourseworkLipovetskii.DatabaseEntities.Customers.Customer;
import com.example.dbcourseworkLipovetskii.DatabaseEntities.Customers.CustomerService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class MainView extends VerticalLayout {

    @Autowired
    private final CustomerService customerService;
    final Grid<Customer> grid;

    public MainView(CustomerService customerService) {

        this.customerService = customerService;
        this.grid = new Grid<>(Customer.class);
        add(grid);
        listCustomers();
    }

    private void listCustomers() {
        Customer customer = new Customer("+380957088791","Dmytro","Fuck","bruh37@gmail.com");
        customerService.createCustomer(customer);
        grid.setItems(customerService.findAll());
    }
}
