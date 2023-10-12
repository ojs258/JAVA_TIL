package chap03._02slp.integrate;

public interface Repository {
    void createUser();
    Domain.User findUserById(Long id);

    void createArticle();
    Domain.Article findArticleById(Long id);
}
