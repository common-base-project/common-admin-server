//
//
//package top.mybi;
//
//import top.mybi.service.DynamicDataSourceTestService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**
// * 多数据源测试
// *
// * @author Mustang mustang2247@gmail.com
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class DynamicDataSourceTest {
//    @Autowired
//    private DynamicDataSourceTestService dynamicDataSourceTestService;
//
//    @Test
//    public void test(){
//        Long id = 1067246875800000001L;
//
//        dynamicDataSourceTestService.updateUser(id);
//        dynamicDataSourceTestService.updateUserBySlave1(id);
//        //dynamicDataSourceTestService.updateUserBySlave2(id);
//    }
//
//
//}
