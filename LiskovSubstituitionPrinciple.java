// it says
// when there is a inheritance(parent child class) then 
// we should be able to replace parent object wiht child and 
// class behaviour should not break it perform same 

interface Bird {

    void fly();

    void walk();
}

class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow Flying");
    }

    @Override
    public void walk() {
        System.out.println("Sparrow Walking");
    }

}

// lets say we made another class penguine

class Penguine implements Bird {

    @Override
    public void walk() {
        System.out.println("Penguine walking");
    }

    @Override
    public void fly() {
        System.out.println("Penguine Cannot Fly");
    }
}

class Mian {
    public void function(Bird b) {
        b.fly();
        b.walk();
    }

    void main() {
        Sparrow s = new Sparrow();
        s.fly();
        s.walk();
        function(s);
    }

    // in above instead of Bird if we
    // pass Sparrow then it should work

}

// solution is to create a separate interface
interface NonFlyAble {
    void walk();
}

interface FlyAble extends NonFlyAble {

    void fly();

    void walk();
}

// now for flyable and onflyable issue is solved
// now child object can be on place of parent objects