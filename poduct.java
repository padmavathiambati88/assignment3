import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeProduct {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    // Specify the file path where the serialized Product object is stored
    String filePath = "product.ser";

    // Open an ObjectInputStream to read from the file
    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath));

    // Read the deserialized object (cast it to Product)
    Product product = (Product) inputStream.readObject();

    // Close the stream
    inputStream.close();

    // Print the deserialized product details
    System.out.println("Deserialized Product:");
    System.out.println("ID: " + product.getId());
    System.out.println("Name: " + product.getName());
    System.out.println("Category: " + product.getCategory());
    System.out.println("Price: " + product.getPrice());
  }
}