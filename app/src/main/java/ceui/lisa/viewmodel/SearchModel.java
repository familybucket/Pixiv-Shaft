package ceui.lisa.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SearchModel extends ViewModel {

    //关键字
    private MutableLiveData<String> keyword = new MutableLiveData<>();
    //收藏数
    private MutableLiveData<String> starSize = new MutableLiveData<>();
    //关键字匹配模式
    private MutableLiveData<String> searchType = new MutableLiveData<>();
    //排序模式
    private MutableLiveData<String> sortType = new MutableLiveData<>();
    //开始日期
    private MutableLiveData<String> startDate = new MutableLiveData<>();
    //结束日期
    private MutableLiveData<String> endDate = new MutableLiveData<>();

    public MutableLiveData<String> getKeyword() {
        return keyword;
    }

    public void setKeyword(MutableLiveData<String> keyword) {
        this.keyword = keyword;
    }

    public MutableLiveData<String> getStarSize() {
        return starSize;
    }

    public void setStarSize(MutableLiveData<String> starSize) {
        this.starSize = starSize;
    }

    public MutableLiveData<String> getSearchType() {
        return searchType;
    }

    public void setSearchType(MutableLiveData<String> searchType) {
        this.searchType = searchType;
    }

    public MutableLiveData<String> getSortType() {
        return sortType;
    }

    public void setSortType(MutableLiveData<String> sortType) {
        this.sortType = sortType;
    }

    public MutableLiveData<String> getStartDate() {
        return startDate;
    }

    public void setStartDate(MutableLiveData<String> startDate) {
        this.startDate = startDate;
    }

    public MutableLiveData<String> getEndDate() {
        return endDate;
    }

    public void setEndDate(MutableLiveData<String> endDate) {
        this.endDate = endDate;
    }
}
