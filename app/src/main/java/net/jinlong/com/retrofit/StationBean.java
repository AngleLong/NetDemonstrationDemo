package net.jinlong.com.retrofit;

import java.util.List;

/**
 * @author : 贺金龙
 * email : 753355530@qq.com
 * create at 2018/9/7  9:46
 * description : 这个是第二个接口，获取火车的接口
 */
public class StationBean {


    /**
     * status : 0
     * msg : ok
     * result : [{"trainno":"G34","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"07:01","arrivaltime":"13:03","sequenceno":"1","costtime":"6时2分","distance":"1279","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G20","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"07:48","arrivaltime":"12:20","sequenceno":"1","costtime":"4时32分","distance":"1279","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G58","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"08:50","arrivaltime":"14:43","sequenceno":"4","costtime":"5时53分","distance":"1279","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G36","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"09:05","arrivaltime":"14:53","sequenceno":"1","costtime":"5时48分","distance":"1279","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G42","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"09:24","arrivaltime":"16:08","sequenceno":"1","costtime":"6时44分","distance":"1477","isend":"1","pricesw":"1966","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"1048.5","priceed":"626.0"},{"trainno":"G46","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"09:50","arrivaltime":"15:43","sequenceno":"7","costtime":"5时53分","distance":"1279","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G38","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"11:34","arrivaltime":"18:09","sequenceno":"8","costtime":"6时35分","distance":"0","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G168","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"11:39","arrivaltime":"18:13","sequenceno":"9","costtime":"6时34分","distance":"0","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G56","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"12:46","arrivaltime":"18:53","sequenceno":"10","costtime":"6时7分","distance":"0","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G32","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"13:00","arrivaltime":"17:39","sequenceno":"1","costtime":"4时39分","distance":"1279","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G164","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"13:41","arrivaltime":"19:53","sequenceno":"13","costtime":"6时12分","distance":"0","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G166","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"15:12","arrivaltime":"20:58","sequenceno":"2","costtime":"5时46分","distance":"1236","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G60","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"15:43","arrivaltime":"21:29","sequenceno":"4","costtime":"5时46分","distance":"1279","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"G44","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"16:15","arrivaltime":"23:08","sequenceno":"1","costtime":"6时53分","distance":"1477","isend":"1","pricesw":"1966","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"1048.5","priceed":"626.0"},{"trainno":"Z10","type":"直达特快","station":"杭州","endstation":"北京","departuretime":"17:17","arrivaltime":"07:34","sequenceno":"1","costtime":"14时17分","distance":"1650","isend":"1","pricesw":"","pricetd":"","pricerz":"","priceyz":"192","pricegr1":"","pricegr2":"","pricerw1":"515","pricerw2":"","priceyw1":"328","priceyw2":"","priceyw3":""},{"trainno":"T32","type":"特快","station":"杭州","endstation":"北京","departuretime":"18:20","arrivaltime":"10:26","sequenceno":"1","costtime":"16时6分","distance":"1650","isend":"1","pricesw":"","pricetd":"","pricerz":"","priceyz":"192","pricegr1":"854","pricegr2":"","pricerw1":"515","pricerw2":"","priceyw1":"328","priceyw2":"","priceyw3":""},{"trainno":"G40","type":"高铁","station":"杭州东","endstation":"北京南","departuretime":"19:00","arrivaltime":"23:23","sequenceno":"1","costtime":"4时23分","distance":"1279","isend":"1","pricesw":"1701","pricetd":"","pricegr1":"","pricegr2":"","pricerw1":"","pricerw2":"","priceyw1":"","priceyw2":"","priceyw3":"","priceyd":"907.0","priceed":"538.5"},{"trainno":"K102","type":"快速","station":"杭州","endstation":"北京","departuretime":"19:23","arrivaltime":"15:43","sequenceno":"10","costtime":"20时20分","distance":"1591","isend":"1","pricesw":"","pricetd":"","pricerz":"","priceyz":"189.5","pricegr1":"","pricegr2":"","pricerw1":"504.5","pricerw2":"","priceyw1":"322.5","priceyw2":"","priceyw3":""}]
     */

    private String status;
    private String msg;
    private List<ResultBean> result;

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

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * trainno : G34
         * type : 高铁
         * station : 杭州东
         * endstation : 北京南
         * departuretime : 07:01
         * arrivaltime : 13:03
         * sequenceno : 1
         * costtime : 6时2分
         * distance : 1279
         * isend : 1
         * pricesw : 1701
         * pricetd :
         * pricegr1 :
         * pricegr2 :
         * pricerw1 :
         * pricerw2 :
         * priceyw1 :
         * priceyw2 :
         * priceyw3 :
         * priceyd : 907.0
         * priceed : 538.5
         * pricerz :
         * priceyz : 192
         */

