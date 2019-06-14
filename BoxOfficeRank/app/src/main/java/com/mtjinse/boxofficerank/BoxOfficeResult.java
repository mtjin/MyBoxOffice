package com.mtjinse.boxofficerank;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/*
"boxOfficeResult": {
"boxofficeType": "주말 박스오피스",
"showRange": "20111230~20120101",
"yearWeekTime": "201152",
"weeklyBoxOfficeList": [
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
*/

import java.util.List;


public class BoxOfficeResult {

    @SerializedName("boxofficeType")
    @Expose
    private String boxofficeType;
    @SerializedName("showRange")
    @Expose
    private String showRange;
    @SerializedName("yearWeekTime")
    @Expose
    private String yearWeekTime;
    @SerializedName("weeklyBoxOfficeList")
    @Expose
    private List<WeeklyBoxOfficeList> weeklyBoxOfficeList = null;

    public String getBoxofficeType() {
        return boxofficeType;
    }

    public void setBoxofficeType(String boxofficeType) {
        this.boxofficeType = boxofficeType;
    }

    public String getShowRange() {
        return showRange;
    }

    public void setShowRange(String showRange) {
        this.showRange = showRange;
    }

    public String getYearWeekTime() {
        return yearWeekTime;
    }

    public void setYearWeekTime(String yearWeekTime) {
        this.yearWeekTime = yearWeekTime;
    }

    public List<WeeklyBoxOfficeList> getWeeklyBoxOfficeList() {
        return weeklyBoxOfficeList;
    }

    public void setWeeklyBoxOfficeList(List<WeeklyBoxOfficeList> weeklyBoxOfficeList) {
        this.weeklyBoxOfficeList = weeklyBoxOfficeList;
    }

}
