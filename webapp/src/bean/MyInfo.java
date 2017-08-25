package bean;

import java.util.Calendar;

public class MyInfo {
   private String name;
   private int age;
   private String agenum;
   public MyInfo(){
      name = "ȫ�浿";
      age = 22;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
public int getAgenum() {
	   int birth_year = -1;
	   try {
		if(Integer.parseInt(agenum.substring(7,8))<3){
			birth_year = Integer.parseInt("19"+agenum.substring(0,2));
		}else{
			birth_year = Integer.parseInt("20"+agenum.substring(0,2));
		}
	} catch (Exception e) {
		return birth_year;
	}
	   Calendar calendar = Calendar.getInstance();
	   int this_year = calendar.get(Calendar.YEAR);
	return this_year - birth_year + 1;
}
public void setAgenum(String agenum) {
	this.agenum = agenum;
}
 
}
