package com.fmh.youfound.dao.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Component;

import com.fmh.youfound.dao.UserDao;
import com.fmh.youfound.entity.User;


/** 
 * 导入了junit，本来想对dao层作测试，但是一直失败，报空指针错误。
 * 在controller层代码是可以运行的，但是自己写的案例中一直报错，考虑到时bean注入问题，没有将testCase注入。
 * 后来在测试类中将DaoImpl类用注解注还是不行，不能后注入。后来上网查发现了别人说的：
 * 		Spring管理的Bean在JUnit中无法注入，而且频繁的进行单元测试会产生大量的垃圾数据，这是困扰开发人员的一大问题。
 * 		幸好Spring提供了一个类，用来集成JUnit进行Service层和DAO层的单元测试，它可以将Spring管理的Bean进行注入
 * 		并在测试结束后控制Hibernate将数据回滚，这个类就是“AbstractTransactionalDataSourceSpringContextTests”。
 * 		public class JUTest extends AbstractTransactionalDataSourceSpringContextTests  {  
    		//Service层Bean  
    		private MyService myServiceImpl;  
      
    		//重写父类的方法，进行Spring配置文件的初始化  
    		public String[] getConfigLocations()  {  
        		String[] config = new String[] { "/spring/applicationContext.xml"  
                	, "/spring/test.xml"  
                	, "/spring/applicationContext-allbean-hibernate.xml" };  
        		return config;  
    			}  
  
    		//测试方法  
    		public void testService() {  
        		myServiceImpl.doService();  
    		}  
  
    		//Service层Bean的set方法，这里注意一定要加(@Qualifier("myServiceImpl")，不然会报一个bean重复的错误  
    		public void setMyServiceImpl(@Qualifier("myServiceImpl") MyService myServiceImpl) {  
        		this.myServiceImpl = myServiceImpl;  
    		}  
		}  
 * 终于发现了问题所在！！！
 * 
 * 但是问题又来了，这个类会将数据回滚，那么怎么验证写入到数据库呢，真蛋疼，还是不用junit这个测试了吧！网上这样解决说的：
 * 		不过有一个问题，这样的测试只能测试会不会报错如果插入的数据有问题是测试不出来的，而且测试结束后数据会回滚，
 * 		无法在数据库中看到测试数据，那咱么办呢？可以在这里写一个JDBC的查询逻辑，将数据查出来进行验证。
 * 		另外，貌似TestSuite中所有的TestCase都会加载一遍Spring配置文件，测试性能不是一般的跌眼镜。。。
 * @author fengmuhai
 * @date 2016-4-1 下午4:18:39 
 * @version 1.0  
 */
@Component
public class UserDaoHTImplTest {

	private UserDao ud ;

	@Test
	public void testGet() {
		UserDaoHTImpl userDaoHTImpl = new UserDaoHTImpl();
		User u =userDaoHTImpl.get((long) 12);
		System.out.println("userName"+u.getUserName()+"\nemail"+u.getEmail()+"\npassword"+u.getPasswprd());
	}

	@Test
	public void testSave() {
		User u = new User("fengmmmmmm", "123456789", "00000000000000","");
		//UserDaoHTImpl userDaoHTImpl = new UserDaoHTImpl();
		System.out.println(ud.getClass().getName());
		ud.save(u);
		System.out.println("添加用户成功！");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByUserName() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByEmail() {
		fail("Not yet implemented");
	}


	public UserDao getUdi() {
		return ud;
	}

	@Resource(name="userDaoHTImpl")
	public void setUdi(UserDao ud) {
		this.ud = ud;
	}

}
