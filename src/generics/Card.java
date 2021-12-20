package generics;

public class Card <T> extends Account implements Accountable{

    private T id;
    private T accountId;
    private int sum;

    public T getAccountId() {
        return accountId;
    }

    Card(T id, int sum, T accountId){
        super();
        this.id=id;
        this.sum=sum;
        this.accountId = accountId;
    }
    @Override
    public T getId() {
        return id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum= sum;
    }

    public void printFromCard()
    {System.out.print("Перевод с карты " + getAccountId() + " счет " + getId());}

    public void printToCard()
    {System.out.print(" на карту " + getAccountId() + " счет " + getId());}
}
