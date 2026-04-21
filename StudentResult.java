
class Student {
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}


class Test extends Student {
    protected int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void getMarks() {
        System.out.println("Subject 1 Marks : " + sub1);
        System.out.println("Subject 2 Marks : " + sub2);
    }
}


interface Sports {
    int sMarks = 10;   
    void set();
}


class Result extends Test implements Sports {
    int total;

    public void set() {
        total = sub1 + sub2 + sMarks;
    }

    public void display() {
        System.out.println("* Student Result *");
        System.out.println("Roll No         : " + getRollNo());
        getMarks();
        System.out.println("Sports Marks    : " + sMarks);
        System.out.println("Total Marks     : " + total);
    
    }
}


public class StudentResult {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(1);       
        r.setMarks(85, 90);     
        r.set();                
        r.display();            
    }
}

