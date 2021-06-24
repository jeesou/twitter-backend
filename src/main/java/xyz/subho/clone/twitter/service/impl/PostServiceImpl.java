package xyz.subho.clone.twitter.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import xyz.subho.clone.twitter.entity.Posts;
import xyz.subho.clone.twitter.exception.ResourceNotFoundException;
import xyz.subho.clone.twitter.model.PostModel;
import xyz.subho.clone.twitter.repository.PostsRepository;
import xyz.subho.clone.twitter.service.PostService;
import xyz.subho.clone.twitter.utility.Mapper;

public class PostServiceImpl implements PostService {

  @Autowired private PostsRepository postsRepository;

  @Autowired
  @Qualifier("PostMapper")
  private Mapper<Posts, PostModel> postMapper;

  @Override
  public List<PostModel> getAllPosts() {

    var posts = postsRepository.findAll();
    List<PostModel> postModels = new ArrayList<>();
    Optional.ofNullable(posts)
        .ifPresent(
            post -> post.forEach(eachPost -> postModels.add(postMapper.transform(eachPost))));
    return postModels;
  }

  @Override
  public PostModel getPost(UUID postId) {

    var post = postsRepository.findById(postId);
    if (post.isPresent()) return postMapper.transform(post.get());
    throw new ResourceNotFoundException("Post ID is Invalid");
  }

  @Override
  @Transactional
  public PostModel addPost(PostModel postModel) {

    var post = postMapper.transformBack(postModel);
    return postMapper.transform(postsRepository.save(post));
  }

  @Override
  @Transactional
  public boolean deletePost(UUID postId, UUID userId) {

    if (Optional.ofNullable((getPost(postId))).isPresent()) {
      postsRepository.deleteById(postId);
      return true;
    }
    return false;
  }

  @Override
  @Transactional
  public boolean addLike(UUID postId, UUID userId) {
    if (Optional.ofNullable((getPost(postId))).isPresent()) {
      postsRepository.deleteById(postId);
      return true;
    }
    return false;
  }

  @Override
  @Transactional
  public boolean removeLike(UUID postId, UUID userId) {
    if (Optional.ofNullable((getPost(postId))).isPresent()) {
      postsRepository.deleteById(postId);
      return true;
    }
    return false;
  }
}
