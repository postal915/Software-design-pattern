package Visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
