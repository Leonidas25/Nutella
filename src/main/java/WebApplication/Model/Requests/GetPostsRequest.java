package WebApplication.Model.Requests;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetPostsRequest {

    private long userId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public GetPostsRequest(long userId) {
        this.userId = userId;
    }
}
