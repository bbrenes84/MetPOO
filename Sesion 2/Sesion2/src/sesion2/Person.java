package sesion2;

/**
 *
 * @author Usuario
 */
public class Person {
    private String name;
    private String lastName;
    private float heigth;
    private int age;
    
    /**
     * Constructor vacío
     */
    public Person(){
        
    }
    
    /**
     * Constructor con parametros
     * @param name
     * @param lastName
     * @param heigth
     * @param age 
     */
    
    public Person(String name, String lastName, float heigth, int age){
            this.name = name;
            this.lastName = lastName;
            this.heigth = heigth;
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nombres: " + name + "\nApellidos: " + lastName + "\nAltura: "
                + heigth + "\nEdad: " + age + '\n';
    }
    
}
