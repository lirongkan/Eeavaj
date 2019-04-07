package start.generic;

/**
 * @author: lrk
 * 2019/4/7 18:05
 */

interface Dao<T>{
    public void add(T t);
    public void remove(T t);
}

/*将接口的泛型删除，重写方法默认为Object类型*/
public class Demo4<T> implements Dao<T> {
    public static void main(String[] args) {
        new Demo4<String>();
    }

    @Override
    public void add(T t) {

    }

    @Override
    public void remove(T t) {

    }
    /*在创建对象的时候就会变成相应的类型*/
    Demo4<String> demo = new Demo4<>();
}


/*
 泛型接口：

 泛型接口的定义格式：

 	interface 接口名<声明自定义的泛型>{

 	}

在接口上自定义泛型要注意的事项：
 	1. 在接口上自定义泛型的具体数据类型是在实现该接口的时候指定的。
 	2. 如果一个接口自定义了泛型，在实现该接口的时候没有指定具体的数据类型，那么默认是Object数据类型。

 如果想在创建接口实现类对象的时候再指定接口自定义泛型 的具体数据类型？



 */