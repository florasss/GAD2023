package patterns.visitor;

public interface Visitor {
    public void visit(Book book);
    public void visit(Song Song);
    public void visit(Film film);


}
