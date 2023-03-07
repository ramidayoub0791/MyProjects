package homeWorks;

public class i {
    public static void main(String[] args) {
        /*    1) Create a 2D array(shorter way) in which first array will consist of 4 names and second array will
        contain grades.Then your program should print name of the students that has A and B grade*/
        String[][] names={{"Rami","Sam","Jack","Mike"},{"A","B"}};
        System.out.println("the grade of the student "+names[0][0]+" is "+names[1][0]);
        System.out.println("the grade of the student "+names[0][1]+" is "+names[1][1]);
        System.out.println("the grade of the student "+names[0][2]+" is "+names[1][1]);
        System.out.println("the grade of the student "+names[0][3]+" is "+names[1][0]);
    }
}
