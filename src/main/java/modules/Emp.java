package modules;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Emp
{
    private Integer id;
    private String name;

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        Emp emp= (Emp) obj;
        return ((this.id==emp.id) || this.id.equals(emp.id))&&
                (this.name==emp.name || this.name.equals(emp.name));
    }

    @Override
    public int hashCode(){
        return (this.id.hashCode()+this.name.hashCode());
    }
}
