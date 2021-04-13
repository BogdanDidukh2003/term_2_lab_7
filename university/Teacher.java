package university;

public class Teacher {
    
    private String nameSurname;
    private int age;
    private String gender;

    private int experience;
    private String alias;
    private String subject;
    private int height;
    private boolean isKind;

    static public int yearOfFoundationOfLvivPolytechnic;

    protected String hairColor;
    protected String eyesColor;

    static {
        yearOfFoundationOfLvivPolytechnic = 1816;
    }

    public Teacher() {
    }

    public Teacher(String nameSurname, int age, String gender, int experience) {
        this.nameSurname = nameSurname;
        this.age = age;
        this.gender = gender;
        this.experience = experience;
    }

    public Teacher(String nameSurname, int age, String gender, int experience, String alias, String subject, int height, boolean isKind, String hairColor, String eyesColor) {
        this(nameSurname, age, gender, experience);
        this.alias = alias;
        this.subject = subject;
        this.height = height;
        this.isKind = isKind;
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
    }

    public String getNameSurname() {
        return this.nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean getIsKind() {
        return this.isKind;
    }

    public void setIsKind(boolean isKind) {
        this.isKind = isKind;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyesColor() {
        return this.eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String toString() {
        return "{" +
            " nameSurname='" + getNameSurname() + "'" +
            ", age='" + getAge() + "'" +
            ", gender='" + getGender() + "'" +
            ", experience='" + getExperience() + "'" +
            ", alias='" + getAlias() + "'" +
            ", subject='" + getSubject() + "'" +
            ", height='" + getHeight() + "'" +
            ", isKind='" + getIsKind() + "'" +
            ", hairColor='" + getHairColor() + "'" +
            ", eyesColor='" + getEyesColor() + "'" +
            "}";
    }

    public static void printStaticYearOfFoundationOfLvivPolytechnic() {
        System.out.println(yearOfFoundationOfLvivPolytechnic);
    }

    public void printFieldYearOfFoundationOfLvivPolytechnic() {
        System.out.println(yearOfFoundationOfLvivPolytechnic);
    }

    public void resetValues(String nameSurname, int age, String gender, int experience, String alias, String subject, int height, boolean isKind, String hairColor, String eyesColor) {
        this.nameSurname = nameSurname;
        this.age = age;
        this.gender = gender;
        this.experience = experience;
        this.alias = alias;
        this.subject = subject;
        this.height = height;
        this.isKind = isKind;
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
    }
}
