CREATE TABLE Repository
( RepositoryID BIGINT NOT NULL AUTO_INCREMENT,
  FullName VARCHAR(100),
  Description VARCHAR(200),
  Url VARCHAR(119),
  Stars INT,
  PRIMARY KEY (RepositoryID)
)