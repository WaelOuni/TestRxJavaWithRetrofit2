package mobile.software.squeezer.rxjavaretrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wael on 24/12/17.
 */
public class GithubRepo {
    String name;
    String owner;
    @SerializedName("url")
    String repoUrl;

    @Override
    public String toString() {
        return (name + " " + repoUrl);
    }
}