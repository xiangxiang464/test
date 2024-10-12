package test;

import domain.Movie;

import java.util.Scanner;

public class MovieService {
    private Movie [] movies;
    private Scanner sc = new Scanner(System.in);

    public MovieService(Movie[] movices) {
        this.movies = movices;
    }

    /*
        展示菜单系统
         */
    public void start() {

        int choice = -1;
        while (choice!= 3) {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    queryAllMovie();
                    break;
                case 2:
                    // 根据id查询电影信息
                    searchMovieById();
                    break;
                case 3:
                    // 退出系统
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }


    }

    private void searchMovieById() {
        // 输入电影id

        System.out.println("请输入电影id：");
        int id = sc.nextInt();
        // 根据id查询电影信息
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println(movies[i].getTitle()+"--------"+movies[i].getDirector());
                return;
            }
        }
        System.out.println("没有找到该电影信息！");
    }

    private void queryAllMovie() {
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getTitle());
        }
    }

    private void showMenu() {
        System.out.println("------电影信息系统------");
        System.out.println("请输入你的选择：");
        System.out.println("1.查询电影全部信息");
        System.out.println("2.根据id查询电影");
        System.out.println("3.退出");
    }

}



