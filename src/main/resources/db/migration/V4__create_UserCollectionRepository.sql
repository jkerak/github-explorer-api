CREATE TABLE UserCollectionRepository
( UserCollectionRepositoryID BIGINT NOT NULL AUTO_INCREMENT,
  UserCollectionID BIGINT,
  RepositoryID BIGINT,
  Notes VARCHAR(250),
  PRIMARY KEY (UserCollectionRepositoryID),
  FOREIGN KEY (UserCollectionID) REFERENCES UserCollection(UserCollectionID),
  FOREIGN KEY (RepositoryID) REFERENCES Repository(RepositoryID)
)