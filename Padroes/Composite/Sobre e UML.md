# Prof! Tentei fazer o seguinte:

Criei tipo sistema de gerenciamento de uma empresa que possui vários departamentos e cada departamento pode conter outros subdepartamentos e/ou funcionários. O objetivo é que possamos obter informações de todos os departamentos e subdepartamentos da empresa de forma hierárquica.

Primeiro, criei a interface Component que define as operações que os departamentos e os funcionarios precisam implementar.

Segundo, criei a classe Employee que representa um funcionario da empresa e implementa a interface Component.

Terceiro, criei a classe Department, que representa um departamento da empresa e também implementa a interface Component... essa classe  possui uma lista de Componentes, que pode conter tanto outros departamentos quanto funcionários. Isso permite que possamos criar hierarquias complexas de departamentos e subdepartamentos.

Por fim, criei uma classe pra testar o conceito chamada "Composite" que de certa forma criou  uma hierarquia de departamentos e funcionários e no fim imprimiu todas as informações de forma hierárquica usando print().


# • Diagrama UML abaixo:

```
+-------------------------+
|        Component        |
+-------------------------+
| + getName(): String     |
| + print(): void         |
+-------------------------+
            ^
            |
            |
+-------------------------+
|        Employee         |
+-------------------------+
| - name: String          |
+-------------------------+
| + Employee(name: String)|
| + getName(): String     |
| + print(): void         |
+-------------------------+

+-------------------------+
|        Department       |
+-------------------------+
| - name: String          |
| - components: List<Component> |
+-------------------------+
| + Department(name: String)|
| + addComponent(c: Component): void |
| + removeComponent(c: Component): void |
| + getName(): String     |
| + print(): void         |
+-------------------------+
```

Essa minha classe Department possui uma lista de Component  que deixa ela  ter outros departamentos e/ou funcionários como componentes;
A interface Component define as operações que ambos os tipos de componentes devem implementar; 
E as classes Employee e Department implementam essas operações de acordo com o seu comportamento específico.

