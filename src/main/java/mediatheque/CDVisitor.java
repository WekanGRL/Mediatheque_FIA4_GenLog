package mediatheque;

public class CDVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
        // do nothing
    }

    @Override
    public void visit(CD cd) {
        cd.print();
    }
}
