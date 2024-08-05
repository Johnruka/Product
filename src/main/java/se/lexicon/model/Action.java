package se.lexicon.model;

@FunctionalInterface
public interface Action {
    void execute(Product product);
}

