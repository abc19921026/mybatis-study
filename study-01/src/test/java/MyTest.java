import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.dao.StudentMapper;
import com.study.model.Student;
import com.study.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.selectById(1);
        System.out.println(student);
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSession();
        PageHelper.startPage(0,3);
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = studentMapper.selectList();
        PageInfo<Student> pageInfo = new PageInfo<Student>(list);
        for(Student student:list){
            System.out.println(student);
        }
    }
}
