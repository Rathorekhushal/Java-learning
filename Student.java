public class Student {
    //  static variable....> single copy 
    // all object will share same copy 

    static String college;
    static String collegeAddress="Laknow";
    static{
        System.out.println(college);
        System.out.println(collegeAddress);
        System.out.println("this is static block 1");
    }
    static{
        college="chuntoo college";
        collegeAddress="near lacknow";
    }
    public static void main(String[] args) {
        System.out.println("this is the main method");
        System.out.println(college);
        System.out.println(collegeAddress);
        
    }
}
