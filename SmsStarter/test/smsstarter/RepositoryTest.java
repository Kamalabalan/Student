/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smsstarter;

import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Gitanjali
 */
public class RepositoryTest {
    Student stu,stu1,st;
    //private Map<Long, Student> m = new HashMap<Long, Student>();
  SimpleStudentRepository ssr;
     @Test
    public void testConstructor() {
        try {
            ssr = new SimpleStudentRepository();
    //        Assert.fail("An IOException was expected");
        } catch (Exception e) {

        }
    }
     @Test
     public void testSaveAndFindStudent(){
         stu=new Student("John","Doe",12345,"Jaffna");
         ssr=new SimpleStudentRepository();
         ssr.saveStudent(stu);
         //assertSame(ssr.findStudent(123445l),null);
         st=ssr.findStudent(12345l);
         Assert.assertEquals("John expected","John",st.getFirstName());
     }
     @Test
     public void testDeleteStudent(){
         stu=new Student("John","Doe",12345,"Jaffna");
         ssr=new SimpleStudentRepository();
         ssr.saveStudent(stu);
         ssr.deleteStudent(stu);
         Assert.assertEquals("Null expected",null,ssr.findStudent(12345l));
     }
     
}
