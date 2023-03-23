import java.util.ArrayList;
import java.util.List;

public class Department implements Component {
    private String name;
    private List<Component> components = new ArrayList<Component>();
    
    public Department(String name) {
        this.name = name;
    }
    
    public void addComponent(Component component) {
        components.add(component);
    }
    
    public void removeComponent(Component component) {
        components.remove(component);
    }
    
    public String getName() {
        return name;
    }
    
    public void print() {
        System.out.println(name);
        for (Component component : components) {
            component.print();
        }
    }
}
