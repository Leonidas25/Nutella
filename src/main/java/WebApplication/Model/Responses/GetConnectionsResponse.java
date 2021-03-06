package WebApplication.Model.Responses;


import WebApplication.Model.Entities.UsersEntity;
import WebApplication.Model.Helpers.UserInfo;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetConnectionsResponse {

    public List<UserInfo> getUsers() {
        return users;
    }

    public void setUsers(List<UserInfo> users) {
        this.users = users;
    }

    public GetConnectionsResponse(List<UserInfo> users) {
        this.users = users;
    }

    private List<UserInfo> users;
}
