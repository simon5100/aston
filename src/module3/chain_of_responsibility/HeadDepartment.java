package module3.chain_of_responsibility;

import java.util.Random;
import java.util.Set;

public class HeadDepartment extends ApprovalHandler {


    public HeadDepartment(String name, Set<StatementType> type) {
        super(name, type);
    }

    @Override
    public void sendForApproval(StatementType type) {
        System.out.println("Это уже в правительство");
    }

    @Override
    public void approve(StatementType type) {

        random = new Random();
        int probability = random.nextInt(111);

        if (probability > 10) {
            System.out.println("Заявление согласованно начальником управления");
        } else {
            System.out.println("Начальник упарвления отклонил заявлене");
        }

    }
}
