package net.jinlong.com.retrofit;

/**
 * @author : 贺金龙
 * email : 753355530@qq.com
 * create at 2018/9/7  14:54
 * description :
 */
public class BodyBean {
    private String appkey;
    private String start;
    private String end;
    private String ishigh;

    public BodyBean(String appkey, String start, String end, String ishigh) {
        this.appkey = appkey;
        this.start = start;
        this.end = end;
        this.ishigh = ishigh;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getIshigh() {
        return ishigh;
    }

    public void setIshigh(String ishigh) {
        this.ishigh = ishigh;
    }
}
