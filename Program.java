    package Files;

    import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
    import java.io.*;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {
            List<Product> products = new ArrayList<>();
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader("SeuCaminho\\products.txt"))){
                String linha = bufferedReader.readLine();
                while (linha != null) {
                    String[] linhas = linha.split(",");
                    Product product = new Product(linhas[0],Integer.parseInt(linhas[1]),Double.parseDouble(linhas[2]));
                    products.add(product);
                    linha = bufferedReader.readLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Format arquive is wrong");
            }

            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("SeuCaminho\\out\\out.txt"))) {
                for (Product a : products) {
                    bufferedWriter.write("Produto : " + a.getName());
                    bufferedWriter.write(" | ");
                    bufferedWriter.write( "Valor total : " + a.total());
                    bufferedWriter.newLine();
                }
            } catch (IOException e ) {
                System.out.println(e.getMessage());
            }
        }
    }
