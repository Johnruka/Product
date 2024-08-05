package se.lexicon.model;

@FunctionalInterface
public interface Action {
    <Product> void  execute (Product p);
}
