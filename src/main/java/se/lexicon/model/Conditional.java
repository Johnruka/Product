package se.lexicon.model;

public interface Conditional {
    <Product> boolean test (Product p);
}
