package day12_NestEdIf;

public class AgeGroup3 {
    public static void main(String[] args) {
        int age = 17;

        String ageGroup1 = (age >= 1 && age <=2) ? "Infant" : (age >= 3 && age <=5) ? "Toddler"
                            : (age >= 6 && age <=9) ? "Kid" : (age >= 10 && age <=12) ? "Pre-Teen"
                            : (age >= 13 && age <=17) ? "Teenager" : "Young Adult";
        System.out.println(ageGroup1);


    }
}
/*


        }else if(age >= 18 && age <=20){
            ageGroup = "Young Adult";
        }else if(age >= 21 && age <=39){
            ageGroup = "Adult";
        }else if(age >=40 && age <=49){
            ageGroup = "Yong middle-aged adult";
        }else if(age >= 50 && age <=54){
            ageGroup = "Middle-aged adult";
        }else if(age >= 55 && age <=64){
            ageGroup = "Very young senior citizen";
        }else if(age >= 65 && age <=74){
            ageGroup = "Young Senior citizen";
        }else if(age >= 75 && age <=84){
            ageGroup = "Senior citizen";
        }else{
            ageGroup = "Old Senior Citizen";
        }
 */