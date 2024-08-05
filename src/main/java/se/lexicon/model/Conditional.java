package se.lexicon.model;

@FunctionalInterface
public interface Conditional {
    boolean test(Product product);
}


