package generics;


import java.util.Objects;

public class Account <T> implements Accountable {

    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public Account() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account<?> account = (Account<?>) o;
        return this.getSum() == account.getSum() && this.getId().equals(account.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSum());
    }
}
