package module3.chain_of_responsibility;

import java.util.Random;
import java.util.Set;

public abstract class ApprovalHandler {

    protected ApprovalHandler nextHandler;
    protected String name;
    protected Set<StatementType> typesApplicationsForApproval;

    //Для разнообразия результатов
    protected Random random;

    public ApprovalHandler(String name, Set<StatementType> type) {
        this.name = name;
        this.typesApplicationsForApproval = type;
    }

    public void setNextHandler(ApprovalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void sendForApproval(StatementType type);

    public abstract void approve(StatementType type);

    public ApprovalHandler getNextHandler() {
        return nextHandler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<StatementType> getTypesApplicationsForApproval() {
        return typesApplicationsForApproval;
    }

    public void setTypesApplicationsForApproval(Set<StatementType> typesApplicationsForApproval) {
        this.typesApplicationsForApproval = typesApplicationsForApproval;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
