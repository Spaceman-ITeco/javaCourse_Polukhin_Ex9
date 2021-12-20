package generics;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("account212", 5000);
        Account acc2 = new Account(487316, 4300);
        Account acc3 = new Account("account212", 5000);
        Account acc4 = new Account(487316, 4300);
        System.out.println();
        System.out.println(acc1.equals(acc3));
        System.out.println(acc2.equals(acc4));
        Card card1 = new Card(12345, 5100, 418263100);
        Card card2 = new Card("account60928", 4200, "418220001");
        Transaction<Account> tran1 = new Transaction<Account>(acc1, acc2, 1560);
        Transaction<Card> tran2 = new Transaction<Card>(card1, card2, 780);
        tran1.execute();
        System.out.println(tran1.toString());
        System.out.println(tran1.getClass());
        tran2.execute();
        card1.printFromCard();
        card2.printToCard();
        System.out.println();
        System.out.println(acc1.equals(acc3));
        System.out.println(acc2.equals(acc4));
        Transaction<Card> tran3;
        try {
            tran3 = (Transaction<Card>) tran2.clone();
            tran3.execute();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    }
