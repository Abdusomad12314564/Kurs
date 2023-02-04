import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Kurs k=new Kurs();
        k.setName("Java kursu");
        k.setNum(555123456);
        k.setDate(LocalDate.of(2023,1, 3));

        Student st=new Student();
        st.setName("Abdusomad");
        st.setSurName("Koshmamatov");
        st.setAge(LocalDate.of(1992,1,1));
        st.setEmail("a@gmail.com");

        System.out.println("Kurs: "+k.getName()+
                "\nTel: "+k.getNum()+
                "\nBashtalgan kunu: "+k.getDate()+
                "\n\nAty: "+st.getName()+
                "\nFamiliya: "+st.getSurName()+
                "\nTuulgan kunu: "+st.getAge()+
                "\nEmail: "+st.getEmail());
    }
}