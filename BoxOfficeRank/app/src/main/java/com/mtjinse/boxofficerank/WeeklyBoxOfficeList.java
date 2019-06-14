package com.mtjinse.boxofficerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*
* weeklyBoxOfficeList": [
{
"rnum": "1",
"rank": "1",
"rankInten": "0",
"rankOldAndNew": "OLD",
"movieCd": "20112207",
"movieNm": "미션임파서블:고스트프로토콜",
"openDt": "2011-12-15",
"salesAmt": "7840509500",
"salesShare": "35.8",
"salesInten": "-1706758500",
"salesChange": "-17.9",
"salesAcc": "40541108500",
"audiCnt": "1007683",
"audiInten": "-234848",
"audiChange": "-18.9",
"audiAcc": "5328435",
"scrnCnt": "697",
"showCnt": "9677"
},
{
"rnum": "2",
"rank": "2",
"rankInten": "1",
"rankOldAndNew": "OLD",
"movieCd": "20112621",
"movieNm": "셜록홈즈 : 그림자 게임",
"openDt": "2011-12-21",
"salesAmt": "3436042500",
"salesShare": "15.7",
"salesInten": "-576328500",
"salesChange": "-14.4",
"salesAcc": "10678327500",
"audiCnt": "453533",
"audiInten": "-83422",
"audiChange": "-15.5",
"audiAcc": "1442861",
"scrnCnt": "363",
"showCnt": "5589"
},
* */
public class WeeklyBoxOfficeList {

    @SerializedName("rnum")
    @Expose
    private String rnum;
    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("rankInten")
    @Expose
    private String rankInten;
    @SerializedName("rankOldAndNew")
    @Expose
    private String rankOldAndNew;
    @SerializedName("movieCd")
    @Expose
    private String movieCd;
    @SerializedName("movieNm")
    @Expose
    private String movieNm;
    @SerializedName("openDt")
    @Expose
    private String openDt;
    @SerializedName("salesAmt")
    @Expose
    private String salesAmt;
    @SerializedName("salesShare")
    @Expose
    private String salesShare;
    @SerializedName("salesInten")
    @Expose
    private String salesInten;
    @SerializedName("salesChange")
    @Expose
    private String salesChange;
    @SerializedName("salesAcc")
    @Expose
    private String salesAcc;
    @SerializedName("audiCnt")
    @Expose
    private String audiCnt;
    @SerializedName("audiInten")
    @Expose
    private String audiInten;
    @SerializedName("audiChange")
    @Expose
    private String audiChange;
    @SerializedName("audiAcc")
    @Expose
    private String audiAcc;
    @SerializedName("scrnCnt")
    @Expose
    private String scrnCnt;
    @SerializedName("showCnt")
    @Expose
    private String showCnt;

    public String getRnum() {
        return rnum;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRankInten() {
        return rankInten;
    }

    public void setRankInten(String rankInten) {
        this.rankInten = rankInten;
    }

    public String getRankOldAndNew() {
        return rankOldAndNew;
    }

    public void setRankOldAndNew(String rankOldAndNew) {
        this.rankOldAndNew = rankOldAndNew;
    }

    public String getMovieCd() {
        return movieCd;
    }

    public void setMovieCd(String movieCd) {
        this.movieCd = movieCd;
    }

    public String getMovieNm() {
        return movieNm;
    }

    public void setMovieNm(String movieNm) {
        this.movieNm = movieNm;
    }

    public String getOpenDt() {
        return openDt;
    }

    public void setOpenDt(String openDt) {
        this.openDt = openDt;
    }

    public String getSalesAmt() {
        return salesAmt;
    }

    public void setSalesAmt(String salesAmt) {
        this.salesAmt = salesAmt;
    }

    public String getSalesShare() {
        return salesShare;
    }

    public void setSalesShare(String salesShare) {
        this.salesShare = salesShare;
    }

    public String getSalesInten() {
        return salesInten;
    }

    public void setSalesInten(String salesInten) {
        this.salesInten = salesInten;
    }

    public String getSalesChange() {
        return salesChange;
    }

    public void setSalesChange(String salesChange) {
        this.salesChange = salesChange;
    }

    public String getSalesAcc() {
        return salesAcc;
    }

    public void setSalesAcc(String salesAcc) {
        this.salesAcc = salesAcc;
    }

    public String getAudiCnt() {
        return audiCnt;
    }

    public void setAudiCnt(String audiCnt) {
        this.audiCnt = audiCnt;
    }

    public String getAudiInten() {
        return audiInten;
    }

    public void setAudiInten(String audiInten) {
        this.audiInten = audiInten;
    }

    public String getAudiChange() {
        return audiChange;
    }

    public void setAudiChange(String audiChange) {
        this.audiChange = audiChange;
    }

    public String getAudiAcc() {
        return audiAcc;
    }

    public void setAudiAcc(String audiAcc) {
        this.audiAcc = audiAcc;
    }

    public String getScrnCnt() {
        return scrnCnt;
    }

    public void setScrnCnt(String scrnCnt) {
        this.scrnCnt = scrnCnt;
    }

    public String getShowCnt() {
        return showCnt;
    }

    public void setShowCnt(String showCnt) {
        this.showCnt = showCnt;
    }

}