interface Worker {
    void performDuties();
}

class PersonR {
    String name;
    int id;

    PersonR(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends PersonR implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " cooks delicious meals.");
    }
}

class Waiter extends PersonR implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " serves customers.");
    }
}

public class Q10_RestaurantSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Ramesh", 101);
        Worker waiter = new Waiter("Suresh", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}