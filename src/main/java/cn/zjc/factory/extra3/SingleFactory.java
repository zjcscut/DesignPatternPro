package cn.zjc.factory.extra3;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * @author zjc
 * @date 16-8-17 上午8:20
 * @desc 单实例工厂，使用此工厂的类的构造必须是private
 **/
public class SingleFactory {

    private static FactoryBean factoryBean = null;

    private static Properties props;


    static {
        props = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("/home/zjc/Develop/LinuxProjects/DesignPatternPro/target/classes/cn/zjc/factory/extra3/config.properties")){
            props.load(fileInputStream);
            String className = props.getProperty("BeanClass");
            Class clz = Class.forName(className);
            factoryBean = (FactoryBean) clz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //懒汉式单例
    public static FactoryBean getInstance() {
        return factoryBean;
    }


}
