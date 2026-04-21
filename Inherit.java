class Student {
    int roll_no;
    String name;

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

class Test extends Student {
    int sub1, sub2;

    public Test(int roll_no, String name, int sub1, int sub2) {
        super(roll_no, name);
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
}

class Result extends Test {
    int total;

    public Result(int roll_no, String name, int sub1, int sub2) {
        super(roll_no, name, sub1, sub2);
        this.total = sub1 + sub2;
    }

    public void displayResult() {
        System.out.println("Roll No : " + roll_no);
        System.out.println("Name    : " + name);
        System.out.println("Sub1    : " + sub1);
        System.out.println("Sub2    : " + sub2);
        System.out.println("Total   : " + total);
    }
}

public class Inherit {
    public static void main(String[] args) {
        Result r = new Result(1, "Adesh", 85, 90);
        r.displayResult();
    }
}
