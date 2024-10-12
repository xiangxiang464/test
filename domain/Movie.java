package domain;

public class Movie {
    private int id;
    private String title;
    private double scores;
    private String time;
    private String director;
    private String area;
    private String type;
    private String starring;

    public Movie() {
    }

    public Movie(int id, String title, double scores, String time, String director, String area, String type, String starring) {
        this.id = id;
        this.title = title;
        this.scores = scores;
        this.time = time;
        this.director = director;
        this.area = area;
        this.type = type;
        this.starring = starring;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return scores
     */
    public double getScores() {
        return scores;
    }

    /**
     * 设置
     * @param scores
     */
    public void setScores(float scores) {
        this.scores = scores;
    }

    /**
     * 获取
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取
     * @return director
     */
    public String getDirector() {
        return director;
    }

    /**
     * 设置
     * @param director
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * 获取
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return starring
     */
    public String getStarring() {
        return starring;
    }

    /**
     * 设置
     * @param starring
     */
    public void setStarring(String starring) {
        this.starring = starring;
    }

    public String toString() {
        return "Movie{id = " + id + ", title = " + title + ", scores = " + scores + ", time = " + time + ", director = " + director + ", area = " + area + ", type = " + type + ", starring = " + starring + "}";
    }
}
