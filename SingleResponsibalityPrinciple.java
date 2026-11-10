// SRP is first principle from SOLID
// this says class should have one reason to change
// in simple meaning it should have one responsibily

// problem class example
//it has too many responsibalities
//order, email,and payment
class OrderService {

    void addOrder() {
        System.out.println("Order added");
    }

    void sendEmail() {
        System.out.println("Email send Succefuly");
    }

    void processPayment() {
        System.out.println("Payment is processing");
    }
}

// solution is to make class for single resposible according to SRP=>Single
// Resposibality Principle

// make separate class for each responsibality
class Order {
    void addOrder() {
        System.out.println("Order added");
    }
}

class Payment {
    void processPayment() {
        System.out.println("Payment is processing");
    }
}

class Notification {
    void sendEmail() {
        System.out.println("Email send Succefuly");
    }
}

// Note-: it does not mean that it should have 1 method
// it means it should have one business related functionalities
// like in order class can be removeOrder() updateorder() similerly for others