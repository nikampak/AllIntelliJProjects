package Repl.it_232_Overriding1_Education;

public class LawSchool extends EducationalInstitution{

    public LawSchool(){
        super(3);
    }

    @Override
    public String graduationRequirements() {
        return super.graduationRequirements()+" and passing the bar";
    }
}
