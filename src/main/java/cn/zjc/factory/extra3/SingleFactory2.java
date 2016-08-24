package cn.zjc.factory.extra3;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author zjc
 * @date 16-8-18 上午5:50
 * @desc 饿汉式单例工厂
 **/
public class SingleFactory2 {

    private static FactoryBean factoryBean = null;

    private static Properties props;


    static {
        props = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("/home/zjc/Develop/LinuxProjects/DesignPatternPro/target/classes/cn/zjc/factory/extra3/config.properties")){
            props.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized static FactoryBean getInstance() throws Exception{
            if (factoryBean == null) {
                Class clz = Class.forName(props.getProperty("BeanClass"));
                factoryBean = (FactoryBean) clz.newInstance();
            }
        return factoryBean;
    }
}
