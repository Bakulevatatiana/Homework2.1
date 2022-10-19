public class Human {
    int dateOfBirth;
    String name;
   String currentCity;
    String jobTitle;
    Human(String name,int dateOfBirth
    ){
        this.name=name;
        this.dateOfBirth = dateOfBirth;
        currentCity="Информация не указана";
        jobTitle="Информация не указана";

    }
    Human(int dateOfBirth,
    String name,
          String currentCity,String jobTitle){
       if (dateOfBirth>=0) {
           this.dateOfBirth = dateOfBirth;
       }
       else {this.dateOfBirth= 0;}

       if (name!=null){this.name=name;}
       else {this.name=
           "Информация не указана";}
       this.currentCity=currentCity;
       this.jobTitle=jobTitle;
   }




       void greetings() {
           System.out.println("Привет! Меня зовут "+ name+"Мне"+dateOfBirth+" Я из города"+currentCity+ ".Я работаю"+jobTitle+" Будем знакомы!");
   }

}
