package org.example.factory;

public interface IBankFactory {
    IBank getBank(String bankCode);
}
