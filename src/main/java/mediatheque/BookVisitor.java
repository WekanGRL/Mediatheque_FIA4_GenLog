package mediatheque;

public class BookVisitor implements ItemVisitor{
    @Override
    public void visit(Book book) {
        book.print();
    }

    @Override
    public void visit(CD cd){
        // do nothing
    }
}
