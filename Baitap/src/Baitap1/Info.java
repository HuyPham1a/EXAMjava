package Baitap1;

public class Info {
    private long id;
    private String articleTitle;
    private String describe;
    private String avatar;
    private String writer ;
    public Info() {}

    public String getDateofwriting() {
        return dateofwriting;
    }

    public void setDateofwriting(String dateofwriting) {
        this.dateofwriting = dateofwriting;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String dateofwriting;
}
