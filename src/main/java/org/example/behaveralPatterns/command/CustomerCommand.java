package org.example.behaveralPatterns.command;

import org.example.behaveralPatterns.command.fx.Command;

public class CustomerCommand implements Command {

    private CustomerService service;

    public CustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
