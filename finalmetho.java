class bike{
public void topspeed(){
    System.out.println("bike runing at top speed of 12kmph");
}
}
class  honda extends bike{

    public void topspeed(){
 System.out.println("honda runing at top speed of 240kmph");
    }
}

public class finalmetho {
 public static void main(String[] args) {
    honda cbz=new honda();
      cbz.topspeed();
 }   
}
