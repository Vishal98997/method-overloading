class frontenddeveloper{
    public void myskills(){
        System.out.println(" i know html css and js");
    }
}
class fullstackdeveloper extends frontenddeveloper{
    public void myskills(){
        super.myskills();//in case of in method overloading super can be anywhere in child class need not be first 
       //myskills();//recursive call of child myskill method and code will crash
        System.out.println(" i know node mongo and express");
        super.myskills();
    }
}
public class methodoverl {
    public static void main(String[] args) {
        fullstackdeveloper developer=new fullstackdeveloper();
    developer.myskills();
    }
    
}
