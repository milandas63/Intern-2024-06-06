import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class KeyboardInput {
    BufferedReader reader;
    Writer writer;
    public KeyboardInput() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("students.csv")));
            writer.write("Candidate's name,Father's name,Gender,Email-id,Mobile number,Location");
            writer.write("\n");
            boolean yesNo = true;
            while (yesNo) {
                for (int i = 0; i < 20; i++) System.out.println();
                System.out.println("STUDENT INFORMATION SYSTEM");
                System.out.println("--------------------------");
                System.out.println();
                System.out.print("Candidate's name: ");
                String name = reader.readLine();
                System.out.print("Father's name:    ");
                String father = reader.readLine();
                System.out.print("Gender [M/F]:     ");
                String gender = reader.readLine();
                System.out.print("Email-id:         ");
                String email = reader.readLine();
                System.out.print("Mobile number:    ");
                String mobile = reader.readLine();
                System.out.print("Location:         ");
                String location = reader.readLine();
                writer.write(String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"\n",
                        name, father, gender, email, mobile, location));
                System.out.println();
                System.out.print("More [Y/N]: ");
                String more = reader.readLine();
                yesNo = more.startsWith("Y");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new KeyboardInput();
    }
}
