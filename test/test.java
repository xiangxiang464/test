package test;

import domain.Movie;

public class test {
    public static void main(String[] args) {
        Movie movie1=new Movie(1,"东八区的先生们",2.2,"2022","中国大陆","刷情喜剧","夏春","张瀚王晓晨");
        Movie movie2=new Movie(2,"上海堡垒",2.9,"2019","中国大陆","爱情战争科幻","膝华涛","鹿晗舒淇");
        Movie movie3=new Movie(3,"纯洁心灵·逐梦演艺圈",2.2,"2015","中国大陆","刷情喜剧","毕志飞","朱一文李彦漫");
        Movie [] movices = {movie1,movie2,movie3};
        // 要把movices数组中的元素传给MovieService，既将一个类中数据传递给另外一个类
        // 通过带参数的构造方法传递数据
        MovieService mv = new MovieService(movices);
        mv.start();
    }
}
