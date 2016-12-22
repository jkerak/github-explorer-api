CREATE TABLE UserCollection
( UserCollectionID BIGINT NOT NULL AUTO_INCREMENT,
  GithubUserID BIGINT,
  Title VARCHAR(25),
  PRIMARY KEY (UserCollectionID),
  FOREIGN KEY (GithubUserID) REFERENCES GithubUser(GithubUserID)
)