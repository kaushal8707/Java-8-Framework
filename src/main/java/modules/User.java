package modules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User
{
    private String userName;
    private int age;
    private float salary;


    public void showData()
    {
        System.out.println(userName+"  "+age);
    }
    public static void viewRecord()
    {
        System.out.println("inside static ref");
    }
}