        private String trainno;
        private String type;
        private String station;
        private String endstation;
        private String departuretime;
        private String arrivaltime;
        private String sequenceno;
        private String costtime;
        private String distance;
        private String isend;
        private String pricesw;
        private String pricetd;
        private String pricegr1;
        private String pricegr2;
        private String pricerw1;
        private String pricerw2;
        private String priceyw1;
        private String priceyw2;
        private String priceyw3;
        private String priceyd;
        private String priceed;
        private String pricerz;
        private String priceyz;

        public String getTrainno() {
            return trainno;
        }

        public void setTrainno(String trainno) {
            this.trainno = trainno;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStation() {
            return station;
        }

        public void setStation(String station) {
            this.station = station;
        }

        public String getEndstation() {
            return endstation;
        }

        public void setEndstation(String endstation) {
            this.endstation = endstation;
        }

        public String getDeparturetime() {
            return departuretime;
        }

        public void setDeparturetime(String departuretime) {
            this.departuretime = departuretime;
        }

        public String getArrivaltime() {
            return arrivaltime;
        }

        public void setArrivaltime(String arrivaltime) {
            this.arrivaltime = arrivaltime;
        }

        public String getSequenceno() {
            return sequenceno;
        }

        public void setSequenceno(String sequenceno) {
            this.sequenceno = sequenceno;
        }

        public String getCosttime() {
            return costtime;
        }

        public void setCosttime(String costtime) {
            this.costtime = costtime;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getIsend() {
            return isend;
        }

        public void setIsend(String isend) {
            this.isend = isend;
        }

        public String getPricesw() {
            return pricesw;
        }

        public void setPricesw(String pricesw) {
            this.pricesw = pricesw;
        }

        public String getPricetd() {
            return pricetd;
        }

        public void setPricetd(String pricetd) {
            this.pricetd = pricetd;
        }

        public String getPricegr1() {
            return pricegr1;
        }

        public void setPricegr1(String pricegr1) {
            this.pricegr1 = pricegr1;
        }

        public String getPricegr2() {
            return pricegr2;
        }

        public void setPricegr2(String pricegr2) {
            this.pricegr2 = pricegr2;
        }

        public String getPricerw1() {
            return pricerw1;
        }

        public void setPricerw1(String pricerw1) {
            this.pricerw1 = pricerw1;
        }

        public String getPricerw2() {
            return pricerw2;
        }

        public void setPricerw2(String pricerw2) {
            this.pricerw2 = pricerw2;
        }

        public String getPriceyw1() {
            return priceyw1;
        }

        public void setPriceyw1(String priceyw1) {
            this.priceyw1 = priceyw1;
        }

        public String getPriceyw2() {
            return priceyw2;
        }

        public void setPriceyw2(String priceyw2) {
            this.priceyw2 = priceyw2;
        }

        public String getPriceyw3() {
            return priceyw3;
        }

        public void setPriceyw3(String priceyw3) {
            this.priceyw3 = priceyw3;
        }

        public String getPriceyd() {
            return priceyd;
        }

        public void setPriceyd(String priceyd) {
            this.priceyd = priceyd;
        }

        public String getPriceed() {
            return priceed;
        }

        public void setPriceed(String priceed) {
            this.priceed = priceed;
        }

        public String getPricerz() {
            return pricerz;
        }

        public void setPricerz(String pricerz) {
            this.pricerz = pricerz;
        }

        public String getPriceyz() {
            return priceyz;
        }

        public void setPriceyz(String priceyz) {
            this.priceyz = priceyz;
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "trainno='" + trainno + '\'' +
                    ", type='" + type + '\'' +
                    ", station='" + station + '\'' +
                    ", endstation='" + endstation + '\'' +
                    ", departuretime='" + departuretime + '\'' +
                    ", arrivaltime='" + arrivaltime + '\'' +
                    ", sequenceno='" + sequenceno + '\'' +
                    ", costtime='" + costtime + '\'' +
                    ", distance='" + distance + '\'' +
                    ", isend='" + isend + '\'' +
                    ", pricesw='" + pricesw + '\'' +
                    ", pricetd='" + pricetd + '\'' +
                    ", pricegr1='" + pricegr1 + '\'' +
                    ", pricegr2='" + pricegr2 + '\'' +
                    ", pricerw1='" + pricerw1 + '\'' +
                    ", pricerw2='" + pricerw2 + '\'' +
                    ", priceyw1='" + priceyw1 + '\'' +
                    ", priceyw2='" + priceyw2 + '\'' +
                    ", priceyw3='" + priceyw3 + '\'' +
                    ", priceyd='" + priceyd + '\'' +
                    ", priceed='" + priceed + '\'' +
                    ", pricerz='" + pricerz + '\'' +
                    ", priceyz='" + priceyz + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "StationBean{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
