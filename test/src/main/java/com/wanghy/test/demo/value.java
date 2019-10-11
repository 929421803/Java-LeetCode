package com.wanghy.test.demo;

/**
 * @Author ：WangHY
 * @date ：Created in 15:32 2019/3/26
 * @Description：
 */
public class value {

        public static void main(String[] args) {
            value t = new value();
            int a=99;
            t.test1(a); //这里传递的参数a就是按值传递
            System.out.println(a);
            System.out.println(6&2);


//            MyObj obj=new MyObj();
//            t.test2(obj);//这里传递的参数obj就是引用传递
//            System.out.println(obj.b);
        }

        public void test1(int a){
            a=a+1;
            System.out.println(a);
        }

//        public void test2(MyObj obj){
//            obj.b=100;
//            System.out.println(obj.b);
//        }
}
