package generics;

import java.util.Objects;

public class Transaction <T extends Accountable> implements Cloneable {

    private T from;
    private T to;
    private int sum;

    Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute(){

        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }
        else{
            System.out.printf("Some error");
        }
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "from account=" + from.getId() +
                ", to account=" + to.getId() +
                ", sum=" + sum +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {return Transaction.super.clone();};
}
