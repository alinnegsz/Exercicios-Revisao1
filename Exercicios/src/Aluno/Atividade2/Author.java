package Aluno.Atividade2;

public class Author {
    private String name, email;
    private Character gender;

    public Author(String name, String email, Character gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author [email=" + email + ", gender=" + gender + ", name=" + name + "]";
    }

}
