package WebApplication.Model.Entities;

import javax.persistence.*;
import java.util.Objects;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments", schema = "nutella", catalog = "")
@IdClass(CommentsEntityPK.class)
@NamedQueries({
        @NamedQuery(
                name = "CommentsEntity.GetComments",
                query = "select c from CommentsEntity c where c.postId = :postId"
        ),
        @NamedQuery(
                name = "CommentsEntity.getUserCommented",
                query = "select u from CommentsEntity c join PostsEntity p on c.postId = p.id join UsersEntity u on u.id = p.userId where p.id = :postId"
        ),
        @NamedQuery(
                name = "CommentsEntity.GetAllComments",
                query = "select c from CommentsEntity c"
        ),
        @NamedQuery(
                name = "CommentsEntity.getCommentsByUser",
                query = "select c from CommentsEntity c where c.userId = :userId"
        )
})
public class CommentsEntity {
    private long userId;
    private long postId;
    private String text;
    private java.sql.Timestamp timeStamp;

    @Id
    @Column(name = "Timestamp")
    public java.sql.Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(java.sql.Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }


    @Id
    @Column(name = "UserID")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "PostID")
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "Text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsEntity that = (CommentsEntity) o;
        return userId == that.userId &&
                postId == that.postId &&
                timeStamp == that.timeStamp &&
                Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, postId, text, timeStamp);
    }
}
