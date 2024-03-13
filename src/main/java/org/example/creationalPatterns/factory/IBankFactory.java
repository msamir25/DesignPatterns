package org.example.creationalPatterns.factory;

public interface IBankFactory {
    IBank getBank(String bankCode);
}
