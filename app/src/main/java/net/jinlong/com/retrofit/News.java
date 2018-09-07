package net.jinlong.com.retrofit;

import java.util.List;

/**
 * @author : 贺金龙
 * email : 753355530@qq.com
 * create at 2018/9/6  13:43
 * description :
 */
public class News {


    /**
     * status : 0
     * msg : ok
     * result : {"channel":"头条","num":"10","list":[{"title":"中国开闸放水27天解救越南旱灾","time":"2016-03-16 07:23","src":"中国网","category":"mil","pic":"http://api.jisuapi.com/news/upload/20160316/105123_31442.jpg","url":"http://mil.sina.cn/zgjq/2016-03-16/detail-ifxqhmve9235380.d.html?vt=4&pos=108","weburl":"http://mil.news.sina.com.cn/china/2016-03-16/doc-ifxqhmve9235380.shtml"}]}
     */

    private String status;
    private String msg;
    private ResultBean result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * channel : 头条
         * num : 10
         * list : [{"title":"中国开闸放水27天解救越南旱灾","time":"2016-03-16 07:23","src":"中国网","category":"mil","pic":"http://api.jisuapi.com/news/upload/20160316/105123_31442.jpg","url":"http://mil.sina.cn/zgjq/2016-03-16/detail-ifxqhmve9235380.d.html?vt=4&pos=108","weburl":"http://mil.news.sina.com.cn/china/2016-03-16/doc-ifxqhmve9235380.shtml"}]
         */

        private String channel;
        private String num;
        private List<ListBean> list;

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * title : 中国开闸放水27天解救越南旱灾
             * time : 2016-03-16 07:23
             * src : 中国网
             * category : mil
             * pic : http://api.jisuapi.com/news/upload/20160316/105123_31442.jpg
             * url : http://mil.sina.cn/zgjq/2016-03-16/detail-ifxqhmve9235380.d.html?vt=4&pos=108
             * weburl : http://mil.news.sina.com.cn/china/2016-03-16/doc-ifxqhmve9235380.shtml
             */

            private String title;
            private String time;
            private String src;
            private String category;
            private String pic;
            private String url;
            private String weburl;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getWeburl() {
                return weburl;
            }

            public void setWeburl(String weburl) {
                this.weburl = weburl;
            }


            @Override
            public String toString() {
                return "ListBean{" +
                        "title='" + title + '\'' +
                        ", time='" + time + '\'' +
                        ", src='" + src + '\'' +
                        ", category='" + category + '\'' +
                        ", pic='" + pic + '\'' +
                        ", url='" + url + '\'' +
                        ", weburl='" + weburl + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "channel='" + channel + '\'' +
                    ", num='" + num + '\'' +
                    ", list=" + list +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "News{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }

}
