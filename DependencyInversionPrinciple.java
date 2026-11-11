// last principle of SOLID
// it says High level module should not depend on low level.
// both depends on abstractions
// it makes code loosly couple

class MySQL {
    void saveData() {
        System.out.println("data saved");
    }
}

class MongoDB {
    void storeDocument() {
        System.out.println("Document Stored");
    }
}

// tight coupling -
class User {
    MySQL db1 = new MySQL();
    MongoDB db2 = new MongoDB();

    void saveUser() {
        db1.saveData();
    }

    void saveDocument() {
        db2.storeDocument();
    }
}

// loose coupling
// make intermediate abstractions
interface DB {
    void save();
}

class MongoDB1 implements DB {

    @Override
    public void save() {
        System.out.println("documet stored");
    }
}

class MySQL1 implements DB {
    @Override
    public void save() {
        System.out.println("data saved");
    }
}

class User1 {

    private DB db;

    public User1(DB db) {
        this.db = db;
    }

    void saveUser() {
        db.save();
    }
    // now it is flexible adn depednent on the abstraction
}