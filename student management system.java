public class student management system {
    public static void main(String[] args) {
    
//student information
int id = 101;
String name ="Madhu Sudan";
int age = 21;
int quiz = 85;
int assignment = 82;
int exam = 86;
int attendencepercetage =78;
System.out.println("id:"+ id);
System.out.println("name:"+ name);
System.out.println("age:"+ age);
System.out.println("quiz score:"+ quiz);
System.out.println("assignment score:"+ assignment);
System.out.println("exam score:"+ exam);
System.out.println("attendance percentage:"+ attendencepercetage);

//calculate total score and average score
int totalScore = quiz + assignment + exam;
System.out.println("Total score:" + totalScore);
    }
}
