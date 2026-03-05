package zjian.api;

import zjian.core.InternalRequestExecutor;
import zjian.dto.req.*;
import zjian.dto.req.ugc.*;
import zjian.dto.res.*;
import zjian.dto.res.ugc.*;

import java.io.File;

public class PostApi {
    private final InternalRequestExecutor executor;

    public PostApi(InternalRequestExecutor executor) {
        this.executor = executor;
    }

    /**
     * 话题帖子列表
     */
    public SubjectPostListRes getPostList(SubjectPostListRequest req) {
        return executor.execute("/api/v3/zjian.crm.saas.subject.post.list", req, SubjectPostListRes.class, "获取话题帖子列表");
    }

    /**
     * 会员收藏列表
     */
    public FavoriteListRes getFavoriteList(FavoriteListRequest req) {
        return executor.execute("/api/v3/zjian.crm.saas.ugc.favorite.list", req, FavoriteListRes.class, "获取会员收藏列表");
    }

    /**
     * 会员发帖图片上传
     */
    public ImageUploadRes uploadImage(File imageFile) {
        return executor.execute("/api/v3/zjian.crm.saas.ugc.image.upload", imageFile, ImageUploadRes.class, "会员发帖图片上传");
    }

    /**
     * 清空搜索关键字
     */
    public KeywordDelRes clearSearchKeywords(KeywordDelRequest req) {
        return executor.execute("/api/v3/zjian.crm.saas.ugc.keyword.del", req, KeywordDelRes.class, "清空搜索关键字");
    }

    /**
     * 搜索关键字列表
     */
    public KeywordListRes getKeywordList(KeywordListRequest req) {
        return executor.execute("/api/v3/zjian.crm.saas.ugc.keyword.list", req, KeywordListRes.class, "获取搜索关键字列表");
    }

    /**
     * 会员点赞列表
     */
    public LikeListRes getLikeList(LikeListRequest req) {
        return executor.execute("/api/v3/zjian.crm.saas.ugc.like.list", req, LikeListRes.class, "获取会员点赞列表");
    }

    /**
     * 会员发帖
     */
    public PostAddRes addPost(PostAddRequest req) {
        return executor.execute("/api/v3/zjian.crm.saas.ugc.post.add", req, PostAddRes.class, "会员发帖");
    }

    /**
     * 话题列表
     */
    public SubjectListRes getSubjectList(SubjectListRequest req) {
        return executor.execute("/api/v3/zjian.crm.saas.ugc.subject.list", req, SubjectListRes.class, "获取话题列表");
    }

    /**
     * 当前会员发帖数据
     */
    public SubjectPostDataRes getSubjectPostData(SubjectPostDataRequest req) {
        return executor.execute("/api/v3/zjian.crm.saas.subject.post.data", req, SubjectPostDataRes.class, "获取当前会员发帖数据");
    }

    /**
     * 帖子收藏/取消收藏
     */
    public PostFavoriteRes favoritePost(PostFavoriteRequest req) {
        return executor.execute("/api/v3/zjian.crm.saas.subject.post.favorite", req, PostFavoriteRes.class, "帖子收藏/取消收藏");
    }

    /**
     * 帖子点赞/取消点赞
     */
    public PostLikeRes likePost(PostLikeRequest req) {
        return executor.execute("/api/v3/zjian.crm.saas.subject.post.like", req, PostLikeRes.class, "帖子点赞/取消点赞");
    }

    /**
     * 当前会员发帖列表
     */
    public MemberPostListRes getMemberPostList(MemberPostListRequest req) {
        return executor.execute("/api/v3/zjian/crm.saas.ugc.subject.post.list", req, MemberPostListRes.class, "获取当前会员发帖列表");
    }

    /**
     * 会员帖子删除
     */
    public MemberPostDelRes deleteMemberPost(MemberPostDelRequest req) {
        return executor.execute("/api/v3/zjian/crm.saas.ugc.talk.subject.post.del", req, MemberPostDelRes.class, "会员帖子删除");
    }

}