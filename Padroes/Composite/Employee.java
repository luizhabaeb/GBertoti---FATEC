public class Employee implements Component {
    private String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void print() {
        System.out.println("- " + name);
    }
}
