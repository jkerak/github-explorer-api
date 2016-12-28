CREATE TABLE UserCollection
( UserCollectionID BIGINT NOT NULL AUTO_INCREMENT,
  GithubUserID BIGINT,
  Title VARCHAR(25),
  minimumStars INT,
  minimumSize INT,
  language VARCHAR(30),
  `timestamp` TIMESTAMP,
  Status CHAR(1) NOT NULL,
  PRIMARY KEY (UserCollectionID),
  FOREIGN KEY (GithubUserID) REFERENCES GithubUser(GithubUserID)
)