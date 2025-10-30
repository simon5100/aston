package module3.chain_of_responsibility;

import java.util.Set;

public class Consultant extends ApprovalHandler {

    public Consultant(String name, Set<StatementType> type) {
        super(name, type);
    }

    @Override
    public void sendForApproval(StatementType type) {
        this.nextHandler.approve(type);
    }

    @Override
    public void approve(StatementType type) {
        System.out.println("Консультанту не нужно соглавовывать заявление с самим собой");
    }
}
