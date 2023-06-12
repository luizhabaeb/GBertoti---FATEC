# DESIGN PATTERNS - GIULIANO 4º BD FATEC

Tentei fazer um sistema simplificado de gerenciamento de biblioteca que utiliza cinco padrões de projeto: Observer, Strategy, Composite, Singleton e Facade.

**Observer**: O sistema permite que os clientes sejam notificados automaticamente quando a disponibilidade de um livro muda. Por exemplo, quando um livro que estava emprestado é devolvido e se torna disponível novamente, o cliente que estava esperando por ele é notificado.

**Strategy**: O sistema calcula multas por atraso na devolução de livros de maneira diferente para estudantes e professores. Isso é feito através da implementação de uma estratégia de cálculo de multa que pode ser alterada em tempo de execução.

**Composite**: O sistema permite que um gerente tenha vários bibliotecários como subordinados. Isso é feito através da implementação de um padrão de design Composite, que permite tratar grupos de objetos da mesma maneira que objetos individuais.

**Singleton**: O sistema garante que apenas uma instância da Biblioteca seja criada. Isso é útil para garantir que todas as operações de gerenciamento de biblioteca sejam realizadas em uma única instância.

**Facade**: O sistema fornece uma interface simplificada para o gerenciamento da biblioteca através da implementação de uma fachada. Isso permite que operações complexas, como emprestar um livro ou calcular uma multa, sejam realizadas com um único método.
