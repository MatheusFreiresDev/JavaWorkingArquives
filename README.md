# 📄 JavaWorkingArquives

## 🔍 Sobre

Esse projeto é um exercício de leitura/escrita de arquivos em Java.  
Ele faz o seguinte:
- Lê um arquivo `products.txt` com linhas no formato `nome,quantidade,valor`.
- Constrói objetos `Product`.
- Gera um arquivo `out.txt` com cada produto e o valor total (`quantidade × valor`).

---

## 📝 Como usar

1. Faça clone no repositório:
   ```bash
   git clone https://github.com/MatheusFreiresDev/JavaWorkingArquives.git
   ```
2. Entre na pasta:
   ```bash
   cd JavaWorkingArquives
   ```
3. Adicione o arquivo `products.txt` na raiz (ou na pasta `resources`), por exemplo:
   ```
   TV,1200,1
   VIDEOGAME,50,3
   IPHONE,2,899.99
   ```
4. Edite o caminho no `Program.java` se precisar, ou use caminhos relativos:
   ```java
   new FileReader("resources/products.txt")
   ```
5. Compile e rode:
   ```bash
   javac -d bin src/Files/*.java
   java -cp bin Files.Program
   ```
6. O resultado será gerado em `out/out.txt`.


---

## 📌 Observações

- O código usa `try-with-resources` pra evitar vazamento de arquivos.
- O `split()` não faz validações avançadas, então certifique-se de que cada linha tenha 3 campos.
- Se der erro como `ArrayIndexOutOfBoundsException`, provavelmente o arquivo está mal formatado.

---

## 🛠️ Melhorias futuras

- Validar formato das linhas antes de usar `split()`.
- Lançar exceção customizada (`FormatInvalidException`) se a linha tiver formato errado.
- Refatorar o `main()` separando leitura, processamento e escrita em métodos.
- Adicionar endpoint (Spring Boot) para baixar o `out.txt` via HTTP.
- Gerar exportação em CSV, PDF ou JSON.

---

## 👋 Feedback

Se quiser mandar uma sugestão ou melhorar algo, manda um PR ou abre uma issue. Valeu!
```
