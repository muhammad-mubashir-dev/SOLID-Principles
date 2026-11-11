
// second last principle of SOLID
// it says a class should not forced to implement the mehtods
// that are needed by it .. make the smaller specific interface

interface Employee {
    void writeCode();

    void testCode();

    void deployCode();
}

// its task is only write code but it has to implemt other function
// . it should not be here
class BackendEngineer implements Employee {

    @Override
    public void writeCode() {
        System.out.println("writing code");
    }

    @Override
    public void testCode() {
        System.out.println("testing code");
    }

    @Override
    public void deployCode() {
        System.out.println("deploying Code");
    }

}

class QAEngineer implements Employee {

    @Override
    public void writeCode() {
        System.out.println("writing code");
    }

    @Override
    public void testCode() {
        System.out.println("testing code");
    }

    @Override
    public void deployCode() {
        System.out.println("deploying Code");
    }
}

class DevOpsEngineer implements Employee {
    @Override
    public void writeCode() {
        System.out.println("writing code");
    }

    @Override
    public void testCode() {
        System.out.println("testing code");
    }

    @Override
    public void deployCode() {
        System.out.println("deploying Code");
    }
}

// solution make separate specific interface like

interface Coder {
    void writeCode();
}

interface Tester {
    void testCode();
}

interface Deployer {
    void deployCode();
}
