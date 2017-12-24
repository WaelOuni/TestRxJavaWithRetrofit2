package mobile.software.squeezer.rxjavaretrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wael on 24/12/17.
 */

public class GithubIssue {

    String id;
    String title;
    String comments_url;

    @SerializedName("body")
    String comment;

    @Override
    public String toString() {
        return id +  " - " + title;
    }
}

