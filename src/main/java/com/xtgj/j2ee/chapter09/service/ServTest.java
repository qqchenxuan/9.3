package main.java.com.xtgj.j2ee.chapter09.service;


@Component
public class ServTest {

    @Resource(name="orderDaoTe")
    private com.xtgj.j2ee.chapter09.dao.OrderDaoBean orderDao;

    ApplicationContext context = null;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMethod3() {
        ServTest orderTest=(com.xtgj.j2ee.chapter09.demo.OrderServiceBean) context.getBean("service");
        orderTest.orderDao.testAutowired("autovried");
    }

}

