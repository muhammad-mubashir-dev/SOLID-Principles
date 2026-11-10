// Second Principle of the SOLID Principles
// it syas class should be open for extension and 
// closed for modification 

// issue examples
// in future if we add another type then 
// we have o cahnge exesting function 
class Notificaion {

    void notify(String type) {

        if (type == "SMS") {
            System.out.println("Sending SMS Notification");
        } else if (type == "Email") {
            System.out.println("Sending email Message");
        } else {
            System.out.println("Message send");
        }
    }
}

// we can solve this by making sepecific class
// as below is given example

interface NotificationService {
    public void sendMessage();
}

class SMSNotification implements NotificationService {

    @Override
    public void sendMessage() {
        System.out.println("Sending SMS Notification");
    }
}

class EmailNotification implements NotificationService {
    @Override
    public void sendMessage() {
        System.out.println("Sending Email Notification");
    }
}
