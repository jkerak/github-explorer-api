CREATE TABLE UserCollectionRepository
( UserCollectionRepositoryID BIGINT NOT NULL AUTO_INCREMENT,
  UserCollectionID BIGINT,
  RepositoryID BIGINT,
  Notes VARCHAR(250),
  RepositoryName VARCHAR(100),
  `timestamp` TIMESTAMP,
  Status CHAR(1) NOT NULL,
  PRIMARY KEY (UserCollectionRepositoryID),
  FOREIGN KEY (UserCollectionID) REFERENCES UserCollection(UserCollectionID)
)