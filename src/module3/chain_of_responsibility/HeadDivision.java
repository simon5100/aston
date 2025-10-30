package module3.chain_of_responsibility;

import java.util.Random;
import java.util.Set;

public class HeadDivision extends ApprovalHandler {

    public HeadDivision(String name, Set<StatementType> type) {
        super(name, type);
    }

    @Override
    public void sendForApproval(StatementType type) {
        nextHandler.approve(type);
    }

    @Override
    public void approve(StatementType type) {

        random = new Random();
        int probability = random.nextInt(111);

        if (!typesApplicationsForApproval.contains(type)) {
            System.out.println("Переданно зам начальника управления на согласование");
            this.nextHandler.approve(type);
        } else if (probability > 10) {
            System.out.println("Заявление согласованно начальником отдела и переданно зам начальника управления на согласование");
            this.nextHandler.approve(type);
        } else {
            System.out.println("Начальник отдела отклонил заявлене");
        }
    }
}
