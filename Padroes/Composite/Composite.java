public class CompositeTest {
    public static void main(String[] args) {
        Department company = new Department("Company");
        Department finance = new Department("Finance");
        Department humanResources = new Department("Human Resources");
        Department marketing = new Department("Marketing");
        
        Employee employee1 = new Employee("John");
        Employee employee2 = new Employee("Mary");
        Employee employee3 = new Employee("Peter");
        Employee employee4 = new Employee("Tom");
        Employee employee5 = new Employee("Bob");
        
        finance.addComponent(employee1);
        finance.addComponent(employee2);
        
        humanResources.addComponent(employee3);
        
        marketing.addComponent(employee4);
        marketing.addComponent(employee5);
        
        company.addComponent(finance);
        company.addComponent(humanResources);
        company.addComponent(marketing);
        
        company.print();
    }
}
