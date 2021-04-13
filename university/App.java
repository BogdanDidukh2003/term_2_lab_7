package university;

public class App {
    static Teacher andres = new Teacher("Andriy Andres", 55, "male", 25, "San-Andres", "PE", 180, false, "black", "brown");
    static Teacher kuba = new Teacher("Nataliya Kuba", 30, "female", 8);
    static Teacher nytrebych = new Teacher();

    public static void main(String[] args) {        
        kuba.setAlias("sonechko"); 
        kuba.setSubject("presentation");
        kuba.setHeight(180);
        kuba.setIsKind(true);
        kuba.setHairColor("brown");
        kuba.setEyesColor("blue");
        nytrebych.setNameSurname("Zinoviy Nytrebych");
        nytrebych.setAge(60);
        nytrebych.setGender("male");
        nytrebych.setExperience(30);
        nytrebych.setAlias("Ninadych");
        nytrebych.setSubject("High meth");
        nytrebych.setHeight(180);
        nytrebych.setIsKind(true);
        nytrebych.setHairColor("grey");
        nytrebych.setEyesColor("grey");
        System.out.println(andres.toString() + "\n" + kuba.toString() + "\n" + nytrebych.toString());
        Teacher.printStaticYearOfFoundationOfLvivPolytechnic();
        andres.printFieldYearOfFoundationOfLvivPolytechnic();
    }
}