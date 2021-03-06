package WebApplication.Model.Responses;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class LikeResponse {

    ///If notificationId == -1 then there was an internal server error

    private long notificationId;

    public long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(long notificationId) {
        this.notificationId = notificationId;
    }

    public LikeResponse(long notificationId) {
        this.notificationId = notificationId;
    }
}
